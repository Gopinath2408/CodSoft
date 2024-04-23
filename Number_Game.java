import java.util.*;
public class Number_Game {
   static Scanner x=new Scanner(System.in);
    static void guess()
    {
        System.out.println("You can Attempt 10 times");
        int random=(int)(Math.random()*100)+1;
        int  count=1;
        while(true)
        {
            if(count>10) {
                System.out.println("You have reached your limit better luck next time");
                break;
            }

            System.out.println("Enter the number :");
            int n=x.nextInt();

            if(n==random)
            {
                System.out.println("Your is guess is correct!");
                if(count<3)
                {
                    System.out.println("_____________Excellent______________");
                }
                else if(count>3 && count<6) {
                    System.out.println("_____________very good_____________");
                } else if (count>6 && count<8) {
                    System.out.println("________________Good_________________");
                }
                else {
                    System.out.println("_____________fair________________");
                }

                break;
            } else if (n>random) {
                System.out.println("guess little smaller!!");
            }
            else
            {
                System.out.println("guess little higher!!");
            }

               count++;


        }

    }
    public static void main(String args[])
    {

        System.out.println("Welcome to the Number Game :");
        guess();
        System.out.println("-----------------------" +
                            "Developed by Gopinath"+
                            "----------------------");

    }
}
