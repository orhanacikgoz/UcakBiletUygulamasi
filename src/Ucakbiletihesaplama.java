import java.util.Scanner;


public class Ucakbiletihesaplama {
    public static void main(String[] args) {
        double km,yolculuktipi, yas, gidisucret,gidisdonusucret;

        Scanner inp=new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km=inp.nextDouble();
        System.out.print("Yasinizi giriniz: ");
        yas=inp.nextDouble();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yon , 2 => Gidis Donus ):");
        yolculuktipi=inp.nextDouble();
        gidisdonusucret=km*0.1*2;
        gidisucret=km*0.1;



        if (yolculuktipi==1 || yolculuktipi==2){

            if (yolculuktipi==1){

                System.out.println("Normal Tutar: "+gidisucret);
                if (yas<12){
                    System.out.println("Yas Indirimi: "+gidisucret/2);
                    System.out.println("Odemeniz Gereken Toplam Tutar: "+(gidisucret-gidisucret/2));
                }else if (yas>=12 && yas<=24){
                    System.out.println("Yas Indirimi: "+gidisucret*0.1);
                    System.out.println("Odemeniz Gereken Toplam Tutar: "+(gidisucret-gidisucret*0.1));
                }else if (yas>65){
                    System.out.println("Yas Indirimi: "+gidisucret*0.3);
                    System.out.println("Odemeniz Gereken Toplam Tutar: "+(gidisucret-gidisucret*0.3));
                }
            }else{
                System.out.println("Normal Tutar: "+gidisdonusucret);
                System.out.println("Gidis Donus Secim Indirimi: "+gidisdonusucret*0.2);
                if (yas<12){
                    System.out.println("Yas Indirimi: "+gidisdonusucret/2);
                    System.out.println("Odemeniz Gereken Toplam Tutar: "+(gidisdonusucret-gidisdonusucret/2));
                }else if (yas>=12 && yas<=24){
                    System.out.println("Yas Indirimi: "+gidisdonusucret*0.1);
                    System.out.println("Odemeniz Gereken Toplam Tutar: "+(gidisdonusucret-gidisdonusucret*0.1));
                }else if (yas>65){
                    System.out.println("Yas Indirimi: "+gidisdonusucret*0.3);
                    System.out.println("Odemeniz Gereken Toplam Tutar: "+(gidisdonusucret-gidisdonusucret*0.3));
                }else {
                    System.out.println("Odemeniz Gereken Toplam Tutar: "+(gidisdonusucret-gidisdonusucret*0.2));
                }
            }
        }else{
            System.out.println("Hatali deger girdiniz lutfen yeniden deneyin.");
        }





























    }
}
