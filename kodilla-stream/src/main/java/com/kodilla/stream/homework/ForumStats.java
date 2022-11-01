package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;

import java.util.List;

public class ForumStats {
    public static void main(String[] args) {
        System.out.println(postsAverageForUsers40OrOlder(UserRepository.getUsersList()));
        System.out.println(postsAverageForUsersYoungerThan40(UserRepository.getUsersList()));
    }

    public static double postsAverageForUsers40OrOlder(List<User> users){
        double average1 = users
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .orElse(0.0);
        return average1;
    }

    public static double postsAverageForUsersYoungerThan40(List<User> users){
        double average2 = users
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .orElse(0.0);
        return average2;
    }
}
