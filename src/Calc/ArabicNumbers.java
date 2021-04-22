package Calc;

import java.io.IOException;
import java.util.Arrays;

public class ArabicNumbers {


    public static void SumArabic () {

        int numb_1_Int = Integer.parseInt(GlobalVariables.numb_1);
        int numb_2_Int = Integer.parseInt(GlobalVariables.numb_2);

        try {

            if (numb_1_Int < 1 || numb_1_Int > 10 || numb_2_Int > 10 || numb_2_Int < 1 ) {

                throw new Exception("Несоответствие ТЗ. Программа будет завершена (обработано через throw new)");

            }

        } catch (Exception ex_2) {

            System.out.println(ex_2.getMessage());
            System.exit(1);
        }

        try {


            switch (GlobalVariables.operator) {

                case "+":
                    GlobalVariables.ResultSum = numb_1_Int + numb_2_Int;
                    break;

                case "-":
                    if (numb_1_Int < numb_2_Int){
                        throw new Exception("Несоответствие ТЗ. (Отрицательное число) Программа будет завершена (обработано через throw new)");
                    }
                    else {
                        GlobalVariables.ResultSum = numb_1_Int - numb_2_Int;
                    }
                    break;

                case "*":
                    GlobalVariables.ResultSum = numb_1_Int * numb_2_Int;
                    break;

                case "/":
                    GlobalVariables.ResultSum = numb_1_Int / numb_2_Int;
                    break;
            }

        }
             catch (Exception ex_6) {

                System.out.println(ex_6.getMessage());
                System.exit(1);
            }


        System.out.print(GlobalVariables.ResultSum);

    }

}
