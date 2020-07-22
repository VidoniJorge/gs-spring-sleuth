# Api-Product

Api-product es una simple API que retorna un listado de productos. Para tal fin, se expone un servicio rest en la siguiente url:

> http://localhost:8090/products

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
