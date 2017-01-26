package stationary;

/**
 * Created by Lisica on 17.01.2017.
 */
public class Stationery  {
    private int price;
    private String producerName;

    Stationery(){}
    Stationery (int price){
        this.price = price;
    }
    Stationery(String producerName){
        this.producerName = producerName;
    }
    Stationery(String producerName, int price){
        this(producerName);
        this.price=price;
    }

    public String toString(){
        return getClass().getName() + "@" + "producerName: " + ((null==producerName)?"unknown":producerName)
                + ",  price "+ ((price==0) ? "unknown":price);

    }

    public boolean equals (Object obj) {
        if (this == obj)
            return true;

        if (null == obj)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Stationery stationery = (Stationery) obj;
        if (price != stationery.price)
            return false;


        if (null == producerName) {
            return (producerName == stationery.producerName);
        } else {
            if (!producerName.equals(stationery.producerName))
                return false;
        }

        return true;
    }

    public int hashCode(){
        return 31 *  price + ((null==producerName) ? 0: producerName.hashCode());

    }
   public int getPrice(){
        return price;
   }

   public void setPrice(int price){
       this.price = price;
   }

    public void setProducerName(String producerName){
        this.producerName = producerName;

    }

    public String getProducerName() {
        return producerName;
    }

}
