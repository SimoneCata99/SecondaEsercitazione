package it.unisa.diem.OOP.persone;

public class Studente {
    private String matricola; //se togliamo private il modificatore di default è package, quindi non possiamo
    //accedere da TestStudenti agli attributi perchè non è nello stesso package di Studente
    private String nome;
    private String cognome;

    public static int contatore=0; //gli attributi statici devono essere inizializzati, inizializzarlo nel costruttore non è corretto
    //perchè il costruttore viene invocato nella creazione di un oggetto, questo contatore è definito prima della creazione dell'oggetto

    //a questo punto, non avendo definito un costruttore, usando new viene usato quello di default
    //usando private ora da TestStudenti non possiamo accedere agli attributi, accederemo con i metodi

    //possiamo generare automaticamente i setter e i getter con "generate" (command+n)
    public Studente(String matricola, String nome, String cognome) {
        this.matricola = matricola;
        this.nome = nome;
        this.cognome = cognome;
        contatore++; //ci permette di contare il numero di oggetti creati
    }

    //definiamo un altro costruttore in cui non vogliamo specificare la matricola
    public Studente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = "06127000" + contatore; //se usiamo il + tra stringa e intero l'intero viene convertito a intero
        contatore++;
        //This si può usare come this.attributo per riferirsi a questa istanza, se invece facciamo this() possiamo invocare
        // un costruttore di questa classe. Anche in questo caso quale costruttore verrà scelto dipenderà dal numero di parametri

    }

    //definiamo un metodo per stampare gli attributi
    public void stampaInfo(){
        System.out.println("***");
        System.out.println("Nome: "+nome);
        System.out.println("Cognome: "+cognome);
        System.out.println("Matricola: "+matricola);
    }
    public static int getContatore(){
        return contatore;
    }

    public void stampaInfo(int a){ //anche se due metodi hanno lo stesso nome, se richiedono parametri diversi sono metodi diversi
        System.out.println(a);
    }

}
