package strategy.case1.improve1;

import java.util.Arrays;

public class Sorter<T>{
    public void sort(T[] arr, Comparator<T> comparator) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (comparator.compare(arr[j+1],arr[j]) < 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Cat[] cats={new Cat(10,1),new Cat(2,9),new Cat(3,8)
                ,new Cat(1,10),new Cat(7,4),new Cat(5,6)};
        //开闭原则
        Sorter<Cat> sorter=new Sorter<>();
        sorter.sort(cats,new CatWeightComparator());
        System.out.println("按照Weight排序"+Arrays.toString(cats));
        sorter.sort(cats,new CatHeightComparator());
        System.out.println("按照Height排序："+Arrays.toString(cats));
    }
}
