package Esercizio1;

public class Esercizio1 {
    public static void main(String[] args) {
   System.out.println(pariDispari("ciao"));
   System.out.println(pariDispari("eleonora!"));

   System.out.println(annoBisestile(1997));
   System.out.println(annoBisestile(2004));
    }
public static boolean pariDispari (String s){
        return s.length() % 2 == 0;
}
public static boolean annoBisestile (int i){
        if (i % 4 == 0){
            if (i % 100 == 0) {
                return i % 400 == 0;
            }
            return true;
    };
        return false;
};
}