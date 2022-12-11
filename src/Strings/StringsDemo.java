package Strings;

public class StringsDemo {
    public static void main(String[] args) {
       // String text = "Java ist cool und das Übungsblatt bald zu Ende!";
        // String result = "";
        // for (int i = 0; i < text.length(); i++) {
        //      char c = text.charAt(i);
        //     if (i == 0 || text.charAt(i-1) == ' '){
        //        c = Character.toUpperCase(c);
        //    }
        //     result = result + c;
        // }
        // System.out.println("Ausgangstext: " + text);
        // System.out.println("Ergebnis: " + result);
        String csvline = "spalte1,spalte2,spalte3,spalte4,spalte5";
        CSVParser parser = new CSVParser(csvline);
        System.out.println(parser.countComma());
        String[] result = parser.parse();
        for (String column :
                result) {
            System.out.println("column = " + column);
        }

    }
}
