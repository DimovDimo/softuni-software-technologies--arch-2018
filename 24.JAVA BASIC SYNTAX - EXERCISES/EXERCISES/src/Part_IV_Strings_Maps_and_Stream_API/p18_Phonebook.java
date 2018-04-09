package Part_IV_Strings_Maps_and_Stream_API;

import java.util.HashMap;
import java.util.Scanner;

public class p18_Phonebook {
    public static void main(String[] args) {
        HashMap<String, String> phonebook = new HashMap<String, String>();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while (!line.equals("END")) {
            String[] information = line.split(" ");
            if (information[0].equals("A")) {
                String name = information[1];
                String phone = information[2];
                phonebook.put(name, phone);
                //if (!phonebook.containsKey(name)){
                //    phonebook.put(name, phone);
                //}else {
                //
                //}
            } else if (information[0].equals("S")) {
                String name = information[1];
                if (phonebook.containsKey(name)) {
                    System.out.printf("%s -> %s\n", name, phonebook.get(name));
                } else {
                    System.out.printf("Contact %s does not exist.\n", name);
                }
            }

            line = scanner.nextLine();
        }
    }
}
