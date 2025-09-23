import java.util.Scanner;

class Quadratic {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        double a;
        System.out.print("Enter coefficient a: ");
        a = in.nextDouble();
        if (a == 0) {
            System.out.println("Not a quadratic equation. 'a' cannot be zero.");
        }
    

        System.out.print("Enter coefficient b: ");
        double b = in.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = in.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and distinct.");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal.");
            System.out.println("Root 1 and Root 2 = " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are imaginary.");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }

        
    }
}
