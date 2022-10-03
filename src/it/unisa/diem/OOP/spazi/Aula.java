package it.unisa.diem.OOP.spazi;
import it.unisa.diem.OOP.persone.Studente;

public class Aula {
    public final int maxPosti; //lo rendiamo public ma final perchè ci può servire come pubblico
    private Studente studenti[];
    private int testa;

    public Aula(int maxPosti) {
        this.maxPosti = maxPosti;

        studenti = new Studente[maxPosti]; //ogni elemento dell'elemento è inizializzato a null

        testa = 0;
    }

    public boolean aulaPiena (){
        return testa==maxPosti;
    }

    public boolean aulaVuota (){
        return testa==0;
    }

    public void entra(Studente s){
        if(aulaPiena()){
            System.out.println("L'aula è piena");
            return;
        }
        else studenti[testa++]=s;
    }
    public Studente esce(){
        if(aulaVuota()){
            System.out.println("L'aula è già vuota");
            return null;
        }
        testa--;

        Studente s= studenti[testa];//studente di appoggio
        studenti[testa]=null; //facciamo così per permettere che il garbage collector elimini lo spazio
        //riservato allo studente perchè non c'è nessun riferimento attivo.
        return s;
    }

    public void StampaStudentiInAula(){
        if(aulaVuota()){
            System.out.println("L'aula è vuota");
            return;
        }
        for(int i=0;i<testa;i++){
            studenti[i].stampaInfo();
        }
    }


}
