package ru.stqa.pft.sandbox;

public class Da {
    public static void main(String[] args) {
        hello("world");
        hello("user");
        double l = 5;
        Square s = new Square(5);
        System.out.println("Квадрат = " + s.area());
        Rectangle r = new Rectangle(4,5);
        r.a = 4;
        r.b = 5;
        System.out.println("Площадь = " + r.a +" "+  r.b +" "+  r.area());

    }

    public static void hello(String somebody) {
        System.out.println("Hello " + somebody + "!");
    }




}
