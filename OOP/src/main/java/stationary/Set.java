package stationary;

import java.util.Arrays;

/**
 * Created by Lisica on 18.01.2017.
 */
public abstract class Set {
    private Stationery[] stationery;
    private Stationery pen = new Pen("Parker", 120);
    private Stationery pencil = new Pencil("Traktor", 20);
    private Stationery eraser = new Eraser("Elephant", 20);

    Set(int a) {
        stationery = new Stationery[a];
        add(pen);
        add(pencil);
        add(eraser);
            }

      void add(Stationery st) {
        if (stationery[stationery.length - 1] != null){
            System.out.println("This set can't have stationery any more");
        return;}
        for (int i = 0; i < stationery.length; i++) {

            if (stationery[i] == null) {
                stationery[i] = st;
                break;
            }
                }

    }


    public Stationery[] getSet() {
        return stationery;
    }

    public void setSet(Stationery[] st) {
        if (this.stationery.length>=st.length){
            this.stationery=st;
        }
    }

    public Stationery[] sortByName(){
        Arrays.sort(stationery, new SortedByName());
        return stationery;
    }

    public Stationery[] sortByPrice(){
        Arrays.sort(stationery, new SortByPrice());
        return stationery;
    }

    public Stationery[] sortByPriceName(){
        Arrays.sort(stationery, new SortedPriceName());
        return stationery;
    }

    public String toString() {
 StringBuilder sb =  new StringBuilder();
         for (int i=0; i<stationery.length; i++){
             if (stationery[i]!=null)
             sb.append(stationery[i].toString()).append("\n");
                            }
        return getClass().getName() + "\n"+sb;
        }
    }

