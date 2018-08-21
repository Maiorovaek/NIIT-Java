public class Percussion extends  Instrument {

    public  void play(Note n, Note m) {

        System.out.println("Percussion.play()" + n + "  " + m);
    }
    public String what() { return "Percussion";}
    public  void adjust(){
        System.out.println("Adjusting Percussion");
    }
}
