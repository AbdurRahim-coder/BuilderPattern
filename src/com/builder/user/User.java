package com.builder.user;

public class User {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String phone;
    private final String address;

    public User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getPhone() {
        return phone;
    }
    public String getAddress() {
        return address;
    }
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder{
        //Here firstName and LastName are required field and age, phone and address are optional
        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;
        private String address;


        public Builder(String firstName,String lastName){
            this.firstName=firstName;
            this.lastName=lastName;
        }

        public Builder age(int age){
            this.age=age;
            return this;
        }
        public Builder phone(String phone){
            this.phone=phone;
            return this;
        }
        public Builder address(String address){
            this.address=address;
            return this;
        }
        public User build(){
            User user=new User(this);
            return user;
        }
    }
}
