package com.demo;

public class BubbleSortExample {
    public static void main(String[] args) {
    int a[] = {16, 19, 11, 15, 10, 12, 14, 8, 9,13}; //массив с 10 чисел
    for(int j = 0; j<a.length; j++)
    {
        //инициализировать если будет обмен то  false
        boolean swapped = false;
        int i = 0;
        while(i<10-1)
        {
            //сравнить соседние елементы
            if (a[i] > a[i+1])
            {
                //swapping
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                //Changing the value of swapped
                swapped = true;
            }
            i++;
        }
        //if swapped is false then the array is sorted
        //we can stop the loop
        if (!swapped)
            break;
    }

        for(int x : a)
    {
        System.out.print(x + " ");
    }

}
}