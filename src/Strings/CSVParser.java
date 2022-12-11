package Strings;

public class CSVParser {
    private String csvline = "";

    public CSVParser(String csvline) {
        this.csvline = csvline;
    }

    public int countComma() {
        int counter = 0;
        for (int i = 0; i < csvline.length(); i++) {
            if (csvline.charAt(i) == ',')
                counter++;
        }
        return counter;
    }

    public String[] parse() {
        String[] result = new String[countComma()+1];
        int pos = 0;
        for (int i = 0; i < result.length; i++) {
            result[i] = "";
        }
        for (int i = 0; i < csvline.length(); i++) {
            char c = csvline.charAt(i);
            if (c == ',') {
                pos++;
            } else {
                result[pos] += c;
            }
        }
        return result;
    }


}
