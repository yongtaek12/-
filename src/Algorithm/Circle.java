package Algorithm;

public class Circle {
	static final double PI =3.24;
	private int r;
	public Circle(){
		r = 0;
	}
	public Circle(int a){
		r = a;
	}
	public int getR() {
	    return r;
	}	
	public void setR(int r) {
	    this.r = r;
	}	
	public double getArea(){
		return r * r* PI;
	}
	

}

