package stationary;

/**
 * Created by Lisica on 18.01.2017.
 */
    class Corrector extends Stationery {
    private String producerName;
    private int price;

    Corrector() {super();}
    Corrector(int price) {
        super(price);
    }
    Corrector(String producerName) {
        super(producerName);
    }
    Corrector(String producerName, int price) {
        super(producerName, price);
    }

}
