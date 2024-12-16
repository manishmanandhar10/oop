package workshop1;

public class qn4 {
	    public static void main(String[] args) {
	        // Triangle sides
	        double a = 3;
	        double b = 4;
	        double c = 5;

	        // Semi-perimeter
	        double s = (a + b + c) / 2;

	        // Area using Heron's formula
	        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

	        // Print the result
	        System.out.println("Area of the triangle: " + area);
	    }
	}

