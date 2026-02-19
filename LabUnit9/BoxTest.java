package LabUnit9;

class Box {
    double length, breadth;

    Box(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }
}

class Box3d extends Box {
    double height;

    Box3d(double l, double b, double h) {
        super(l, b); // Calling parent constructor
        height = h;
    }

    double volume() {
        // Reusing area() from the base class
        return area() * height;
    }

    void display() {
        System.out.println("Length: " + length + ", Breadth: " + breadth + ", Height: " + height);
        System.out.println("Surface Area (Base): " + area());
        System.out.println("Volume: " + volume());
    }
}

public class BoxTest {
    public static void main(String[] args) {
        Box3d myBox = new Box3d(10, 5, 2);
        myBox.display();
    }
}
