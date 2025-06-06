package org.example.array.designhashset;

class MyHashSet {
    private final boolean[] set;

    public MyHashSet() {
        set = new boolean[1_000_001];
    }

    public void add(int key) {
        set[key] = true;
    }

    public void remove(int key) {
        set[key] = false;
    }

    public boolean contains(int key) {
        return set[key];
    }
}
