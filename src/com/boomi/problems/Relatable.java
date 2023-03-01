package com.boomi.problems;

public interface Relatable {
    public int isLargerThan(Relatable other);
    public Object findLargest(Object object1,Object object2);
    public boolean isEqual(Object object1,Object object2);

    public Object findSmallest(Object object1,Object object2);
}
