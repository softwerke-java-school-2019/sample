# JAX-RS Sample application
Simple JAX-RS application with embedded Jetty web server using Jersey as JAX-RS implementation

## How to build and run:
To build an application run  
```mvn clean install```

This will produce a jar file with embedded dependencies.

To launch an application run: 

```java -jar target/app2019-1.0-SNAPSHOT.jar```

## API:
```GET /api/some-entity```  
...

```GET /api/some-entity/{id}```  
...

```POST /api/some-entity
{
    "value": 
}
```

```GET```