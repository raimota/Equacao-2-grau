import java.util.Scanner;

class Main {
  public static float validar(int a) {
    Scanner leia = new Scanner(System.in);
    if (a > 0) {
      return a;
    } else {
      while (a == 0) {
        System.out.printf("Digite um valor para 'a' diferente de 0: ");
        a = leia.nextInt();
      }
      return a;
    }
  }

  public static double delta(int a, int b, int c) {
    return (b * b) + (-4 * a) * c;
  }

  public static double x1(int a, int b, int c) {
    double d;
    d = delta(a, b, c);
    return (-b + Math.sqrt(d)) / (2 * a);
  }

  public static double x2(int a, int b, int c) {
    double d;
    d = delta(a, b, c);
    return (-b - Math.sqrt(d)) / (2 * a);
  }

  public static void raiz(int a, int b, int c) {
    double d;
    d = delta(a, b, c);
    if (d < 0) {
      System.out.printf("Não possui raízes reais\n\n");
    } else {
      if (d == 0) {
        double result = x1(a, b, c);
        System.out.printf("X = %.2f\n", result);
      } else {
        double result = x1(a, b, c);
        double result2 = x2(a, b, c);
        System.out.printf("x1 = %.2f\n", result);
        System.out.printf("x2 = %.2f\n", result2);
      }
    }
  }

  public static void main(String[] args) {
    try (Scanner leia = new Scanner(System.in);) {
      int a, b, c;
      System.out.println();
      System.out.printf("Digite um valor para 'a': ");
      a = leia.nextInt();
      while (a == 0) {
        System.out.printf("Digite um valor para 'a' diferente de 0: ");
        a = leia.nextInt();
      }
      validar(a);
      System.out.printf("Digite um valor para 'b': ");
      b = leia.nextInt();
      System.out.printf("Digite um valor para 'c': ");
      c = leia.nextInt();
      raiz(a, b, c);
    }
  }
}