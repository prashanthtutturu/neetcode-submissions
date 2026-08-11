class Solution {
    public int numUniqueEmails(String[] emails) {
        
        Set<String> uniqueEmails = new HashSet<>();
        for(String email : emails){
            String[] parts = email.split("@");
            String localName = parts[0];
            String domain = parts[1];

            int endOfLocal = localName.indexOf('+');

            if(endOfLocal != -1){
                localName = localName.substring(0,endOfLocal);
            }

            localName = localName.replace(".","");

            uniqueEmails.add(localName + "@" + domain);
        }

        return uniqueEmails.size();
    }
}