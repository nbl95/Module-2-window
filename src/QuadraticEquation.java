import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a:");
        double a = scanner.nextDouble();
        System.out.println("enter b:");
        double b = scanner.nextDouble();
        System.out.println("enter c:");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta == 0) {
            System.out.println("Your Root is" + quadraticEquation.getRoot1());
        } else if (delta > 0) {
            System.out.println("You have too Root:\n Root 1:" + quadraticEquation.getRoot1() + "\n Root2: " + quadraticEquation.getRoot2());
        } else {
            System.out.println("the equation has no roots");
        }
    }

    protected double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return Math.pow(this.b, 2) - (4 * this.a * this.c);
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(Math.pow(this.b, 2) - (4 * this.a * this.c))) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(Math.pow(this.b, 2) - (4 * this.a * this.c))) / (2 * this.a);
    }
}
