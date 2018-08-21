public class Stringed extends Instrument {

    public   void play(Note n, Note m){
        System.out.println("Stringed.play()" + n + " " + m);
    }

    public String what(){ return "Stringed";}
    public void adjust(){
        System.out.println("Adjusting Stringed");
    }
}
