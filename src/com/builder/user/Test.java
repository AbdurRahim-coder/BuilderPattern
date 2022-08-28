package com.builder.user;

public class Test {
    public static void main(String[] args) {
        User user1=new User.Builder("Abdur","Rahim")
                .age(24)
                .phone("01843528797")
                .address("Mirpur-1,Dhaka")
                .build();
        System.out.println(user1);
        User user2=new User.Builder("Arif","Azad")
                .address("Banoni")
                .build();
        System.out.println(user2);
        System.out.println(new User.Builder("Tamin","Iqbal")
                .build());
    }

}
