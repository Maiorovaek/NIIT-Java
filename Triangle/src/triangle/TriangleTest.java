package triangle;

public class TriangleTest {
        public static void main(String[] args) {
            MyPoint a = new MyPoint(0,1);
            MyPoint b = new MyPoint(2,4);
            MyPoint c = new MyPoint(3,1);
            Triangle myTriangle = new Triangle(a,b,c);

            System.out.println( myTriangle.toString() ); //* Here we will see the initial data of our triangle
            System.out.println("Рerimeter of a triangle: " + myTriangle.getPerimetr());
            System.out.println("the type of the triangle :" + myTriangle.getTrianleType());
        }

}
