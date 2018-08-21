public class Wind extends Instrument {
    public   void play(Note n, Note m){

        System.out.println("Wind.play()" + n + "  " + m);

    }

    public String what() { return "Wind";}
    public  void adjust(){
        System.out.println("Adjusting Wind");
    }


}
