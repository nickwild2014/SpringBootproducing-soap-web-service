package com.subhash.producingsoapwebservice.applicationmain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//http://localhost:8888/ws/countries.wsdl
		//curl --header "content-type: text/xml" -d @request.xml http://localhost:8080/ws
		/*
		 * request.xml
		 */
		// <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
		// xmlns:gs="http://spring.io/guides/gs-producing-web-service">
		// <soapenv:Header/>
		// <soapenv:Body>
		// <gs:getCountryRequest>
		// <gs:name>Spain</gs:name>
		// </gs:getCountryRequest>
		// </soapenv:Body>
		// </soapenv:Envelope>
		SpringApplication.run(Application.class, args);
	}
}
