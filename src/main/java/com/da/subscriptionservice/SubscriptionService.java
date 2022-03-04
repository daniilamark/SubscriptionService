package com.da.subscriptionservice;

public class SubscriptionService implements ISearch {

    Subscription subscription_1 = new Subscription("стандарт", 190);
    Subscription subscription = new Subscription("вип", 990);
    public Subscription presentSubscription = new Subscription("подарок");
    Subscription freeSubscription = new Subscription("бесплатная");
    Subscription freeSubscription1 = new Subscription("бесплатная");

    public Subscription[] arrayListSu ={subscription_1, subscription, presentSubscription, freeSubscription, freeSubscription1};

    public String searchByName(String nameSubscription){
        int countSubscriptions = 0;
        String res;

        for (Subscription sub : arrayListSu){
            System.out.println(sub.getName());
            String s = sub.getName();
            if (s.equals(nameSubscription)){ // тут была ошибка в прошлом семестре
                countSubscriptions ++;
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
