Write a program to return a string from a given string s where all occurrences of 
the first char of the string except the first occurrence have been changed to '$'.
public static String change_char(String s) {
 StringBuilder result = new StringBuilder(); 
        char firstChar=s.charAt(0);
        result.append(firstChar); 
        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            if (currentChar == firstChar) {
                result.append('$');
            } else {
                result.append(currentChar);
            }
        }

        return result.toString(); 
    }
