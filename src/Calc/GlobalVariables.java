package Calc;

public class GlobalVariables {


    public static String numb_1;
    public static String operator;
    public static String numb_2;
    public static boolean CheckOnArabik;
    public static boolean ResultSearchNumb_1;
    public static boolean ResultSearchNumb_2;
    public static boolean ResultSearchNumb_3;
    public static boolean ResultSearchNumb_4;

    public static int ResultSum;

    // массивы для вычисления формы числа

    public static final String[] Roman  = new String[] {"I", "II", "III", "IV", "V","VI", "VII", "VIII", "IX" , "X"};
    public static final String[] Arabic  = new String[] {"1", "2", "3", "4", "5","6", "7", "8", "9" , "10"};

    // массив разрядов Римских чисел . (столбцы : единицы, десятки, сотни)

    public static final String[][] RomanDischarge  = {

            {"I", "X", "C"},
            {"II","XX","CC"},
            {"III","XXX","CCC"},
            {"IV","XL","CD"},
            {"V","L","D"},
            {"VI","LX","DC"},
            {"VII","LXX","DCC"},
            {"VIII","LXXX","DCCC"},
            {"IX","XC","CM"},
    };


}
