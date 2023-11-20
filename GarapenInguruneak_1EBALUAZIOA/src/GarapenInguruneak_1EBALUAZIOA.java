	import java.util.Scanner;
public class GarapenInguruneak_1EBALUAZIOA {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int zenbakia;
	        int totala = 0;
	        int zenbakiKopurua = 0;

	        do {
	            System.out.println("Sartu zenbaki osoa (0 sartu programa amaitzeko): ");
	            zenbakia = sc.nextInt();

	            if (zenbakia != 0) {
	                totala += zenbakia;
	                zenbakiKopurua++;
	            }

	        } while (zenbakia != 0);

	        if (zenbakiKopurua > 0) {
	            double batazBestekoa = (double) totala / zenbakiKopurua;
	            System.out.println("Sartutako zenbaki guztien bataz bestekoa: " + batazBestekoa);
	        } else {
	            System.out.println("Ez da zenbakirik sartu");
	        }

	        sc.close();
	    }
	}


