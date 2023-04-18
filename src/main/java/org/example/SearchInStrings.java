package org.example;

public class SearchInStrings {

    public static void main(String[] args) {
        String name = "Manya";
        char search = 'y';
        System.out.println(search(name, search));
        System.out.println(search2(name, search));
    }

    static boolean search2(String string, char ch){
        if (string.length() == 0) return false;
        for (char c : string.toCharArray()) {
            if (c == ch) return true;
        }
        return false;
    }

    static boolean search(String string, char ch){
        if (string.length() == 0) return false;
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }
}
