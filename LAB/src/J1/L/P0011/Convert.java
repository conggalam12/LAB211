/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J1.L.P0011;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author cong0
 */
public class Convert {

    String convertBinaryToOther(String input, int BaseInput) {
        switch (BaseInput) {
            case 2:
                BigInteger convert = new BigInteger("0");
                BigInteger i;
                for (int j = 0; j < input.length(); j++) {
                    if (input.charAt(j) == '1') {
                        BigInteger k = new BigInteger("2");
                        i = k.pow(input.length() - 1 - j);
                        convert = convert.add(i);
                    }
                }
                return convert.toString();
            case 3:
                String convert2 = "";
                HashMap<String, String> BinToHex = new HashMap<>();
                BinToHex.put("0000", "0");
                BinToHex.put("0001", "1");
                BinToHex.put("0010", "2");
                BinToHex.put("0011", "3");
                BinToHex.put("0100", "4");
                BinToHex.put("0101", "5");
                BinToHex.put("0110", "6");
                BinToHex.put("0111", "7");
                BinToHex.put("1000", "8");
                BinToHex.put("1001", "9");
                BinToHex.put("1010", "A");
                BinToHex.put("1011", "B");
                BinToHex.put("1100", "C");
                BinToHex.put("1101", "D");
                BinToHex.put("1110", "E");
                BinToHex.put("1111", "F");
                while (input.length() % 4 != 0) {
                    input = "0" + input;
                }
                for (int t = 0; t < input.length(); t += 4) {
                    String key = input.substring(t, t + 4);
                    convert2 += BinToHex.get(key);
                }
                return convert2;
        }
        return null;
    }

    String convertDecimalToOther(String input, int BaseInput) {
        String a = "";
        String b = "";
        BigInteger convert = new BigInteger(input);
        BigInteger t1 = new BigInteger("0");
        BigInteger t2 = new BigInteger("0");
        switch (BaseInput) {
            case 1:
                BigInteger convert1 = new BigInteger("2");
                while (convert.compareTo(t2) > 0) {
                    t1 = convert.mod(convert1);
                    a += t1.toString();
                    convert = convert.divide(convert1);
                }
                for (int i = a.length() - 1; i >= 0; i--) {
                    b += a.charAt(i);
                }

                return b;
            case 3:
                BigInteger convert3 = new BigInteger("16");
                while (convert.compareTo(t2) > 0) {
                    t1 = convert.mod(convert3);
                    if (t1.compareTo(new BigInteger("10")) < 0) {
                        a += t1.toString();
                    } else {
                        char c = (char) (t1.intValue() + 55);
                        a += c;
                    }
                    convert = convert.divide(convert3);
                }
                for (int i = a.length() - 1; i >= 0; i--) {
                    b += a.charAt(i);
                }
                return b;
        }
        return null;
    }

    String convertHexadecimalToOther(String input, int BaseInput) {
        BigInteger convert = new BigInteger("0");
        switch (BaseInput) {
            case 1:
                String convert1 = "";
                HashMap<String, String> HexToBin = new HashMap<>();
                HexToBin.put("0", "0000");
                HexToBin.put("1", "0001");
                HexToBin.put("2", "0010");
                HexToBin.put("3", "0011");
                HexToBin.put("4", "0100");
                HexToBin.put("5", "0101");
                HexToBin.put("6", "0110");
                HexToBin.put("7", "0111");
                HexToBin.put("8", "1000");
                HexToBin.put("9", "1001");
                HexToBin.put("A", "1010");
                HexToBin.put("B", "1011");
                HexToBin.put("C", "1100");
                HexToBin.put("D", "1101");
                HexToBin.put("E", "1110");
                HexToBin.put("F", "1111");
                for (int i = 0; i < input.length(); i++) {
                    String key = Character.toString(input.charAt(i));
                    convert1 += HexToBin.get(key);
                }
                return convert1;
            case 2:
                BigInteger i,
                 t;
                int c;
                for (int j = 0; j < input.length(); j++) {
                    BigInteger k = new BigInteger("16");
                    if (input.charAt(j) >= '0' && input.charAt(j) <= '9') {
                        c = input.charAt(j) - 48;
                    } else {
                        c = input.charAt(j) - 55;
                    }
                    t = BigInteger.valueOf(c);
                    k = k.pow(input.length() - 1 - j);
                    i = t.multiply(k);
                    convert = convert.add(i);
                }
                return convert.toString();
        }
        return null;

    }
}
