import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner a = new Scanner(System.in);
    double height = a.nextDouble();
    double weight = a.nextDouble();
    double bmi = weight / (height * height);
    System.out.print(bmi);
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
  }
}
