package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj {

    private String broj;

    public MedunarodniBroj(String drzava, String broj) {
        this.broj = drzava + "/" + broj;
    }

    @Override
    public final String ispisi() {
        return broj;
    }

    @Override
    public final int hashCode() {
        return broj.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        MedunarodniBroj temp = (MedunarodniBroj) obj;
        return (broj.equals(temp.broj));
    }
}
