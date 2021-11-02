package info.belikov.codewars.k3;

enum RomanNum {
    M(1000),
    CM(900),
    D(500),
    CD(400),
    C(100),
    XC(90),
    L(50),
    XL(40),
    X(10),
    IX(9),
    V(5),
    IV(4),
    I(1);

    private int value;

    RomanNum(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }
}

public class RomanNumerals {
    public static String toRoman(int n) {
        String result = "";
        for (RomanNum r: RomanNum.values()) {
            while(n-r.getValue() >= 0){
                n -= r.getValue();
                result += r.name();
            }
        }
        return result;
    }

    public static int fromRoman(String romanNumeral) {
        int result = 0;
        char[] charArray = romanNumeral.toCharArray();
        for (int i=0; i < charArray.length; i++) {
            try {
                result += RomanNum.valueOf(Character.toString(charArray[i]) + Character.toString(charArray[i+1])).getValue();
                i++;
            } catch (Exception e) {
                result += RomanNum.valueOf(String.valueOf(charArray[i])).getValue();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(RomanNumerals.toRoman(1666));
    }
}
