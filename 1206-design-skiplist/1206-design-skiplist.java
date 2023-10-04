class Skiplist {

    Map<Integer, Integer> map;
    public Skiplist() {
        map = new HashMap<>();
    }

    public boolean search(int target) {
        return map.containsKey(target);
    }

    public void add(int num) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }

    public boolean erase(int num) {
        Integer count = map.get(num);
        if (count == null) return false;
        if (count == 1) map.remove(num);
        else map.put(num, count - 1);
        return true;
    }
}

/**
 * Your Skiplist object will be instantiated and called as such:
 * Skiplist obj = new Skiplist();
 * boolean param_1 = obj.search(target);
 * obj.add(num);
 * boolean param_3 = obj.erase(num);
 */