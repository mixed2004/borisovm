package ru.job4j.coffemachine;

/**
 *рассчет сдачи.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 28.04.2018
 */
public class CoffeMachine {
    /**
     * method of counting change.
     *
     * @param value value of money
     * @param price price
     * @return coinsNumber
     */
   public int[] changes(int value, int price) {
       int surrender = value - price;
       int[] coinsNominal = {1, 2, 5, 10};
       int[] result = new int[coinsNominal.length];
       int numberElementCoins = 0;
       for (int i = coinsNominal.length - 1; i >= 0; i--) {
           result[i] = surrender / coinsNominal[i];
           surrender = surrender % coinsNominal[i];
           if (result[i] != 0) {
               numberElementCoins += result[i];
           }
       }
       int[] coinsNumber = new int[numberElementCoins];
       int index = 0;
           for (int i = 0; i < coinsNominal.length; i++) {
               for (int j = 0; j < result[i]; j++) {
                   coinsNumber[index] = coinsNominal[i];
                   index++;
               }
           }
       return coinsNumber;
   }
}
