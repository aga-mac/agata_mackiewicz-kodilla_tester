package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
        System.out.println(" ");
        List<String> olderThan = filterUsersOlderThan();
        System.out.println(olderThan);
        System.out.println(" ");
        List<String> numberOfPost = filterNumberOfPost();
        System.out.println(numberOfPost);
    }
    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UserRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }

    public static List<String> filterUsersOlderThan() {
        List<String> usernames1 = UserRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > 35)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames1;
    }

    public static List<String> filterNumberOfPost() {
        List<String> usernames2 = UserRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() < 10)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames2;
    }
    public static String getUserName(User user) {
        return user.getUsername();
    }
}
