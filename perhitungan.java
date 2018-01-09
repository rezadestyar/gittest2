import java.util.Scanner;
public class perhitungan{ 
public static void main(String [] args){ 
int panjang;
int lebar;
double luas;

Scanner a = new Scanner(System.in);
System.out.println("Luas Persegi Panjang");
System.out.println("Panjang : ");
panjang = a.nextInt();
System.out.println("Lebar : ");
lebar = a.nextInt();

luas = (panjang*lebar);
System.out.println("Luasnya : "+luas);
}
}


