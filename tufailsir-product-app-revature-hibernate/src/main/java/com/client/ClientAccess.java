package com.client;

public class ClientAccess {
public static void main(String[] args) {
	Client c1=new Client(1,"pavi");
	Client c2=new Client(1,"pavi");
	
	System.out.println(c1==c2);
	System.out.println(c1.equals(c2));
	
	System.out.println(c1.hashCode());
	System.out.println(c2.hashCode());

	
}
}


