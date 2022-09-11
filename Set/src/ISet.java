import java.util.ArrayList;

public interface ISet <T> {

    public ArrayList<T> addElement(T element);
    public boolean elementBelongsSet( T element);
    public ArrayList<T>  deleteElement(T element);
    public int countElements();
    public Set joinSets(Set set, Set set2);
}
