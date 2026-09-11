/*
Enter number of elements: 7
Enter elements in ascending order:
10 20 30 40 50 60 70
Enter element to search: 50
Element found at position 5
*/

import java.util.*;

class BinarySearch
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

        System.out.println("Enter elements in ascending order:");

        for(int i = 0; i < n; i++)
        {
            a[i] = conin.nextInt();
        }

        System.out.print("Enter element to search: ");
        search = conin.nextInt();
    }

    void calculate()
    {
        int low = 0;
        int high = n - 1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(a[mid] == search)
            {
                position = mid;
                break;
            }
            else if(search > a[mid])
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
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

class BinarySearchDemo
{
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        ob.display();
    }
}