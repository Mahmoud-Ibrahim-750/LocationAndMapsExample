# Android Location & Maps Demo

This repository contains a simple Android app demonstrating how to request and handle runtime permissions, specifically focusing on location permissions. The app integrates Google Maps to showcase best practices for using the Maps SDK and handling location permissions in an Android application.

## Overview

### Features

- Demonstrates runtime location permission handling in an Android app.
- Integrates Google Maps to showcase a practical use case for location permissions.
- Follows best practices for requesting and handling location permissions in Android as stated in the documentation.

## Getting Started

### Prerequisites

- Android Studio installed on your development machine.
- Basic knowledge of Android app development.

### Clone the Repository

Clone this repository to your local machine using the following command:

```bash
git clone https://github.com/Mahmoud-Ibrahim-750/LocationAndMapsExample.git
```

### Open with Android Studio

You can open the project in Android Studio to explore the code and run the app on an emulator or physical device. Please, do NOT forget to use your own API key (get it from your Google Cloud account) since the provided application doesn't contain my key. 

## Usage

1. Build and run the app on an Android emulator or device.
2. Grant the location permission when prompted.
3. Explore the app's integration with Google Maps and observe how location permissions are handled.

## Code Highlights

1- Permission Handling

The app demonstrates how to request location permissions at runtime. Check the [Initial Commit (Location Permissions)](https://github.com/Mahmoud-Ibrahim-750/LocationAndMapsExample/commit/2e563d3b2f8e91822a1028861e8b72d107a1d976).

2- Receiving Location Updates

After handling location permissions, the app shows how to listen for location updates. Check the [Location Updates Setup](https://github.com/Mahmoud-Ibrahim-750/LocationAndMapsExample/commit/514b3bb0ea9eb33849c07c45ad52bb64bf199150) commit. 

3- Google Maps Integration

Explore the Google Maps integration for a practical example of utilizing location data. Check the [Google Maps Integration](https://github.com/Mahmoud-Ibrahim-750/LocationAndMapsExample/commit/2f82235e3d8cd5adeef2933e753f5df75cc22cce) commit.

4- Best Practices

Dive into KTX to explore Kotlin features that unleash your potential. Check the [Google Maps with KTX](https://github.com/Mahmoud-Ibrahim-750/LocationAndMapsExample/commit/115da00cead0e248d17cf20fe340826cd4b2acf0) commit.

## Contributing

Feel free to contribute to the project by opening issues or submitting pull requests. Your feedback and contributions are highly appreciated.

## License

This project is licensed under the [MIT License](LICENSE).

## Acknowledgments

- Thanks to the [Getting started with Google Maps Platform](https://developers.google.com/maps/get-started) documentation.
- Thanks to the [Receive location updates in Android with Kotlin](https://codelabs.developers.google.com/codelabs/while-in-use-location/#0) and the [Add a map to your Android app (Kotlin)](https://developers.google.com/codelabs/maps-platform/maps-platform-101-android#0) codelabs.
