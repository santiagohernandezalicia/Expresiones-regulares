import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main{
    public static void main(String[] args){
        System.out.println("3. Escribir una expresión regular para buscar cualquiera de las palabras de la siguiente lista: \nJava, Python, Go, Pascal,Perl.\n");

        String str = "LosJava sistemas de inforPerlmación usan lenguajes como Python se compGoaran frecuentemente en elPerl desaJavarrollo. \n ";
        String [] cadenas = str.split("Java|Python|Go|Pascal|Perl");
        for(int i = 0; i<cadenas.length; i++){
            System.out.print(cadenas[i]);
        }

        Pattern pat = Pattern.compile(".*Java.*|.*Python.*|.*Go.*|.*Pascal.*|.*Perl.*");
        Matcher mat = pat.matcher("LosJava sistemas de inforPerlmación usan lenguajes como Python se compGoaran frecuentemente en elPerl desaJavarrollo. ");
        if (mat.matches()) {
            System.out.println("Válido");
        } else {
            System.out.println("No Válido");
        }
    }
}
