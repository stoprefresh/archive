package com.skilldistillery.sdinity.fdo;


public class MonitoringApp {

	public static void main(String[] args) {
		MonitoringApp ma = new MonitoringApp();	
		ma.startApp();
	}
	public void startApp() {
		HomeDevices devices = new HomeDevices();
		devices.addHomeDevices();
//		switchOnLights(devices);
//		switchOffLights(devices);
		fillAllItems(devices.fillables, 20);
//		switchOffKitchenAppliances(devices);
		
	}
	
	public void switchOnLights(HomeDevices devices) {
		devices.turnOnLights();

	}
	public void switchOffLights(HomeDevices devices) {
		devices.turnOffLights();

	}
	

	public void fillAllItems(Fillable[] fillables, int gallons) {

		for(Fillable d : fillables) {
			if(d != null) {	
					d.fill(gallons);		
			}
			
		}
	}
	public void switchOffKitchenAppliances(HomeDevices devices) {
		devices.turnOffKitchen();
		
	}

}
