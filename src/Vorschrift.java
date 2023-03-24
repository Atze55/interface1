public interface Vorschrift {
    // durch interface kann vorgeschrieben werden was verwendet werden muss
    // und was man erhalten möchte(return einer vorgeschriebenen Methode zum Beispiel),
    // egal was der Programmierer machen will
    // final = Konstante = nicht veränderbar im Lauf
    // public final nicht notwendig anzugeben, da im interface immer so
    public final static int wert = 140;

    // "public abstract" nicht notwendig anzugeben, da im interface immer so bei methoden
    public abstract String liefereString(int anzahl);

    // int liefereInt() = public abstract int liefereInt()
    int liefereInt(String wort);

}
