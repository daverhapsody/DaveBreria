class Test extends Dave {
  public static void main(String[] args) {
  	long tempo, fine, inizio;
  	int a;
  	
  	inizio = nanosecondiAdesso();
  	System.out.println("Ciao");
  	fine = nanosecondiAdesso();
  	stampaACapo(fine-inizio +" ns");

  	inizio = nanosecondiAdesso();
  	stampaACapo("Ciao");
  	fine = nanosecondiAdesso();
  	stampaACapo(fine-inizio +" ns");
  	separatore();

  	inizio = nanosecondiAdesso();
  	a = somma(10,10);
  	fine = nanosecondiAdesso();
  	stampaACapo(fine-inizio +" ns");

  	inizio = nanosecondiAdesso();
  	a = sommaRicorsiva(10,10);
  	fine = nanosecondiAdesso();
  	stampaACapo(fine-inizio +" ns");

  	inizio = nanosecondiAdesso();
  	a = 10+10;
  	fine = nanosecondiAdesso();
  	stampaACapo(fine-inizio +" ns");
  }  
}
