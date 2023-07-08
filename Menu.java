package TugasKasir;

public class Menu {

    private String[] NamaMenu = {"Mie Ayam", "Bakso", "Ceker" ,"Es Teh", "Es Jeruk"};

    private int[] Harga = {15000, 12000, 7000, 3000, 5000};
    
    public void tampilan(){
            System.out.println("============  KASIR  ============");
            System.out.printf("1.%s \t|| Rp.%d \n",NamaMenu[0], Harga[0]);
            System.out.printf("2.%s \t|| Rp.%d \n",NamaMenu[1], Harga[1]);
            System.out.printf("3.%s \t|| Rp.%d \n",NamaMenu[2], Harga[2]);
            System.out.printf("4.%s \t|| Rp.%d \n",NamaMenu[3], Harga[3]);
            System.out.printf("5.%s \t|| Rp.%d \n",NamaMenu[4], Harga[4]);
            System.out.println("0. ---  Check out  --- ");
            System.out.println("=================================");
    }

    public String[] getNamaMenu() {
        return NamaMenu;
    }

    public int[] getHarga() {
        return Harga;
    }


}
