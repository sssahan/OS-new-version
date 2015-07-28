package processsimulator;

public class AProcess {
    private String name;
    private int arrivalTime;
    private int serviceTime;
    private int excutedTime;
    private double priority;
    private boolean isComeFirst;
    private int processWaitTime;
    
    public AProcess(String name,int arrivalTime,int serviceTime){
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.serviceTime = serviceTime;
        this.excutedTime = 0;
        this.priority = 0;
        this.isComeFirst = true;
        this.processWaitTime = 0;
        
    }
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
 
    /**
     * @return the arrivalTime
     */
    public int getArrivalTime() {
        return arrivalTime;
    }

       /**
     * @return the serviceTime
     */
    public int getServiceTime() {
        return serviceTime;
    }

    /**
     * @return the priority
     */
    public double getPriority() {
        return priority;
    }

    /**
     * @param priority the priority to set
     */
    public void setPriority(double priority) {
        this.priority = priority;
    }

    /**
     * @return the excutedTime
     */
    public int getExcutedTime() {
        return excutedTime;
    }

    /**
     * @param excutedTime the excutedTime to set
     */
    public void setExcutedTime(int excutedTime) {
        this.excutedTime = excutedTime;
    }

    /**
     * @return the isFirst
     */
    public boolean isIsComeFirst() {
        return isComeFirst;
    }

    /**
     * @param isFirst the isFirst to set
     */
    public void setIsComeFirst(boolean isFirst) {
        this.isComeFirst = isFirst;
    }

    /**
     * @param arrivalTime the arrivalTime to set
     */
    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /**
     * @return the processWaitTime
     */
    public int getProcessWaitTime() {
        return processWaitTime;
    }

    /**
     * @param processWaitTime the processWaitTime to set
     */
    public void setProcessWaitTime(int processWaitTime) {
        this.processWaitTime = processWaitTime;
    }
   
}
