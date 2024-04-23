import java.util.Scanner;
class average{
    public int average_mark(int a[],int n)
    {
        int sum=0;

        for(int i=0;i<n;i++)
        {
            sum=sum+a[i];
        }


        return sum;
    }
}

class grade_mark{
    public String grade_provide(float a)
    {
        String b="";

        if(a>=90)
        {
            b="O";
        } else if (a>=80 && a<90 ) {
            b="A+";
        } else if (a>=70 && a<80) {
            b="A";
        } else if (a>=60 && a<70) {
            b="B+";
        } else if (a>50 && a<60) {
            b="B";

        }
        else if(a==50) {
            b="C";
        }
        else {
            b="U";
        }

        return b;
    }
}
public class Grade {

    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        System.out.println("_____Welcome to the grade System_____");

            System.out.println("Enter the total number subjects");
            int n=x.nextInt();
            int arr[]=new int[n];
            int c=1;

           System.out.println("Enter a valid mark");
            for(int i=0;i<n;i++)
            {
                System.out.println("Enter the "+c+" "+"Subject mark");
                int n1=x.nextInt();
                if(n1>=0 && n1<=100)
                {
                    arr[i]=n1;
                }
                else{
                    System.out.println("**Enter a valid Mark**");
                    System.out.println("Reenter the mark");
                    i=i-1;
                    c=c-1;
                }
                c++;
            }

            average s=new average();
            int sum=s.average_mark(arr,n);
            float avg=sum/n;

            grade_mark s1=new grade_mark();
            String g=s1.grade_provide(avg);

        System.out.println("Total mark is :"+sum);
        System.out.println("Average of Your Mark is :"+avg);

        System.out.println("Grade is :"+g);



    }
}
