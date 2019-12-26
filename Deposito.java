class Deposito{

  public static int fx(int vet[], int n){
    if(n==0) return 0;
    else {
      stampa(vet[n]+"*"+vet[n-1]+" + ");
      return vet[n]*vet[n-1] + fx(vet, n-1);
    }
  }
  /*----------------------------------*/
  public static void test1(){
    Punto a, b, c;
    int variazione = 100;
    Triangolo vet[] = new Triangolo[variazione];
    for(int i=0;i<variazione;i++){
      a = new Punto(potenza(randomInt(variazione), randomInt(variazione)), randomInt(variazione));
      b = new Punto(randomInt(variazione), randomInt(variazione));
      c = new Punto(randomInt(variazione), randomInt(variazione));
      vet[i] = new Triangolo(arrotonda(distanza(a, b), 2), arrotonda(distanza(b, c), 2), arrotonda(distanza(c, a), 2), true);
      stampaACapo(vet[i].toString(2));
    }
    String str = "xktr    aererer";
    String nuova = "";
    int i = 0;
    while(i != str.length()){
      if(!vocale(str.charAt(i))){
        nuova += inMaiuscola(str.charAt(i));
      }
      else nuova += str.charAt(i);
      i++;
    }
    stampaACapo(nuova);
    String d = "ciao", e = " mondo";
    d = concatenaString(d, e);
    stampaACapo(d);
  }
  /*----------------------------------*/
  public static void test2(){
    ArrayList<Integer> prova = new ArrayList<Integer> ();

    prova.add(1);
    prova.add(2);
    prova.add(3);
    prova.add(1, 4);

    stampaACapo(prova);
  }
  /*----------------------------------*/
  public static void test3(){
    int v[] = creaArrayInt(10);
    riempiArrayRandom(v, 10);
    infoArray(v);
    stampaACapo(fx(v, 9));
  }
  /*----------------------------------*/
  public static void testTempi(){
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
