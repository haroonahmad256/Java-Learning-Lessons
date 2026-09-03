public class Plant extends Organism {
    String growFactor;
    Plant(){
        growFactor= "Sunlight";
    }

    void sun(){
        System.out.println("Sun is like oxygen for plants");
    }

}
