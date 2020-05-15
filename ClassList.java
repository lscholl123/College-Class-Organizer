import java.util.LinkedList;

public class ClassList implements Printing{
    private LinkedList<Class> linkedList;


    public ClassList(LinkedList<Class> linkedList) {
        this.linkedList = linkedList;
    }



    //this search looks for index that corresponds to class object
    public int BinarySearch(LinkedList<Class> linkedList, int left, int right, int x) {
        if (right >= 1) {
            int mid = left + (right - 1) / 2;

            if (linkedList.get(mid).getNumber() == x) {
                return mid;
            }

            if (linkedList.get(mid).getNumber() > x) {
                return BinarySearch(linkedList, left, mid - 1, x);
            } else {
                return BinarySearch(linkedList, mid + 1, right, x);
            }
        } else {
            return -1;
        }
    }
//sorts classes by number
    public void InsertionSort(LinkedList<Class> linkedList) {
        int length = linkedList.size();
        for (int i = 1; i < length; ++i) {
            Class key = linkedList.get(i);
            int j = i - 1;
            while (j >= 0 && linkedList.get(j).getNumber() > key.getNumber()) {
                linkedList.set(j + 1, linkedList.get(j));
                j = j - 1;
            }
            linkedList.set(j + 1, key);
        }
    }
//returns linked list value at index
    public Class get(int index) {
        return linkedList.get(index);
    }
//prints relevant information about classes
    @Override
    public void printLinkedList(LinkedList linkedList) {
        for (Object Subject : linkedList) {
            Subject= (Class) Subject;
            System.out.println(((Class) Subject).getName() + " " + ((Class) Subject).getAbbreviation() + "-" + ((Class)Subject).getNumber()+ ", "+ ((Class) Subject).getNameCollege());
        }
    }
}
