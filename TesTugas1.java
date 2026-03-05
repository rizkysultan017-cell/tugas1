public class TesTugas1 {

    public static void main(String[] args) {

        Tabungan tab = new Tabungan(5000);

        System.out.println("Saldo awal : " + tab.getSaldo());

        System.out.println("Jumlah uang yang disimpan : 3000");
        tab.simpanUang(3000);

        System.out.print("Jumlah uang yang diambil : 6000 ");
        if (tab.ambilUang(6000))
            System.out.println("ok");
        else
            System.out.println("gagal");

        System.out.println("Jumlah uang yang disimpan : 3500");
        tab.simpanUang(3500);

        System.out.print("Jumlah uang yang diambil : 4000 ");
        if (tab.ambilUang(4000))
            System.out.println("ok");
        else
            System.out.println("gagal");

        System.out.print("Jumlah uang yang diambil : 1600 ");
        if (tab.ambilUang(1600))
            System.out.println("ok");
        else
            System.out.println("gagal");

        System.out.println("Jumlah uang yang disimpan : 2000");
        tab.simpanUang(2000);

        System.out.println("Saldo sekarang = " + tab.getSaldo());
    }
}