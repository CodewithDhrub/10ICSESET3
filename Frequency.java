import java.util.*;

class Frequency
{
    int a[];
    int n;
    int search;
    int count = 0;

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

        System.out.print("Enter element: ");
        search = conin.nextInt();
    }

    void calculate()
    {
        for(int i = 0; i < n; i++)
        {
            if(a[i] == search)
                count++;
        }
    }

    void display()
    {
        getData();
        calculate();

        System.out.println("Frequency = " + count);
    }
}

class FrequencyDemo
{
    public static void main(String args[])
    {
        Frequency ob = new Frequency();
        ob.display();
    }
}