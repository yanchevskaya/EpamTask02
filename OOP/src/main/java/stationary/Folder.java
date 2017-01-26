package stationary;

/**
 * Created by Lisica on 18.01.2017.
 */
    class Folder extends Stationery{
    private String producerName;
    private int price;

    Folder(){super();}
    Folder(int price){
        super(price);
    }
    Folder(String producerName){
        super(producerName);
    }
    Folder(String producerName, int price){
      super(producerName,price);
    }

    }

