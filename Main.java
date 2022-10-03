import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //A = B*A
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o valor da base do quadrado: ");

    double base = sc.nextDouble();  
    double area = (base * base) * 2;

    System.out.println("o dobro desta area é: " + area);
  }
}