package locks;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Station {
	private Lock lock;
    private Condition state;
	private Simulator sync;
	
	private String name;
	private Station nextStation;
	
	private Train arrivedTrain;
	
	private ArrayList<Passenger> passengerList;
	
	public Station(String name, Simulator c){
		this.name = name;
		this.lock = new ReentrantLock();
        this.state = lock.newCondition();
		this.nextStation = null;
		arrivedTrain = null;
		this.passengerList = new ArrayList<>(); 
		this.sync = c;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setNextStation(Station s){
		this.nextStation = s;
	}
	
	public Station getNextStation(){
		return this.nextStation;
	}
	
	public void addNewPassenger(int ctr, Station o){
		passengerList.add(new Passenger("Passenger " + ctr, this, o, sync));
	}
	
	public Passenger removePassenger(){
		return(passengerList.remove(0));
	}
	
	public ArrayList<Passenger> getPeople(){
		return this.passengerList;
	}
	
	public Train getTrain(){
		return this.arrivedTrain;
	}
	
	public boolean getsOccupiedBy(Train t){
		if(!this.hasTrain()){
			this.arrivedTrain = t;
			return true;
		}
		return false;
	}
	
	public void removeTrain(){
		this.arrivedTrain = null;
	}
	
	public boolean hasTrain(){
		if(this.arrivedTrain == null)
			return false;
		return true;
	}

	public Lock getLock() {
		return lock;
	}

	public void setLock(Lock lock) {
		this.lock = lock;
	}

	public Condition getState() {
		return state;
	}

	public void setState(Condition state) {
		this.state = state;
	}
	
}
