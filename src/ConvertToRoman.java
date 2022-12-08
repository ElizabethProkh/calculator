public class ConvertToRoman {
    public static int romeToArab(String value) {

        if (value.equals("I")) {
            return 1;
        }
        if (value.equals("II")) {
            return 2;
        }
        if (value.equals("III")) {
            return 3;
        }
        if (value.equals("IV")) {
            return 4;
        }
        if (value.equals("V")) {
            return 5;
        }
        if (value.equals("VI")) {
            return 6;
        }
        if (value.equals("VII")) {
            return 7;
        }
        if (value.equals("VIII")) {
            return 8;
        }
        if (value.equals("IX")) {
            return 9;
        }
        if (value.equals("X")) {
            return 10;


        }
        return 0;
    }

    public static String arabToRome(int input) {
        String s = "";
        while (input >= 1000) {
            s += "M";
            input -= 1000;        }
        while (input >= 900) {
            s += "CM";
            input -= 900;
        }
        while (input >= 500) {
            s += "D";
            input -= 500;
        }
        while (input >= 400) {
            s += "CD";
            input -= 400;
        }
        while (input >= 100) {
            s += "C";
            input -= 100;
        }
        while (input >= 90) {
            s += "XC";
            input -= 90;
        }
        while (input >= 50) {
            s += "L";
            input -= 50;
        }
        while (input >= 40) {
            s += "XL";
            input -= 40;
        }
        while (input >= 10) {
            s += "X";
            input -= 10;
        }
        while (input >= 9) {
            s += "IX";
            input -= 9;
        }
        while (input >= 5) {
            s += "V";
            input -= 5;
        }
        while (input >= 4) {
            s += "IV";
            input -= 4;
        }
        while (input >= 1) {
            s += "I";
            input -= 1;
        }
        return s;
    }
}

