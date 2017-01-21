package stationary;

/**
 * Created by Lisica on 17.01.2017.
 */
    class Pencil extends Stationery{
    private String producerName;
    private int price;

    Pencil(){super();}
    Pencil (int price){
        super(price);
    }
    Pencil (String producerName){
        super(producerName);
    }
    Pencil (String producerName, int price){
        super(producerName,price);
            }

}
