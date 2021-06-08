package JavaCodes;

import java.util.Scanner;

public class SecondLargest
{
    public static void main(String args[])
    {
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter the elements");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Current array is:-");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        for(int i=0; i<n; i++ )
        {
            for(int j=i+1; j<n; j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp= arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println("Sorted array is ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Second smallest elememt is "+arr[n-2]);
    }
}