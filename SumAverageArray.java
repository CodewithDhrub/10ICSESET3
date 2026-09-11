/*
sum = sum + a[i]
average = sum / n
OUTPUT==>
Enter number of elements: 5
Enter 5 elements:
10 20 30 40 50
Sum = 150
Average = 30.0
*/

import java.util.*;

class ArrayAverage
{
    int a[];
    int n;
    int sum = 0;
    double average;

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
            sum = sum + a[i];
        }

        average = (double)sum / n;
    }

    void display()
    {
        getData();
        calculate();

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}

class ArrayAverageDemo
{
    public static void main(String args[])
    {
        ArrayAverage ob = new ArrayAverage();
        ob.display();
    }
}