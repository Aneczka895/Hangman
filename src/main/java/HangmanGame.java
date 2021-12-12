import java.util.ArrayList;
import java.util.Random;

public class HangmanGame {

    //Java keywords

    public static final String[] WORDS = {
            "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE",
            "CASE", "CATCH", "CHAR", "CLASS", "CONST",
            "CONTINUE", "DEFAULT", "DOUBLE", "DO", "ELSE",
            "ENUM", "EXTENDS", "FALSE", "FINAL", "FINALLY",
            "FLOAT", "FOR", "GOTO", "IF", "IMPLEMENTS",
            "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG",
            "NATIVE", "NEW", "NULL", "PACKAGE", "PRIVATE",
            "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC",
            "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED",
            "THIS", "THROW", "THROWS", "TRANSIENT", "TRUE",
            "TRY", "VOID", "VOLATILE", "WHILE"
    };

    public static final Random RANDOM = new Random();

    //max errors before user loses
    public static final int MAX_ERRORS = 8;

    //word to find
    private String wordToFind;

    //word found stored in a char arra to show progression of user
    private char[] wordFound;

    private int nbErrors;

    //letters already entred by user
    private ArrayList<String> letters = new ArrayList<>();

    //method letting the computer choose the next word the user must guess
    private String nextWordToFind() {
        return WORDS[RANDOM.nextInt(WORDS.length)];
    }


    //method to start a new Hangman game
    public void newGame() {
        nbErrors = 0;
        letters.clear(); //making an array empty & size = 0
        wordToFind = nextWordToFind(); //picking the next word randombly

        //word found initialisation:
        wordFound = new char[wordToFind.length()]; // tworzymy nowy array pusty o określonej długości

        for (int i = 0; i < wordFound.length; i++) {
            wordFound[i] = '_';
        }

    }



}
