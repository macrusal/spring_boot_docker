# API MongoDB SpringBoot 
Docker e Spring Boot

# Arquitetura da Aplicação
* Java 8
* Spring Boot(com servidor Tomcat embarcado)


# Objetivo:
  Criar uma aplicação Restful Dockerizada com Spring Boot.


* mvn clean package docker:build
* docker run -t -p 8000:8087 --name dockerize macrusal/dockerize-spring