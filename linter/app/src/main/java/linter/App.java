package linter;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        checkSemiColon("app/src/main/resources/gates.js");
    }

    public void testCheckSemiColon(String file){
        checkSemiColon(file);
    }
    public static void checkSemiColon(String file){
        Path path = Paths.get(file);
        try{
            Scanner gatesS = new Scanner(path);
            int line = 1;
            while(gatesS.hasNext()){
                String input = gatesS.nextLine();
                if(!input.isEmpty()
                        && !input.endsWith("{")
                        && !input.endsWith("}")
                        && !input.contains("if")
                        && !input.contains("else")){
                    if(!input.endsWith(";")){
                        System.out.println("Line " + line + ": Missing semicolon." + " " + input);
                    }
                }
                line++;
            }
        } catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
