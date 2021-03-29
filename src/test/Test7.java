package test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class Test7 {

    public static void main(String[] args) {
        double price = 1.85;
        double rate = 0.065;
        price -= price * rate;

        System.out.println(price);

        price = Math.round(price * 100)/100.0;
        System.out.println(price);



        BigDecimal price2 = BigDecimal.valueOf(1.85);
        BigDecimal rate2 = BigDecimal.valueOf(0.065);

        price2 = price2.subtract(price2.multiply(rate2)).setScale(2, RoundingMode.HALF_UP);
        System.out.println(price2);

        Locale locale = Locale.FRANCE;
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);
        format.setMaximumFractionDigits(2);
        System.out.println(format.format(price2));
        System.out.println(format.format(rate2));

        locale = Locale.UK;
        format = NumberFormat.getCurrencyInstance(locale);
        System.out.println(format.format(price2));
        System.out.println(format.format(rate2));
    }
}
