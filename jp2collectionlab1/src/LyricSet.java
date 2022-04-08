import java.util.HashSet;
import java.util.Set;

public class LyricSet {
    private static final String[] lyric = {"you", "say", "it", "best",
            "when", "you", "say", "nothing", "at", "all"};

    public static void main(String[] args) {
        //create a set from Hashset that implement Set
        Set words=new HashSet<>();
        //add all words to set
        for (String w:lyric)
            words.add(w);
            //traverse the list
            //notice : set doesn't allow duplicate items
            for (Object o:words)
                System.out.println(o+" ");
                System.out.println("\n__________________");
                System.out.println("Contains [you]?:"+words.contains("you"));
                System.out.println("Contains [me]?:"+words.contains("me"));

    }
}
