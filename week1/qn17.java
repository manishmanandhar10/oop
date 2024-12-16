package workshop1;

class Rectangle {
    double width;
    double height;

    // Constructor to initialize the width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Override toString method to return the rectangle's dimensions in a readable format
    @Override
    public String toString() {
        return "Rectangle [Width: " + width + ", Height: " + height + "]";
    }
}

public class qn17 {
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(5.0, 10.0);

        // Print the rectangle's dimensions using the toString method
        System.out.println(rectangle);
    }
}

