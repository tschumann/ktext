ktext
=====

Wrapper around iText library: https://itextpdf.com/en

Currently it can only rotate .pdf files.

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

License
-------

AGPL 3.0 because iText is AGPL 3.0
