public class Solution {

    public String encode(List<String> strs) {

        StringBuilder encoded = new StringBuilder();

        for(String s: strs){

            int len = s.length();
            encoded.append(len).append('#').append(s);

        }
        return encoded.toString();
    }

    public List<String> decode(String str) {

        List<String> decoded = new ArrayList<>();
        int pos = 0;

        while (pos < str.length()){
            StringBuilder lengthStr = new StringBuilder();
            while (Character.isDigit(str.charAt(pos))){
                lengthStr.append(str.charAt(pos));
                pos++;
            }
            int len = Integer.parseInt(lengthStr.toString());

            pos++;

            String value = str.substring(pos,pos + len);
            decoded.add(value);
            pos +=len;
        }

        return decoded;
    }
}