# Movie Catalog Service

This is the movie catalog service used to display the catalog of movies

### URL

> http:localhost:8083/movieCatalog/getCatalog

> http:localhost:8083/movieCatalog/getCatalogById{id}

### Port

> 8084

### application.properties

```
spring.application.name=catalog
server.port=8083
eureka.client.serviceUrl.defaultZone = http://localhost:8761/eureka

spring.jpa.hibernate.ddl-auto = update
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.HANAColumnStoreDialect
spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true


spring.datasource.driver-class-name=com.sap.db.jdbc.Driver
spring.datasource.username=USR_1ACNSHVB0QQA51XLHCOS9JCYW
spring.datasource.url=jdbc:sap://zeus.hana.prod.eu-central-1.whitney.dbaas.ondemand.com:23803?encrypt=true&validateCertificate=true&currentschema=USR_1ACNSHVB0QQA51XLHCOS9JCYW
spring.datasource.password=

```
