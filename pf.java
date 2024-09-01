import java.util.Scanner;
public class pf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter first grade: ");
        int g1 = sc.nextInt();

        System.out.print("Enter second grade: ");
        int g2 = sc.nextInt();

        System.out.print("Enter third grade: ");
        int g3 = sc.nextInt();

        System.out.print("Enter fourth grade: ");
        int g4 = sc.nextInt();

        double average = (g1 + g2 + g3 + g4) / 4;

        System.out.println("\nSTUDENTS INFORMATION: ");

        System.out.println("Name: " + name);

        System.out.println("Average grade: " + average);

        if(average >= 90){
            System.out.println("Remark: Excellent");
        }else if(average > 80){
            System.out.println("Remark: Very Good");
        }else if(average > 70){
            System.out.println("Remark: Good");
        }else if (average > 60){
            System.out.println("Remark: Satisfactory");
        }else{
            System.out.println("Remark: Needs improvement");
        }

        if(age >= 18){
            System.out.println("Status: Adult");
        }else{
            System.out.println("Status: Minor");
        }


        sc.close();
        
    }
    
}
