#!/bin/bash
cd "$(dirname "$0")"
java -Djava.util.logging.config.file=config/logging.properties -jar RobotFactorySimulator.jar
