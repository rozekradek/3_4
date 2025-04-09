

import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
   Scanner scanner  = new Scanner(System.in);
    System.out.println("Wprowadz liczbe a: ");
    int a = scanner.nextInt();
    System.out.println("Wprowadz liczbe b: ");
    int b = scanner.nextInt();
    System.out.println("Wprowadz liczbe c: ");
    int c = scanner.nextInt();

    System.out.println("1.Sprawdzanie czy trojkat jest prostokatny");
    System.out.println("2.Liczenie pola trojkata");

    int wybor=scanner.nextInt();

    switch(wybor)
      {
        case 1:
          if(a*a+b*b==c*c)
          {
            System.out.println("Trojkat jest prostokatny");
          }
          else
          {
            System.out.println("Trojkat nie jest prostokatny");
          }
          break;
        case 2:
          int p=(a+b+c)/2;
          double pole=Math.sqrt(p*(p-a)*(p-b)*(p-c));
          System.out.println("Pole trojkata wynosi: "+pole);
      }

  }


}
