

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();

        for (String email : emails) {
            // 1. Split the email at the '@' symbol
            int atIndex = email.indexOf('@');
            String local = email.substring(0, atIndex);
            String domain = email.substring(atIndex); // includes '@'

            // 2. Ignore everything after '+' in the local name
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf('+'));
            }

            // 3. Remove all dots '.' from the local name
            local = local.replace(".", "");

            // 4. Combine and add to the HashSet
            set.add(local + domain);
        }

        return set.size();
    }
}