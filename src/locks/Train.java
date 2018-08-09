package locks;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;

import locks.Passenger;
import locks.Simulator;
import locks.Station;


public class Train implements Runnable {
	private Simulator sync;
	
    private Condition rideable;
	public long startTime;
	private String name;
    private int seatLimit;
	
	
	private Station inStation;
	private Thread t = new Thread(this);
	
	private ArrayList<Passenger> passengers;	
	
	public Train(String name, int limit, Station inStation, Simulator c){
		this.name = name;
		this.passengers = new ArrayList<>();
		this.seatLimit = limit;
        this.rideable = inStation.getLock().newCondition();
		this.sync = c;
		
		this.startTime = System.currentTimeMillis();
		try {
			System.out.println("AvailablePermits: " + this.seatLimit);
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
		}
		
		this.inStation = inStation;
		t.start();
	}
	
	public String getName(){
		return this.name;
	}
	
	public void getOnBoard(Passenger p){
		try {
			seatLimit--;
			passengers.add(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void getOffBoard(Passenger p){
		seatLimit++;
		passengers.remove(p);
	}
	
	public int getSeated(){
		return this.passengers.size();
	}
	
	public int getLimit(){
		return this.seatLimit;
	}
	
	
	public void waitTrain(){
		try {
			rideable.await();
		} catch (Exception e) {
		}
	}
	
	public void signalTrain(){
        try {
            rideable.signal();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public void run(){
		while(inStation != null){
			String str = this.name + " is approaching.\n";
			System.out.println(str);
			
			
			if(sync.caltrainGUI != null)
				for(int i = 0; i < 8; i++){
					if(inStation.getName().equals(sync.getStations().get(i).getName())){
						sync.caltrainGUI.list_station_status.get(i).append(str);		
					}
				}

			signalTrain();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			
			inStation.getsOccupiedBy(this);
			double endTime = System.currentTimeMillis();
			double totalTimeArrive = (endTime - startTime) * 0.001;
			str = this.name + " has arrived. in " + totalTimeArrive + "\n";
			System.out.println(str + inStation.getName() + "\n");
			System.out.println("CURRENT TRAIN: " + inStation.getTrain().getName());
			
			if(sync.caltrainGUI != null)
				for(int i = 0; i < 8; i++){
					if(inStation.getName().equals(sync.getStations().get(i).getName())){
						sync.caltrainGUI.list_station_status.get(i).append(str);		
					}
				}
			
			System.out.println("\tENTERING STATION: " + inStation.getName());
			
			sync.station_out_board(inStation);
			
			while(seatLimit > 0 && inStation.getPeople().size() > 0){
				//get passengers
			}
	
			inStation.removeTrain();
			endTime = System.currentTimeMillis();
			double totalTimeLeave = (endTime - startTime) * 0.001;
			str = this.name + " is leaving at" + totalTimeLeave + "\n";
			System.out.println("\t" + str + inStation.getName() + "\n");
			
			if(sync.caltrainGUI != null)
				for(int i = 0; i < 8; i++){
					if(inStation.getName().equals(sync.getStations().get(i).getName())){
						sync.caltrainGUI.list_station_status.get(i).append(str);		
					}
				}
			
			try{
				Thread.sleep(1000);
			}catch(Exception e){
			}
			inStation = inStation.getNextStation();
			
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
		}
		
	}
	
	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(ArrayList<Passenger> passengers) {
		this.passengers = passengers;
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public int getSeatLimit() {
		return seatLimit;
	}

	public void setSeatLimit(int seatLimit) {
		this.seatLimit = seatLimit;
	}

}
