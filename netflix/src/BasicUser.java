public class BasicUser {

    String email;
    int price;
    int numberOfParalellScreens;

    BasicUser (String email, int price, int numberOfParalellScreens){
    this.email = email;
    this.price = price;
    this.numberOfParalellScreens = numberOfParalellScreens;
    }

    public void watch (Device device, String movie){
        System.out.println("user" + email + "whatches" + movie);

    }


}