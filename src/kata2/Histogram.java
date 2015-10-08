
package kata2;

import java.util.HashMap;

public class Histogram {
    
    private final int[] vector;
    
    public Histogram(int[]vector){
        this.vector=vector;
        
    }
    
    public HashMap<Integer,Integer> getHisto(){
    HashMap<Integer,Integer> histo=new HashMap<>();
    for (int i=0; i<vector.length;i++){
        if(!histo.containsKey(vector[i])){
           histo.put(vector[i],1);
}else{
histo.put(vector[i], histo.get(vector[i])+1);
}
}
        return histo;
    }
}
