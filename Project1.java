import java.util.Scanner;

public class Project1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Prompt user for number of minutes
    System.out.println("Enter the number of minutes:");
    int minutes = input.nextInt();

     // Number of minutes in a year
    int year = minutes / 525600;
    int day = minutes / 1440;
    int remainingtime = day % 365;

    System.out.println(minutes + " minutes is approximately " + year + " years and "  +  remainingtime + " days ");
    }

   }