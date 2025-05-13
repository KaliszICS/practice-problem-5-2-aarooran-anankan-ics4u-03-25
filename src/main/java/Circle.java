class Circle {

    //Instance Variables
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double diameter() {
        return 2 * this.radius;
    }

    public double perimeter() {
        return 2 * (Math.PI) *this.radius;
    }

    public double area() {
        return (Math.PI) * this.radius * this.radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }
}