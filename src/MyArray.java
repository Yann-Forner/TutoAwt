import java.util.ArrayList;
import java.util.Random;

public class MyArray {
    private ArrayList<Integer> myList = new ArrayList<>(0);
    private Integer position;

    public MyArray() {
        System.out.println("création d'un array");
        for (int i = 0; i <200 ; i++) {
            myList.add(new Random().nextInt(400));
        }
    }
    public void next(){

        if(position==null)position=0;
        else if (position<this.size()-1){
            trInsertion();
        }
        ++position;
    }
    public void shift(int cible, int position){
        if(cible!=position){
            Integer temp = this.myList.get(cible);
            this.myList.remove(cible);
            this.myList.add(position, temp);
        }

    }
    public void trInsertion(){
        int temp = position;
        for (int i = position; i >=0; i--) {
            if(this.myList.get(i)>=this.myList.get(position)) {
//                    System.out.println(this.myList.get(temp)+"<="+this.myList.get(i)+"<="+this.myList.get(position));
                temp=i;
            }
        }
        this.shift(position,temp);
    }
    public Integer getPosition() {
        return position;
    }
    public Integer get(int index){
        return this.myList.get(index);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Integer elem: this.myList
        ) {
            str.append(elem);
        }
        return str.toString();
    }

    public int size(){
        return this.myList.size();
    }
}
