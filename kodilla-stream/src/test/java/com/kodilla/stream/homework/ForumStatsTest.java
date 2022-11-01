package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {
    public static List<User> getUsersList(){
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 234, "Chemists"));
        users.add(new User("Jessie Pinkman", 29, 5000, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 77, "Manager"));
        users.add(new User("Gus Firing", 12, 5555, "Board"));
        users.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        return users;
    }

    @Test
    public void checkPostsAverageForUsers40OrOlder(){
        //Given
        List<User> users = getUsersList();
        double sum = 0;
        int counter = 0;
        for(User user: users){
            if (user.getAge()>=40){
                sum += user.getNumberOfPost();
                counter++;
            }
        }
        //When
        double average = ForumStats.postsAverageForUsers40OrOlder(users);
        //Then
        Assertions.assertEquals(sum/counter, average,0.001);
    }

    @Test
    public void checkPostsAverageForUsersYoungerThan40(){
        //Given
        List<User> users = getUsersList();
        double sum = 0;
        int counter = 0;
        for(User user: users){
            if (user.getAge()<40){
                sum += user.getNumberOfPost();
                counter++;
            }
        }
        //When
        double average = ForumStats.postsAverageForUsersYoungerThan40(users);
        //Then
        Assertions.assertEquals(sum/counter, average,0.001);
    }

    @Test
    public void checkPostAverageForUsersYoungerThan40WhenNoUsersInTheAgeOnTheList() {
        //Given
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 234, "Chemists"));
        users.add(new User("Jessie Pinkman", 55, 5000, "Sales"));
        users.add(new User("Tuco Salamanca", 40, 77, "Manager"));
        double sum = 0;
        int counter = 0;
        for(User user: users){
            if (user.getAge()<40){
                sum += user.getNumberOfPost();
                counter++;
            }
        }
        //When
        double average = ForumStats.postsAverageForUsersYoungerThan40(users);
        //Then
        Assertions.assertEquals(0, average);
    }

    @Test
    public void checkPostAverageForUserOlderEquals40WhenNoUsersInTheAgeOnTheList() {
        //Given
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 39, 234, "Chemists"));
        users.add(new User("Jessie Pinkman", 22, 5000, "Sales"));
        users.add(new User("Tuco Salamanca", 18, 77, "Manager"));
        double sum = 0;
        int counter = 0;
        for(User user: users){
            if (user.getAge()>=40){
                sum += user.getNumberOfPost();
                counter++;
            }
        }
        //When
        double average = ForumStats.postsAverageForUsers40OrOlder(users);
        //Then
        Assertions.assertEquals(0, average);
    }

}