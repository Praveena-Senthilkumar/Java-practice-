class non_repetitive_character {
   public static void main(String[] args) {
      String str = "abcabcde";
      char result = findFirstNonRepetitiveCharacter(str);
      if (result != '\0') {
         System.out.println("The first non-repetitive character is: " + result);
      } else {
         System.out.println("No non-repetitive character found.");
      }
   }

}

public static char findFirstNonRepetitiveCharacter(String str) {
   for (int i = 0; i < str.length(); i++) {
      char currentChar = str.charAt(i);
      boolean isRepetitive = false;

      for (int j = 0; j < str.length(); j++) {
         if (i != j && currentChar == str.charAt(j)) {
            isRepetitive = true;
            break;
         }
      }

      if (!isRepetitive) {
         return currentChar;
      }
   }
   return '\0'; 
}