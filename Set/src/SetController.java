import java.util.ArrayList;

public class SetController {

    private ArrayList<Set> sets;

    public SetController(){
        this.sets = new ArrayList<>();
    } // constructor

    public boolean createSet(int m){

        if(m==1){
            Set<String> set1 = new Set<>();
            sets.add(set1);
            return true;
        } else if(m==2){
            Set<Integer> set1 = new Set<>();
            sets.add(set1);
            return true;
        } else if(m==3){
            Set<Double> set1 = new Set<>();
            sets.add(set1);
            return true;
        } else {
            return false;
        }
    } // create set

    public <T> Set addElement(Set<T> set, T element) {

        if(set.addElement(element)!=null){
            return set;
        } else {
            return null;
        } // if to validate that the element isn't already in the set

    }// add elements

    public <T> boolean elementBelongsSet(Set<T> set, T element) {
        return set.elementBelongsSet(element);
    } // element belongs a set

    public <T> Set deleteElement(Set<T> set, T element) {
        set.deleteElement(element);
        return set;
    } // delete element from a set

    public <T> int countElements(Set<T> set) {
        return set.countElements();
    } // count elements of a set

    public <T> Set joinSets(Set<T> set, Set<T> set2) {
        sets.add(set.joinSets(set,set2));
        return set.joinSets(set, set2);
    } // join sets

    public String toString(){

        String msg = "";

        for (int i = 0; i < sets.size(); i++) {

            if (sets.get(i).toString().equals("")) {
                msg += (i + 1) + ") (has no elements) \n";
            } else {
                msg += (i + 1) + ") " + sets.get(i).toString() + "\n";

            }
        }
        // for, for print all the sets

        return msg;
    } // to string of all sets

    public Set whichSet(int j){

        for (int i = 0; i < sets.size(); i++) {

            if(i==j) {
                return sets.get(i);
            }

        } // for, for print all the sets

        return null;
    } // which set according to a position

} // set controller
