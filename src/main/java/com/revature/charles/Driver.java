package com.revature.charles;
import com.revature.ok.Message;
import com.revature.test.Guy;

public class Driver {

	static Message m = new Message("trainer is nice");
	static Guy g = new Guy("dude");
	
	public static void main(String[] args) {
		System.out.println(m.toString());
		System.out.println(g);
	}

}
