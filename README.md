<h1 align="center">Hello!!! 👋, We are Group5 DevOps USACH 2022</h1>
<h3 align="center">Final Testing project lab</h3>
# Proyecto de laboratorio

Desafío desarrollar un sitio web que permita realizar lo siguiente:
Conocer el 10% que se obtendría.
Conocer el saldo restante que quedará luego de un posible retiro.
Conocer el impuesto asociado al retirar el monto máximo.
Se adjuntará un microservicio que deberá utilizar y completar. Este microservicio sólo cumple con la opción de calcular el 10%. Deberá implementar lo siguiente:


# Casos de negocio
  Cálculo del impuesto
  Cálculo del Saldo Restante.
  Generación de clases Test en Junit para todos los casos de negocio.
  Integración con Servicio para obtener la UF. Actualmente sólo se obtiene un
  valor por defecto.

## DESARROLLO LABORATORIO

La solución a la problemática planteada fue desarrollada en Java de acuerdo a las siguientes características:

Proyecto Spring Boot mvc con Maven 
Utilizando dependencias Spring Web y Thymeleaf 

Para la generación del proyecto nos apoyamos directamente desde https://start.spring.io/

Frontend
Como se indicó en el punto anterior, en nuestro proyecto se utilizó la dependencia Thymeleaf para las página web, obteniendo como resultado lo que se muestra a continuación:

## Instalación, Compilación y Testing

Realice fork del siguiente repositorio 

```bash
https://github.com/DevOpslabGrupo5/LabModulo4
```

Ejecutar el proyecto con Maven

```bash
mvn clean compile
```

Realizar pruebas unitarias

```bash
mvn -Dtest=UtilTest test
```

Levantar aplicación

```bash
mvn spring-boot:run &
```

Test Selenium

```bash
mvn -Dtest=ApplicationTest test
```

Test Newman

```bash
newman run src/test/postman/Dxc.postman_collectionLab.json
```

Test Jmeter

```bash
mvn verify -Pperformance
```     

## Ejecucion de Pipeline

```bash
Crear pipeline jenkinsfile utilizando la rama main
```     
## Consideraciones

```bash
Para las prueba de Selenium se require instalar Google Chrome versión 99 [a relative link](https://chromedriver.storage.googleapis.com/index.html?path=99.0.4844.51/)
```     

<h3 align="left">Languages and Tools:</h3>
<p align="left">  <a href="https://www.docker.com/" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/docker/docker-original-wordmark.svg" alt="docker" width="40" height="40"/> </a> <a href="https://git-scm.com/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" alt="git" width="40" height="40"/> </a> <a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a> <a href="https://www.jenkins.io" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/jenkins/jenkins-icon.svg" alt="jenkins" width="40" height="40"/> </a> <a href="https://postman.com" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/getpostman/getpostman-icon.svg" alt="postman" width="40" height="40"/> </a>  <a href="https://www.selenium.dev" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/detain/svg-logos/780f25886640cef088af994181646db2f6b1a3f8/svg/selenium-logo.svg" alt="selenium" width="40" height="40"/> </a> <a href="https://spring.io/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" alt="spring" width="40" height="40"/> </a> </p>

