import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        System.out.println(calc(in));

    }

    public static String calc(String input) throws Exception {
        String operand_1;
        String operand_2;
        String operator;

        String[] splitString = input.split(" ");

        if (splitString.length == 1){
            throw new Exception("Cтрока не является математической операцией");
        }

        if (splitString.length > 3){
            throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        operand_1 = splitString[0];
        operand_2 = splitString[2];
        operator = splitString[1];

        String result = arithmeticCalc(operand_1, operand_2, operator);
        return String.valueOf(result);
    }

    public static String arithmeticCalc(String operand_1, String operand_2, String operator) throws Exception {
        if (isArabic(operand_1) && isArabic(operand_2)) {
            int operand_1_int = Integer.parseInt(operand_1);
            int operand_2_int = Integer.parseInt(operand_2);

            if (operand_1_int <= 0 || operand_1_int > 10 || operand_2_int <= 0 || operand_2_int > 10 ){
                throw new Exception("Калькулятор должен принимать на вход числа от 1 до 10 включительно.");
            }

            if (operator.equals("+")){
                return String.valueOf(operand_1_int + operand_2_int);
            }
            if (operator.equals("-")){
                return String.valueOf(operand_1_int - operand_2_int);
            }
            if (operator.equals("*")){
                return String.valueOf(operand_1_int * operand_2_int);
            }
            if (operator.equals("/")){
                return String.valueOf(operand_1_int / operand_2_int);
            }
            throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

        if (!isArabic(operand_1) && !isArabic(operand_2)) {
            int operand_1_int = ConvertToRoman.romeToArab(operand_1);
            int operand_2_int = ConvertToRoman.romeToArab(operand_2);

            if (operand_1_int - operand_2_int <0){
                throw new Exception("В римской системе нет отрицательных чисел");
            }

            if (operand_1_int <= 0 || operand_1_int > 10 || operand_2_int <= 0 || operand_2_int > 10 ){
                throw new Exception("Калькулятор должен принимать на вход числа от 1 до 10 включительно.");
            }

            if (operator.equals("+")){
                return ConvertToRoman.arabToRome(operand_1_int + operand_2_int);
            }
            if (operator.equals("-")){
                return ConvertToRoman.arabToRome(operand_1_int - operand_2_int);
            }
            if (operator.equals("*")){
                return ConvertToRoman.arabToRome(operand_1_int * operand_2_int);
            }
            if (operator.equals("/")){
                return ConvertToRoman.arabToRome(operand_1_int / operand_2_int);
            }
            throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        throw new Exception("Используются одновременно разные системы счисления");
    }

    public static boolean isArabic(String operand) {
        try {
            Integer.parseInt(operand);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    
}


