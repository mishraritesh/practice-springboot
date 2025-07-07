package com.project.practice.Patterns.Builder;

import lombok.Getter;

public class UserProfile {
    private final String name;
    private final String address;
    private final int age;

    private UserProfile(Builder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.age = builder.age;
    }

    @Override
    public String toString() {
        return "name: " + name + ", address: " + address + ", age: " + age;
    }
    static class Builder {
        private String name;
        private String address;
        private int age;

        public  Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public UserProfile build(){
            return new UserProfile(this);
        }
    }
}
