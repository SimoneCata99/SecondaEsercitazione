package it.unisa.diem.OOP.spazi;
import it.unisa.diem.OOP.persone.Studente;

//come Aula ma con una coda


public class Laboratorio {
    public final int maxPosti; //lo rendiamo public ma final perchè ci può servire come pubblico
    private Studente studenti[];
    private int testa;
    private int coda;
    private int postiOccupati;

    public Laboratorio(int maxPosti) {
        this.maxPosti = maxPosti;
        studenti = new Studente[maxPosti];
        this.coda=0;
        this.testa=0;
        this.postiOccupati=0;
    }

    public boolean laboratorioPieno (){
        return postiOccupati == maxPosti;
    }
    public boolean laboratorioVuoto () { return postiOccupati == 0; }

    public void entra(Studente s){
        if(laboratorioPieno()){
            System.out.println("Il laboratorio è pieno");
            return;
        }
        studenti[coda]=s;
        coda = (coda+1)%maxPosti;
        postiOccupati++;
    }

    public Studente esce(){
        if(laboratorioVuoto()){
            System.out.println(("Il laboratorio è vuoto"));
            return null;
        }
        Studente s= studenti[testa];
        studenti[testa]=null;
        testa=(testa+1)%maxPosti;
        postiOccupati--;
        return s;
    }
    public void stampaStudentiInLaboratorio(){
        if(laboratorioVuoto()){
            System.out.println("Il laboratorio è vuoto");
            return;
        }
            for(int i=0;i < postiOccupati;i++) {
                studenti[(testa+i)%maxPosti].stampaInfo();
            }
    }
}
