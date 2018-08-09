package locks;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

import locks.Simulator;

public class GUI {

	private JFrame frame;
	
	private final JLabel lblTrainStatus = new JLabel("Train Status");
	private final JLabel label_train1 = new JLabel("Train 1");
	private final JLabel label_train2 = new JLabel("Train 2");
	private final JLabel label_train3 = new JLabel("Train 3");
	private final JLabel label_train4 = new JLabel("Train 4");
	private final JLabel label_train5 = new JLabel("Train 5");
	private final JLabel label_train6 = new JLabel("Train 6");
	private final JLabel label_train7 = new JLabel("Train 7");
	private final JLabel label_train8 = new JLabel("Train 8");
	private final JLabel label_train9 = new JLabel("Train 9");
	private final JLabel label_train10 = new JLabel("Train 10");
	private final JLabel label_train11 = new JLabel("Train 11");
	private final JLabel label_train12 = new JLabel("Train 12");
	private final JLabel label_train13 = new JLabel("Train 13");
	private final JLabel label_train14 = new JLabel("Train 14");
	private final JLabel label_train15 = new JLabel("Train 15");
	private final JLabel label_train16 = new JLabel("Train 16");
	
	public ArrayList<JLabel> list_train_status = new ArrayList<JLabel>();
	public JLabel status_train1 = new JLabel("Status: Not Deployed");
	public JLabel status_train2 = new JLabel("Status: Not Deployed");
	public JLabel status_train3 = new JLabel("Status: Not Deployed");
	public JLabel status_train4 = new JLabel("Status: Not Deployed");
	public JLabel status_train5 = new JLabel("Status: Not Deployed");
	public JLabel status_train6 = new JLabel("Status: Not Deployed");
	public JLabel status_train7 = new JLabel("Status: Not Deployed");
	public JLabel status_train8 = new JLabel("Status: Not Deployed");
	public JLabel status_train9 = new JLabel("Status: Not Deployed");
	public JLabel status_train10 = new JLabel("Status: Not Deployed");
	public JLabel status_train11 = new JLabel("Status: Not Deployed");
	public JLabel status_train12 = new JLabel("Status: Not Deployed");
	public JLabel status_train13 = new JLabel("Status: Not Deployed");
	public JLabel status_train14 = new JLabel("Status: Not Deployed");
	public JLabel status_train15 = new JLabel("Status: Not Deployed");
	public JLabel status_train16 = new JLabel("Status: Not Deployed");
	
	public ArrayList<JLabel> list_train_location = new ArrayList<JLabel>();
	public JLabel location_train1 = new JLabel("Location:");
	public JLabel location_train2 = new JLabel("Location:");
	public JLabel location_train3 = new JLabel("Location:");
	public JLabel location_train4 = new JLabel("Location:");
	public JLabel location_train5 = new JLabel("Location:");
	public JLabel location_train6 = new JLabel("Location:");
	public JLabel location_train7 = new JLabel("Location:");
	public JLabel location_train8 = new JLabel("Location:");
	public JLabel location_train9 = new JLabel("Location:");
	public JLabel location_train10 = new JLabel("Location:");
	public JLabel location_train11 = new JLabel("Location:");
	public JLabel location_train12 = new JLabel("Location:");
	public JLabel location_train13 = new JLabel("Location:");
	public JLabel location_train14 = new JLabel("Location:");
	public JLabel location_train15 = new JLabel("Location:");
	public JLabel location_train16 = new JLabel("Location:");

	public ArrayList<JLabel> list_train_seatcount = new ArrayList<JLabel>();
	public JLabel seatcount_train1 = new JLabel("Seat Count:");
	public JLabel seatcount_train2 = new JLabel("Seat Count:");
	public JLabel seatcount_train3 = new JLabel("Seat Count:");
	public JLabel seatcount_train4 = new JLabel("Seat Count:");
	public JLabel seatcount_train5 = new JLabel("Seat Count:");
	public JLabel seatcount_train6 = new JLabel("Seat Count:");
	public JLabel seatcount_train7 = new JLabel("Seat Count:");
	public JLabel seatcount_train8 = new JLabel("Seat Count:");
	public JLabel seatcount_train9 = new JLabel("Seat Count:");
	public JLabel seatcount_train10 = new JLabel("Seat Count:");
	public JLabel seatcount_train11 = new JLabel("Seat Count:");
	public JLabel seatcount_train12 = new JLabel("Seat Count:");
	public JLabel seatcount_train13 = new JLabel("Seat Count:");
	public JLabel seatcount_train14 = new JLabel("Seat Count:");
	public JLabel seatcount_train15 = new JLabel("Seat Count:");
	public JLabel seatcount_train16 = new JLabel("Seat Count:");
	
	public ArrayList<JLabel> list_train_passengercount = new ArrayList<JLabel>();
	public JLabel passengercount_train1 = new JLabel("Passenger Count:");
	public JLabel passengercount_train2 = new JLabel("Passenger Count:");
	public JLabel passengercount_train3 = new JLabel("Passenger Count:");
	public JLabel passengercount_train4 = new JLabel("Passenger Count:");
	public JLabel passengercount_train5 = new JLabel("Passenger Count:");
	public JLabel passengercount_train6 = new JLabel("Passenger Count:");
	public JLabel passengercount_train7 = new JLabel("Passenger Count:");
	public JLabel passengercount_train8 = new JLabel("Passenger Count:");
	public JLabel passengercount_train9 = new JLabel("Passenger Count:");
	public JLabel passengercount_train10 = new JLabel("Passenger Count:");
	public JLabel passengercount_train11 = new JLabel("Passenger Count:");
	public JLabel passengercount_train12 = new JLabel("Passenger Count:");
	public JLabel passengercount_train13 = new JLabel("Passenger Count:");
	public JLabel passengercount_train14 = new JLabel("Passenger Count:");
	public JLabel passengercount_train15 = new JLabel("Passenger Count:");
	public JLabel passengercount_train16 = new JLabel("Passenger Count:");
	
	private final JLabel lblStationQueue = new JLabel("Station Queue Status");
	private final JLabel lblStation1Queue = new JLabel("Station 1");
	private final JLabel lblStation2Queue = new JLabel("Station 2");
	private final JLabel lblStation3Queue = new JLabel("Station 3");
	private final JLabel lblStation4Queue = new JLabel("Station 4");
	private final JLabel lblStation5Queue = new JLabel("Station 5");
	private final JLabel lblStation6Queue = new JLabel("Station 6");
	private final JLabel lblStation7Queue = new JLabel("Station 7");
	private final JLabel lblStation8Queue = new JLabel("Station 8");

	public ArrayList<JLabel> list_queue_total = new ArrayList<JLabel>();
	public JLabel queue_total_station1 = new JLabel("Total: 0");
	public JLabel queue_total_station2 = new JLabel("Total: 0");
	public JLabel queue_total_station3 = new JLabel("Total: 0");
	public JLabel queue_total_station4 = new JLabel("Total: 0");
	public JLabel queue_total_station5 = new JLabel("Total: 0");
	public JLabel queue_total_station6 = new JLabel("Total: 0");
	public JLabel queue_total_station7 = new JLabel("Total: 0");
	public JLabel queue_total_station8 = new JLabel("Total: 0");
	
	private final JLabel lblStationStatus = new JLabel("Station Status");
	private final JLabel lblStationStatus1 = new JLabel("Station 1");
	private final JLabel lblStationStatus2 = new JLabel("Station 2");
	private final JLabel lblStationStatus3 = new JLabel("Station 3");
	private final JLabel lblStationStatus4 = new JLabel("Station 4");
	private final JLabel lblStationStatus5 = new JLabel("Station 5");
	private final JLabel lblStationStatus6 = new JLabel("Station 6");
	private final JLabel lblStationStatus7 = new JLabel("Station 7");
	private final JLabel lblStationStatus8 = new JLabel("Station 8");
	
	private final JScrollPane station1_status_scrollpane = new JScrollPane();
	private final JScrollPane station2_status_scrollpane = new JScrollPane();
	private final JScrollPane station3_status_scrollpane = new JScrollPane();
	private final JScrollPane station4_status_scrollpane = new JScrollPane();
	private final JScrollPane station5_status_scrollpane = new JScrollPane();
	private final JScrollPane station6_status_scrollpane = new JScrollPane();
	private final JScrollPane station7_status_scrollpane = new JScrollPane();
	private final JScrollPane station8_status_scrollpane = new JScrollPane();
	
	public ArrayList<JTextArea> list_station_status = new ArrayList<JTextArea>();
	public JTextArea status_station1 = new JTextArea();
	public JTextArea status_station2 = new JTextArea();
	public JTextArea status_station3 = new JTextArea();
	public JTextArea status_station4 = new JTextArea();
	public JTextArea status_station5 = new JTextArea();
	public JTextArea status_station6 = new JTextArea();
	public JTextArea status_station7 = new JTextArea();
	public JTextArea status_station8 = new JTextArea();
	
	public ArrayList<JButton> list_add_passenger_btn = new ArrayList<JButton>();
	public JButton addPassenger_station1 = new JButton("Add");
	public JButton addPassenger_station2 = new JButton("Add");
	public JButton addPassenger_station3 = new JButton("Add");
	public JButton addPassenger_station4 = new JButton("Add");
	public JButton addPassenger_station5 = new JButton("Add");
	public JButton addPassenger_station6 = new JButton("Add");
	public JButton addPassenger_station7 = new JButton("Add");
	public JButton addPassenger_station8 = new JButton("Add");
	
	public JButton btnRunSimulator ;
	public JButton btn_deploy_train;
	public JSpinner spinner_seatcount;
	public SpinnerModel smTrain = new SpinnerNumberModel(1, 1, 20, 1);
	public SpinnerModel sm = new SpinnerNumberModel(1, 1, 8, 1); //default value,lower bound,upper bound,increment by
	public JSpinner destinationSpinner;
	public Simulator simulator;
	
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initializeGUI(){
		//initialize Train Number Labels
		label_train1.setBounds(10, 41, 46, 14);
		frame.getContentPane().add(label_train1);
		
		label_train2.setBounds(145, 41, 46, 14);
		frame.getContentPane().add(label_train2);
		
		label_train3.setBounds(313, 41, 46, 14);
		frame.getContentPane().add(label_train3);
		
		label_train4.setBounds(484, 41, 46, 14);
		frame.getContentPane().add(label_train4);
		
		label_train5.setBounds(636, 41, 46, 14);
		frame.getContentPane().add(label_train5);
		
		label_train6.setBounds(799, 41, 46, 14);
		frame.getContentPane().add(label_train6);
		
		label_train7.setBounds(959, 41, 46, 14);
		frame.getContentPane().add(label_train7);
		
		label_train8.setBounds(1116, 41, 91, 14);
		frame.getContentPane().add(label_train8);
		
		label_train9.setBounds(10, 173, 46, 14);
		frame.getContentPane().add(label_train9);
		
		label_train10.setBounds(145, 173, 46, 14);
		frame.getContentPane().add(label_train10);
		
		label_train11.setBounds(313, 173, 46, 14);
		frame.getContentPane().add(label_train11);
		
		label_train12.setBounds(484, 173, 46, 14);
		frame.getContentPane().add(label_train12);
		
		label_train13.setBounds(636, 173, 46, 14);
		frame.getContentPane().add(label_train13);
		
		label_train14.setBounds(799, 173, 46, 14);
		frame.getContentPane().add(label_train14);
		
		label_train15.setBounds(959, 173, 46, 14);
		frame.getContentPane().add(label_train15);
		
		label_train16.setBounds(1116, 173, 46, 14);
		frame.getContentPane().add(label_train16);
		
		lblTrainStatus.setBounds(10, 16, 120, 14);
		frame.getContentPane().add(lblTrainStatus);
		
		lblStationQueue.setBounds(10, 314, 120, 14);
		frame.getContentPane().add(lblStationQueue);
		
		lblStation1Queue.setBounds(10, 339, 120, 14);
		frame.getContentPane().add(lblStation1Queue);
		
		lblStation2Queue.setBounds(145, 339, 115, 14);
		frame.getContentPane().add(lblStation2Queue);
		
		lblStation3Queue.setBounds(313, 339, 120, 14);
		frame.getContentPane().add(lblStation3Queue);
		
		lblStation4Queue.setBounds(484, 339, 120, 14);
		frame.getContentPane().add(lblStation4Queue);
		
		lblStation5Queue.setBounds(636, 339, 120, 14);
		frame.getContentPane().add(lblStation5Queue);
		
		lblStation6Queue.setBounds(799, 339, 120, 14);
		frame.getContentPane().add(lblStation6Queue);
		
		lblStation7Queue.setBounds(959, 339, 120, 14);
		frame.getContentPane().add(lblStation7Queue);
		
		lblStation8Queue.setBounds(1116, 339, 120, 14);
		frame.getContentPane().add(lblStation8Queue);
		
		
		queue_total_station1.setBounds(10, 364, 120, 14);
		frame.getContentPane().add(queue_total_station1);
		list_queue_total.add(queue_total_station1);
		
		queue_total_station2.setBounds(145, 364, 131, 14);
		frame.getContentPane().add(queue_total_station2);
		list_queue_total.add(queue_total_station2);
		
		queue_total_station3.setBounds(313, 364, 120, 14);
		frame.getContentPane().add(queue_total_station3);
		list_queue_total.add(queue_total_station3);
		
		queue_total_station4.setBounds(484, 364, 131, 14);
		frame.getContentPane().add(queue_total_station4);
		list_queue_total.add(queue_total_station4);
		
		queue_total_station5.setBounds(636, 364, 120, 14);
		frame.getContentPane().add(queue_total_station5);
		list_queue_total.add(queue_total_station5);
		
		queue_total_station6.setBounds(799, 364, 120, 14);
		frame.getContentPane().add(queue_total_station6);
		list_queue_total.add(queue_total_station6);
		
		queue_total_station7.setBounds(959, 364, 120, 14);
		frame.getContentPane().add(queue_total_station7);
		list_queue_total.add(queue_total_station7);
		
		queue_total_station8.setBounds(1116, 364, 120, 14);
		frame.getContentPane().add(queue_total_station8);
		list_queue_total.add(queue_total_station8);
		
		lblStationStatus.setBounds(10, 389, 131, 14);
		frame.getContentPane().add(lblStationStatus);
		
		station1_status_scrollpane.setBounds(10, 439, 250, 100);
		frame.getContentPane().add(station1_status_scrollpane);
		station1_status_scrollpane.setViewportView(status_station1);
		list_station_status.add(status_station1);
		
		station2_status_scrollpane.setBounds(357, 439, 250, 100);
		frame.getContentPane().add(station2_status_scrollpane);
		station2_status_scrollpane.setViewportView(status_station2);
		list_station_status.add(status_station2);
		
		station3_status_scrollpane.setBounds(669, 439, 250, 100);
		frame.getContentPane().add(station3_status_scrollpane);
		station3_status_scrollpane.setViewportView(status_station3);
		list_station_status.add(status_station3);
		
		station4_status_scrollpane.setBounds(986, 439, 250, 100);
		frame.getContentPane().add(station4_status_scrollpane);
		station4_status_scrollpane.setViewportView(status_station4);
		list_station_status.add(status_station4);
		
		station5_status_scrollpane.setBounds(986, 570, 250, 100);
		frame.getContentPane().add(station5_status_scrollpane);
		station5_status_scrollpane.setViewportView(status_station5);
		list_station_status.add(status_station5);
		
		station6_status_scrollpane.setBounds(669, 570, 250, 100);
		frame.getContentPane().add(station6_status_scrollpane);
		station6_status_scrollpane.setViewportView(status_station6);
		list_station_status.add(status_station6);
		
		station7_status_scrollpane.setBounds(357, 570, 250, 100);
		frame.getContentPane().add(station7_status_scrollpane);
		station7_status_scrollpane.setViewportView(status_station7);
		list_station_status.add(status_station7);
		
		station8_status_scrollpane.setBounds(10, 570, 250, 100);
		frame.getContentPane().add(station8_status_scrollpane);
		station8_status_scrollpane.setViewportView(status_station8);
		list_station_status.add(status_station8);
		
		lblStationStatus1.setBounds(10, 414, 131, 14);
		frame.getContentPane().add(lblStationStatus1);
		
		lblStationStatus2.setBounds(354, 414, 120, 14);
		frame.getContentPane().add(lblStationStatus2);
		
		lblStationStatus3.setBounds(669, 414, 120, 14);
		frame.getContentPane().add(lblStationStatus3);
		
		lblStationStatus4.setBounds(986, 414, 125, 14);
		frame.getContentPane().add(lblStationStatus4);
		
		lblStationStatus5.setBounds(986, 550, 115, 14);
		frame.getContentPane().add(lblStationStatus5);
		
		lblStationStatus6.setBounds(669, 550, 120, 14);
		frame.getContentPane().add(lblStationStatus6);
		
		lblStationStatus7.setBounds(357, 550, 120, 14);
		frame.getContentPane().add(lblStationStatus7);
		
		lblStationStatus8.setBounds(10, 550, 120, 14);
		frame.getContentPane().add(lblStationStatus8);
		

		
		
		location_train1.setBounds(10, 91, 120, 14);
		list_train_location.add(location_train1);
		list_train_location.add(location_train2);
		list_train_location.add(location_train3);
		list_train_location.add(location_train4);
		list_train_location.add(location_train5);
		list_train_location.add(location_train6);
		list_train_location.add(location_train7);
		list_train_location.add(location_train8);
		list_train_location.add(location_train9);
		list_train_location.add(location_train10);
		list_train_location.add(location_train11);
		list_train_location.add(location_train12);
		list_train_location.add(location_train13);
		list_train_location.add(location_train14);
		list_train_location.add(location_train15);
		list_train_location.add(location_train16);
		
		frame.getContentPane().add(location_train1);
		
		
		seatcount_train1.setBounds(10, 116, 120, 14);
		frame.getContentPane().add(seatcount_train1);
		
		
		passengercount_train1.setBounds(10, 141, 120, 14);
		frame.getContentPane().add(passengercount_train1);
		
		
		addPassenger_station4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		addPassenger_station4.setBounds(543, 335, 60, 23);
		frame.getContentPane().add(addPassenger_station4);
		

		
		addPassenger_station5.setBounds(697, 335, 60, 23);
		frame.getContentPane().add(addPassenger_station5);
		
		
		addPassenger_station3.setBounds(373, 335, 60, 23);
		frame.getContentPane().add(addPassenger_station3);
		
		
		addPassenger_station2.setBounds(214, 335, 60, 23);
		frame.getContentPane().add(addPassenger_station2);

		
		
		addPassenger_station1.setBounds(70, 335, 60, 23);
		frame.getContentPane().add(addPassenger_station1);
		
		
		addPassenger_station6.setBounds(859, 335, 60, 23);
		frame.getContentPane().add(addPassenger_station6);
		
		
		addPassenger_station7.setBounds(1019, 335, 60, 23);
		frame.getContentPane().add(addPassenger_station7);
		
		
		addPassenger_station8.setBounds(1176, 335, 60, 23);
		frame.getContentPane().add(addPassenger_station8);
		
		btnRunSimulator = new JButton("Run Simulator");
		btnRunSimulator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRunSimulator.setBounds(714, 12, 131, 23);
		frame.getContentPane().add(btnRunSimulator);
		
		
		status_train9.setBounds(10, 198, 131, 14);
		frame.getContentPane().add(status_train9);
		
		
		location_train9.setBounds(10, 223, 131, 14);
		frame.getContentPane().add(location_train9);
		

		
		location_train10.setBounds(145, 223, 131, 14);
		frame.getContentPane().add(location_train10);
		
		
		location_train2.setBounds(145, 91, 120, 14);
		frame.getContentPane().add(location_train2);
		
		
		location_train3.setBounds(313, 91, 131, 14);
		frame.getContentPane().add(location_train3);
		
		
		location_train11.setBounds(313, 223, 161, 14);
		frame.getContentPane().add(location_train11);
		
		
		location_train12.setBounds(484, 223, 131, 14);
		frame.getContentPane().add(location_train12);
		
		
		location_train4.setBounds(484, 91, 120, 14);
		frame.getContentPane().add(location_train4);
		
		
		location_train5.setBounds(636, 91, 91, 14);
		frame.getContentPane().add(location_train5);
		
		
		location_train13.setBounds(636, 223, 131, 14);
		frame.getContentPane().add(location_train13);
		
		
		location_train6.setBounds(799, 91, 91, 14);
		frame.getContentPane().add(location_train6);
		
		
		location_train14.setBounds(799, 223, 120, 14);
		frame.getContentPane().add(location_train14);
		
		
		location_train7.setBounds(959, 91, 131, 14);
		frame.getContentPane().add(location_train7);
		
		
		location_train15.setBounds(959, 223, 152, 14);
		frame.getContentPane().add(location_train15);
		
		
		location_train16.setBounds(1116, 223, 120, 14);
		frame.getContentPane().add(location_train16);
		
		
		location_train8.setBounds(1116, 91, 138, 14);
		frame.getContentPane().add(location_train8);
		
		status_train1.setBounds(10, 66, 120, 14);
		frame.getContentPane().add(status_train1);
		list_train_status.add(status_train1);
		list_train_status.add(status_train2);
		list_train_status.add(status_train3);
		list_train_status.add(status_train4);
		list_train_status.add(status_train5);
		list_train_status.add(status_train6);
		list_train_status.add(status_train7);
		list_train_status.add(status_train8);
		list_train_status.add(status_train9);
		list_train_status.add(status_train10);
		list_train_status.add(status_train11);
		list_train_status.add(status_train12);
		list_train_status.add(status_train13);
		list_train_status.add(status_train14);
		list_train_status.add(status_train15);
		list_train_status.add(status_train16);
		
		status_train2.setBounds(145, 66, 131, 14);
		frame.getContentPane().add(status_train2);
		
		status_train3.setBounds(313, 66, 152, 14);
		frame.getContentPane().add(status_train3);
		
		status_train10.setBounds(145, 198, 131, 14);
		frame.getContentPane().add(status_train10);
		
		
		status_train11.setBounds(313, 198, 161, 14);
		frame.getContentPane().add(status_train11);
		
		
		status_train12.setBounds(484, 198, 131, 14);
		frame.getContentPane().add(status_train12);
		
		
		status_train4.setBounds(484, 66, 131, 14);
		frame.getContentPane().add(status_train4);
		
		
		status_train5.setBounds(636, 66, 138, 14);
		frame.getContentPane().add(status_train5);
		
		
		status_train13.setBounds(636, 198, 131, 14);
		frame.getContentPane().add(status_train13);
		
		
		status_train6.setBounds(799, 66, 131, 14);
		frame.getContentPane().add(status_train6);
		
		
		status_train14.setBounds(799, 198, 131, 14);
		frame.getContentPane().add(status_train14);
		
		
		status_train15.setBounds(959, 198, 120, 14);
		frame.getContentPane().add(status_train15);
		
		
		status_train16.setBounds(1116, 198, 120, 14);
		frame.getContentPane().add(status_train16);
		
		
		status_train7.setBounds(959, 66, 91, 14);
		frame.getContentPane().add(status_train7);
		
		
		status_train8.setBounds(1116, 66, 138, 14);
		frame.getContentPane().add(status_train8);
		
		seatcount_train2.setBounds(145, 116, 131, 14);
		frame.getContentPane().add(seatcount_train2);
		list_train_seatcount.add(seatcount_train1);
		list_train_seatcount.add(seatcount_train2);
		list_train_seatcount.add(seatcount_train3);
		list_train_seatcount.add(seatcount_train4);
		list_train_seatcount.add(seatcount_train5);
		list_train_seatcount.add(seatcount_train6);
		list_train_seatcount.add(seatcount_train7);
		list_train_seatcount.add(seatcount_train8);
		list_train_seatcount.add(seatcount_train9);
		list_train_seatcount.add(seatcount_train10);
		list_train_seatcount.add(seatcount_train11);
		list_train_seatcount.add(seatcount_train12);
		list_train_seatcount.add(seatcount_train13);
		list_train_seatcount.add(seatcount_train14);
		list_train_seatcount.add(seatcount_train15);
		list_train_seatcount.add(seatcount_train16);
		
		seatcount_train3.setBounds(313, 116, 131, 14);
		frame.getContentPane().add(seatcount_train3);
		
		
		seatcount_train4.setBounds(484, 116, 91, 14);
		frame.getContentPane().add(seatcount_train4);
		
		
		seatcount_train5.setBounds(636, 116, 91, 14);
		frame.getContentPane().add(seatcount_train5);
		
		
		seatcount_train6.setBounds(799, 116, 91, 14);
		frame.getContentPane().add(seatcount_train6);
		
		
		seatcount_train7.setBounds(959, 116, 91, 14);
		frame.getContentPane().add(seatcount_train7);
		
		
		seatcount_train8.setBounds(1116, 116, 91, 14);
		frame.getContentPane().add(seatcount_train8);
		
		
		seatcount_train9.setBounds(10, 248, 131, 14);
		frame.getContentPane().add(seatcount_train9);
		
		
		seatcount_train10.setBounds(145, 248, 131, 14);
		frame.getContentPane().add(seatcount_train10);
		
		
		seatcount_train11.setBounds(313, 248, 161, 14);
		frame.getContentPane().add(seatcount_train11);
		
		
		seatcount_train12.setBounds(484, 248, 91, 14);
		frame.getContentPane().add(seatcount_train12);
		
		
		seatcount_train13.setBounds(636, 248, 91, 14);
		frame.getContentPane().add(seatcount_train13);
		
		
		seatcount_train14.setBounds(799, 248, 91, 14);
		frame.getContentPane().add(seatcount_train14);
		
		
		seatcount_train15.setBounds(959, 248, 91, 14);
		frame.getContentPane().add(seatcount_train15);
		
		
		seatcount_train16.setBounds(1116, 248, 91, 14);
		frame.getContentPane().add(seatcount_train16);
		
		
		passengercount_train2.setBounds(145, 141, 131, 14);
		frame.getContentPane().add(passengercount_train2);
		list_train_passengercount.add(passengercount_train1);
		list_train_passengercount.add(passengercount_train2);
		list_train_passengercount.add(passengercount_train3);
		list_train_passengercount.add(passengercount_train4);
		list_train_passengercount.add(passengercount_train5);
		list_train_passengercount.add(passengercount_train6);
		list_train_passengercount.add(passengercount_train7);
		list_train_passengercount.add(passengercount_train8);
		list_train_passengercount.add(passengercount_train9);
		list_train_passengercount.add(passengercount_train10);
		list_train_passengercount.add(passengercount_train11);
		list_train_passengercount.add(passengercount_train12);
		list_train_passengercount.add(passengercount_train13);
		list_train_passengercount.add(passengercount_train14);
		list_train_passengercount.add(passengercount_train15);
		list_train_passengercount.add(passengercount_train16);
		
		passengercount_train3.setBounds(313, 141, 152, 14);
		frame.getContentPane().add(passengercount_train3);
		
		
		passengercount_train4.setBounds(484, 141, 131, 14);
		frame.getContentPane().add(passengercount_train4);
		
		
		passengercount_train5.setBounds(636, 141, 131, 14);
		frame.getContentPane().add(passengercount_train5);
		
		
		passengercount_train6.setBounds(799, 141, 131, 14);
		frame.getContentPane().add(passengercount_train6);
		
		
		passengercount_train7.setBounds(959, 141, 142, 14);
		frame.getContentPane().add(passengercount_train7);
		
		
		passengercount_train8.setBounds(1116, 141, 138, 14);
		frame.getContentPane().add(passengercount_train8);
		
		
		passengercount_train9.setBounds(10, 273, 131, 14);
		frame.getContentPane().add(passengercount_train9);
		
		
		passengercount_train10.setBounds(145, 273, 131, 14);
		frame.getContentPane().add(passengercount_train10);
		
		
		passengercount_train11.setBounds(313, 273, 161, 14);
		frame.getContentPane().add(passengercount_train11);
		
		
		passengercount_train12.setBounds(484, 273, 142, 14);
		frame.getContentPane().add(passengercount_train12);
		
		
		passengercount_train13.setBounds(636, 273, 153, 14);
		frame.getContentPane().add(passengercount_train13);
		
		
		passengercount_train14.setBounds(799, 273, 150, 14);
		frame.getContentPane().add(passengercount_train14);
		
		
		passengercount_train15.setBounds(959, 273, 152, 14);
		frame.getContentPane().add(passengercount_train15);
		
		
		passengercount_train16.setBounds(1116, 273, 138, 14);
		frame.getContentPane().add(passengercount_train16);
		
		JLabel lblNumberOfSeats = new JLabel("Number of Seats:");
		lblNumberOfSeats.setBounds(145, 16, 108, 14);
		frame.getContentPane().add(lblNumberOfSeats);
		
		btn_deploy_train = new JButton("Deploy New Train");

		btn_deploy_train.setBounds(484, 12, 142, 23);
		frame.getContentPane().add(btn_deploy_train);
		
		spinner_seatcount = new JSpinner(smTrain);
		spinner_seatcount.setBounds(313, 15, 46, 20);
		frame.getContentPane().add(spinner_seatcount);
		
		JLabel lblDestination = new JLabel("Destination:");
		lblDestination.setBounds(145, 314, 115, 14);
		frame.getContentPane().add(lblDestination);
		
		destinationSpinner = new JSpinner(sm);
		destinationSpinner.setBounds(291, 311, 29, 20);
		frame.getContentPane().add(destinationSpinner);
		
		list_add_passenger_btn.add(addPassenger_station1);
		list_add_passenger_btn.add(addPassenger_station2);
		list_add_passenger_btn.add(addPassenger_station3);
		list_add_passenger_btn.add(addPassenger_station4);
		list_add_passenger_btn.add(addPassenger_station5);
		list_add_passenger_btn.add(addPassenger_station6);
		list_add_passenger_btn.add(addPassenger_station7);
		list_add_passenger_btn.add(addPassenger_station8);
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("CalTrains");
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);		
		initializeGUI();
		initializeBackend();
	}
	
	public void setLogic(Simulator c) {
		this.simulator = c;
	}
	
	private void initializeBackend(){
		simulator = new Simulator();
		simulator.station_init(); // add's 2nd station to the caltrain system
		simulator.station_init(); // add's 3nd station to the caltrain system
		simulator.station_init(); // add's 4th station to the caltrain system
		simulator.station_init(); // add's 5th station to the caltrain system
		simulator.station_init(); // add's 6th station to the caltrain system
		simulator.station_init(); // add's 7th station to the caltrain system
		simulator.station_init(); // add's 8th station to the caltrain system

		simulator.setGUI(this);
		
		setLogic(simulator);
		
		addPassenger_station1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				simulator.station_wait_for_train(simulator.getStations().get(0),
						simulator.getStations().get(Integer.parseInt(destinationSpinner.getValue().toString()) - 1));
			}
		});
		
		addPassenger_station2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				simulator.station_wait_for_train(simulator.getStations().get(1),
						simulator.getStations().get(Integer.parseInt(destinationSpinner.getValue().toString()) - 1));
			}
		});
		
		addPassenger_station3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				simulator.station_wait_for_train(simulator.getStations().get(2),
						simulator.getStations().get(Integer.parseInt(destinationSpinner.getValue().toString()) - 1));
			}
		});
		
		addPassenger_station4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				simulator.station_wait_for_train(simulator.getStations().get(3),
						simulator.getStations().get(Integer.parseInt(destinationSpinner.getValue().toString()) - 1));
			}
		});
		
		addPassenger_station5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				simulator.station_wait_for_train(simulator.getStations().get(4),
						simulator.getStations().get(Integer.parseInt(destinationSpinner.getValue().toString()) - 1));
			}
		});
		
		addPassenger_station6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				simulator.station_wait_for_train(simulator.getStations().get(5),
						simulator.getStations().get(Integer.parseInt(destinationSpinner.getValue().toString()) - 1));
			}
		});
		
		addPassenger_station7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				simulator.station_wait_for_train(simulator.getStations().get(6),
						simulator.getStations().get(Integer.parseInt(destinationSpinner.getValue().toString()) - 1));
			}
		});
		
		addPassenger_station8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				simulator.station_wait_for_train(simulator.getStations().get(7),
						simulator.getStations().get(Integer.parseInt(destinationSpinner.getValue().toString()) - 1));
			}
		});
		
		btn_deploy_train.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int seatCount;
				
				seatCount = Integer.parseInt(spinner_seatcount.getValue().toString());

				simulator.station_load_train(simulator.getStations().get(0), seatCount);
			}
		});
	}
}
