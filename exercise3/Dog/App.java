package Dog;
public class App {
    public static void main(String[] args) throws Exception {

        // Create object from pet class
        GoldenHusky myPet = new GoldenHusky();

        System.out.println(myPet.name);
        System.out.println(myPet.Sky);
        myPet.bark();
        System.out.println("He has a " + myPet.eyeColor + " eyes");
        System.out.println("He is " + myPet.height + " tall");
    }
}
