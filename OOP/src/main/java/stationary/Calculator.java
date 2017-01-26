package stationary;

/**
 * Created by Lisica on 17.01.2017.
 */
    class Calculator extends Stationery{
    private String producerName;
    private int price;

    Calculator(){super(); }
    Calculator (int price){super(price);}
    Calculator(String producerName){
        super(producerName);
    }
    Calculator(String producerName, int price){
        super(producerName,price);
    }

}
