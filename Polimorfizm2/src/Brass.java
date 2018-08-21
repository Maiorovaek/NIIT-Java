public class Brass extends Wind {
    public void play(Note n, Note m){
        System.out.println("Brass.play()" + n + " "+ m);
    }
    public  void adjust(){
        System.out.println("Adjusting Brass");
    }
}
