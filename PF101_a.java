import java.util.Scanner;

public class PF101_a{ 
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);

        System.out.print("Enter a month: ");
        String month = a.nextLine();

        if(month.equalsIgnoreCase("December") || 
           month.equalsIgnoreCase("January") || 
           month.equalsIgnoreCase("February")){
           System.out.println("Dry Season");
        } 
        else if(month.equalsIgnoreCase("March") || 
                month.equalsIgnoreCase("April") || 
                month.equalsIgnoreCase("May")){
                System.out.println("Summer Season"); 
        } 
        else if(month.equalsIgnoreCase("June") || 
                month.equalsIgnoreCase("July") || 
                month.equalsIgnoreCase("August")){
                System.out.println("Wet Season");
        } 
        else if(month.equalsIgnoreCase("September") || 
                month.equalsIgnoreCase("October") || 
                month.equalsIgnoreCase("November")){
                System.out.println("Typhoon Season");
        }else{
            System.out.println("Sorry, not found.");
        }

    }
}