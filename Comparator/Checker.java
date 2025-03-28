package Comparator;
import java.util.Comparator;
public class Checker implements Comparator<Players> {
    @Override
    public int compare(Players a, Players b) {
        if(a.score!=b.score){
            return b.score-a.score;
        }
        return a.name.compareTo(b.name);
    }


}