# camel-webservice-example
Camel example exposing a SOAP webservice.

To build this project use

    mvn clean install

To run this project use

    mvn camel:run

The Service can be accessed using Wsdl endpoint:

    http://localhost:9191/camel-example/ProductService?wsdl

Sample request XML for the three service operations can be found under src/test/resources/data
