/**
 * Created by danawacomputer on 2017-04-04.
 */

import java.text.*;

public class Calc {
    public static void main(String[] args){
        int iPadPro = 999_000;
        double discount = 0.15;

        DecimalFormat totalPrice = new DecimalFormat("#,###.0");

        System.out.println("totalPrice:" + totalPrice.format(iPadPro * (1 - discount)));


    }
}
