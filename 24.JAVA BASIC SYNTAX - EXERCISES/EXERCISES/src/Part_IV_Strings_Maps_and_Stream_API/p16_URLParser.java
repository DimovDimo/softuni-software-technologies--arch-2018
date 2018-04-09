package Part_IV_Strings_Maps_and_Stream_API;

import java.util.Scanner;

public class p16_URLParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        String[] protocolSplit = url.split(":\\/\\/");
        String protocol = "";
        if (protocolSplit.length == 2) {
            protocol = protocolSplit[0];
        }

        String serverForSplit = url.replaceAll(protocol + "://", "");
        String[] serverSplit = serverForSplit.split("\\/", 2);
        String server = "";
        String recource = "";
        if (serverSplit.length == 2) {
            server = serverSplit[0];
            recource = serverSplit[1];
        } else {
            server = serverForSplit;
        }

        System.out.printf("[protocol] = \"%s\"\n", protocol);
        System.out.printf("[server] = \"%s\"\n", server);
        System.out.printf("[resource] = \"%s\"\n", recource);
    }
}
