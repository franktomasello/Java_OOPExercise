
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!
        Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase tomsCase = new Suitcase(10);
        tomsCase.addThing(book);
        tomsCase.addThing(mobile);

        Suitcase georgesCase = new Suitcase(10);
        georgesCase.addThing(brick);

        Container container = new Container(1000);
        container.addSuitcase(tomsCase);
        container.addSuitcase(georgesCase);

        System.out.println("There are the following things in the container suitcases:");
        container.printThings();
    }

    public static void addSuitcasesFullOfBricks(Container container)
    {
        Thing brick = new Thing("Brick", 4);
        
        for (int i = 0; i < 100; i++)
        {

        }
    }

}
