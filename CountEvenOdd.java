/*
Enter number of elements: 6
Enter 6 elements:
10 13 22 35 40 51
Number of even elements = 3
Number of odd elements = 3
*/
import java.util.*;

class EvenOdd
{
    int a[];
    int n;
    int even = 0;
    int odd = 0;

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
            if(a[i] % 2 == 0)
                even++;
            else
                odd++;
        }
    }

    void display()
    {
        getData();
        calculate();

        System.out.println("Number of even elements = " + even);
        System.out.println("Number of odd elements = " + odd);
    }
}

class EvenOddDemo
{
    public static void main(String args[])
    {
        EvenOdd ob = new EvenOdd();
        ob.display();
    }
}