package com.ayalamih;

import java.io.File;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ExampleFile {
    public static void main(String[] args) {
        /*DecimalFormat df = new DecimalFormat("#.##");
        String result = df.format(1.000000009D);*/
        // taken from http://stackoverflow.com/a/153785#0#L0

        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.CEILING);
        for (Number n : Arrays.asList(12, 123.12345, 0.23, 0.1, 2341234.212431324)) {
            Double d = n.doubleValue();
            System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                    + " INFO "
                    + "[" + Thread.currentThread().getName() + "] "
                    + df.format(d));
        }

        DecimalFormat df1 = new DecimalFormat("#.##");
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + " INFO "
                + "[" + Thread.currentThread().getName() + "] "
                + df1.format(1000000.9123D));

        System.out.println(System.currentTimeMillis());
    }
}
