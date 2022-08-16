package day43_interfaces_iterators;

public interface C02_Child extends I01_InterfaceBodyOlanMethod {
    @Override
    public default void motor() {
    }
    @Override
    public default void yakit() {
    }
    @Override
    public default String aku() {
        return null;
    }
    /*
     parent interface'de abstract olan 3 method'u implement ettigimizde
     Java itirazini durdurur
     sonradan ekledigimiz
     default veya static keyword ile tanimladigimiz
     method'lari implement etmememiz sorun olusturmadi
     O zaman nicin 2 keyword (static ve default) tanimlanmistir ?
     Bu iki farkli kelimenin amaci
     child class'lardan bu method'a nasil erisilebilecegini belirlemek icindir
     static keyword kullanilirsa , child class'dan bu method'a erismek icin
     InterfaceAdi.methodAdi yeterli olur
    default keyword kullanilirsa, method'a erismek icin obje olusturulmalidir.
     */
    public static void main(String[] args) {
        I01_InterfaceBodyOlanMethod.direksiyon();
        C02_Child obj= new C02_Child() {
            @Override
            public void motor() {

            }

            @Override
            public void yakit() {

            }

            @Override
            public String aku() {
                return null;
            }
        };
        obj.teker();
    }
}



