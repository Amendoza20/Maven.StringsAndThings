package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {


    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {
//loop through string to see if letter is y or z && if next character is space or end of string.


        Integer counter = 0;
        Integer i = 0;

        for (i = 0; i < input.length(); i++) {
            Character character = input.charAt(i);

            if ((character.equals('y') || character.equals('z')) && (i + 1 >= input.length() || input.charAt(i + 1) == ' ')) {

                counter++;
            }
        }
        return counter;
    }

    /*


     */


    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */

    /*
    nested for loop, when the character matches the first character does a character
    StringBuilder.append(string1.charAt(1)

     */
    public String removeString(String base, String remove) {
        String result = "";
        for (Integer i = 0; i < base.length(); i++) {
            Character index = base.charAt(i);
            if (index.equals(remove.charAt(0))) {
                if (remove.length() == 1) {
                    continue;
                }
            } else {
                result += index;
            }
        }
        return null;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {
        int counter1 = 0;
        int counter2 = 0;

        for (int i = 0; i < input.length() - 1; i++) {

            if (input.charAt(i) == 'i' && input.charAt(i + 1) == 's') {
                counter1++;
            }
            if (input.charAt(i) == 'n' && input.charAt(i + 1) == 'o' && input.charAt(i + 2) == 't') {
                counter2++;
            }

        }
        return counter1 == counter2;
    }


        /**
         * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
         * Return true if all the g's in the given string are happy.
         * example : gHappy("xxggxx") // Should return  true
         *           gHappy("xxgxx") // Should return  false
         *           gHappy("xxggyygxx") // Should return  false
         */
        public Boolean gIsHappy (String input){

            for (Integer i = 0; i < input.length(); i++) {
                Character current = input.charAt(i);
                if (current.equals('g')) {
                    boolean gExists = false;


                    if (i > 0 && input.charAt(i - 1) == 'g') {
                        gExists = true;
                    }
                    if (i < input.length() - 1 && input.charAt(i + 1) == 'g') {
                        gExists = true;
                    }
                    if (!gExists) {
                        return false;
                    }
                }
            }
            return true;
            }
/*
 for(int i = 0; i < input.length()-1; i++)
        {
        if (input.charAt(i) == 'g' && input.charAt(i+1) == 'g'){
        return true;
        }
        }
        return false

*/


        /**
         * We'll say that a "triple" in a string is a char appearing three times in a row.
         * Return the number of triples in the given string. The triples may overlap.
         * example :  countTriple("abcXXXabc") // Should return 1
         *            countTriple("xxxabyyyycd") // Should return 3
         *            countTriple("a") // Should return 0
         */
        public Integer countTriple (String input){
            //Set a result counter variable
            Integer result = 0;
            //Set a character counter variable
            Integer x = 1;
            //Set a previous character variable
            Character previous = null;

            //Loop Through string input
            for (int i = 0; i < input.length(); i++) {
                Character current = input.charAt(i);
                if (current == previous) {
                    x++;
                } else {
                    x = 1;
                }
                //If current character equals previous character add 1 to character counter
                //Else set character counter to 1

                if (x >= 3) {
                    result++;

                }

                //If character counter >= 3, add 1 to result counter
                //set current character to previous character
                previous = current;
            }
            return result;
        }// this closes method count triple
    }//this closes class

//what is the char here. variable that saves the previous character outside of loop. also set counter outside of loop. if is same set counter to +=1
