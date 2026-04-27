class Solution {
    public boolean isAnagram(String s, String t) {


        char[] first = s.toLowerCase().toCharArray();
        char[] second = t.toLowerCase().toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first,second);
    }
}
