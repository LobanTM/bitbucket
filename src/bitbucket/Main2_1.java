package bitbucket;

/**
 * Created by tetya on 12.07.2017.
 */
public class Main2_1 {
    public static void main(String[] args) {
        MyCollection myCollection = new MyCollection();
        for (int i = 0; i < 20 ; i++) {
            myCollection.addEl(2);
        }
        print(myCollection);

        myCollection.addElByPos(100,10);
        print(myCollection);

        myCollection.addElByPos(1000,11);
        print(myCollection);

        myCollection.delElByPos(0);
        print(myCollection);



    }

    public static void print(MyCollection m){
        System.out.println("==========================================================");
        System.out.println("capacity" + m.getCapacity());
        System.out.println("size "+ m.size);
        System.out.print("all: " );
        for (int i = 0; i < m.size; i++) { System.out.print(" " + m.get(i)); }
        System.out.println("");
        System.out.println("Max: " + m.getMax());
        System.out.println("Min: " + m.getMin());
        System.out.println("Average: " + m.getAverage());
    }
}
