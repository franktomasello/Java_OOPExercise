import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Thing> things;
    private final int MAX_WEIGHT_LIMIT;

    public Suitcase(int MAX_WEIGHT_LIMIT)
    {
        this.things = new ArrayList<>();
        this.MAX_WEIGHT_LIMIT = MAX_WEIGHT_LIMIT;
    }

    public void addThing(Thing thing)
    {
        if(totalWeight() + thing.getWeight() <= MAX_WEIGHT_LIMIT) {
            things.add(thing);
        }
    }

    public String toString()
    {
        if(things.size() == 0)
        {
            return "empty" + " " + "(" + totalWeight() + " " + "kg" + ")";
        }
        if(things.size() == 1)
        {
            return things.size() + " " + "thing" + " " + "(" + totalWeight() + " " + "kg" + ")";
        }
        return things.size() + " " + "things" + " " + "(" + totalWeight() + " " + "kg" + ")";
    }

    public int totalWeight()
    {
        int total = 0;
        for (Thing t : things)
        {
            total += t.getWeight();
        }
        return total;
    }

    public void printThings()
    {
        for(Thing t : things)
        {
            System.out.println(t);
        }
    }

    public Thing heaviestThing()
    {
        int heaviest = 0;
        int heaviestThingIndex = 0;
        if(things.isEmpty())
        {
            return null;
        }
        for(int i = 0; i < things.size(); i ++)
        {
            if(things.get(i).getWeight() > heaviest)
            {
                heaviestThingIndex = i;
                heaviest = things.get(i).getWeight();
            }
        }
        return things.get(heaviestThingIndex);
    }

    public int getMAX_WEIGHT_LIMIT()
    {
        return MAX_WEIGHT_LIMIT;
    }


}
