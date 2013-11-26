import java.io.FileReader;
import java_cup.runtime.Symbol;

public class Main {

        /**
         * @param args
         */
        public static void main(String[] args) {
                try {
                        FileReader  myFile = new FileReader(args[0]);
                        Lexer myLex = new Lexer(myFile);
                        Parser myParser = new Parser(myLex);
                        try {
                                Symbol result=myParser.parse();
                        }
                        catch (Exception e) {
                                System.out.println("parse error");
                        }
                }
                catch (Exception e){
                        System.out.println("invalid file");
                }
        }
}
