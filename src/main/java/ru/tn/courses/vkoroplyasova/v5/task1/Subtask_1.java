package ru.tn.courses.vkoroplyasova.v5.task1;
/*
Дана последовательность натуральных чисел a1, a2, ..., an. Создать массив из четных чисел этой последовательности.
Если таких чисел нет, то вывести сообщение об этом факте.
 */

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Subtask_1 {
    public static void main(String[] args){
        ArrayList<Integer> result = new ArrayList<>();
        result = generate_even_list(generate_list());
        if (result.size() == 0)
            System.out.println("Import list does not contain even numbers");
        else
            System.out.println("Generated even numbers list: " + result);
    }

    public static ArrayList<Integer> generate_list(){
        int count = 0;
        int import_size = ThreadLocalRandom.current().nextInt(1, 31);
        ArrayList<Integer> import_list = new ArrayList<>();
        for(count = 0; count < import_size; count++)
            import_list.add(ThreadLocalRandom.current().nextInt(0, 999));
        System.out.println("Generated numbers list: " + import_list);
        return import_list;
    }

    public static ArrayList<Integer> generate_even_list(ArrayList<Integer> import_list){
        int count = 0;
        ArrayList<Integer> even_list = new ArrayList<>();
        for(count = 0; count < import_list.size(); count++)
            if (import_list.get(count) % 2 == 0)
                even_list.add(import_list.get(count));
        return even_list;
    }
}
