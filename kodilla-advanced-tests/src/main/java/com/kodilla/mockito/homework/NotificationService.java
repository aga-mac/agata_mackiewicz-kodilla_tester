package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NotificationService {
    private String city;
    Map<String, Set<SubscriberHomework>> notificationMap = new HashMap<>();
    Set<SubscriberHomework> citySubscriberHomework = new HashSet<>();

    public void addSubscriberToCity(String city, SubscriberHomework subscriberHomework) {
        citySubscriberHomework = notificationMap.getOrDefault(city, new HashSet<>());
        citySubscriberHomework.add(subscriberHomework);
        notificationMap.put(city, citySubscriberHomework);
    }
    public void sendNotificationForCity(String city, NotificationHomework notificationHomework){
        Set<SubscriberHomework> notificationForCity = notificationMap.get(city);
        notificationForCity.forEach(subscriberHomework -> subscriberHomework.receive(notificationHomework));
    }

    public void sendNotificationForAll(NotificationHomework notificationHomework) {
        notificationMap.values().forEach(cityClientHomework -> cityClientHomework.forEach(clientHomework -> clientHomework.receive(notificationHomework)));
    }
    public void removeSubscriberFromCity(String city, SubscriberHomework subscriberHomework) {
        notificationMap.remove(city, subscriberHomework);
    }
    public void removeSubscriberAtAll(SubscriberHomework subscriberHomework) {
        notificationMap.values().forEach(clients->clients.remove(subscriberHomework));
    }
    public void removeCity(String city) {
        notificationMap.remove(city);
    }
}
