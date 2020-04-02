package com.company.users;

import com.company.devices.Device;

public class PremiumUser extends StandardUser {
    public PremiumUser(String email) {
        super(email);
        this.setPrice(15.99);
        this.setNumberOfParallelScreens(4);

    }

    public PremiumUser(String email, int numberOfParallelScreens) {
        super(email, numberOfParallelScreens);
        promote();
    }

    public void stopWatch(){

    }

    @Override
    public void promote() {
        if(this.getNumberOfParallelScreens()>4){
            System.out.println("Subscribe another account please");
        }
    }

    public void watchUltraHD(Device device, String movie){
        System.out.println("user " + getEmail() + " watches " + movie + " in UltraHD.");
    }//watchHD



}
