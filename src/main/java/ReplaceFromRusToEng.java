import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class ReplaceFromRusToEng {
    private static HashMap<Integer, String> CreateMap(){
        HashMap<Integer, String> map = new HashMap<>();

        map.put(-1, "z");
        map.put(-2, ".");
        map.put(-3, "'");
        map.put(-4, "m");
        map.put(-5, "s");
        map.put(-6, "]");
        map.put(-7, "o");
        map.put(-8, "i");
        map.put(-9, "x");
        map.put(-10, "w");
        map.put(-11, "[");
        map.put(-12, "a");
        map.put(-13, "e");
        map.put(-14, "n");
        map.put(-15, "c");
        map.put(-16, "h");
        map.put(-17, "g");
        map.put(-18, "j");
        map.put(-19, "y");
        map.put(-20, "v");
        map.put(-21, "k");
        map.put(-22, "r");
        map.put(-23, "q");
        map.put(-24, "b");
        map.put(-25, "p");
        map.put(-26, ";");
        map.put(-27, "t");
        map.put(-28, "l");
        map.put(-29, "u");
        map.put(-30, "d");
        map.put(-31, ",");
        map.put(-32, "f");
        map.put(-33, "Z");
        map.put(-34, ">");
        map.put(-35, "\"");
        map.put(-36, "M");
        map.put(-37, "S");
        map.put(-38, "}");
        map.put(-39, "O");
        map.put(-40, "I");
        map.put(-41, "X");
        map.put(-42, "W");
        map.put(-43, "{");
        map.put(-44, "A");
        map.put(-45, "Q");
        map.put(-46, "N");
        map.put(-47, "C");
        map.put(-48, "H");
        map.put(-49, "G");
        map.put(-50, "J");
        map.put(-51, "Y");
        map.put(-52, "V");
        map.put(-53, "K");
        map.put(-54, "R");
        map.put(-55, "Q");
        map.put(-56, "B");
        map.put(-57, "P");
        map.put(-58, ":");
        map.put(-59, "T");
        map.put(-60, "L");
        map.put(-61, "U");
        map.put(-62, "D");
        map.put(-63, "<");
        map.put(-64, "F");
        map.put(-72, "`");
        map.put(-88, "~");
        map.put(34, "@");
        map.put(-71, "#");
        map.put(59, "$");
        map.put(58, "^");
        map.put(63, "&");
        map.put(46, "/");
        map.put(44, "?");
        return map;
    }

    public static String Replace(String input) throws UnsupportedEncodingException {
        var map = CreateMap();
        if (input.equals(""))
            return null;
        var b = input.getBytes("cp1251");
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i<b.length; ++i) {
            if (b[i] == -47 || b[i] == -48)
                continue;
            if (b[i] == -30) {
                ans.append(map.get((int) b[i]));
                i+=2;
                continue;
            }
//            System.out.println((int)b[i]);
            ans.append(map.get((int) b[i]));
        }
        return ans.toString();
    }
}
