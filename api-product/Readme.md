# Getting Started

Api-product es una simple API que retorna un listado de productos. Para tal fin, se expone un servicio rest en la siguiente url:

> http://localhost:8090/products

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

