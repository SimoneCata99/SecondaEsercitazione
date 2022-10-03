import it.unisa.diem.OOP.persone.Studente;
import it.unisa.diem.OOP.spazi.Aula;

public class TestAula {
    public static void main(String[] args){
        Aula a= new Aula(3);

        a.entra(new Studente("Mario","Rossi"));
        a.entra(new Studente("Luca","Rossi"));
        a.entra(new Studente("Stefano","Rossi"));
        Studente s= a.esce();
        System.out.println("è uscito lo studente: ");
        s.stampaInfo();

        a.entra(new Studente("Nicola","Rossi"));

        System.out.println("\nIn aula ci sono gli studenti: ");
        a.StampaStudentiInAula();
    }
}
