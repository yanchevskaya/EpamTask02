package stationary;

/**
 * Created by Lisica on 17.01.2017.
 */
    class Clips extends Stationery {
    private String producerName;
    private int price;

    Clips() { super();}
    Clips(int price) { super(price); }
    Clips(String producerName) {
        super(producerName);
    }
    Clips(String producerName, int price) {
        super(producerName, price);
    }

}