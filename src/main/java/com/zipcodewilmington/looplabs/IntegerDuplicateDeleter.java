package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    private Integer[] intArray;
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] intArr = new Integer[intArray.length - maxNumberOfDuplications];
        Integer[] newArr = new Integer[intArr.length];

        for (int i = 0; i < newArr.length; i++){
            if (i != maxNumberOfDuplications){
                newArr[i] = i;
            }
        }
        return newArr;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return new Integer[0];
    }
}
