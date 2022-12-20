public class Main {
    public static void main(String[]args) {
        CircleWithStaticMethods circle1 = new CircleWithStaticMethods();
        System.out.println(circle1.getArea());
        System.out.println(circle1.getCircumference());
        CircleWithStaticMethods circle2 = new CircleWithStaticMethods(4);
        System.out.println(circle2.getArea());
        System.out.println(circle2.getCircumference());

        CircleWithStaticMethods.printClassAndMethodInfo();
    }
}
