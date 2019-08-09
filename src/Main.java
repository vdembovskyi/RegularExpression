import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String challenge1 = "I want a bike.";
        String challenge2 = "I want a ball.";
        System.out.println(challenge1.matches("I want a bike."));

        String regEXp1 = "I want a \\w+.";
        String regEXp2 = "I want a (bike|ball).";
        String regEXp3 = "I want a \\w+.";
        Pattern pattern = Pattern.compile(regEXp3);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());
        matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches());

        System.out.println(challenge1.matches(regEXp1));

        String challenge4 = "Replace all blanks with";
        System.out.println(challenge1.replaceAll(" ", "_"));
        System.out.println(challenge1.replaceAll("\\s", "_"));

        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("[abcdefg]+"));
        System.out.println(challenge5.matches("^a{3}bc{8}d{3}ef{3}g$"));

        String challenge7 = "abcd.135";

        System.out.println(challenge7.matches("^[A-z][a-z]+\\.\\d+$"));


        String challenge8 = "abcd.135uvqz.7tzik.999";
        Pattern pattern8 = Pattern.compile("[A-Za-z]+\\.(\\d+)");
        Matcher matcher8 = pattern8.matcher(challenge8);
        while (matcher8.find()){
            System.out.println(matcher8.group(1));
        }

        String challenge10 = "abcd.135\tuvqz.7\ttzik.999\t";
        Pattern pattern10 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcher10 = pattern10.matcher(challenge10);
        while (matcher10.find()){
            System.out.println(matcher10.start(1) + " " + (matcher10.end(1)-1));
        }


        String challenge11 = "{0,2}, {0,5}, {1,3}, {2,4}";
        Pattern pattern11 = Pattern.compile("\\{(.+?)\\}");
        Matcher matcher11 = pattern11.matcher(challenge11);
        while (matcher11.find()){
            System.out.println(matcher11.group(1));
        }


        String challenge12 = "11111";
        System.out.println(challenge12.matches("^\\d{5}$"));

        String challenge13 = "11111-1111";
        System.out.println(challenge13.matches("^\\d{5}-\\d{4}$"));

    }
}
