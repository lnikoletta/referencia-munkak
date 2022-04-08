import java.util.ArrayList;
import java.util.Comparator;


public class Shelf<T>{

    private final ArrayList<T> boxes = new ArrayList<>();


    public int getBoxCount() {
        return boxes.size();
    }

    public Box getBox(int index) {
        if(index >= 0 && index < boxes.size()) {
            return (Box) boxes.get(index);
        }
        return null;
    }

    public void addBox(Box newBox){
        boxes.add((T) newBox);
    }

    public Shelf(){
    }

    public void listItems(){
        for (int i = 0; i < boxes.size(); i++) {
            System.out.println(boxes.get(i));
        }
    }

    public void Sort(Comparator<T> boxesComparator) {
        boxes.sort(boxesComparator);
    }

    public void removeBox(T box) {
        boxes.remove(box);
    }
}
