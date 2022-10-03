import it.unisa.diem.OOP.persone.Studente;

public class TestStudenti { //per lanciare un programma java si scrive "java nomeClasse che contiene il main"
    public static void main(String[] args) {

        it.unisa.diem.OOP.persone.Studente s1 = new Studente("Mario","Rossi"); //nome completo della classe
        //Non serve il nome completo se facciamo import. Se usiamo due implementazioni di una classe con lo stesso nome
        //non possiamo importare e dobbiamo usare il nome completo
        Studente s2 = new Studente("Stefano","Rossi");
        Studente s3 = new Studente("Giorgio","Rossi");

        s1.stampaInfo();
        s2.stampaInfo();
        s3.stampaInfo();

        //come contiamo quante istante della classe sono state istanziate? usiamo un contatore statico nel costruttore
        System.out.println("Numero di oggetti: "+Studente.contatore); //questo attributo esiste anche prima di creare l'oggetto, se lo stampassimo



    }
}

