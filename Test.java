class Test extends Dave {
	public static void main(String[] args) {
		System.out.println("Last Save: MacBook 23 Luglio 2019 01:06");
		System.out.println("Last Save: MacBook 23 Luglio 2019 12:16");
		stampaACapo("Hai la faccia da culo");

		int [] vet = creaArrayInt(10);
		riempiArrayRandom(vet, 100);
		infoArray(vet);
		int a = vet.length;
		int b = a;
		for (int j=0; j<b-1; j++) {			
			for (int i=0; i<a; i++) {
				if(i==a-1) scambio(vet, i-1, i);
			} 
			a = a - 1;
		}

		infoArray(vet);

	}  
	
}
