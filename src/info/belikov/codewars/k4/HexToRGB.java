package info.belikov.codewars.k4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HexToRGB {
    public static int[] hexStringToRGB(String hex) {
        return new int[] {Integer.parseInt(hex.substring(1,3), 16), Integer.parseInt(hex.substring(3,5), 16), Integer.parseInt(hex.substring(5,7), 16)};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(hexStringToRGB("#FF9933")));
    }
}
