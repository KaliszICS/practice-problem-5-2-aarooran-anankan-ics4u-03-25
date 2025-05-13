class Sphere extends Circle{
    
    public Sphere(double radius) {
        super(radius);
    }

    @Override
    public double area() {
        return 4 * (Math.PI) * super.radius * super. radius;
    }

    public double volume() {
        return (4 * (Math.PI) * super.radius * super.radius * super.radius)/3;
    }
}
