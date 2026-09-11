/*
Enter size of first array: 3
Enter elements of first array:
10 20 30

Enter size of second array: 3
Enter elements of second array:
40 50 60

Merged array:
10 20 30 40 50 60
*/

import java.util.*;

class Merge
{
    int a[], b[], c[];
    int n1, n2;

    void getData()
    {
        Scanner conin = new Scanner(System.in);

        System.out.print("\nEnter size of first array: ");
        n1 = conin.nextInt();

        a = new int[n1];

        System.out.println("Enter elements of first array:");

        for(int i = 0; i < n1; i++)
        {
            a[i] = conin.nextInt();
        }

        System.out.print("Enter size of second array: ");
        n2 = conin.nextInt();

        b = new int[n2];

        System.out.println("Enter elements of second array:");

        for(int i = 0; i < n2; i++)
        {
            b[i] = conin.nextInt();
        }
    }

    void calculate()
    {
        c = new int[n1 + n2];

        for(int i = 0; i < n1; i++)
        {
            c[i] = a[i];
        }

        for(int i = 0; i < n2; i++)
        {
            c[n1 + i] = b[i];
        }
    }

    void display()
    {
        getData();
        calculate();

        System.out.println("Merged array:");

        for(int i = 0; i < c.length; i++)
        {
            System.out.print(c[i] + " ");
        }
    }
}

class MergeDemo
{
    public static void main(String args[])
    {
        Merge ob = new Merge();
        ob.display();
    }
}
