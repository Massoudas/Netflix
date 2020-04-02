package com.company;

import com.company.users.BasicUser;
import com.company.users.PremiumUser;
import com.company.users.StandardUser;

public class Main {

    public static void main(String[] args) {
        StandardUser standardUser=new StandardUser("massuod@info.com", 2);
        PremiumUser pu= new PremiumUser("max@gmail.com", 4);
        BasicUser bu= new BasicUser("tom@raiden.com", 2);

    }
}
