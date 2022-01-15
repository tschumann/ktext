ktext
=====

Wrapper around iText library: https://itextpdf.com/en

Use a tagged release if you want a stable and working project.

Currently it can rotate and give some basic information on .pdf files.

Usage
-----

ktext needs at least Java 11 to build and run, so you may need to point directly to your installation of Java e.g. `"C:\Program Files\Java\jdk-13.0.1\bin\java"`

```
java -jar build/libs/ktext.jar file.pdf --rotate
java -jar build/libs/ktext.jar file.pdf --info
```

Building
--------

```
./gradlew clean build
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

Testing
-------

```
java -jar build/libs/ktext.jar test_cases/blank_page.pdf --rotate
java -jar build/libs/ktext.jar test_cases/blank_page.pdf --info
```

License
-------

AGPL 3.0 because iText is AGPL 3.0
