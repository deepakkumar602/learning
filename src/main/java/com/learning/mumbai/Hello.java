package com.learning.mumbai;

class Hello {
    public static int fun(int a, int b) {
        if (a > 1 || b > 1) {
            return fun(0, 0) + fun(0, 1) + fun(a - 1, a - 1);
        } else {
            a = a + 1;
            b = b - 1;
        }
        return a + 2 - b;
    }

    public static void main(String[] args) {
        System.out.println(fun(3, 3));
    }
}