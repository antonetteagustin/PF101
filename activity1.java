public class activity1{
    public static void main(String[] args) {
        
        int a = 2;

        double subject1 = 85.5;
        double subject2 = 90.0;
        double subject3 = 78.0;

        double average = (subject1 + subject2 + subject3) / 3;

        System.out.println("Your average is " + average + ".");
 
        if(average >= 75){
            System.out.println("Congratulations, you passed!");
        } else{
            System.out.println("Sorry, you failed.");
        }


    }
}