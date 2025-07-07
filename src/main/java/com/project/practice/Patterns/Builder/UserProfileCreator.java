package com.project.practice.Patterns.Builder;

public class UserProfileCreator {

    public static void main(String[] args) {
        UserProfile userProfile =new UserProfile.Builder().name("jaadoo").age(21).address("area51").build();
        System.out.println(userProfile);
    }
}
