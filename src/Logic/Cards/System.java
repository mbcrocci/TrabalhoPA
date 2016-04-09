package Logic.Cards;

/**
 * Created by mbcrocci on 09/04/16.
 */
public class System {
    private String name;
    private int resistance;
    private int metal;
    private int wealth;
    private int victoryPoint;

    public System(String name, int resistance, int metal, int wealth, int victoryPoint) {
        this.name = name;
        this.resistance = resistance;
        this.metal = metal;
        this.wealth = wealth;
        this.victoryPoint = victoryPoint;
    }
}
