# Google Custom Search Module

This is a module for consuming the Google custom Search API through Mule ESB. For more information on the API visit:

https://developers.google.com/custom-search/v1/cse/list

In order to test this module you'd need to have a custom search engine which can be created for free here:

http://www.google.com/cse/create/new

Finally a sample mule application to showcase the ease of this module:

```xml
<mule xmlns:http="http://www.mulesoft.org/schema/mule/http" xmlns:google-search="http://www.mulesoft.org/schema/mule/google-search" xmlns="http://www.mulesoft.org/schema/mule/core" xmlns:doc="http://www.mulesoft.org/schema/mule/documentation" xmlns:spring="http://www.springframework.org/schema/beans" version="EE-3.4.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-current.xsd
http://www.mulesoft.org/schema/mule/core http://www.mulesoft.org/schema/mule/core/current/mule.xsd
http://www.mulesoft.org/schema/mule/http http://www.mulesoft.org/schema/mule/http/current/mule-http.xsd
http://www.mulesoft.org/schema/mule/google-search http://www.mulesoft.org/schema/mule/google-search/1.0.0-SNAPSHOT/mule-google-search.xsd">
    
    <google-search:config name="Google_Search" apiKey="<api key>" searchEngineId="<engine id>" doc:name="Google Search"/>
    
    <flow name="mule-configFlow1" doc:name="mule-configFlow1">
        <http:inbound-endpoint exchange-pattern="request-response" host="localhost" port="8081" doc:name="HTTP"/>
        <google-search:search config-ref="Google_Search" query="http connector" doc:name="Google Search" />
        <logger level="ERROR" message="Payload is: #[payload]" doc:name="Logger"/>
        <logger level="ERROR" doc:name="Logger"/>
    </flow>
</mule>
```