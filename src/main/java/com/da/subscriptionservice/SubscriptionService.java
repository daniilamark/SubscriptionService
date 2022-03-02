package com.da.subscriptionservice;

import java.util.ArrayList;

public class SubscriptionService implements ISearch {

    SubscriptionArray subscriptionArray = new SubscriptionArray();

    ArrayList<Subscription> arrayListSu = subscriptionArray.arrayListSub;

    int allCountSubscriptions = arrayListSu.size();
    int countSubscriptions;
    //String res = null;

    public String searchByName(String nameSubscription){
        int countSubscriptions = 0;
        String res = null;

        //nameSubscription = "free";

        for (Subscription sub : arrayListSu){
            if (sub.getName() == nameSubscription){
                countSubscriptions ++;
                System.out.println(sub.getName());
            }
        }

        if(countSubscriptions > 0){
            res = String.valueOf(countSubscriptions);
        }else{
            res = "Такой подписки нет";
        }
        return res;
    }
}
