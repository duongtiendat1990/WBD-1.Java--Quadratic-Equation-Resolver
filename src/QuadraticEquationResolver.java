import java.util.Scanner;

public class QuadraticEquationResolver {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Quadratic Equation Resolver");
    System.out.println("Given a equation as 'a * x * x + b * x + c = 0', please enter constants:");
    System.out.print("a: ");
    double a = scanner.nextDouble();

    System.out.print("b: ");
    double b = scanner.nextDouble();

    System.out.print("c: ");
    double c = scanner.nextDouble();

    if (a==0) {
      linearEquationResolver(b,c);
    } else {
      double delta = b*b - 4*a*c;
      if (delta<0 ) System.out.print("No solution!");
      else System.out.printf("Equation pass with x = %f and %f! \n",(-b+Math.sqrt(delta))/(2*a),(-b-Math.sqrt(delta))/(2*a));
    }
  }
  public static void linearEquationResolver(double a, double b) {
    if (a != 0) {
      double answer = -b / a;
      System.out.printf("Equation pass with x = %f!\n", answer);
    }
    else {
      if (b == 0) {
        System.out.print("The solution is all x!");
      }
      else {
        System.out.print("No solution!");
      }
    }
  }
}
