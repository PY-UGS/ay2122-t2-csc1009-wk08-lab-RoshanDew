import java.util.Scanner;
public class Circle{ 
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        CircleWithException circleException = new CircleWithException();
        try{
            System.out.print("Enter radius of circle:");
            double radius = input.nextDouble();
            circleException.setRadius(radius);
            System.out.println("The radius of circle is: " +radius);
            System.out.println("The area of circle is: " + circleException.getArea());
            System.out.println("The diameter of the circle is: " + circleException.getDiameter());

        }catch(IllegalArgumentException e){
            System.out.println("Error: Input must be a positive number");
        }catch(Exception e){
            System.out.println("Error: Area of circle is more than 1000");
        }

        input.close();
    }

}
