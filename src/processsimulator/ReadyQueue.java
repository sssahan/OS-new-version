package processsimulator;

import java.util.ArrayList;


public class ReadyQueue extends ArrayList<AProcess>{
    public AProcess remove(){
        AProcess highPriority = this.get(0);
        for(AProcess p:this){
            if(p.getPriority()==highPriority.getPriority()){
                if(p.isIsComeFirst())
                    highPriority = p;                                    
            }else if(p.getPriority()>highPriority.getPriority()){
                highPriority = p;
            }
        }        
        return this.remove(this.indexOf(highPriority));
    }
   
    public AProcess pop(){
        return this.remove(0);
    }
}
