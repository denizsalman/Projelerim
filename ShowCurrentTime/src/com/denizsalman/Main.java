package com.denizsalman;

import java.util.Scanner;

public class Main {
    /**
     * Main method
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vezir = new int[64]; // satranc tahtamız 8x8=64 olduğu için

        /** Burada vezir dizimizin bütün elemanlarını 0 yaparak, satranç tahtamıza henüz
         * vezir yerleştirmediğimizi belirtiyoruz. Program boyunca tahtanın hangi alanına
         * vezir yerleştirirsek o alanı 1'e eşitleyeceğiz.
         */
        diziyiSifirla(vezir);
        /** Burada satranç tahtamızın ilk satırına kullanıcı tarafından vezir yerleştirmesini
         * sağlayacağız.
         */
        System.out.print("1. satırda hangi sutuna vezir yerleştirmek istersiniz?(0-7): ");
        int ilkVezir = input.nextInt();
        vezir[ilkVezir] = 1;
        vezirKapsamaAlanı(vezir, ilkVezir);
        vezirYazdır(vezir);
        rastgeleYerlestir(vezir, ilkVezir);


    }

    public static void diziyiSifirla(int[] vezir) {
        for (int i = 1; i < 64; i++) {
            vezir[i] = 0;
        }
    }

    //Satranç tahtamıza yerleştirdiğimiz vezirlerimizi bu metod  sayesinde görüntüleyeceğiz.
    public static void vezirYazdır(int[] vezir) {
        for (int i = 0; i < 64; i++) {
            if (i % 8 == 0 && i != 0) {
                System.out.println("|");
            }
            if (vezir[i] == 1) {
                System.out.print("|Q");
            } else {
                System.out.print("| ");
            }

            if (i == 63) {
                System.out.print("|");
            }
        }

    }

    public static void rastgeleYerlestir(int[] vezir, int ilkVezir) {
        int vezirSayisi = 1;
        int index;
        long timeOut = 0;
        while (vezirSayisi != 7) {
            while (vezirSayisi != 7 && timeOut != 5_000_000_0) {
                index = (int) (Math.random() * 64);
                if (vezir[index] == 0) {
                    vezir[index] = 1;
                    vezirKapsamaAlanı(vezir, index);
                    //System.out.println("\n----------------------");
                    //vezirYazdır(vezir);
                    vezirSayisi++;
                }
                if (diziFullDolu(vezir)) {
                    break;
                }
            }
            diziyiSifirla(vezir);
            vezir[ilkVezir] = 1;
            vezirKapsamaAlanı(vezir, ilkVezir);
            vezirSayisi = 1;
        }
        vezirYazdır(vezir);
    }

    /**Bu method, yerleştirilen vezirin yatayda, dikeyde, çaprazda kilitlediği alanı göstermektedir.
     *Bu alana göre vezir yerleştirilemeyecek alanlar belli olacaktır. Vezirin kapsama alanını belirlemek
     * için bu alanlara denk gelen dizi indexlerinin içeriğini 2'ye eşitliyoruz.
     */

    public static void vezirKapsamaAlanı(int[] vezir, int index) {
        int tutulanSatir = index / 8;
        int tutulanSutun = index % 8;
        int tutulanSatirBaslangicIndex = tutulanSatir * 8;

        //Yerleştirlen vezirin satırlarda kilitlediği alan
        for (int i = tutulanSatirBaslangicIndex;i < tutulanSatirBaslangicIndex + 8; i++) {
            if (vezir[i] == 1){
                continue;
            } else {
                vezir[i] = 2;
            }
        }

        for (int i = tutulanSutun;i < 64;i += 8 ) {
            if (vezir[i] == 1) {
                continue;
            } else {
                vezir[i] = 2;
            }
        }

        for (int i = index + 7; i < 64;i += 7) {
            if (vezir[i] == 1){
                continue;
            } else {
                vezir[i] = 2;
            }
        }

        for (int i = index + 9; i < 64;i += 9) {
            if (vezir[i] == 1){
                continue;
            } else {
                vezir[i] = 2;
            }
        }

        for (int i = index - 7; i >= 0;i -= 7) {
            if (vezir[i] == 1){
                continue;
            } else {
                vezir[i] = 2;
            }
        }

        for (int i = index - 9; i >= 0;i -= 9) {
            if (vezir[i] == 1){
                continue;
            } else {
                vezir[i] = 2;
            }
        }

    }
    public static boolean diziFullDolu(int[] vezir){
        for(int i=0;i<64;i++)
            if(vezir[i]==0)
                return false;
        return true;
    }

}