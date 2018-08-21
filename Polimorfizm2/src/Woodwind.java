public class Woodwind extends Wind {
    public  void play(Note n, Note m){
        System.out.println("Woodwind.play()" + n + "  " + m);
    }
    public String what() { return "Woodwind";}
}