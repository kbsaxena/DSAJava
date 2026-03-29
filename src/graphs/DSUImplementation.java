package graphs;

import java.util.Arrays;

class DSU{
    int[] parent;
    DSU(int vertices){
        parent = new int[vertices];
        for(int i=0;i<vertices;i++) make(i);
    }

    void make(int n){
        parent[n] = n;
    }

    int findGroupLeader(int n){
        if(parent[n] == n) return n;
        return findGroupLeader(parent[n]);
    }

    void union(int a, int b){
        parent[findGroupLeader(b)] = findGroupLeader(a);
    }
}

public class DSUImplementation {
    public static void main(String[] args) {
        DSU dsu = new DSU(6);

        System.out.println(Arrays.toString(dsu.parent));
        dsu.union(0,1);
        dsu.union(2,3);
        dsu.union(0,2);
        dsu.union(4,5);
        dsu.union(2,5);
        System.out.println(Arrays.toString(dsu.parent));
        System.out.println("group Leader of 5 is - " + dsu.findGroupLeader(5));

    }
}
