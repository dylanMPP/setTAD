import java.util.ArrayList;

public class Set<T> implements ISet<T> {

    private ArrayList<T> set;

    public Set(){
        set = new ArrayList<T>();
    } // constructor

    @Override
    public ArrayList<T> addElement(T element) {

        boolean flag = true;

        if(this.set.isEmpty()){

            this.set.add(element);
            return this.set;

        } else {
            for (int i = 0; i < this.set.size(); i++) {

                if(element.equals(this.set.get(i))){
                    flag = false;
                }
            } // for to validate that the element isn't already in the set
        }

        if(flag){
            this.set.add(element);
            return this.set;
        } else {
            return null;
        }

    } // adds a element in a set

    @Override
    public boolean elementBelongsSet(T element) {

        for (int i = 0; i < this.set.size(); i++) {

            if(this.set.get(i).equals(element)){
                return true;
            }
        }

        return false;
    } // search for an element in a set

    @Override
    public ArrayList<T> deleteElement(T element) {

        for (int i = 0; i < this.set.size(); i++) {

            if(this.set.get(i).equals(element)){
                this.set.remove(i);
            }
        }

        return this.set;
    } // delete an element from a set

    @Override
    public int countElements() {
        return this.set.size();
    } // count elements from a set

    @Override
    public Set joinSets(Set set, Set set2) {

        Set unionSet = new Set();

        for (int i = 0; i < set.getSet().size(); i++) {
            unionSet.getSet().add(set.getSet().get(i));
        } // for set 1

        for (int i = 0; i < set2.getSet().size(); i++) {
            unionSet.getSet().add(set2.getSet().get(i));
        } // for set 1

        return unionSet;
    } // join 2 sets and create 1

    public ArrayList<T> getSet() {
        return set;
    }

    public void setSet(ArrayList<T> set) {
        this.set = set;
    }

    @Override
    public String toString(){

        String msg = "";

        for (int i = 0; i < this.set.size(); i++) {

            if (i==this.set.size()-1){
                msg += this.set.get(i);
            } else {
                msg += this.set.get(i)+", ";
            }

        } // for to get the msg of a set

        return msg;
    } // to string set
} // set class
