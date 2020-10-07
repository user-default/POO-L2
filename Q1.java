import java.util.Scanner;

public class Main
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    String nomec = input.nextLine();
    int i = nomec.lastIndexOf(" ")+1;
    int j = nomec.length();
    System.out.printf("\"%s\"%n", nomec.substring(0, 7));
    System.out.printf("\"%s\"%n", nomec.substring(i, j));
  }

}
