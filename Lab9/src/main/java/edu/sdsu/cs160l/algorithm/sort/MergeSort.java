package edu.sdsu.cs160l.algorithm.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * TODO assignment (4 points)
 *  implement mergesort in a similar way as quick sort and bubble sort structurally
 */
public class MergeSort implements Sorter {
    @Override
    @SuppressWarnings("unchecked")
    public <T> void sort(T[] c) {
        Comparable[] comparable = (Comparable[]) c;
        sort(comparable, Comparator.naturalOrder());
    }

    @Override
    public <T> void sort(T[] c, Comparator<? super T> comparisonStrategy) {
        mergeSort(c, c.length,comparisonStrategy);
    }

    private <T> void mergeSort(T[] c, int n, Comparator<? super T> comparisonStrategy) {
        if(n <= 1)
        {
            return;
        }
        int start = 0;
        int end = n-1;
        int mid = n/2;

        T[] left = Arrays.copyOfRange(c, 0, mid);
        T[] right = Arrays.copyOfRange(c, mid, n);

        mergeSort(left, left.length, comparisonStrategy);
        mergeSort(right, right.length, comparisonStrategy);
        merge(c, left, right, start, end, comparisonStrategy);
    }

    private <T> void merge(T[] c, T[] l, T[] r, int left, int right, Comparator<? super T> comparisonStrategy) {
        int i = 0;
        int j = 0;
        int k = 0;

        while(i != l.length && j != r.length) {
            if(comparisonStrategy.compare(l[i], r[j]) <= 0)
            {
                c[k] = l[i];
                i++;
            } else
            {
                c[k] = r[j];
                j++;
            }
            k++;
        }

        while(i < l.length)
        {
            c[k] = l[i];
            i++;
            k++;
        }

        while(j < r.length)
        {
            c[k] = r[j];
            j++;
            k++;
        }
    }
}