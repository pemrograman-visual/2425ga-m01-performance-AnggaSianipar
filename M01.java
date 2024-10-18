// 12S24004 - Silvia Eklesiana Br. Sitorus
// 12S24032 - Angga Sianipar

import java.util.*;
import java.lang.Math;

public class M01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nilaihuruf, kredit;
        double nilaiangka, result;

        do {
            kredit = input.nextLine();
            if (kredit.equals("---")) {
            } else {
                nilaihuruf = input.nextLine();
                if (nilaihuruf.equals("A")) {
                    nilaiangka = 4.0;
                } else {
                    if (nilaihuruf.equals("AB")) {
                        nilaiangka = 3.5;
                    } else {
                        if (nilaihuruf.equals("B")) {
                            nilaiangka = 3.0;
                        } else {
                            if (nilaihuruf.equals("BC")) {
                                nilaiangka = 2.5;
                            } else {
                                if (nilaihuruf.equals("C")) {
                                    nilaiangka = 2.0;
                                } else {
                                    if (nilaihuruf.equals("D")) {
                                        nilaiangka = 1.0;
                                    } else {
                                        if (nilaihuruf.equals("E")) {
                                            nilaiangka = 0.0;
                                        } else {
                                            nilaiangka = 0.0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                result = Integer.parseInt(kredit) * nilaiangka;
                System.out.println(toFixed(result,1));
            }
        } while (kredit.equals("---"));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
