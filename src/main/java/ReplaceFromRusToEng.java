import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class ReplaceFromRusToEng {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "руддщцщкдв";
        //System.out.println(Replace(s));
    }

    private static HashMap<Integer, String> CreateMap(){
        HashMap<Integer, String> map = new HashMap<>();
        /*map.put(-71, "q");
        map.put(-122, "w");
        map.put(-125, "e");
        map.put(-70, "r");
        map.put(-75, "t");
        map.put(-67, "y");
        map.put(-77, "u");
        map.put(-120, "i");
        map.put(-119, "o");
        map.put(-73, "p");
        map.put(-123, "[");
        map.put(-118, "]");
        map.put(-124, "a");
        map.put(-117, "s");
        map.put(-78, "d");
        map.put(-80, "f");
        map.put(-65, "g");
        map.put(-128, "h");
        map.put(-66, "j");
        map.put(-69, "k");
        map.put(-76, "l");
        map.put(-74, ";");
        map.put(-115, "'");
        map.put(-113, "z");
        map.put(-121, "x");
        map.put(-127, "c");
        map.put(-68, "v");
        map.put(-72, "b");
        map.put(-126, "n");
        map.put(-116, "m");
        map.put(-79, ",");
        map.put(-114, ".");
        map.put(46, "/");
        map.put(34, "@");
        map.put(-30, "#");
        map.put(59, "$");
        map.put(58, "^");
        map.put(63, "&");
        map.put(-111, "`");
        map.put(-103, "Q");
        map.put(-90, "W");
        map.put(-93, "E");
        map.put(-102, "R");
        map.put(-107, "T");
        map.put(-99, "Y");
        map.put(-109, "U");
        map.put(-88, "I");
        map.put(-87, "O");
        map.put(-105, "P");
        map.put(-91, "{");
        map.put(-86, "}");
        map.put(-92, "A");
        map.put(-85, "S");
        map.put(-110, "D");
        map.put(-112, "F");
        map.put(-97, "G");
        map.put(-96, "H");
        map.put(-98, "J");
        map.put(-101, "K");
        map.put(-108, "L");
        map.put(-106, ":");
        map.put(-83, "\"");
        map.put(-81, "Z");
        map.put(-89, "X");
        map.put(-95, "C");
        map.put(-100, "V");
        map.put(-94, "N");
        map.put(-84, "M");
        map.put(-111, "<");
        map.put(-82, ">");
        map.put(44, "?");
        map.put(-127, "~");*/
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
