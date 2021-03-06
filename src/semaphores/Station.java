package semaphores;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;


public class Station {
	private Simulator sync;
	private Semaphore isStationOccupied;
	
	private String name;
	private Station nextStation;
	
	private Train arrivedTrain;
	
	private ArrayList<Passenger> passengerList;
	
	public Station(String name, Simulator c){
		this.name = name;
		this.nextStation = null;
		this.isStationOccupied = new Semaphore(1, true);
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
	
	public void waitStation(){
		try {
			this.isStationOccupied.acquire();
		} catch (Exception e) {
		}
	}
	
	public void signalStation(){
		try {
			this.isStationOccupied.release();
		} catch (Exception e) {
		}
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
}
