package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {

    private String broj;

    public MobilniBroj(int mob, String broj) {
        this.broj += "0" + mob + "/" + broj;
    }

    @Override
    public int hashCode() {
        return broj.hashCode();
    }

    @Override
    public String ispisi() {
        return broj;
    }

    @Override
    public boolean equals(Object obj) {
        MobilniBroj temp = (MobilniBroj) obj;
        return broj.equals(temp.broj);
    }
}
