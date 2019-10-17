package com.skilldistillery.sdinity.fdo;

public class MonitoringApp {

	public static void main(String[] args) {
		MonitoringApp ma = new MonitoringApp();	
		ma.startApp();
	}
	public void startApp() {
		HomeDevices devices = new HomeDevices();
		switchOnLights(devices);
		switchOffLights(devices);
		fillAllItems(devices, 20);
		switchOffKitchenAppliances(devices);
	}
	
	public void switchOnLights(HomeDevices devices) {
		devices.turnOnLights();

	}
	public void switchOffLights(HomeDevices devices) {
		devices.turnOffLights();

	}
	

	public void fillAllItems(HomeDevices devices, int gallons) {
		devices.fill(gallons);
		
		
	}
	public void switchOffKitchenAppliances(HomeDevices devices) {
		devices.turnOffKitchen();
		
	}

}
