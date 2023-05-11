package Dog;
public class App {
    public static void main(String[] args) throws Exception {

        // Create object from pet class
        Golden_Husky myPet = new Golden_Husky();

        myPet.bark();
        System.out.println(myPet.eyeColor);
        System.out.println(myPet.height);
    }
}