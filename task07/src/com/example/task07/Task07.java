package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {
        n = n / k;
        m = m / k;
        return n * m;
    }

    public static void main(String[] args) {
        int result = solution(10, 20, 5);
        System.out.println(result);
    }
}