package sr.imit.ticket.machine.model;

public class Film {

    private String naam;
    private Boolean drieDimensionaal;
    private String zaal;

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Boolean getDrieDimensionaal() {
        return drieDimensionaal;
    }

    public void setDrieDimensionaal(Boolean drieDimensionaal) {
        this.drieDimensionaal = drieDimensionaal;
    }

    public String getZaal() {
        return zaal;
    }

    public void setZaal(String zaal) {
        this.zaal = zaal;
    }
}

