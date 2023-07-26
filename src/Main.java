import com.qa.Circle;
import com.qa.Point;
import com.qa.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle("rectangle1", "black", 1,1,2,2);
        Rectangle rectangle2= new Rectangle("rectangle2", "blue", 2,2,4,6);
        System.out.println(rectangle1.toString());
        System.out.println(rectangle2.toString());

        System.out.println(rectangle1+ "Area: "+rectangle1.getArea()+" CentrePoint: "+rectangle1.getCentrePoint()+" is square: "+ rectangle1.isSquare());
        System.out.println(rectangle2+ "Area: "+rectangle2.getArea()+" CentrePoint: "+rectangle2.getCentrePoint()+" is square: "+ rectangle2.isSquare());


        Circle circle1 = new Circle("Circle1", "White", 1,1,2);
        Circle circle2 = new Circle("Circle2", "Red", 2,2,5);
        System.out.println(circle1.toString());
        System.out.println(circle2.toString());

        System.out.println(circle1 + ", CentrePoint is: " + circle1.getCentrePoint() + ", Area is: " + circle1.getArea());
        System.out.println(circle2 + ", CentrePoint is: " + circle2.getCentrePoint() + ", Area is: " + circle2.getArea());

    }




}
