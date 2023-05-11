package Cat;
public class App {
    public static void main(String[] args) throws Exception {

        // Create object from pet class
        Pet myPet = new Pet();

        myPet.meow();
        System.out.println("My PurPin has a " + myPet.eyeColor + " eyes");
        System.out.println("He is " + myPet.height + " tall");
    }
}
