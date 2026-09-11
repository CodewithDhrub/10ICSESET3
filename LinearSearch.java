/*
Array: 10 20 30 40 50
Search: 30

10 ❌
20 ❌
30 ✅

OUTPUT==>
Enter number of elements: 5
Enter 5 elements:
10 20 30 40 50
Enter element to search: 30
Element found at position 3
*/

import java.util.*;

class LinearSearch
{
    int a[];
    int n;
    int search;
    int position = -1;

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

        System.out.print("Enter element to search: ");
        search = conin.nextInt();
    }

    void calculate()
    {
        for(int i = 0; i < n; i++)
        {
            if(a[i] == search)
            {
                position = i;
                break;
            }
        }
    }

    void display()
    {
        getData();
        calculate();

        if(position != -1)
            System.out.println("Element found at position " + (position + 1));
        else
            System.out.println("Element not found");
    }
}

class LinearSearchDemo
{
    public static void main(String args[])
    {
        LinearSearch ob = new LinearSearch();
        ob.display();
    }
}