class RideSharingSystem {
    Queue<Integer> queueRider = new LinkedList<>();
    Queue<Integer> queueDriver = new LinkedList<>();

    public RideSharingSystem() {
        
    }
    
    public void addRider(int riderId) {
        queueRider.add(riderId);
    }
    
    public void addDriver(int driverId) {
        queueDriver.add(driverId);
    }
    
    public int[] matchDriverWithRider() {
        if(!queueRider.isEmpty() && !queueDriver.isEmpty()){
            int driver = queueRider.poll();
            int rider = queueDriver.poll();
            return new int[] {rider,driver};
        }
        return new int[] {-1,-1};
    }
    
    public void cancelRider(int riderId) {
        if(!queueRider.isEmpty()){
            queueRider.remove(riderId);
        }
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */