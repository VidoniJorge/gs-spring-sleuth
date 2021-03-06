# Web-Shop

Aplicación web que consume las siguientes APIs

* api-client
* api-producr

La aplicación expone 2 endpoints para poder visualizar el listada de productos y de clientes

* http://localhost:8080/products
* http://localhost:8080/clients

# Releases

## Releases 1 – Hacer funcionar Sleuth

Para el funcionamiento de **Sleuth** la única dependencia que tendremos que agregar a nuestra app **Spring** es:

    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-sleuth</artifactId>
    </dependency>

## Releases 2 – Integrar el proyecto con Zipkin por http

Para el manejo de __Zipkin__ se cambió  la dependencia de __Sleuth__ por 

    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-zipkin</artifactId>
    </dependency

También se agregó las siguientes propiedades, para conectarse a Zipkin por http 

    spring:
        zipkin:
            baseUrl: http://localhost:9411/