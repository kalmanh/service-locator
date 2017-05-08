package com.serviceImpl;

import com.service.FlyingService;

public class Flyer implements FlyingService {

	@Override
	public void fly() {
		System.out.println("I am flying!!!");
	}

}
