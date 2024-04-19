import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner a = new Scanner(System.in);
    int num = a.nextInt();
    ArrayList<Integer> list1 = new ArrayList<>();
    int highest = 0;
    int highestnum = 0;
    for (int i = 0; i < num; i++)
      {
        int numc = a.nextInt();
        list1.add(numc);
      }
    for(int i = 0; i < list1.size(); i++)
      {
        int count = 0;
        for(int ii = 0; ii < list1.size(); ii++)
          {
            if(list1.get(i) == list1.get(ii))
            {
              count++;
            }
          }
        if(count>highest)
        {
          highest = count;
          highestnum = list1.get(i);
        }
      }
    System.out.print(highestnum);
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    
  }
}
