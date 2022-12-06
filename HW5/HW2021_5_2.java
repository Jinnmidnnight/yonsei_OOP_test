package HW5;
import java.util.Scanner;

public class HW2021_5_2 {
    public static void main (String[] args){
        String dict = "";
        System.out.println("[DICT]=" + dict);
    
        Scanner keyboard = new Scanner(System.in);
        
        while (true) {
            String inst = keyboard.next();
            if (inst.equals("add")) {
                String word = keyboard.next().toUpperCase();
                String newWord = word.substring(0,1) + word.substring(1).toLowerCase();
                if (dict.indexOf(newWord) == -1) {
                    dict += newWord;
                }
                System.out.println("[DICT]=" + dict);
            }
            else if (inst.equals("delete")) {
                String word = keyboard.next().toUpperCase();
                String newWord = word.substring(0,1) + word.substring(1).toLowerCase();
                if (dict.indexOf(newWord) != -1) {
                    dict = dict.substring(0, dict.indexOf(newWord)) + dict.substring(dict.indexOf(newWord)+newWord.length());
                }
                System.out.println("[DICT]=" + dict);
            }
            else if (inst.equals("end")) {
                System.out.println("[DICT]=" + dict);
                System.out.println("Bye");
                break;
            }
            else {
                System.out.println("wrong operator");
            }
        }
    }


}
