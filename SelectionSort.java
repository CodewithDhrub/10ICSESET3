import java.util.*;

class SelectionSort
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
            int pos = i;

            for(int j = i + 1; j < n; j++)
            {
                if(a[j] < a[pos])
                    pos = j;
            }

            int temp = a[i];
            a[i] = a[pos];
            a[pos] = temp;
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

class SelectionSortDemo
{
    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        ob.display();
    }
}
