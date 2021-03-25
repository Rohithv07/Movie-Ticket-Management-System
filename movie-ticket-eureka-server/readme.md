# Movie Ticket Eureka Server

This is the Eureka Server used for the Service Discovery

* URL 

	localhost:8761

* Port 

	8761
	
* application.properties

	```
	spring.application.name = naming-server
	server.port = 8761
	eureka.client.register-with-eureka=false
	eureka.client.fetch-registry=false
	```