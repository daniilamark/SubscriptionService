package com.da.subscriptionservice;

public class Test {

    public static void main(String[] args) {
        SubscriptionService service = new SubscriptionService();

        for (int i = 0; i < service.arrayListSu.length; i++){
           service.arrayListSu[i].printInfo();
        }
        //service.subscription_1.printInfo();
    }
}
