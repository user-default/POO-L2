import java.util.Scanner;

public class Main
{
  public static void main(String [] args)
  { 
    Scanner input = new Scanner(System.in);
    int idade = 0;
    int pessoas = 0;
    for (int i = 0; i < 10; i++)
    {
      System.out.printf("Sua idade?\n");
      pessoas = input.nextInt();
      if(pessoas >= 0 && pessoas <= 12) idade++;

    }
    System.out.printf("Quantidade de pessoas com idade entre 0 e 12 anos: %d\n", idade);
  }
} 
