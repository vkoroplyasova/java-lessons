package ru.tn.courses.vkoroplyasova.v5.task1;

//Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию. Делается это следующим
// образом: сравниваются два соседних элемента ai и аi+1. Если ai ≤ ai+1, то продвигаются на один элемент вперед.
// Если ai > ai+1, то производится перестановка и сдвигаются на один элемент назад. Составить алгоритм этой сортировки.

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Subtask_3 {
    public static void main(String[] args){
        shell_sort(generate_list());
    }

    public static ArrayList<Double> generate_list(){
        int n = ThreadLocalRandom.current().nextInt(2, 10);
        ArrayList<Double> import_list = new ArrayList<>();
        for(int count = 0; count < n; count++)
            import_list.add(ThreadLocalRandom.current().nextDouble(-999, 999));
        System.out.println("Generated list: " + import_list);
        return import_list;
    }

    public static ArrayList<Double> shell_sort(ArrayList<Double> import_list){
        ArrayList<Double> sorted_list = import_list;
        int i = 0;
        double temp = 0;
        while(i < sorted_list.size() - 1){
            if(sorted_list.get(i) <= sorted_list.get(i + 1))
                i++;
            else{
                temp = sorted_list.get(i);
                sorted_list.set(i, sorted_list.get(i + 1));
                sorted_list.set(i + 1, temp);
                if(i != 0)
                    i--;
            }
        }
        System.out.println("Sorted list: " + sorted_list);
        return sorted_list;
    }
}
