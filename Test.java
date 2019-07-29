class Test extends Dave {
	public static void main(String[] args) {
		System.out.println("Last Save: MacBook 23 Luglio 2019 01:06");
		System.out.println("Last Save: MacBook 23 Luglio 2019 12:16");
		System.out.println("Last Save: MacBook 29 Luglio 2019 14:49 Pure sul treno!");
		stampaACapo("Hai la faccia da culo");
		int [] vet = creaArrayInt(10);
		for (int i=0; i<vet.length; i++) {
			vet[i] = i;
		}
		infoArray(vet);
		cifrarioCesare(5, vet);
		infoArray(vet);
	} 
	public static void cifrarioCesare(int quanto, int vet[]){
		if(quanto < vet.length){
			int a = vet.length;
			int b = a;
			int i, j;
			for(int c=0; c<quanto; c++){
				a = vet.length; 
				b = a;
				for (j=0; j<b-1; j++) {			
					for (i=0; i<a; i++) {
						if(i==a-1) scambio(vet, i-1, i);
					} 
					a = a - 1;
				}
			}
		}
	}
}

