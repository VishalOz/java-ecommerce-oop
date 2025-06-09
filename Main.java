import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Shops> shopList = new ArrayList<>();

        Shops telisonic = new Shops("Telisonic");
        shopList.add(telisonic);
        telisonic.addProduct(new Product("4K UHD Smart TV with HDR10+", 899.99));
        telisonic.addProduct(new Product("OLED TV with Dolby Vision", 2999.99));
        telisonic.addProduct(new Product("Noise-cancelling wireless headphones", 349.99));
        telisonic.addProduct(new Product("Portable Bluetooth speaker with 20W output", 129.99));
        telisonic.addProduct(new Product("Color-changing smart bulb with voice control", 249.99));
        telisonic.addProduct(new Product("Ergonomic design with customizable buttons", 69.99));
        telisonic.addProduct(new Product("Waterproof action camera with 4K/60fps", 299.99));
        telisonic.addProduct(new Product("24MP DSLR with 18-55mm lens kit", 699.99));
        telisonic.addProduct(new Product("Universal fast charger with multiple ports", 39.99));
        telisonic.addProduct(new Product("Gold-plated 3.5mm audio cable", 29.99));

        int choice = 7;
        while(choice != 0) {
            System.out.println("------ Welcome to Shopping Portal ------");
            for (Shops shop : shopList) {
                System.out.println(shop);
            }
            System.out.println();
            System.out.println("Select a Shop(1-10): ");
            choice = scanner.nextInt();
        }
        

    }


}
