class Test extends Dave {
	public static void main(String[] args) {
		System.out.println("Last Save: MacBook 23 Luglio 2019 01:06");
		System.out.println("Last Save: MacBook 23 Luglio 2019 12:16");
		System.out.println("Last Save: MacBook 29 Luglio 2019 14:49 Pure sul treno!");
		System.out.println("Last Save: MacBook 29 Luglio 2019 17:21");
		stampaACapo("Hai la faccia da culo");
		int [] vet = creaArrayInt(10);
		for (int i=0; i<vet.length; i++) {
			vet[i] = i;
		}
		infoArray(vet);
		cifrarioCesare(5, vet);
		infoArray(vet);
	} 
}

