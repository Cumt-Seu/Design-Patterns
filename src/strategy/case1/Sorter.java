package strategy.case1;

import java.util.Arrays;

public class Sorter {
   /* public static void sort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j+1]<arr[j])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void sort(Cat[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j+1].compareTo(arr[j])<0)
                {
                    Cat temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }*/
   public static void sort(Comparable[] arr) {
       for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr.length - i - 1; j++) {
               if (arr[j + 1].compareTo(arr[j]) < 0) {
                   Comparable temp = arr[j];
                   arr[j] = arr[j + 1];
                   arr[j + 1] = temp;
               }
           }
       }
   }
    public static void main(String[] args) {
/*        int arr[]={1,3,9,6,2,7,4};
        Sorter.sort(arr);
        System.out.println(Arrays.toString(arr));*/
        Cat[] cats={new Cat(10,10),new Cat(2,2),new Cat(3,3)
        ,new Cat(1,1),new Cat(7,7),new Cat(5,5)};
        Sorter.sort(cats);
        System.out.println(Arrays.toString(cats));
    }
}
