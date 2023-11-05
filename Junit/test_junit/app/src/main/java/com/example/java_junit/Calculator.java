package com.example.java_junit;

/**
 * Kelas Calculator merupakan sebuah kelas yang menyediakan fungsi-fungsi dasar
 * operasi matematika seperti penambahan, pengurangan, perkalian, dan pembagian.
 */
public class Calculator {
    /**
     * Fungsi ini menambahkan dua bilangan bulat.
     *
     * @param num1 Bilangan pertama yang akan ditambahkan
     * @param num2 Bilangan kedua yang akan ditambahkan
     * @return Hasil penambahan dari dua bilangan
     */
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Fungsi ini mengurangkan bilangan kedua dari bilangan pertama.
     *
     * @param num1 Bilangan utama dari mana bilangan kedua akan dikurangkan
     * @param num2 Bilangan yang akan dikurangkan dari bilangan pertama
     * @return Hasil pengurangan bilangan kedua dari bilangan pertama
     */
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Fungsi ini mengalikan dua bilangan.
     *
     * @param num1 Bilangan pertama yang akan dikalikan
     * @param num2 Bilangan kedua yang akan dikalikan
     * @return Hasil perkalian dari dua bilangan
     */
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Fungsi ini membagi bilangan pertama dengan bilangan kedua.
     *
     * @param num1 Bilangan yang akan dibagi
     * @param num2 Bilangan pembagi
     * @return Hasil pembagian bilangan pertama dengan bilangan kedua
     * @throws IllegalArgumentException Jika bilangan kedua adalah nol (0)
     */
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return num1 / num2;
    }
}
