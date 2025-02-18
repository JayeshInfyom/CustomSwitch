# Custom Switch

**Custom Switch** is a highly customizable Android library that allows you to fully customize the appearance and behavior of a switch. You can change the ON/OFF thumb icon, background color, label color, and more.

[![JitPack](https://jitpack.io/v/JayeshInfyom/CustomSwitch.svg)](https://jitpack.io/#JayeshInfyom/CustomSwitch)

## Features
- Fully customizable switch thumb icon for ON/OFF states.
- Customizable background color.
- Customizable label color.
- Easy integration with Gradle.
- Lightweight and optimized for performance.

## Installation

Add the JitPack repository to your `settings.gradle.kts` file:

```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}
```
Add the JitPack repository to your `build.gradle.kts` file:

```
dependencies {
    implementation("com.github.JayeshInfyom:CustomSwitch:1.0.0")
}
```
#Usage

```
 <com.github.angads25.toggle.widget.LabeledSwitch
        android:id="@+id/switch"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="16dp"
        android:textSize="14sp"
        app:on="false"
        app:colorBorder="@color/colorAccent"/>

```
