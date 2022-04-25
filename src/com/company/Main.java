package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
       ArrayList<Integer> arrayList1 = new ArrayList<>();
       ArrayList<Integer> arrayList2 = new ArrayList<>();


        for (int i = 0; i < 50; i++) {
            arrayList.add(random.nextInt(1,100));

        }
        System.out.println(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)%2==1){
                arrayList1.add(arrayList.get(i));

            }else {
                arrayList2.add(arrayList.get(i));
            }
        }
        System.out.println(arrayList1);
        System.out.println(arrayList2);
    }
}
