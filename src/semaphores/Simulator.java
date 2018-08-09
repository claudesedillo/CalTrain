package semaphores;

import java.util.ArrayList;

import semaphores.GUI;
import semaphores.Passenger;
import semaphores.Station;
import semaphores.Train;

public class Simulator {
	public static Simulator singleton;
	
	public GUI caltrainGUI;

	ArrayList<Station> stations = new ArrayList<>();
	
	private int trainCtr;
	public int peopleCtr;

	public Simulator(){
		this.trainCtr = 1;
		this.peopleCtr = 1;
		this.stations = new ArrayList<>();
		station_init();
	}
	
	public void setGUI(GUI gui){
		this.caltrainGUI = gui;
	}
	
	public static Simulator getInstance(){
		if(singleton == null){
			singleton = new Simulator();
		}
		return singleton;
	}
	
	
	public void station_load_train(Station s, int count){
		
		new Train("Train " + trainCtr, count, s, this);
		this.caltrainGUI.list_train_status.get(trainCtr - 1).setText("Status: Deployed");
		this.caltrainGUI.list_train_seatcount.get(trainCtr - 1).setText("Seat Count: " + count);
		trainCtr++;

	}
	
	public void station_wait_for_train(Station origin, Station destination){
		String str;
		origin.addNewPassenger(peopleCtr, destination);
		
		str = origin.getPeople().get(origin.getPeople().size()-1).getName() + ", destination: " + destination.getName() + " is now waiting \n";		
		if(caltrainGUI != null){
			caltrainGUI.list_station_status.get(stations.indexOf(origin)).append(str);
			caltrainGUI.list_queue_total.get(stations.indexOf(origin)).setText("Total:" + origin.getPeople().size());
		}
		System.out.println("\t\t" + str);
		peopleCtr++;
	}
	
	public void station_out_board(Station s){
		String str;
		for(int i = 0 ; i < s.getTrain().getPassengers().size() ; i++){
			if(s.getTrain().getPassengers().get(i).getOutStation().getName().equals(s.getName())){
				
				str = s.getTrain().getPassengers().get(i).getName() + " is getting off " + s.getTrain().getName() + ".\n";
				this.caltrainGUI.list_queue_total.get(i).setText("Total: " + s.getPeople().size());
				this.caltrainGUI.list_train_passengercount.get(i).setText("Passenger Count:" + s.getTrain().getPassengers().size());
				
				System.out.println("\t" + str);
				
				if(caltrainGUI != null)
					for(int j = 0; j < stations.size(); j++){
						if(s.getName().equals(stations.get(j).getName())){
							this.caltrainGUI.list_station_status.get(j).append(str);
						}
					}
				
				s.getTrain().getOffBoard(s.getTrain().getPassengers().get(i));
				i--;
			}
				
		}
	}
	
	public void station_on_board(Station s){
		String str;
		Passenger p = s.removePassenger();
		
		str = p.getName() + " is riding " + s.getTrain().getName() + ".\n";
		
		System.out.println("\t" + str);
		
		if(caltrainGUI != null)
			for(int i = 0; i < stations.size(); i++){
				if(s.getName().equals(stations.get(i).getName())){
					this.caltrainGUI.list_station_status.get(i).append(str);
				}
			}
		
		s.getTrain().getOnBoard(p);
		
		str = p.getName() + " has been seated.\n";
		
		if(caltrainGUI != null)
			for(int i = 0; i < stations.size(); i++){
				if(s.getName().equals(stations.get(i).getName())){
					caltrainGUI.list_station_status.get(i).append(str);		
				}
			}
		
		
		System.out.println("\t\t" + str);
		
		if(s.getPeople().size() == 0){
			str = "No more waiting passengers.\n";
		
			if(caltrainGUI != null)
				for(int i = 0; i < stations.size(); i++){
					if(s.getName().equals(stations.get(i).getName())){
						caltrainGUI.list_station_status.get(i).append(str);		
					}
				}
			System.out.println(str);
		}
	
		if(s.getTrain().getLimit().availablePermits() == 0){
			str = "Train is full.\n";
			
			if(caltrainGUI != null)
				for(int i = 0; i < stations.size(); i++){
					if(s.getName().equals(stations.get(i).getName())){
						caltrainGUI.list_station_status.get(i).append(str);		
					}
				}
			System.out.println(str);
		}
		
	}
	
	public void station_init(){
		stations.add(new Station("Station " + (stations.size()+1), this));
		if(stations.size() > 1){
			stations.get(stations.size()-2).setNextStation(stations.get(stations.size()-1));
		}
	}
	
	public ArrayList<Station> getStations(){
		return this.stations;
	}
	
	public void showSummary(){
		for(int i = 0; i < stations.size(); i++){
			Station s = stations.get(i);
			
			System.out.println("====================================================");
			System.out.println(s.getName());
			System.out.println("NO. OF PASSENGERS ON TRAIN: " + s.getPeople().size());
		}
	}
	
	public void showStatus(){
		for(int i = 0; i < stations.size(); i++){
			System.out.println("====================================================");
			Station s = stations.get(i);
			System.out.println("STATION: " + s.getName());
			System.out.println("NO. OF PASSENGERS ON TRAIN: " + s.getPeople().size());
			if(s.getPeople().size() == 0){
				System.out.println("\tNO PASSENGERS TO SHOW");
			}else{
				for(int j = 0; j < s.getPeople().size(); j++){
					if(j == 0){
						System.out.println("PASSENGERS WAITING:");
					}
					System.out.println("\t" + s.getPeople().get(j).getName());
				}
			}
		}
		System.out.println("====================================================");	
	}

	public int getTrainCtr() {
		return trainCtr;
	}

	public void setTrainCtr(int trainCtr) {
		this.trainCtr = trainCtr;
	}
}
