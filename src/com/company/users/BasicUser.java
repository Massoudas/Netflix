package com.company.users;

import com.company.devices.Device;

public class BasicUser {
    private String email;
    private double price;
    private int numberOfParallelScreens;

    public BasicUser(String email){
        this(email,7.99,1);
    }
    protected BasicUser(String email, double price, int numberOfParallelScreens) {
        this.email = email;
        this.price = price;
        this.numberOfParallelScreens = numberOfParallelScreens;
    }

    public BasicUser(String email, int numberOfParallelScreens) {
        this.email = email;
        this.numberOfParallelScreens = numberOfParallelScreens;
        promote();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfParallelScreens() {
        return numberOfParallelScreens;
    }

    public void setNumberOfParallelScreens(int numberOfParallelScreens) {
        this.numberOfParallelScreens = numberOfParallelScreens;
    }

    public void watch(Device device, String movie) {
        System.out.println("user " +email + " watches " + movie);

    }

    public void promote(){
        if(numberOfParallelScreens>=2){
            System.out.println("Please subscribe for standard membership");
        }

    }
}


