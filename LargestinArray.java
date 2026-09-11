/*
OUTPUT AT THE END.
Remember:
largest = a[0];
for(int i = 1; i < n; i++)
*/
import java.util.*;

class Largest
{
    int a[];
    int n;
    int largest;

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
        largest = a[0];

        for(int i = 1; i < n; i++)
        {
            if(a[i] > largest)
                largest = a[i];
        }
    }

    void display()
    {
        getData();
        calculate();

        System.out.println("Largest element = " + largest);
    }
}

class LargestDemo
{
    public static void main(String args[])
    {
        Largest ob = new Largest();
        ob.display();
    }
}

/*
Enter number of elements: 5
Enter 5 elements:
12 45 23 67 34
Largest element = 67
*/