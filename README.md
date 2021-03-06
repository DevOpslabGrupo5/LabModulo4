<h1 align="center">Hello!!! 馃憢, We are Group5 DevOps USACH 2022</h1>
<h3 align="center">Final Testing project lab</h3>
# Proyecto de laboratorio

Desaf铆o desarrollar un sitio web que permita realizar lo siguiente:
Conocer el 10% que se obtendr铆a.
Conocer el saldo restante que quedar谩 luego de un posible retiro.
Conocer el impuesto asociado al retirar el monto m谩ximo.
Se adjuntar谩 un microservicio que deber谩 utilizar y completar. Este microservicio s贸lo cumple con la opci贸n de calcular el 10%. Deber谩 implementar lo siguiente:


# Casos de negocio
  C谩lculo del impuesto
  C谩lculo del Saldo Restante.
  Generaci贸n de clases Test en Junit para todos los casos de negocio.
  Integraci贸n con Servicio para obtener la UF. Actualmente s贸lo se obtiene un
  valor por defecto.

## DESARROLLO LABORATORIO

La soluci贸n a la problem谩tica planteada fue desarrollada en Java de acuerdo a las siguientes caracter铆sticas:

Proyecto Spring Boot mvc con Maven 
Utilizando dependencias Spring Web y Thymeleaf 

Para la generaci贸n del proyecto nos apoyamos directamente desde https://start.spring.io/

Frontend
Como se indic贸 en el punto anterior, en nuestro proyecto se utiliz贸 la dependencia Thymeleaf para las p谩gina web, obteniendo como resultado lo que se muestra a continuaci贸n:

## Instalaci贸n, Compilaci贸n y Testing

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

Levantar aplicaci贸n

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
Crear pipeline jenkinsfile utilizando la rama master
```     
## Consideraciones

```bash
Para las prueba de Selenium se require instalar Google Chrome versi贸n 99 
```     
https://chromedriver.storage.googleapis.com/index.html?path=99.0.4844.51/

<h3 align="left">Languages and Tools:</h3>
<p align="left">  <a href="https://www.docker.com/" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/docker/docker-original-wordmark.svg" alt="docker" width="40" height="40"/> </a> <a href="https://git-scm.com/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" alt="git" width="40" height="40"/> </a> <a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a> <a href="https://www.jenkins.io" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/jenkins/jenkins-icon.svg" alt="jenkins" width="40" height="40"/> </a> <a href="https://postman.com" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/getpostman/getpostman-icon.svg" alt="postman" width="40" height="40"/> </a>  <a href="https://www.selenium.dev" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/detain/svg-logos/780f25886640cef088af994181646db2f6b1a3f8/svg/selenium-logo.svg" alt="selenium" width="40" height="40"/> </a> <a href="https://spring.io/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" alt="spring" width="40" height="40"/> </a> </p>

