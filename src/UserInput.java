import java.util.Scanner;

public class UserInput {
    public static void main(String[] args)
    {
        //Prompt
        System.out.println("Please enter your First Initial, Last Name, House Number, Street Name, Street Type and City: ");

        //Variables and Scanner Object
        Scanner kybd = new Scanner(System.in);


        String firstInitial = kybd.next();
        String lastName = kybd.next();
        int houseNum = kybd.nextInt();
        String streetName = kybd.next();
        String streetType = kybd.next();
        String city = kybd.next();

        //Displaying
        System.out.println("Your information has been stored: ");
        System.out.print(firstInitial + " " + lastName + " " + houseNum + " ");
        System.out.println(streetName + " " + streetType + " " + city);

    }
}
