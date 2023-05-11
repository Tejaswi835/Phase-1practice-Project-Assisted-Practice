package assistedprojects;

public class Rectangle {
	    private double length;
	    private double width;
	    public Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }
	    public double calculateArea() {
	        return length * width;
	    }
	    public double calculatePerimeter() {
	        return 2 * (length + width);
	    }
	    public static void main(String[] args) {
	    	Rectangle rectangle1= new Rectangle(7.5, 5.9);
	        Rectangle rectangle2 = new Rectangle(7.5, 4.2);
	        double area1 = rectangle1.calculateArea();
	        double perimeter1 = rectangle1.calculatePerimeter();
	        double area2 = rectangle2.calculateArea();
	        double perimeter2 = rectangle2.calculatePerimeter();
	        System.out.println("Rectangle 1:");
	        System.out.println("Area: " + area1);
	        System.out.println("Perimeter: " + perimeter1);
	        System.out.println("Rectangle 2:");
	        System.out.println("Area: " + area2);
	        System.out.println("Perimeter: " + perimeter2);
	    }
	}

