package lab6.ex3;

import java.util.ArrayList;
import java.util.List;

public class lyricWordWithoutGeneric {
    private static final Word[] lyric={
            new Word("you",1), new Word("say",2), new Word("it",3),
            new Word("best",4),new Word("when",5),new Word("you",6),
            new Word("say",7), new Word("nothing",8), new Word("at",9),
            new Word("all",10)
    };

    public static void main(String[] args) {
        List lyrric=new ArrayList<>();
        //add all string in string array to list
        for (Object W:lyrric){
            lyrric.add(W);
            //show all elemenet of words
            for (Object o:lyrric){
                Word w=(Word) o;
                System.out.println(w.getValue()+", "+w.getPosition());
            }
        }
    }
}
