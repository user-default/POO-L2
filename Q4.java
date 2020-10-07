import java.util.Scanner;

public class Main
{
  public static void main(String [] args)
  { 
    int j = 0;
    Scanner input = new Scanner(System.in);
    for (int k = 1; k != 0;)
    {
      k = input.nextInt();
      if(k == 2) j++;
    }
    System.out.printf("Quantidade de vezes em que 2 foi digitado: %d\n", j);
  }
} 
