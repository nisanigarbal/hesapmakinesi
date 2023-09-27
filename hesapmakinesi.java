import java.util.Scanner;
public class hesapmakinesi{
    public static void main(String[]args){
        int n1 , n2, select;
        Scanner input= new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz:");
        n1 = input.nextInt();
        System.out.print("ikinci sayısı giriniz:");
        n2= input.nextInt();

        System.out.println("1-Toplama\n2-Cıkarma\n3-Carpma\n4-Bolme");
        System.out.print("Seçiminiz:");
        select=input.nextInt();

        if(select==1){
            System.out.println("toplam:"+ (n1+n2));
        }
        else if (select==2){
            System.out.println("çıkarma:"+(n1-n2));
        }
        else if(select==3){
            System.out.println("carpma:"+ (n1*n2));
        }
        else if(select==4){
            if(n2!=0){
                System.out.println("bölme:"+(n1/n2));
            }
            else {
                System.out.println("bir sayı 0 a bölünemez..");
            }
        }
        else {
            System.out.println("yanlış nir seçim!");
        }


    }
}
