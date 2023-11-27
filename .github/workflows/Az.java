class Pen{
	String color;
	String style;
	public void print(){
		System.out.println("The color of pen is "+ this.color);
		System.out.println("The Style of pen is "+ this.style);
	}
}

public class Az{
	public static void main(String args[]){
		Pen p1 = new Pen();
		p1.color = "blue";
		p1.style = "Simple";
		Pen p2 = new Pen();
		p2.color = "Black";
		p2.style = "Modern";
		p1.print();
		p2.print();
	}
}