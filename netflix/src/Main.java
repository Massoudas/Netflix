import javax.print.DocFlavor;

public class Main {

    public static void main(String args[]) {

      BasicUser ahmad = new BasicUser("ahmad@gmail.com", 5, 3);
      StandardUser max = new StandardUser("ashmad@gmail.com", 53, 3);
      PremiumUser anna = new PremiumUser("ahsmad@gmail.com", 54, 4);

      ahmad.watch(new Device(), "Aladdin");
    }
}
