ktext
=====

Wrapper around iText library: https://itextpdf.com/en

Building
--------
```
./gradlew clean build
```

Running
-------
```
java -jar build/libs/ktext.jar
```

To build without running test run:
```
./gradlew build -x test
```

To upgrade Gradle run:
```
./gradlew wrapper --gradle-version=
```

To upgrade dependencies run:
```
./gradlew build --refresh-dependencies
```
