package Part_IV_Strings_Maps_and_Stream_API;

import java.util.*;

public class p19_PhonebookUpgrade {
    public static void main(String[] args) {
        TreeMap<String, String> phonebook = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while (!line.equals("END")) {
            String[] information = line.split(" ");
            if (information[0].equals("A")) {
                String name = information[1];
                String phone = information[2];
                phonebook.put(name, phone);
            } else if (information[0].equals("S")) {
                String name = information[1];
                if (phonebook.containsKey(name)) {
                    System.out.printf("%s -> %s\n", name, phonebook.get(name));
                } else {
                    System.out.printf("Contact %s does not exist.\n", name);
                }
            } else if (information[0].equals("ListAll")) {
                for (Map.Entry<String, String> entry : phonebook.entrySet()) {
                    System.out.printf("%s -> %S%n", entry.getKey(), entry.getValue());
                }
            }

            line = scanner.nextLine();
        }
    }
}
