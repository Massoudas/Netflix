package com.company.users;

import com.company.devices.Device;

public class StandardUser extends BasicUser {
    public StandardUser(String email) {
        super(email,11.99,2);
    }

    public StandardUser(String email, int numberOfParallelScreens) {
        super(email, numberOfParallelScreens);
        promote();
    }

    public void watchHD(Device device, String movie){
        System.out.println("user " + getEmail() + " watches " + movie + " in HD.");
    }

    @Override
    public void promote() {
        if(this.getNumberOfParallelScreens()>2){
            System.out.println("Please subscribe for premium membership");
        }
    }
}
