package stationary;

/**
 * Created by Lisica on 16.01.2017.
 */
    public class Pen extends Stationery {
    private String ink;
    private String producerName;
    private String material;
    private String color;
    private int length;
    private int wide;
    private int price;

    public Pen(){super();}
    public Pen(int price){super(price);}
    public Pen(String producerName){
        super(producerName);
          }
    public Pen (String producerName, int price){
        super(producerName,price);
    }
    public Pen(String producerName, String material, int wide, int length, int price){
        super(producerName,price);
        this.material = material;
        this.wide = wide;
        this.length = length;
         }

@Override
    public String toString(){
      return getClass().getName() + "@"
              + "producerName: " + ((null==getProducerName()) ? "unknown": getProducerName())
              + ", material: "+ ((null==material) ? "unknown" : material)
              + ", color "+((null==color) ? "unknown": color)
              + ", size "+ ((wide==0 || length==0)? "unknown" : wide+ "x"+ length)
              + ", ink: "+ ((ink==null)? "unknown" : ink)
              + ", price "+ ((getPrice()==0)? "unknown" : getPrice());

    }

    @Override
       public boolean equals (Object obj) {
        if (this == obj)
            return true;

        if (null == obj)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Pen pen = (Pen) obj;
        if (getPrice() != pen.getPrice())
            return false;

        if (length != pen.length)
            return false;

        if (wide != pen.wide)
            return false;

        if (null == getProducerName()) {
            if (!(getProducerName()==pen.getProducerName()))
                return false;
        } else {
            if (!getProducerName().equals(pen.getProducerName()))
                return false;
                    }

        if (material == null) {
            if (!(material==pen.material))
                return false;
        } else {
            if (!material.equals(pen.material))
                return false;
                    }

        if (color == null) {
            if (!(color==pen.color))
                return false;
        } else {
            if (!(color==pen.color))
                return false;
                    }

        if (null==ink){
            return (ink==pen.ink);
        } else {
            if (!ink.equals(pen.ink))
                return false;
        }
        return true;
    }

    @Override
    public int hashCode(){
        return (31 * wide + length + getPrice() + ((null==getProducerName()) ? 0: getProducerName().hashCode()
        ) + ((null==material) ? 0: material.hashCode()) + ((null==ink) ? 0: ink.hashCode())
       + ((null==color) ? 0: color.hashCode())) ;

    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getInk() {
        return ink;
    }

    public void setInk(String ink) {
        this.ink = ink;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWide() {
        return wide;
    }

    public void setWide(int wide) {
        this.wide = wide;
    }
}
