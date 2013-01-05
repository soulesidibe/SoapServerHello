package sn.sidibe.ws;

import javax.xml.ws.Endpoint;

public class Publisher {

    public static void main(String[] args) {
	Endpoint.publish("http://192.168.0.100:9900/hello", new HelloService());
	System.out.println("Service published!");
    }
}
