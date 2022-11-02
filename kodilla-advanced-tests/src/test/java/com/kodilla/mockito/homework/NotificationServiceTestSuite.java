package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class NotificationServiceTestSuite {

    SubscriberHomework firstSubscriber = Mockito.mock(SubscriberHomework.class);
    SubscriberHomework secondSubscriber = Mockito.mock(SubscriberHomework.class);
    SubscriberHomework thirdSubscriber = Mockito.mock(SubscriberHomework.class);
    NotificationHomework notificationHomework = Mockito.mock(NotificationHomework.class);
    NotificationService notificationService = new NotificationService();

    @Test
    public void shouldAddSubscriberToCity() {
        //given
        NotificationService notificationServiceHomework = Mockito.mock(NotificationService.class);
        //when
        notificationServiceHomework.addSubscriberToCity("Kraków", firstSubscriber);
        //then
        Mockito.verify(notificationServiceHomework).addSubscriberToCity("Kraków", firstSubscriber);
        Mockito.verifyNoInteractions(secondSubscriber);
        Mockito.verifyNoInteractions(thirdSubscriber);
    }

    @Test
    public void shouldSendNotificationForCity() {
        //when
        notificationService.sendNotificationForCity("Kraków", notificationHomework);
        //then
        Mockito.verify(firstSubscriber, Mockito.times(1)).receive(notificationHomework);
        Mockito.verify(secondSubscriber, Mockito.times(1)).receive(notificationHomework);
        Mockito.verify(thirdSubscriber, Mockito.never()).receive(notificationHomework);
    }

    @Test
    public void shouldSendNotificationForAll() {
        //when
        notificationService.sendNotificationForAll(notificationHomework);
        //then
        Mockito.verify(firstSubscriber, Mockito.times(1)).receive(notificationHomework);
        Mockito.verify(secondSubscriber, Mockito.times(1)).receive(notificationHomework);
        Mockito.verify(thirdSubscriber, Mockito.times(1)).receive(notificationHomework);
    }

    @Test
    public void shouldRemoveSubscriberFromCity() {
        notificationService.addSubscriberToCity("Kraków", thirdSubscriber);
        //when
        notificationService.removeSubscriberFromCity("Kraków", thirdSubscriber);
        notificationService.sendNotificationForAll(notificationHomework);
        //then
        Mockito.verify(firstSubscriber, Mockito.times(1)).receive(notificationHomework);
        Mockito.verify(secondSubscriber, Mockito.times(1)).receive(notificationHomework);
        Mockito.verify(thirdSubscriber, Mockito.times(1)).receive(notificationHomework);
    }

    @Test
    public void shouldRemoveSubscriberAtAll() {
        notificationService.addSubscriberToCity("Kraków", thirdSubscriber);
        //when
        notificationService.removeSubscriberAtAll(thirdSubscriber);
        notificationService.sendNotificationForAll(notificationHomework);
        //then
        Mockito.verify(firstSubscriber, Mockito.times(1)).receive(notificationHomework);
        Mockito.verify(secondSubscriber, Mockito.times(1)).receive(notificationHomework);
        Mockito.verify(thirdSubscriber, Mockito.never()).receive(notificationHomework);
    }

    @Test
    public void shouldRemoveCity() {
        notificationService.addSubscriberToCity("Kraków", thirdSubscriber);
        //when
        notificationService.removeCity("Kraków");
        notificationService.sendNotificationForAll(notificationHomework);
        //then
        Mockito.verify(firstSubscriber, Mockito.never()).receive(notificationHomework);
        Mockito.verify(secondSubscriber, Mockito.never()).receive(notificationHomework);
        Mockito.verify(secondSubscriber, Mockito.times(1)).receive(notificationHomework);
    }

    @BeforeEach
    public void addThreeClients() {
        notificationService.addSubscriberToCity("Kraków", firstSubscriber);
        notificationService.addSubscriberToCity("Kraków", secondSubscriber);
        notificationService.addSubscriberToCity("Wrocław", secondSubscriber);
    }

}