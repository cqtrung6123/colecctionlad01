import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LyricWord {
    private  static  final String[] lyric={"you","say","it","best","when","you","say","nothing","at","all"};

    public static void main(String[] args) {
        //create a list  a list thats implpemented by Arratlist
        List word=new ArrayList<>();
        //add all String in String array to list
        for (String w:lyric)
            word.add(w);
            //traverse the list
            for (Object o:word)
                System.out.println(o+" ");
                System.out.println("Contains [you]:"+word.contains("you"));
                System.out.println("Contains [me]:"+word.contains("me"));
                System.out.println("Contains [say]:"+word.indexOf("say"));
                System.out.println("Where's the last [say]:"+word.lastIndexOf("say"));
                //sort word
                Collections.sort(word);
                //show all element of word
                for (Object o1:word){
                    System.out.println(o1+" ");
                }

            }
        }


