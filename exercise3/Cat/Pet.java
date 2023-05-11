package Cat;
public class Pet implements PerPin {

    String name = "I have a cat named Moshi";
    String age = "He is 1 year and 7 months";


    @Override
    public void meow() {
        System.out.println("My cute PerPin is meowing");

    }
   
}
