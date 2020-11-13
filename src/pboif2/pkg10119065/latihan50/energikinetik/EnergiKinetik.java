package pboif2.pkg10119065.latihan50.energikinetik;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program hitung energi kinetik
 *                         dengan objek
 */
public class EnergiKinetik {
    private double massa,kecepatan,hasil,usaha;
    
    public EnergiKinetik(double massa, double kecepatan) {
        this.massa = massa;
        this.kecepatan = kecepatan;
    }
    
    public double getMassa() {
        return massa;
    }
    
    public double getKecepatan() {
        return kecepatan;
    }
    
    public double getHitungEnergiKinetik() {
        return ((massa/1000)*(kecepatan*kecepatan))/2 ;
    }
    
    public double getUsaha() {
        return getHitungEnergiKinetik() - 0;
    }
    public void tampil()
    {
        System.out.println("Energi kinetik : "+getHitungEnergiKinetik()+" J");
        System.out.println("Usaha : "+getUsaha() +" J");
    }
}
