# Skill Exp 4 - Spring Student Bean

## Overview

Demonstrates Spring IoC with XML and annotation-based configuration for a `Student` bean.

## How to run

### XML configuration

```bash
mvn -q -DskipTests compile
mvn -q exec:java -Dexec.mainClass=com.klu.MainApp
```

### Annotation configuration

```bash
mvn -q -DskipTests compile
mvn -q exec:java -Dexec.mainClass=com.klu.MainAnnotation
```

## Notes

- `applicationContext.xml` defines the XML-based `Student` bean.
- `AppConfig` enables component scanning for annotation-based wiring.
