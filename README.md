Custom Switch

Custom Switch we can change every thing with both ON or OFF thumb icon,background color,lable color

### Gradle 
Add it in your settings.gradle.kts at the end of repositories:
```gradle
dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url = uri("https://jitpack.io") }
		}
	}
```


Add the dependency below to your module's `build.gradle` file:

```gradle
dependencies {
    implementation 'com.github.JayeshInfyom:CustomSwitch:1.0.0'
}
```

Add the dependency below to your module's `build.gradle.kts` file:

```gradle
dependencies {
    implementation ("com.github.JayeshInfyom:CustomSwitch:1.0.0")
}
```
