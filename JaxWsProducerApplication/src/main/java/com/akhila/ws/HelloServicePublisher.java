package com.akhila.ws;

import jakarta.xml.ws.Endpoint;

public class HelloServicePublisher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "http://localhost:8081/ws/hello";
		Endpoint point = Endpoint.publish(url, new HelloServiceImpl());
		//System.out.println("Service is running at: " + url + "?wsdl");
		System.out.println("Service published: " + point.isPublished());
	}

}
