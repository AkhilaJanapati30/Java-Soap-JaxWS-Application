package com.akhila.webservices.client;

import java.net.URL;

import javax.xml.namespace.QName;

import com.akhila.ws.HelloService;

import jakarta.xml.ws.Service;
public class HelloServiceClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		URL url = new URL("http://localhost:8081/ws/hello?wsdl");
		QName qname = new QName("http://ws.akhila.com/", "HelloServiceImplService");
		Service service = Service.create(url,qname);
		HelloService hello = service.getPort(HelloService.class);
		System.out.println(hello.sayHello("Akhila"));
		
	}

}
