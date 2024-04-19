import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     Scanner a = new Scanner(System.in);
    int num = a.nextInt();
    for(int i = num; i >= 0; i --)
      {
        int j = 0;
        while(j < i)
          {
            System.out.print("*");
            j++;
          }
        System.out.println();
      }
    
  }
}
