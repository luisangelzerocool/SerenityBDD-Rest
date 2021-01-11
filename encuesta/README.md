# SerenityBDD-Automation-Encuesta_Sura

This contain the automation for sura poll

## Implementación Local
Requisitos: 
- Gradle
- JDK 
- Cucumber

Copiar `docs/chromedriver.exe` dentro de `src/test/resources/driver/`

Construir el Proyecto con el comando: `gradle wrapper` 

## Ejecución
Usando el comando: `gradlew.bat  clean test --tests *RunnerTags* aggregate --info`