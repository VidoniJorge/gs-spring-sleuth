# Getting Started

Aplicación web que consume el api de producto. La aplicación levanta una simple página web la cual muestra los productos disponibles.  
Para acceder a esta tenemos que entrar a: 

> http://localhost:8080/products

Para que nuestra web, tenemos que correr adicional mente nuestra **api-pruduct**.

# Dependencias

Para el funcionamiento de **Sleuth** la única dependencia que tendremos que agregar a nuestra app **Spring** es:

    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-sleuth</artifactId>
    </dependency>

## Sleuth

Nuestra aplicación tiene importada las dependencias de **Sleuth**, por lo que podremos observar cómo se comporta este mirando los log.

Cabe aclarar que el funcionamiento que veremos es el que viene pre establecido por Spring.

Para que podamos apreciar el comportamiento de Sleuth, tendremos que agregar algún mensaje de log. En nuestro caso utilizamos las API de log de Log4j.