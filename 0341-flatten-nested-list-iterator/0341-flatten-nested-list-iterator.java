
public class NestedIterator implements Iterator<Integer> {
    private List<NestedInteger> nestedList;
ArrayList <Integer> arr= new ArrayList<>();
    int i=0;
    public NestedIterator(List<NestedInteger> nestedList) {
        this.nestedList = nestedList;
        this.flatten(nestedList);
    }
    private void flatten(List<NestedInteger> nestedList) 
        {
        for(int i=0;i<nestedList.size();i++)
        {
            if(nestedList.get(i).isInteger())
                arr.add(nestedList.get(i).getInteger());
            else 
                flatten(nestedList.get(i).getList());
        }
    }

    @Override
    public Integer next() {
        int number = this.arr.get(i);
        i++;
        return number;
    }

    @Override
    public boolean hasNext() {
                return i < arr.size();

    }
}

