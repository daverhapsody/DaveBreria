import java.util.ArrayList;
class Test extends Dave {
  public static void main(String[] args) {
    stampa("Tempo di allocazione di un intero: ");
    long inizio = nanosecondiAdesso();
    int a = 5;
    stampa(nanosecondiAdesso()-inizio);
    stampaACapo("ns");
  }  
}
