ktext
=====

Wrapper around iText library: https://itextpdf.com/en

Use a tagged release if you want a stable and working project.

Currently it can only rotate .pdf files.

Usage
-----

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
```

License
-------

AGPL 3.0 because iText is AGPL 3.0
