package com.skilldistillery.sdinity.fdo;

public class HomeDevices implements Switchable, Fillable {
	Switchable[] switchables = new Switchable[10];
	Fillable[] fillables = new Fillable[10];
	AbstractLight[] abstractLights = new AbstractLight[10];
	KitchenAppliance[] kitchenAppliances = new KitchenAppliance[10];

	public HomeDevices() {

	}

	public void addHomeDevices() {

		abstractLights[0] = new FluorescentLight();
		abstractLights[1] = new HalogenLight();
		abstractLights[2] = new FluorescentLight();
		abstractLights[3] = new HalogenLight();

		fillables[0] = new CoffeeMaker();
		fillables[1] = new Humidifier();

		switchables[0] = new CoffeeMaker();
		switchables[1] = new HalogenLight();
		switchables[2] = new FluorescentLight();
		switchables[3] = new Humidifier();

		kitchenAppliances[0] = new CoffeeMaker();
	}

	public Switchable[] getSwitchables() {
		return switchables;
	}

	public void setSwitchables(Switchable[] switchables) {
		this.switchables = switchables;
	}

	public Fillable[] getFillables() {
		return fillables;
	}

	public void setFillables(Fillable[] fillables) {
		this.fillables = fillables;
	}

	public AbstractLight[] getAbstractLights() {
		return abstractLights;
	}

	public void setAbstractLights(AbstractLight[] abstractLights) {
		this.abstractLights = abstractLights;
	}

	public KitchenAppliance[] getKitchenAppliances() {
		return kitchenAppliances;
	}

	public void setKitchenAppliances(KitchenAppliance[] kitchenAppliances) {
		this.kitchenAppliances = kitchenAppliances;
	}

	@Override
	public void fill(int g) {
		for (int i = 0; i < fillables.length; i++) {
			if (fillables[i] != null) {
				fillables[i].fill(g);
			}
			
		}

	}

	@Override
	public void turnOn() {
		for (int i = 0; i < switchables.length; i++) {
			if (switchables != null) {
				switchables[i].turnOn();
			}
		}
	}

	public void turnOnLights() {
		for (int i = 0; i < abstractLights.length; i++) {
			if (abstractLights[i] != null) {
				abstractLights[i].turnOn();
			}
		}
	}

	public void turnOffLights() {
		for (int i = 0; i < abstractLights.length; i++) {
			if (abstractLights[i] != null) {
				abstractLights[i].turnOff();
			}
		}
	}

	public void turnOffKitchen() {
		for (int i = 0; i < kitchenAppliances.length; i++) {
			if (kitchenAppliances[i] != null) {
				kitchenAppliances[i].turnOff();
			}
			
		}
	}
	@Override
	public void turnOff() {

	}

	@Override
	public boolean isOn() {
		return false;
	}
}
