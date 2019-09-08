# API Docker SpringBoot 
Docker e Spring Boot

# Arquitetura da Aplicação
* Java 8
* Spring Boot(com servidor Tomcat embarcado)


# Objetivo:
  Criar uma aplicação Restful Dockerizada com Spring Boot.

**Execute**
* mvn clean package docker:build
* docker images
* docker run -t -p 8000:8080 --name mechanical_overhaul macrusal/sb_docker_mechanical_overhaul
* docker tag  03dfe9135ff5 macrusal/sb_docker_mechanical_overhaul:latest
* docker push macrusal/sb_docker_mechanical_overhaul:latest