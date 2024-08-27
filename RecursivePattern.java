package ProjectClass;

/*
Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.
Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
 */

import java.util.Scanner;
public class RecursivePattern {

    public static void decreasePattern(int n,int originalValue) {
        System.out.print(n + " ");

        if (n <= 0){
            increasePattern(n+5,originalValue);  //Sayı 0 veya negatif olduğunda arttırma işlemi yapılıyor
            return;
        }

        decreasePattern(n-5,originalValue);  //Sayıyı 5 eksilterek devam eder
    }


    public static void increasePattern(int n,int originalValue) {
        System.out.print(n + " ");

        if ( n == originalValue) {   //Başlangıç değeri neyse o değere ulaştığında işlem tamamlanır
            return;
        }

        increasePattern(n+5,originalValue);   //Sayıyı 5 ekleyerek başlangıç değerine kadar artarılıyor
    }



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        //Burada kullanıcıdan değer alıyoruz
        System.out.println("Desenini oluşturmak istediğiniz sayıyı girin: ");
        int n = input.nextInt();
        decreasePattern(n,n);

    }
}
