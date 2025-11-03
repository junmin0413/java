package exam1029;

public class ClickableExample {
	public static void main(String[] args) {
		Clickable c1 = new Image();
		Clickable c2 = new Button();
		
		c1.click();
		c2.click();
		
		Drowable d1 = (Image) c1;
		Drowable d2 = (Button) c2;
		
		d1.draw();
		d2.draw();
		
		if(c1 instanceof Image) {
			Image i = (Image) c1;
			System.out.println(i.url);
			Drowable d = i;
			d.draw();
		}
		
		if(c1 instanceof Image) {
			Button b = (Button) c2;
			System.out.println(b.label);
			Drowable d = b;
			d.draw();
		}
	}
}
