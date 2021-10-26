package edu.aluismarte.diplomado.code.alg;

/**
 * Created by Aluis on 10/25/2021.
 */
public class PrimeNumber {

    public boolean simplePrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean simplePrimeNumber2(int number) {
        int mid = (number / 2) + 1;
        for (int i = 2; i < mid; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean criba(int number) {
        if (number == 2) {
            return true;
        }
        int square = (int) Math.ceil(Math.sqrt(number));
        for (int i = 2; i <= square; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
