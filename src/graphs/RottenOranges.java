package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    public class Pair{
        int i;
        int j;
        int time;
        Pair(int i, int j, int time){
            this.i = i;
            this.j = j;
            this.time = time;
        }
    }
    public int orangesRot(int[][] mat) {
        // code here
        int rows = mat.length;
        int cols = mat[0].length;

        Queue<Pair> q = new LinkedList<>();
        int fresh = 0;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(mat[i][j]==2){
                    q.add(new Pair(i,j,0));
                } else if(mat[i][j]==1){
                    fresh++;
                }
            }
        }

        int ans = 0;

        while(q.size()>0){
            Pair front = q.remove();
            int x = front.i;
            int y = front.j;
            int t = front.time;

            ans = t;

            //Up
            if(x-1>=0 && mat[x-1][y]==1){
                mat[x-1][y]=2;
                q.add(new Pair(x-1,y,t+1));
                fresh--;
            }

            //Down
            if(x+1<rows && mat[x+1][y]==1){
                mat[x+1][y]=2;
                q.add(new Pair(x+1,y,t+1));
                fresh--;
            }

            //Left
            if(y-1>=0 && mat[x][y-1]==1){
                mat[x][y-1]=2;
                q.add(new Pair(x,y-1,t+1));
                fresh--;
            }

            //Right
            if(y+1<cols && mat[x][y+1]==1){
                mat[x][y+1]=2;
                q.add(new Pair(x,y+1,t+1));
                fresh--;
            }
        }

        return fresh==0 ? ans : -1;
    }
}
