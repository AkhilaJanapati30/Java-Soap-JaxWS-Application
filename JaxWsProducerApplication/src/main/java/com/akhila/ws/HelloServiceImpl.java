package com.akhila.ws;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.akhila.ws.HelloService")
public class HelloServiceImpl implements HelloService{
	
	@Override
	public String sayHello(String name) {
		return "Welcome to JAX-WS webservices Dear "+name;
	}
}