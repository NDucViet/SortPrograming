package SortNSearch.model;

import java.util.Arrays;

public class Element {
    private int sizeArray;
    private int[] arrays;
    public Element(int sizeArray, int[] arrays) {
        this.sizeArray = sizeArray;
        this.arrays = arrays;
    }
    public Element() {
    }
    public int getSizeArray() {
        return sizeArray;
    }
    public void setSizeArray(int sizeArray) {
        this.sizeArray = sizeArray;
    }
    public int[] getArrays() {
        return arrays;
    }
    public void setArrays(int[] arrays) {
        this.arrays = arrays;
    }
    @Override
    public String toString() {
        return "Element [sizeArray=" + sizeArray + ", arrays=" + Arrays.toString(arrays) + "]";
    }
}
