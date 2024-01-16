# SOAP_WebService_JAX-WS
Java implementation of a SOAP WebService for online payment by JAX-WS.

Implementatio (bottom-up approach*) of a Web service for on-line payment. The service has:
- An operation that returns the supported credit cards;
- An operation that returns the registered organizations (which can receive payments);
- An operation to pay.
   
The Java interface is the following:
- List<String> getSupportedCreditCards();
- List<Organization> getRegisteredOrganizations();
- void pay(String cctype, String ccnumber, String code, Double amount, int destination);
  
* Bottom-up approach (the WSDL description is created starting from the Java interface).
