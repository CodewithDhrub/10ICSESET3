/*
Mechanism 
40 20 10 30
40 > 20 → swap
20 40 10 30
40 > 10 → swap
20 10 40 30
Continue...

OUTPUT==>

Enter number of elements: 5
Enter 5 elements:
40 10 50 20 30
Array in ascending order:
10 20 30 40 50

*/

import java.util.*;

class BubbleSort
{
    int a[];
    int n;

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
        for(int i = 0; i < n - 1; i++)
        {
            for(int j = 0; j < n - 1 - i; j++)
            {
                if(a[j] > a[j + 1])
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    void display()
    {
        getData();
        calculate();

        System.out.println("Array in ascending order:");

        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}

class BubbleSortDemo
{
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        ob.display();
    }
}
