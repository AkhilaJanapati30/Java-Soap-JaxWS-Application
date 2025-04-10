package com.akhila.ws;

import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public interface HelloService{
	@jakarta.jws.WebMethod
	String sayHello(String name);
}