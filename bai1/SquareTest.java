package bai1;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2);
        System.out.println(square);
        square = new Square("blue",true,5);
        System.out.println(square);
    }
}
