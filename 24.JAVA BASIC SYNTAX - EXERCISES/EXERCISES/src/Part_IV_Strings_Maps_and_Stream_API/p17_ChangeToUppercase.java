package Part_IV_Strings_Maps_and_Stream_API;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p17_ChangeToUppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String pattern = "<upcase>(.*?)<\\/upcase>";
        Pattern r = Pattern.compile(pattern);
        Matcher matcher = r.matcher(text);
        if (matcher.find( )) {
            int from = 0;
            while(matcher.find(from)) {
                from = matcher.start() + 1;
                String target =  matcher.group(1);
                String forReplase = "<upcase>" + target + "<\\/upcase>";
                String targetUperCase = target.toUpperCase();
                text = text.replaceAll(forReplase, targetUperCase);
            }

            System.out.println(text);
        }else {
            System.out.println(text);
        }
    }
}
