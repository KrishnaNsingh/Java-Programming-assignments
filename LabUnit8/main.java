package LabUnit8;

class Point {
    private int x, y;

    // Default Constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Parameterized Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
    
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}
