package com.jakob.effectivejava.item18;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * @author Jakob
 */
// Broken - Inappropriate use of inheritance!
public class WrongInstrumentedHashSet<E> extends HashSet<E> {
    // The number of attempted elements insertions
    private int addCount = 0;

    public WrongInstrumentedHashSet() {
    }

    public WrongInstrumentedHashSet(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }

    public static void main(String[] args) {
        WrongInstrumentedHashSet<String> s = new WrongInstrumentedHashSet<>();
        s.addAll(Arrays.asList("hello","world"));
        // 4
        System.out.println(s.getAddCount());
    }
}
