import java.util.ArrayList;

public class Container {

    private final int MAX_WEIGHT_LIMIT;
    private ArrayList<Suitcase> suitcases;

    public Container(int MAX_WEIGHT_LIMIT) {
        this.MAX_WEIGHT_LIMIT = MAX_WEIGHT_LIMIT;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase)
    {
        if(suitcase.totalWeight() + totalContainerWeight() <= MAX_WEIGHT_LIMIT)
        {
            suitcases.add(suitcase);
        }
    }

    public int totalContainerWeight()
    {
        int containerWeight = 0;
        for (Suitcase s : suitcases)
        {
            containerWeight += s.totalWeight();
        }
        return containerWeight;
    }

    public String toString()
    {
        if(suitcases.size() == 0)
        {
            return "empty" + " " + "(" + totalContainerWeight() + " " + "kg" + ")";
        }
        if(suitcases.size() == 1)
        {
            return suitcases.size() + " " + "suitcase" + " " + "(" + totalContainerWeight() + " " + "kg" + ")";
        }
        return suitcases.size() + " " + "suitcases" + " " + "(" + totalContainerWeight() + " " + "kg" + ")";
    }

    public void printThings()
    {
        for (Suitcase s : suitcases)
        {
            s.printThings();
        }
    }





}
