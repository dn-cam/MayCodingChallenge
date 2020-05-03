/*
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, 
 * write a function that will return true if the ransom note can be constructed from the magazines ; 
 * otherwise, it will return false.

 * Each letter in the magazine string can only be used once in your ransom note.

 * Note:
 * You may assume that both strings contain only lowercase letters.
 */

/* 
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 */


class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length() < ransomNote.length())
            return false;
        if(ransomNote.length() == 0)
            return true;
        
        int i = 0;
        String[] ransom = ransomNote.split("");
        
        while(i < ransom.length && magazine.length() != 0){
            if(!magazine.contains(ransom[i]))
                return false;
            else magazine = magazine.replaceFirst(ransom[i], "");
            i++;
        }
        if(i == ransom.length && magazine.length() >= 0)
            return true;
        else if(i < ransom.length-1 && magazine.length() == 0)
            return false;
        else
            return false; 
    }
}