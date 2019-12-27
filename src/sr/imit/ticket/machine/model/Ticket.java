package sr.imit.ticket.machine.model;

public class Ticket {
    private String bioscoop;
    private String filmnaam;
    private double prijs;
    private int stoelnummer;
    private String zaal;

    public Ticket(String bioscoop, String filmnaam, double prijs, int stoelnummer, String zaal) {
        this.bioscoop = bioscoop;
        this.filmnaam = filmnaam;
        this.prijs = prijs;
        this.stoelnummer = stoelnummer;
        this.zaal = zaal;
    }

    public String getBioscoop() {
        return bioscoop;
    }

    public void setBioscoop(String bioscoop) {
        this.bioscoop = bioscoop;
    }

    public String getFilmnaam() {
        return filmnaam;
    }

    public void setFilmnaam(String filmnaam) {
        this.filmnaam = filmnaam;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public int getStoelnummer() {
        return stoelnummer;
    }

    public void setStoelnummer(int stoelnummer) {
        this.stoelnummer = stoelnummer;
    }

    public String getZaal() {
        return zaal;
    }

    public void setZaal(String zaal) {
        this.zaal = zaal;
    }
}
