import java.nio.charset.StandardCharsets;

public class BinOps {
    public String sum(String a, String b) {
        int aInt = Integer.parseInt(a, 2);
        int bInt = Integer.parseInt(b, 2);
        int sum = aInt + bInt;
        String sumString = Integer.toBinaryString(sum);
        return sumString;
    }

    public String mult(String a, String b) {
        int aInt = Integer.parseInt(a, 2);
        int bInt = Integer.parseInt(b, 2);
        int mult = aInt * bInt;
        String multString = Integer.toBinaryString(mult);
        return multString;
    }
}
