package com.mis.route.locationexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.mis.route.locationexample.databinding.ActivityMainBinding
import android.Manifest
import android.content.pm.PackageManager
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding get() = _binding!!

    private lateinit var locationPermissionRequest: ActivityResultLauncher<Array<String>>
    private lateinit var locationPermissionRationaleDialog: AlertDialog


    private fun askForUpdate() {
        Toast.makeText(this, "update first", Toast.LENGTH_SHORT).show()
    }

    private fun startAction() {
        Toast.makeText(this, "start", Toast.LENGTH_SHORT).show()
    }

    private fun locationPermissionsGranted(): Boolean {
        arrayOf(
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.ACCESS_COARSE_LOCATION
        ).forEach {
            if (ContextCompat.checkSelfPermission(this, it) == PackageManager.PERMISSION_DENIED)
                return false
        }
        return true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        locationPermissionRationaleDialog = createDialog(
            "Permission Required",
            "In order to listen to location updates, we need location permission",
            "Request again",
            {
                locationPermissionRequest.launch(
                    arrayOf(
                        Manifest.permission.ACCESS_FINE_LOCATION,
                        Manifest.permission.ACCESS_COARSE_LOCATION
                    )
                )
            },
            "No thanks"
        )

        locationPermissionRequest = registerForActivityResult(
            ActivityResultContracts.RequestMultiplePermissions()
        ) { permissions ->
            when {
                permissions.getOrDefault(Manifest.permission.ACCESS_FINE_LOCATION, false) -> {
                    // Precise location access granted.
                    startAction()
                }

                permissions.getOrDefault(Manifest.permission.ACCESS_COARSE_LOCATION, false) -> {
                    // Only approximate location access granted.
                    askForUpdate()
                }

                else -> {
                    // No location access granted.
                    if (locationPermissionRationaleDialog.isShowing)
                        locationPermissionRequest.launch(
                            arrayOf(
                                Manifest.permission.ACCESS_FINE_LOCATION,
                                Manifest.permission.ACCESS_COARSE_LOCATION
                            )
                        )
                    else locationPermissionRationaleDialog.show()
                }
            }
        }


        binding.startListeningBtn.setOnClickListener {
            if (locationPermissionsGranted()) {
                startAction()
            } else {
                locationPermissionRequest.launch(
                    arrayOf(
                        Manifest.permission.ACCESS_FINE_LOCATION,
                        Manifest.permission.ACCESS_COARSE_LOCATION
                    )
                )
            }
        }

    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}