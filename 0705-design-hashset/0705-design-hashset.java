class MyHashSet {

    private final long[] bits;

    public MyHashSet() {
        bits = new long[(1_000_000 >> 6) + 1];
    }

    public void add(int key) {
        bits[key >> 6] |= 1L << (key & 63);
    }

    public void remove(int key) {
        bits[key >> 6] &= ~(1L << (key & 63));
    }

    public boolean contains(int key) {
        return (bits[key >> 6] & (1L << (key & 63))) != 0;
    }
}
/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */