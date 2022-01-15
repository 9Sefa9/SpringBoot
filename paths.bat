@echo off
:: ########################################
::
:: Beispieldatei zum Setzen von Umgebungsvariablen.
:: Die Pfade hier sind Platzhalter und müssen ggf. durch die Pfade zu den
:: entsprechenden Programmen ersetzt werden.
::
:: ########################################

echo "Setze Pfade für diese Konsole"
:: Docker Pfad
:: set PATH=C:\Program Files\Docker\Docker\resources\bin;%PATH%
:: Node Pfad (mindestens Version 14)
:: set PATH=C:\Program Files\nodejs;%PATH%
:: Java Pfad (mindestens Version 11)
set JAVA_HOME=C:\Program Files\Java\jdk-17.0.1
:: set PATH=%JAVA_HOME%\bin;%PATH%
:: Maven Pfad
:: set PATH=%USERPROFILE%\apache-maven-3.8.3\bin;%PATH%

echo %PATH%