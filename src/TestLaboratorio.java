import it.unisa.diem.OOP.persone.Studente;
import it.unisa.diem.OOP.spazi.Laboratorio;

public class TestLaboratorio {
    public static void main(String[] args) {
        Laboratorio l = new Laboratorio(3);

        l.entra(new Studente("Primo", "Rossi"));
        l.entra(new Studente("Secondo", "Rossi"));
        l.entra(new Studente("Terzo", "Rossi"));

        Studente s = l.esce();
        System.out.println(("Esce lo studente: "));
        s.stampaInfo();

        l.entra(new Studente("Quarto", "Rossi"));

        l.stampaStudentiInLaboratorio();
    }
}
