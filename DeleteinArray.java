/*
Enter number of elements: 5
Enter 5 elements:
10 20 30 40 50
Enter position to delete: 3

Array after deletion:
10 20 40 50
*/

import java.util.*;

class Delete
{
    int a[];
    int n;
    int position;

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

        System.out.print("Enter position to delete: ");
        position = conin.nextInt();
    }

    void calculate()
    {
        for(int i = position - 1; i < n - 1; i++)
        {
            a[i] = a[i + 1];
        }

        n--;
    }

    void display()
    {
        getData();
        calculate();

        System.out.println("Array after deletion:");

        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}

class DeleteDemo
{
    public static void main(String args[])
    {
        Delete ob = new Delete();
        ob.display();
    }
}
