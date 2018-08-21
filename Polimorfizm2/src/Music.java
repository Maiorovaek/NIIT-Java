public class Music {


//    private static RandomInstrumentGenerator gen = new RandomInstrumentGenerator();

 static void tune(Instrument i){
        i.play(Note.MIDDLE_C, Note.B_FLAT);
      // System.out.println(i);
    }


static  void tuneAll(Instrument[] e){

        for (Instrument i : e)
            tune(i);
    }
    public static void main(String[] args) {

        Instrument[] orchestra = {new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind()};
        tuneAll(orchestra);
//            Instrument [] inst =  new Instrument[20];
//
//            for (int i=0; i<inst.length; i++)
//            inst[i]=gen.next();
//
//          for (Instrument i : inst){
//              i.play(Note.MIDDLE_C, Note.B_FLAT);
//          System.out.println(gen.next());}
        }
    }

    /*public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
        Brass viol = new Brass();
        tune(viol);
    }
*/
  /*  public static void tune(Wind i){
        i.play(Note.MIDDLE_C, Note.B_FLAT);
    }
    public static void tune(Stringed i){
        i.play(Note.MIDDLE_C, Note.B_FLAT);
    }

    public static void tune(Brass i){
        i.play(Note.MIDDLE_C, Note.B_FLAT);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute);
        tune(violin);
        tune(frenchHorn);
    }*/


