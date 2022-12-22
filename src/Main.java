public class Main {

    //main - точка входа программы
    public static int subtractProductAndSum(int n) {

        int prod = 1;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            prod = prod * digit;
            sum = sum + digit;
            n = n / 10;
        }
        return prod - sum;
    }


    public static void main(String[] args) {
        //System.out.println("Hello java");
        //System.out.println(subtractProductAndSum(15));
        System.out.println(addStrings("101", "56"));
        System.out.println(addBinary("101", "11011"));
    }
    public static String addStrings(String num1, String num2) {
        if (num1.length() < num2.length()) {
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }
        int j = num2.length() - 1;
        int carry = 0;
        String res = "";
        for (int i = num1.length() - 1; i >= 0; i--) {
            carry += (num1.charAt(i) - '0');
            if (j >= 0) {
                carry += (num2.charAt(j) - '0');
            }
            res = (carry % 10) + res;
            carry = carry / 10;
            j = j - 1;
        }
        if (carry == 1) {
            res = 1 + res;
        }
        return res;


    }

    public static String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }
        int j = b.length() - 1;
        int carry = 0;
        String res = "";
        for (int i = a.length(); i >= 0; i--) {
            if (a.charAt(j) == '1') {
                carry += 1;
            }
            if (j >= 0 && b.charAt(j) == '1') {
                res = (carry % 2) + res;
                carry = carry / 2;
                j = j - 1;
            }

        }
        if (carry == 1) {
            res = 1 + res;
        }

        return res;


    }


}
