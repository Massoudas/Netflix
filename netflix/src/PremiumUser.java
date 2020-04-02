public class PremiumUser extends StandardUser {

    PremiumUser(String email, int price, int numberOfParalellScreens) {
        super(email, price, numberOfParalellScreens);
    }

    public void watchUltraHd (Device device, String movie){
        System.out.println("user" + email + "whatches" + movie + "in UltraHD");

    }
}
