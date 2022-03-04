import java.time.LocalDate;
import java.util.Scanner;

public class Pohon {
    private int daun, akar, dahan, umur, MASAHIDUP = 10;
    private LocalDate tanggalMusim;
    private Buah buah;
    private Musim musim;

    public int getDaun() {
        return daun;
    }

    private void setDaun(int daun) {
        this.daun = daun;
    }

    public int getAkar() {
        return akar;
    }

    private void setAkar(int akar) {
        this.akar = akar;
    }

    public int getDahan() {
        return dahan;
    }

    private void setDahan(int dahan) {
        this.dahan = dahan;
    }

    public int getMASAHIDUP() {
        return MASAHIDUP;
    }

    public int getUmur() {
        return umur;
    }

    private void setUmur(int umur) {
        this.umur = umur;
    }

    public Buah getBuah() {
        return buah;
    }

    private void setBuah(Buah buah) {
        this.buah = buah;
    }

    public Musim getMusim() {
        return musim;
    }

    public void setMusim(Musim musim) {
        this.musim = musim;
    }

    public LocalDate getTanggalMusim() {
        return tanggalMusim;
    }

    public void setTanggalMusim(LocalDate tanggalMusim) {
        this.tanggalMusim = tanggalMusim;
    }

    Scanner input = new Scanner(System.in);
    int umur1 = input.nextInt();
    if(
    int umur1 <MASAHIDUP) {
        musim musim1 = input.nextLine();
        if (musim1 = "kemarau") {
            buah buah1 = "apel";
        } else if (musim1 = "penghujan") {
            buah buah2 = "pisang";
        } else if (musim1 = "dingin") {
            buah buah3 = "jeruk";
        } else {
            System.out.println("Musim yang kamu masukan ga sesuai");
        }
    }
}