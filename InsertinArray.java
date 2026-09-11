/*
Enter number of elements: 4
Enter 4 elements:
10 20 30 40
Enter element to insert: 25
Enter position: 3
Array after insertion:
10 20 25 30 40
*/
import java.util.*;

class Insert
{
    int a[];
    int n;
    int element;
    int position;

    void getData()
    {
        Scanner conin = new Scanner(System.in);

        System.out.print("\nEnter number of elements: ");
        n = conin.nextInt();

        a = new int[n + 1];

        System.out.println("Enter " + n + " elements:");

        for(int i = 0; i < n; i++)
        {
            a[i] = conin.nextInt();
        }

        System.out.print("Enter element to insert: ");
        element = conin.nextInt();

        System.out.print("Enter position: ");
        position = conin.nextInt();
    }

    void calculate()
    {
        for(int i = n; i >= position; i--)
        {
            a[i] = a[i - 1];
        }

        a[position - 1] = element;
        n++;
    }

    void display()
    {
        getData();
        calculate();

        System.out.println("Array after insertion:");

        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}

class InsertDemo
{
    public static void main(String args[])
    {
        Insert ob = new Insert();
        ob.display();
    }
}
