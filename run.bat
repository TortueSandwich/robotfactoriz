@echo off
cd /d "%~dp0"
java -Djava.util.logging.config.file=config/logging.properties -jar RobotFactorySimulator.jar
