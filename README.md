# Spring Cloud Sleuth
**Spring Cloud Sleuth** es una librería, proporciona por **Spring**, que implementa una solución de traceo distribuido. Con tan solo incluir la dependencia en nuestros micro servicios, dotamos al ecosistema de **un mecanismo automático** de identificación de peticiones, ya que añade varios campos útiles a las mismas para identificarlas. 

A partir de la versión 2.0.0, **Spring Cloud Sleuth** utiliza una librería de rastreo llamada [Brave](https://github.com/openzipkin/brave). Brave se encarga de agregar un identificador único a cada solicitud web que ingresa a nuestra aplicación y Spring le agrega el manejo multi hilo.

## Sleuth – Trace
Antes de pasar a analizar los identificadores que genera **Sleuth** tenemos que definir 2 conceptos:
* **Trace:** se pueden considerar como una sola solicitud o trabajo que se desencadena en una aplicación. Todos los diversos pasos en esa solicitud, incluso a través de los límites de la aplicación y el hilo, tendrán el mismo **traceId**.
* **Span:** pueden considerarse como secciones de un trabajo o solicitud. Una única traza (**trace**) puede estar compuesta por múltiples tramos (**span**), cada uno de los cuales se correlaciona con un paso o sección específicos de la solicitud. 
 
Mediante el uso de identificadores de **trace** y **span** podemos determinar exactamente cuándo y dónde está nuestra aplicación mientras procesa una solicitud.

Ahora veamos como se ve un mensaje de Sleuth por consola:

![](img/sleuth_01.png)

La parte importante para nosotros es:

![](img/sleuth_02.png)

Los datos que presenta **Sleuth** tienen el siguiente formato:
    
    [nombre de la aplicación, traceId, spanId, export]

* **Nombre de la aplicación:** este es el nombre que establecemos en el archivo de propiedades y se puede usar para agregar registros de varias instancias de la misma aplicación.
* **TraceId**: esta es una identificación que se asigna a una sola solicitud, trabajo o acción.  
* **SpanId:** rastrea una unidad de trabajo. Piense en una solicitud que consta de múltiples pasos. Cada paso podría tener su propio intervalo y ser rastreado individualmente. Por defecto, cualquier flujo de aplicación comenzará con el mismo **TraceId** y **SpanId**.
* **export:** esta propiedad es un valor booleano que indica si este registro se exportó o no a un agregador como **Zipkin**. 

## Trace – Entre Servicios
Bien, ya sabemos que es **Sleuth** y cuál es la estructura de mensaje, pero ¿cómo mantiene la traza entre servicios?

Las trazas se conectan de un servicio a otro utilizando la propagación de encabezado. El formato predeterminado es [B3](https://github.com/openzipkin/b3-propagation). De manera similar a los formatos de datos, también puede configurar formatos de encabezado alternativos, siempre que las ID de rastreo y extensión sean compatibles con **B3**. En particular, esto significa que el ID de rastreo y los ID de intervalo son hexadecimales en minúsculas, no UUID. Además de los identificadores de rastreo, también se pueden pasar otras propiedades (**baggage**) junto con la solicitud.

Veamos un ejemplo de una propagación de encabezado:

![](img/sleuth_03.png)

**Sleuth** configura todo lo que necesita para comenzar a rastrear. Configura donde se informa los datos de rastreo (**spans**), cuantos rastreos mantener(**sampling**), si se envían campos remotos (**baggege**) y que librerías se rastrean.

## Interacción entre servicios con Sleuth

A modo de ejemplo se deje una gráfica de cómo se vería la interacción entre de servicios cuando se agrega Sleuth a nuestros proyectos.

![](img/sleuth_04.png)

# ¿Cómo incluir Sleuth en nuestro proyecto Spring?
Para hacer esto lo único que tenemos que hacer es incluir la siguiente dependencia en nuestro proyecto:

_Ejemplo maven_

    <dependency>
		<groupId>org.springframework.cloud</groupId>
		<artifactId>spring-cloud-starter-sleuth</artifactId>
	</dependency>

_Ejemplo gradle_

	compile group: 'org.springframework.cloud', name: 'spring-cloud-starter-sleuth'

Del resto se encarga Spring.

Al agregar esta dependencia solo estaremos dotando a nuestro proyecto con la capacidad de generar una trazabilidad sobre una solicitud, aunque esto no es poca cosa, si queremos conectar esto con productos como Zipkin, las dependencias a utilizar son otras. 

> Recordad que para para poder visual la traza tendremos que estar logeando algo.
