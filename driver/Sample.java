package driver;

import com.service.FlyingService;
import com.service.WalkingService;
import com.serviceImpl.ServiceLocator;

public class Sample {
	public static void main(String[] args) {
		FlyingService flyingService = ServiceLocator.shared.getService(FlyingService.class);
		flyingService.fly();

		WalkingService walkingService = ServiceLocator.shared.getService(WalkingService.class);
		walkingService.walk();
	}
}
