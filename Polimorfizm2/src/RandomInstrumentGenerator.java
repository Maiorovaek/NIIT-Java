import java.util.Random;

public class RandomInstrumentGenerator {
    private Random c = new Random(47);
    public Instrument next(){
        switch (c.nextInt(5)){
            default:
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringed();
            case 3: return new Woodwind();
            case 4: return new Brass();
        }

    }

}
