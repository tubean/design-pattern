package io.github.tubean.designpattern.adapter.site;

import io.github.tubean.designpattern.adapter.payd.PayD;
import io.github.tubean.designpattern.adapter.xpay.Xpay;

public class RunAdapterExample {
    public static void main(String[] args) {

        // Object for Xpay
        Xpay xpay = new XpayImpl();
        xpay.setCreditCardNo("4789565874102365");
        xpay.setCustomerName("Tu Bean");
        xpay.setCardExpMonth("01");
        xpay.setCardExpYear("2020");
        xpay.setCardCVVNo((short)123);
        xpay.setAmount(2565.23);

        PayD payD = new XpayToPayDAdapter(xpay);
        testPayD(payD);
    }

    private static void testPayD(PayD payD){

        System.out.println(payD.getCardOwnerName());
        System.out.println(payD.getCustCardNo());
        System.out.println(payD.getCardExpMonthDate());
        System.out.println(payD.getCVVNo());
        System.out.println(payD.getTotalAmount());
    }
}
