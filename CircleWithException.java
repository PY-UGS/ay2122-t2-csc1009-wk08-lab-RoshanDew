class CircleWithException {
    private double radius;
    private final static double PI = 3.142;

    //Method to set the radius of the circle
    public void setRadius(double radius) throws IllegalArgumentException {
    //Throw an error if radius is not positive number
        if(radius <= 0)
        {
            throw new IllegalArgumentException();
        }
        else
        {
            this.radius = radius;
        }
    }

    //Method to get the radius of the circle
    public double getRadius() {
        return radius;
    }

    //Method to get the area of the circle
    public double getArea() throws Exception{
        double area = PI * radius * radius;
        if (area > 1000)
        {
            throw new Exception();
        }
        else
        {
        return area;
        }
    }

    //Method to get the diameter of the circle
    public double getDiameter(){
        return 2*radius;
    }
}
