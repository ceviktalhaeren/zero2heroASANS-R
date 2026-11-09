
package com.mycompany.asansor;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Asansor {

    public static void main(String[] args) {
        System.out.println("TEC ASANSOR arayuzune hosgeldiniz");
        
       Scanner sc = new Scanner(System.in);
       int  Mesafe;
        System.out.println("mevcut katinizi girer misiniz");
        int Mkat = sc.nextInt();
        System.out.println("sagolun,simdi ise gitmek istediginiz kati giriniz:");
        int Gkat = sc.nextInt();
        // eğer kat girişleri 1-10 arasında değilse 
        if (Mkat<1 || Gkat>10 || Mkat>10 || Gkat<1){
            System.out.println("HATA!!!! katlar 1-10 arasinda olmalidir");
        } else {
            // hareket mesafesi 
             
            Mesafe = Math.abs(Gkat-Mkat);
            System.out.println( Mesafe + " kat mesafesi:"  );
            
            //HAREKET YÖNÜ(yukarı , aşşağı)
            if (Mkat>Gkat) {
                System.out.println("ASSAGIYA DOGRU HAREKET EDILIYOR");
                
            }else if ( Mkat<Gkat) {
                System.out.println("YUKARI DOGRU HAREKET EDİLİYOR");
            } else {
                    System.out.println("ASANSOR HAREKET EDEMIYOR");
                    }
                   
        }
        
    }
}
