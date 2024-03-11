public class InvalidLitri extends Exception{

    public InvalidLitri(double number){
        super("Il valore di " + number +  " litri non è corretto");
    }
}
