package Calc;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.print("Введите уравнение: ");
            GlobalVariables.numb_1 = in.next();
            GlobalVariables.operator = in.next();
            GlobalVariables.numb_2 = in.next();

            ChekOnTz();


            if (GlobalVariables.CheckOnArabik) {        // проверка на араб/римск символы
                ArabicNumbers.SumArabic();
            } else {
                RomanNumbers.SumRoman();
            }

    }

    public static void Search_In_Arabic() {


        GlobalVariables.ResultSearchNumb_1 = Arrays.asList(GlobalVariables.Arabic).contains(GlobalVariables.numb_1);
        GlobalVariables.ResultSearchNumb_2 = Arrays.asList(GlobalVariables.Roman).contains(GlobalVariables.numb_1);

        GlobalVariables.ResultSearchNumb_3 = Arrays.asList(GlobalVariables.Arabic).contains(GlobalVariables.numb_2);
        GlobalVariables.ResultSearchNumb_4 = Arrays.asList(GlobalVariables.Roman).contains(GlobalVariables.numb_2);

        try {

            if (GlobalVariables.ResultSearchNumb_1 != GlobalVariables.ResultSearchNumb_3 || GlobalVariables.ResultSearchNumb_2 != GlobalVariables.ResultSearchNumb_4) {
               throw new Exception("Несоответствие ТЗ. Программа будет завершена (обработано через throw new)");

            } else {

                GlobalVariables.CheckOnArabik = Arrays.asList(GlobalVariables.Arabic).contains(GlobalVariables.numb_1);
            }
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
            System.exit(1);
        }
    }

    public static void ChekOnTz () {

        try {

            switch (GlobalVariables.operator) {
                case "+", "-", "*", "/" -> Search_In_Arabic();
                default -> throw new Exception("Несоответствие ТЗ. Программа будет завершена (обработано через throw new)");
            }

        } catch (Exception ex_1) {

            System.out.println(ex_1.getMessage());
            System.exit(1);
        }

        try {

            if (!GlobalVariables.ResultSearchNumb_1 && !GlobalVariables.ResultSearchNumb_2 && !GlobalVariables.ResultSearchNumb_3 && !GlobalVariables.ResultSearchNumb_4){
                throw new Exception("Несоответствие ТЗ. Программа будет завершена (обработано через throw new)");

            }

        }catch (Exception ex_2) {

            System.out.println(ex_2.getMessage());
            System.exit(1);
        }




    }


}


// проверка правильности ввода разрядов (вывод в консоль)
      /*  for (int i = 0; i < GlobalVariables.RomanDischarge.length; i++) {
         for (int j = 0; j < GlobalVariables.RomanDischarge[i].length; j++)
             System.out.print(GlobalVariables.RomanDischarge[i][j] + " ");
         System.out.println();
      }
      */
