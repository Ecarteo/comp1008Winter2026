package wk11;

public class Week11 {

    public static void main(String[] args) {

        //Shape s = new Shape();

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle("Rectangle", 10, 20);

        System.out.println(r2.area());
        System.out.println(r2.perimeter());

        Shape s = new Rectangle("Example", 5, 10);
        System.out.println(s.area());

    }

}
