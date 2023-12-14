import java.util.Scanner;



/*Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart*/


public class BurcBulma {

	public static void main(String[] args) {
		System.out.println("Doğum ayınızı giriniz:");
		Scanner input= new Scanner(System.in);
		String ay= input.nextLine();
		System.out.println("Ayın kaçında doğdunuz:");
		int gun= input.nextInt();
		int i=0;
		//String[] aylar= new String[] {"ocak","şubat","mart","nisan","mayıs","haziran","temmuz","ağustos","eylül","ekim","kasım","aralık"}; 
		//String ocak="ocak";
		switch(ay.toLowerCase()) { //Kullanıcnın girdiği ayın tüm harflerini küçüğe çevirdim
		case "ocak":
			if( gun>0 && gun<23) {
				System.out.println("Oğlak burcusunuz");
			}
			else if(gun>22 && gun<32) {
				System.out.println("Kova burcusunuz");
			}
			else {
				System.out.println("Hatalı giriş yaptınız");
		
			}
			break;
		case "şubat":
			if( gun>0 && gun<20) {
				System.out.println("Kova burcusunuz");
			}
			else if(gun>19 && gun<30) {
				System.out.println("Balık burcusunuz");
			}
			else {
				System.out.println("Hatalı giriş yaptınız");
		
			}
			break;
		case "mart":
			if( gun>0 && gun<21) {
				System.out.println("Oğlak burcusunuz");
			}
			else if(gun>20 && gun<32) {
				System.out.println("Koç burcusunuz");
			}
			else {
				System.out.println("Hatalı giriş yaptınız");
		
			}
			break;
		case "nisan":
			if( gun>0 && gun<21) {
				System.out.println("Koç burcusunuz");
			}
			else if(gun>20 && gun<31) {
				System.out.println("Boğa burcusunuz");
			}
			else 
				System.out.println("Hatalı giriş yaptınız");
			break;
		case "mayıs":
			if( gun>0 && gun<22) {
				System.out.println("Boğa burcusunuz");
			}
			else if(gun>21 && gun<32) {
				System.out.println("İkizler burcusunuz");
			}
			else 
				System.out.println("Hatalı giriş yaptınız");
			break;
		case "haziran":
			if( gun>0 && gun<23) {
				System.out.println("İkizler burcusunuz");
			}
			else if(gun>22 && gun<31) {
				System.out.println("Yengeç burcusunuz");
			}
			else 
				System.out.println("Hatalı giriş yaptınız");
			break;
		case "temmuz":
			if( gun>0 && gun<23) {
				System.out.println("Yengeç burcusunuz");
			}
			else if(gun>22 && gun<32) {
				System.out.println("Aslan burcusunuz");
			}
			else 
				System.out.println("Hatalı giriş yaptınız");
			break;
		case "ağustos":
			if( gun>0 && gun<23) {
				System.out.println("Aslan burcusunuz");
			}
			else if(gun>22 && gun<32) {
				System.out.println("Başak burcusunuz");
			}
			else 
				System.out.println("Hatalı giriş yaptınız");
			break;
		case "eylül":
			if( gun>0 && gun<23) {
				System.out.println("Başak burcusunuz");
			}
			else if(gun>22 && gun<31) {
				System.out.println("Terazi burcusunuz");
			}
			else 
				System.out.println("Hatalı giriş yaptınız");
			break;
		case "ekim":
			if( gun>0 && gun<23) {
				System.out.println("Terazi burcusunuz");
			}
			else if(gun>22 && gun<32) {
				System.out.println("Akrep burcusunuz");
			}
			else 
				System.out.println("Hatalı giriş yaptınız");
			break;
		case "kasım":
			if( gun>0 && gun<22) {
				System.out.println("Akrep burcusunuz");
			}
			else if(gun>21 && gun<31) {
				System.out.println("Yay burcusunuz");
			}
			else 
				System.out.println("Hatalı giriş yaptınız");
			break;
		case "aralık":
			if( gun>0 && gun<22) {
				System.out.println("Yay burcusunuz");
			}
			else if(gun>21 && gun<32) {
				System.out.println("Oğlak burcusunuz");
			}
			else 
				System.out.println("Hatalı giriş yaptınız");
			break;
		default:
			System.out.println("Hatalı giriş");
		}
	
		

	}

	
	}


