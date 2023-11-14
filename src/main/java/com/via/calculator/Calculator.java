/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.calculator;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * 
 * @author via
 * 
 * @date 14 Nov 2023
 *
 */
public class Calculator {

    /**
     * 
     * @param num1
     * @param num2
     * @return sum of num1 and num2
     */
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * 
     * @param R
     * @param t
     * @param r
     * @param n
     * @return
     */
    public String calculateAnnuity(String R, int t, String r, int n) {
        Locale locale = new Locale("en", "US");
        BigDecimal a = new BigDecimal(r).divide(new BigDecimal(n));
        BigDecimal b = BigDecimal.ONE.add(a);
        BigDecimal c = b.pow(n * t);
        BigDecimal d = c.subtract(BigDecimal.ONE);
        BigDecimal e = d.divide(a);
        BigDecimal f = e.multiply(new BigDecimal(R));
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        // System.out.println(Arrays.asList(Locale.getAvailableLocales()));
        return currencyInstance.format(f);
    }

}
