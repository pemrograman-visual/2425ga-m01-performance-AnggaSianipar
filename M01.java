// 12S24004 - Silvia Eklesiana Br. Sitorus
// 12S24032 - Angga Sianipar

import java.util.*;
import java.lang.Math;

public class M01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double result, value, a, aB, b, bC, c, d, e;
        double kredit1;
        String nilai, kredit;

        kredit1 = 0;
        a = 4.0;
        aB = 3.5;
        b = 3.0;
        bC = 2.5;
        c = 2.0;
        d = 1.0;
        e = 0.0;
        kredit = input.nextLine();
        if (kredit.equals("---")) {
            kredit = kredit;
        } else {
            kredit1 = Integer.parseDouble(kredit);
        }
        nilai = input.nextLine();
        while (!nilai.equals("---")) {
            if (nilai.equals("A")) {
                value = 4.0;
            } else {
                if (nilai.equals("AB")) {
                    value = 3.5;
                } else {
                    if (nilai.equals("B")) {
                        value = 3.0;
                    } else {
                        if (nilai.equals("BC")) {
                            value = 2.5;
                        } else {
                            if (nilai.equals("C")) {
                                value = 2.0;
                            } else {
                                if (nilai.equals("D")) {
                                    value = 1.0;
                                } else {
                                    if (nilai.equals("E")) {
                                        value = 0.0;
                                    } else {
                                        value = 0.0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            performa = kredit1 * value;
            System.out.println(toFixed(result,1));
            kredit = input.nextLine();
            if (kredit.equals("---")) {
                kredit = kredit;
            } else {
                kredit1 = Integer.parseDouble(kredit);
            }
            nilai = input.nextLine();
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
