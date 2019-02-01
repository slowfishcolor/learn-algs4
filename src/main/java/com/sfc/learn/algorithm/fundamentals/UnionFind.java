package com.sfc.learn.algorithm.fundamentals;

/**
 * The {@code UnionFind} class represents a <em>union–find data type</em>
 * (also known as the <em>disjoint-sets data type</em>).
 * It supports the <em>union</em> and <em>find</em> operations,
 * along with a <em>connected</em> operation for determining whether
 * two sites are in the same component and a <em>count</em> operation that
 * returns the total number of components.
 */
public interface UnionFind {

    /**
     * Merges the component containing site {@code p} with thethe component containing site {@code q}.
     *
     * @param p the integer representing one site
     * @param q the integer representing the other site
     * @throws IllegalArgumentException unless both {@code 0 <= p < n} and {@code 0 <= q < n}
     */
    void union(int p, int q);

    /**
     * Returns the component identifier for the component containing site {@code p}.
     *
     * @param  p the integer representing one site
     * @return the component identifier for the component containing site {@code p}
     * @throws IllegalArgumentException unless {@code 0 <= p < n}
     */
    int find(int p);


    /**
     * Returns true if the the two sites are in the same component.
     *
     * @param  p the integer representing one site
     * @param  q the integer representing the other site
     * @return {@code true} if the two sites {@code p} and {@code q} are in the same component;
     *         {@code false} otherwise
     * @throws IllegalArgumentException unless both {@code 0 <= p < n} and {@code 0 <= q < n}
     */
    boolean connected(int p, int q);

    /**
     * Returns the number of components.
     *
     * @return the number of components (between {@code 1} and {@code n})
     */
    int count();
}
