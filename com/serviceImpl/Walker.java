package com.serviceImpl;

import com.service.WalkingService;

public class Walker implements WalkingService{

	@Override
	public void walk() {
		System.out.println("I am walking!!!");
	}

}
