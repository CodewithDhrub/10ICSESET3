import java.util.*;

class Smallest
{
    int a[];
    int n;
    int smallest;

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
        smallest = a[0];

        for(int i = 1; i < n; i++)
        {
            if(a[i] < smallest)
                smallest = a[i];
        }
    }

    void display()
    {
        getData();
        calculate();

        System.out.println("Smallest element = " + smallest);
    }
}

class SmallestDemo
{
    public static void main(String args[])
    {
        Smallest ob = new Smallest();
        ob.display();
    }
}