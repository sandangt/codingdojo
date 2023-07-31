package codingdojo.sedgewick.iterating;

public abstract class ResizingArray<Item> {
    protected static final int INIT_CAPACITY = 8;
    protected Item[] arr;
    protected int n;

    public ResizingArray() {
        arr = (Item[]) new Object[INIT_CAPACITY];
        n = 0;
    }

    protected void resize(int capacity) {
        if (capacity < n) return;
        Item[] tempArr = (Item[]) new Object[capacity];
        for (int i = 0; i < n; i++) {
            tempArr[i] = arr[i];
        }
        arr = tempArr;
    }
}
