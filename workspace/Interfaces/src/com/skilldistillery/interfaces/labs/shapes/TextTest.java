package com.skilldistillery.interfaces.labs.shapes;

public class TextTest {

	public static void main(String[] args) {

		TextTest t = new TextTest();
		
		t.begin();
		
		
		
	}
	
	public void begin() {
		Drawable drawO[] = new Drawable[5];
		
		drawO[0] = new Circle(2.2);
		drawO[1] = new Rectangle(3.2, 2.5);
		drawO[2] = new Circle(5.4);
		drawO[3] = new Rectangle(5.0, 3.0);
		drawO[4] = new Circle(3.4);
		
		
		
		for(Drawable d : drawO) {
			if(d != null) {
				d.Draw();	
			}
		}
	}
}
