package com.mis.route.locationexample

import android.app.Activity
import androidx.appcompat.app.AlertDialog
import com.google.android.material.dialog.MaterialAlertDialogBuilder

fun Activity.createDialog(
    title: String,
    message: String,
    posBtnText: String? = null,
    posBtnAction: (() -> Unit)? = null,
    negBtnText: String? = null,
    negBtnAction: (() -> Unit)? = null,
    isCancelable: Boolean = false
): AlertDialog {
    return MaterialAlertDialogBuilder(this)
        .setTitle(title)
        .setMessage(message)
        .setPositiveButton(posBtnText) { dialog, _ ->
            dialog.dismiss()
            posBtnAction?.invoke()
        }
        .setNegativeButton(negBtnText) { dialog, _ ->
            dialog.dismiss()
            negBtnAction?.invoke()
        }
        .setCancelable(isCancelable)
        .create()
}