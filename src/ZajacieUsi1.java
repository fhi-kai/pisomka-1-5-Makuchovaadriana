public class ZajacieUsi1 implements ZajacieUsi{
    public int zajacieUsi(int pocetZajacov){
        int pocetZ = pocetZajacov;
        int pocetU = 0;
        switch(pocetZ){
            case 1: pocetU = 2; break;
            case 2: pocetU = 5; break;
            case 3: pocetU = 7; break;
            case 4: pocetU = 10; break;
            case 5: pocetU = 12; break;
            case 6: pocetU = 15; break;
        }
        return pocetU;
    }

/* len tak pre odskusanie
    public static void main(String[] args) {
        ZajacieUsi1 usi = new ZajacieUsi1();
        System.out.println(usi.zajacieUsi(5));
    }
    */

}
