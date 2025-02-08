
import java.util.Scanner;
public class WeekPlanner{
    public static void main (String[] args){
        String[][] schedule = new String[7][2];
        schedule[0][0]="Sunday";
        schedule[0][1]="do homework";
        schedule[1][0]="Monday";
        schedule[1][1]="go to courses; watch a film";
        schedule[2][0]="Tuesday";
        schedule[2][1]="go to a cinema";
        schedule[3][0]="Wednesday";
        schedule[3][1]="do sport";
        schedule[4][0]="Thursday";
        schedule[4][1]="swimming";
        schedule[5][0]="Friday";
        schedule[5][1]="go to picnic";
        schedule[6][0]="Saturday";
        schedule[6][1]="spend time with family";

        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please, input the day of the week: ");
            String input = sc.nextLine();
            input.trim();
            switch (input.toLowerCase()) {
                case "monday":
                    System.out.println("Your task for Monday: " + schedule[1][1]);
                    break;
                case "tuesday":
                    System.out.println("Your task for Tuesday: " + schedule[2][1]);
                    break;
                case "wednesday":
                    System.out.println("Your task for Wednesday: " + schedule[3][1]);
                    break;
                case "thursday":
                    System.out.println("Your task for Thursday: " + schedule[4][1]);
                    break;
                case "friday":
                    System.out.println("Your task for Friday: " + schedule[5][1]);
                    break;
                case "saturday":
                    System.out.println("Your task for Saturday: " + schedule[6][1]);
                    break;
                case "sunday":
                    System.out.println("Your task for Sunday: " + schedule[0][1]);
                    break;
                case "change monday":
                    System.out.println("Please, input new tasks for Monday.");
                    schedule[1][1] = sc.nextLine();
                    System.out.println("Your task for Monday: " + schedule[1][1]);
                    break;
                case "change tuesday":
                    System.out.println("Please, input new tasks for Tuesday.");
                    schedule[2][1] = sc.nextLine();
                    System.out.println("Your task for Tuesday: " + schedule[2][1]);
                    break;
                case "change wednesday":
                    System.out.println("Please, input new tasks for Wednesday.");
                    schedule[3][1] = sc.nextLine();
                    System.out.println("Your task for Wednesday: " + schedule[3][1]);
                    break;
                case "change thursday":
                    System.out.println("Please, input new tasks for Thursday.");
                    schedule[4][1] = sc.nextLine();
                    System.out.println("Your task for Thursday: " + schedule[4][1]);
                    break;
                case "change friday":
                    System.out.println("Please, input new tasks for Friday.");
                    schedule[5][1] = sc.nextLine();
                    System.out.println("Your task for Friday: " + schedule[5][1]);
                    break;
                case "change saturday":
                    System.out.println("Please, input new tasks for Saturday.");
                    schedule[6][1] = sc.nextLine();
                    System.out.println("Your task for Saturday: " + schedule[6][1]);
                    break;
                case "change sunday":
                    System.out.println("Please, input new tasks for Sunday.");
                    schedule[0][1] = sc.nextLine();
                    System.out.println("Your task for Sunday: " + schedule[0][1]);
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
            }
        }
    }
}
