package ru.tn.courses.vkoroplyasova.v5.task1;

/*
Каждый солнечный день улитка, сидящая на дереве, поднимается вверх на 2 см, а каждый пасмурный день опускается вниз на
1 см, В начале наблюдения улитка находится в A см от земли на B-метровом дереве. Имеется 30-элементный массив,
 содержащий сведения о том, был ли соответствующий день наблюдения пасмурным или солнечным. Написать программу,
определяющую местоположение улитки к концу 30-го дня наблюдения.
 */

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

// Для определенности примем: 1 - солнечный день, 0 - пасмурный
public class Subtask_2 {
    public static void main(String[] args) {
        System.out.println("Final position: " + define_position(generate_initial_conditions()));
    }

    public static ArrayList<Integer> generate_initial_conditions(){
        ArrayList<Integer> conditions_list = new ArrayList<>();
        int B = ThreadLocalRandom.current().nextInt(0, 100);
        int A = ThreadLocalRandom.current().nextInt(0, B);
        conditions_list.add(A);
        conditions_list.add(B);
        for(int count = 2; count < 32; count++)
            conditions_list.add(ThreadLocalRandom.current().nextInt(0, 2));
        System.out.println("Conditions_list: " + conditions_list);
        return conditions_list;
    }

    public static int define_position(ArrayList<Integer> conditions_list){
        int position = conditions_list.get(0);
        int A = conditions_list.get(0);
        int B = conditions_list.get(1);
        for(int count = 2;count < conditions_list.size(); count++)
            if (conditions_list.get(count) == 0)
                if (position - 1 < 0)
                    position = 0;
                else
                    position -= 1;
            else if (conditions_list.get(count) == 1)
                if (position + 2 > B)
                    position = B;
                else
                    position += 2;
        return position;
    }
}
