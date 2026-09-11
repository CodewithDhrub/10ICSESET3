import java.util.*;

class NumberCount
{
    int a[];
    int n;
    int positive = 0;
    int negative = 0;
    int zero = 0;

    void getData()
    {
        Scanner conin = new Scanner(System.in);

        System.out.print("\nEnter number of elements: ");
        n = conin.nextInt();

        a = new int[n];

        System.out.println("Enter " + n + " elements:");

        for(int i = 0; i < n; i++)
        {
            a[i] = conin.nextInt();
        }
    }

    void calculate()
    {
        for(int i = 0; i < n; i++)
        {
            if(a[i] > 0)
                positive++;
            else if(a[i] < 0)
                negative++;
            else
                zero++;
        }
    }

    void display()
    {
        getData();
        calculate();

        System.out.println("Positive numbers = " + positive);
        System.out.println("Negative numbers = " + negative);
        System.out.println("Zeroes = " + zero);
    }
}

class NumberCountDemo
{
    public static void main(String args[])
    {
        NumberCount ob = new NumberCount();
        ob.display();
    }
}