public class KlasseEins implements Vorschrift{

    public int liefereInt(String wort) {
       if(wort.equals("eins")){
           return 1;
       }
        if(wort.equals("zwei")){
            return 2;
        }
        // else - bezieht sich immer nur auf das "If" davor, funktioniert trotzdem da er von oben nach unten geht
        else{
            return 0;
        }
    }

    public String liefereString(int anzahl) {
        if(anzahl == 1){
            return "eins";
        }
        else{
            return "null";
        }
    }
}
