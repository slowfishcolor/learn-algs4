package com.sfc.learn.algorithm.fundamentals;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class QuickFindUF implements UnionFind {

    /**
     * Array index represents the <em>site</em>, array value represents the <em>id of components</em>.
     * If two sites are in the same components, then the value of these two index are the same.
     */
    private int[] id;

    private int count;

    private int n;

    public QuickFindUF(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        this.n = n;
        this.count = n;
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public void union(int p, int q) {
        if (id[p] == id[q]) {
            return;
        }
        int oldCompositeId = id[p];
        int compositeId = id[q];
        for (int i = 0; i < n; i++) {
            if (id[i] == oldCompositeId) {
                id[i] = compositeId;
            }
        }
        count--;
    }

    public int find(int p) {
        if (p < 0 || p >= n) {
            throw new IllegalArgumentException();
        }
        return id[p];
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public int count() {
        return this.count;
    }

    public static void main(String[] args) {
        int n = StdIn.readInt();
        UnionFind uf = new QuickFindUF(n);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + " components");
    }
}
