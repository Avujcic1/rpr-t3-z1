package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {

    private int mob;
    private String broj;

    public MobilniBroj(int mob, String broj) {
        this.mob = mob;
        this.broj = broj;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String ispisi() {
        return "0" + mob + "/" + broj;
    }
}
