package com.gjh6.java.review.arithmetic.interview;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2019-02-09
 * Time: 11:46 AM
 */
public class EqualTest implements Cloneable{
    public int x;

    public EqualTest(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EqualTest)) return false;
        EqualTest equalTest = (EqualTest) o;
        return getX() == equalTest.getX();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX());
    }
}
