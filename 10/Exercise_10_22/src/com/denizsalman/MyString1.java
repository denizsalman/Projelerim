package com.denizsalman;

public class MyString1 {

    private char[] chars;
    public MyString1(char[] chars) {
        this.chars = chars;
    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length(){
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        char[] c = new char[end - begin];
        for (int i = begin; i < end; i++) {
            c[i] = chars[i];
        }
        return new MyString1(c);
    }

    public MyString1 toLowerCase() {
        int distance = 'A' - 'a';
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] - distance);
            }
        }
        return new MyString1(chars)
    }

    public boolean equals(MyString1 s) {
        if (chars.length != s.length()) {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static MyString1 valueOf(int i) {
        
        return new MyString1()
    }


}
