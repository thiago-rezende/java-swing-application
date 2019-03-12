# Java Swing Application
![](https://img.shields.io/badge/Java-8-red.svg) ![](https://img.shields.io/badge/Gradle-5-green.svg)
 - A simple java swing application
 ### How to Use
 - first download and install jdk_8 [here](https://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html)
 - setup the ```JAVA_HOME``` system variable
 - execute the following commands
 
     ```
     git clone https://github.com/thiago-rezende/java-swing-application.git
     cd java-swing-application
     gradlew.bat build
     gradlew.bat run
     ``` 
 - Project structure
     ```
        .
        ├───.gradle
        ├───build                # Build directory
        │   ├───classes          # Bytecode classes
        │   ├───distributions    # Distribution packages
        │   ├───libs             # Libraries
        │   ├───reports          # Gradle reports
        │   ├───scripts          # Gradle scripts
        ├───gradle
        │   └───wrapper          # Gradle wrapper
        └───src                  # Soure directory
            ├───main             # Application directory
            │   ├───java         # Your application goes here
            │   └───resources    # Your resources goes here
            └───test             # Tests directory
                ├───java         # Test classes goes here
                └───resources    # Test resources goes here
    ```
 
