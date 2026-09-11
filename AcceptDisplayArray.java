import java.util.*;

class ArrayDisplay
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

    void display()
    {
        getData();

        System.out.println("Array elements:");

        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}

class ArrayDisplayDemo
{
    public static void main(String args[])
    {
        ArrayDisplay ob = new ArrayDisplay();
        ob.display();
    }
}
