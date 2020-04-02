public class StandardUser extends BasicUser{

    StandardUser(String email, int price, int numberOfParalellScreens) {
        super(email, price, numberOfParalellScreens);
    }

    public void watchHd (Device device, String movie){
        System.out.println("user" + email + "whatches" + movie + "in HD");

    }

}
