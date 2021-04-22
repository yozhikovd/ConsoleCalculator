package Calc;

import java.io.IOException;
import java.util.Arrays;

public class RomanNumbers {

   public static int in_1;
   public static int in_2;
   public static int SumRomanTrans;
   public static String CharSearch_2 = Integer.toString(SumRomanTrans);
   public static int indexCalcDozens_2 = Integer.parseInt(String.valueOf(CharSearch_2.charAt(0)));
   public static String part_1_2;
   public static String CharSearch;
   public static int indexCalcDozens;
   public static int indexCalcUnits;

    public static void SumRoman () {

        IndexSearch();

        // вычисление эквивалентных арабских символов по найденым индексам метода IndexSearch

        int numb_1_RomanToArabic = Integer.parseInt(GlobalVariables.Arabic[in_1]);
        int numb_2_RomanToArabic = Integer.parseInt(GlobalVariables.Arabic[in_2]);

        try {

            if (numb_1_RomanToArabic < 1 || numb_1_RomanToArabic > 10 || numb_2_RomanToArabic > 10 || numb_2_RomanToArabic < 1 ) {

                throw new Exception("Несоответствие ТЗ. Программа будет завершена (обработано через throw new)");

            }

        } catch (Exception ex_1) {

            System.out.println(ex_1.getMessage());
            System.exit(1);
        }


        // логика простейших операции, подготовка к преобразованиям в римские
        try {

        switch (GlobalVariables.operator) {
            case "+" -> SumRomanTrans = numb_1_RomanToArabic + numb_2_RomanToArabic;
            case "-" -> {

                if (numb_1_RomanToArabic < numb_2_RomanToArabic){
                    throw new Exception("У римлян не существовало отрицательных чисел. Программа будет завершена (обработано через throw new)");
                }
                else {
                    SumRomanTrans = numb_1_RomanToArabic - numb_2_RomanToArabic;
                }

             }
            case "*" -> SumRomanTrans = numb_1_RomanToArabic * numb_2_RomanToArabic;
            case "/" -> SumRomanTrans = numb_1_RomanToArabic / numb_2_RomanToArabic;
        }

        } catch (Exception ex_6) {

            System.out.println(ex_6.getMessage());
            System.exit(1);
        }

        // логика преобразования конечного результата в римские через разрядный массив риских чисел

        switch (SumRomanTrans) {
            case 100 -> System.out.println(GlobalVariables.RomanDischarge[0][2]);
            case 90, 80, 70, 60, 50, 40, 30, 20, 10 -> {
                CharSearch_2 = Integer.toString(SumRomanTrans);
                indexCalcDozens_2 = Integer.parseInt(String.valueOf(CharSearch_2.charAt(0)));
                part_1_2 = GlobalVariables.RomanDischarge[indexCalcDozens_2 - 1][1];
                System.out.println(part_1_2);
            }
            case 9, 8, 7, 6, 5, 4, 3, 2, 1 -> {
                CharSearch_2 = Integer.toString(SumRomanTrans);
                indexCalcDozens_2 = Integer.parseInt(String.valueOf(CharSearch_2.charAt(0)));
                part_1_2 = GlobalVariables.RomanDischarge[indexCalcDozens_2 - 1][0];
                System.out.println(part_1_2);
            }
            case 0 -> {
                System.out.println("Пишу арабский 0, но у Римлян его существовало");

            }
            default -> {
                CharSearch = Integer.toString(SumRomanTrans);
                indexCalcDozens = Integer.parseInt(String.valueOf(CharSearch.charAt(0)));
                indexCalcUnits = Integer.parseInt(String.valueOf(CharSearch.charAt(1)));
                String part_1 = GlobalVariables.RomanDischarge[indexCalcDozens - 1][1];
                String part_2 = GlobalVariables.RomanDischarge[indexCalcUnits - 1][0];
                System.out.println(part_1 + part_2);
            }
        }
    }
        // вычисление индексов в арабских и римских массивах чисел введеных в консоль
        public static void IndexSearch () {

        for (int index = 0; index < GlobalVariables.Roman.length; index++) {
            if (GlobalVariables.Roman[index].equals(GlobalVariables.numb_1))
                in_1 = index;
        }

        for (int index_2 = 0; index_2 < GlobalVariables.Roman.length; index_2++) {
            if (GlobalVariables.Roman[index_2].equals(GlobalVariables.numb_2))
                in_2 = index_2;
        }

    }

}


