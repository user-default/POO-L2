import java.util.Scanner;

public class Main
{
  public static void main(String [] args)
  { 
    Scanner input = new Scanner(System.in);
    for(int i = 1; i != 0;)
    {
        System.out.println("Qual é a sua idade?\n");
        i = input.nextInt();
        if (((i >= 5) && (i <= 10))) System.out.println("\nCategoria INFANTIL\n");
        else if ((i >= 11) && (i <= 15)) System.out.println("\nCategoria JUVENIL\n");
        else if ((i >= 16) && (i <= 20)) System.out.println("\nCategoria JÚNIOR\n");
        else if ((i >= 21) && (i <= 25)) System.out.println("\nCategoria PROFISSIONAL\n");
        else if (i == 0) System.out.println("Fim de execução!\n");
        else System.out.println("\nIdade incorreta!\n");
    }
  }
} 
