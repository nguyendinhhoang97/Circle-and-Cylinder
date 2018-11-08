public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(12, "Red");
        System.out.println(circle1.toString());
        System.out.println("The area = " + (double) Math.round(circle1.getArea() * 100) / 100);

        Cylinder cylinder1 = new Cylinder(14, "Yellow", 6);
        System.out.println(cylinder1.toString());
        System.out.println("The volume = " + (double) Math.round(cylinder1.getVolume() * 100 / 100));
    }
}
