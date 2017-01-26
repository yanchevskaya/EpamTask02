package stationary;

/**
 * Created by Lisica on 17.01.2017.
 */
    class Eraser extends Stationery {
    private String producerName;
    private int price;

    Eraser() {super();}
    Eraser(int price) {
        super(price);
    }
    Eraser(String producerName) {
        super(producerName);
    }
    Eraser(String producerName, int price) {
        super(producerName, price);
    }

}