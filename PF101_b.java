import java.util.Scanner;
public class PF101_b{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        
        System.out.print("Enter a month: ");
        String month = a.nextLine();

        switch(month){
            case "January":
            case "February":
            case "December":
                System.out.println("Dry Season");
                break;

            case "March":
            case "April":
            case "May":
                System.out.println("Summer Season");
                break;

            case "June":
            case "July":
            case "August":
                System.out.println("Wet Season");
                break;

            case "September":
            case "October":
            case "November":
                System.out.println("Typhoon Season");
                break;

            default:
                System.out.println("Sorry, not found.");
        }

    }
}