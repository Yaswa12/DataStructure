public class longestCommonPrefix {
    public String longestCmmonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        String prefix = strs[0];
       
        for (int i = 1; i < strs.length; i++) {
            //indexOf is the java method to find if
            //the index of the one string is equal to the index of 
            //the other sting
            //prefix=flower;
            //comparing with the flag it will iterate through each letter and 
            // see if there is any uncommon letter and
            // we decrese the letters form the string through the while loop from the string[by using the prefix.substring] 
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        longestCommonPrefix solution = new longestCommonPrefix();

        String[] strs1 = { "flower", "flow", "flight" };
        System.out.println(solution.longestCmmonPrefix(strs1)); // Output: "fl"

        String[] strs2 = { "dog", "racecar", "car" };
        System.out.println(solution.longestCmmonPrefix(strs2)); // Output: ""
    }
}
