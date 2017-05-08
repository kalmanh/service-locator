package com.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import com.service.FlyingService;
import com.service.WalkingService;

@SuppressWarnings("rawtypes")
public class ServiceLocator {
	private Map serviceLookup;
	
	public static ServiceLocator shared = new ServiceLocator();
	
	@SuppressWarnings("unchecked")
	private ServiceLocator() {
		serviceLookup = new HashMap();
		serviceLookup.put(FlyingService.class, new Flyer());
		serviceLookup.put(WalkingService.class, new Walker());
	}
	
	@SuppressWarnings("unchecked")
	public <T> T getService(Class<T> clazz) {
		return (T) serviceLookup.get(clazz);
	}
}
