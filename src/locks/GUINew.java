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

import zed.semaphores.Simulator;

public class GUINew {

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
	
	public static ArrayList<JLabel> list_train_status = new ArrayList<JLabel>();
	public static JLabel status_train1 = new JLabel("Status: Not Deployed");
	public static JLabel status_train2 = new JLabel("Status: Not Deployed");
	public static JLabel status_train3 = new JLabel("Status: Not Deployed");
	public static JLabel status_train4 = new JLabel("Status: Not Deployed");
	public static JLabel status_train5 = new JLabel("Status: Not Deployed");
	public static JLabel status_train6 = new JLabel("Status: Not Deployed");
	public static JLabel status_train7 = new JLabel("Status: Not Deployed");
	public static JLabel status_train8 = new JLabel("Status: Not Deployed");
	public static JLabel status_train9 = new JLabel("Status: Not Deployed");
	public static JLabel status_train10 = new JLabel("Status: Not Deployed");
	public static JLabel status_train11 = new JLabel("Status: Not Deployed");
	public static JLabel status_train12 = new JLabel("Status: Not Deployed");
	public static JLabel status_train13 = new JLabel("Status: Not Deployed");
	public static JLabel status_train14 = new JLabel("Status: Not Deployed");
	public static JLabel status_train15 = new JLabel("Status: Not Deployed");
	public static JLabel status_train16 = new JLabel("Status: Not Deployed");
	
	public static ArrayList<JLabel> list_train_location = new ArrayList<JLabel>();
	public static JLabel location_train1 = new JLabel("Location:");
	public static JLabel location_train2 = new JLabel("Location:");
	public static JLabel location_train3 = new JLabel("Location:");
	public static JLabel location_train4 = new JLabel("Location:");
	public static JLabel location_train5 = new JLabel("Location:");
	public static JLabel location_train6 = new JLabel("Location:");
	public static JLabel location_train7 = new JLabel("Location:");
	public static JLabel location_train8 = new JLabel("Location:");
	public static JLabel location_train9 = new JLabel("Location:");
	public static JLabel location_train10 = new JLabel("Location:");
	public static JLabel location_train11 = new JLabel("Location:");
	public static JLabel location_train12 = new JLabel("Location:");
	public static JLabel location_train13 = new JLabel("Location:");
	public static JLabel location_train14 = new JLabel("Location:");
	public static JLabel location_train15 = new JLabel("Location:");
	public static JLabel location_train16 = new JLabel("Location:");

	public static ArrayList<JLabel> list_train_seatcount = new ArrayList<JLabel>();
	public static JLabel seatcount_train1 = new JLabel("Seat Count: 5");
	public static JLabel seatcount_train2 = new JLabel("Seat Count: 5");
	public static JLabel seatcount_train3 = new JLabel("Seat Count: 5");
	public static JLabel seatcount_train4 = new JLabel("Seat Count: 5");
	public static JLabel seatcount_train5 = new JLabel("Seat Count: 5");
	public static JLabel seatcount_train6 = new JLabel("Seat Count: 5");
	public static JLabel seatcount_train7 = new JLabel("Seat Count: 5");
	public static JLabel seatcount_train8 = new JLabel("Seat Count: 5");
	public static JLabel seatcount_train9 = new JLabel("Seat Count: 5");
	public static JLabel seatcount_train10 = new JLabel("Seat Count: 5");
	public static JLabel seatcount_train11 = new JLabel("Seat Count: 5");
	public static JLabel seatcount_train12 = new JLabel("Seat Count: 5");
	public static JLabel seatcount_train13 = new JLabel("Seat Count: 5");
	public static JLabel seatcount_train14 = new JLabel("Seat Count: 5");
	public static JLabel seatcount_train15 = new JLabel("Seat Count: 5");
	public static JLabel seatcount_train16 = new JLabel("Seat Count: 5");
	
	public static ArrayList<JLabel> list_train_passengercount = new ArrayList<JLabel>();
	public static JLabel passengercount_train1 = new JLabel("Passenger Count: 1");
	public static JLabel passengercount_train2 = new JLabel("Passenger Count: 1");
	public static JLabel passengercount_train3 = new JLabel("Passenger Count: 1");
	public static JLabel passengercount_train4 = new JLabel("Passenger Count: 1");
	public static JLabel passengercount_train5 = new JLabel("Passenger Count: 1");
	public static JLabel passengercount_train6 = new JLabel("Passenger Count: 1");
	public static JLabel passengercount_train7 = new JLabel("Passenger Count: 1");
	public static JLabel passengercount_train8 = new JLabel("Passenger Count: 1");
	public static JLabel passengercount_train9 = new JLabel("Passenger Count: 1");
	public static JLabel passengercount_train10 = new JLabel("Passenger Count: 1");
	public static JLabel passengercount_train11 = new JLabel("Passenger Count: 1");
	public static JLabel passengercount_train12 = new JLabel("Passenger Count: 1");
	public static JLabel passengercount_train13 = new JLabel("Passenger Count: 1");
	public static JLabel passengercount_train14 = new JLabel("Passenger Count: 1");
	public static JLabel passengercount_train15 = new JLabel("Passenger Count: 1");
	public static JLabel passengercount_train16 = new JLabel("Passenger Count: 1");
	
	private final JLabel lblStationQueue = new JLabel("Station Queue Status");
	private final JLabel lblStation1Queue = new JLabel("Station 1");
	private final JLabel lblStation2Queue = new JLabel("Station 2");
	private final JLabel lblStation3Queue = new JLabel("Station 3");
	private final JLabel lblStation4Queue = new JLabel("Station 4");
	private final JLabel lblStation5Queue = new JLabel("Station 5");
	private final JLabel lblStation6Queue = new JLabel("Station 6");
	private final JLabel lblStation7Queue = new JLabel("Station 7");
	private final JLabel lblStation8Queue = new JLabel("Station 8");
	
	private final JScrollPane station1_queue_scrollpane = new JScrollPane();
	private final JScrollPane station2_queue_scrollpane = new JScrollPane();
	private final JScrollPane station3_queue_scrollpane = new JScrollPane();
	private final JScrollPane station4_queue_scrollpane = new JScrollPane();
	private final JScrollPane station5_queue_scrollpane = new JScrollPane();
	private final JScrollPane station6_queue_scrollpane = new JScrollPane();
	private final JScrollPane station7_queue_scrollpane = new JScrollPane();
	private final JScrollPane station8_queue_scrollpane = new JScrollPane();
	
	public static ArrayList<JTextArea> queue_info_list = new ArrayList<JTextArea>();
	public static JTextArea queue_info_station1 = new JTextArea();
	public static JTextArea queue_info_station2 = new JTextArea();
	public static JTextArea queue_info_station3 = new JTextArea();
	public static JTextArea queue_info_station4 = new JTextArea();
	public static JTextArea queue_info_station5 = new JTextArea();
	public static JTextArea queue_info_station6 = new JTextArea();
	public static JTextArea queue_info_station7 = new JTextArea();
	public static JTextArea queue_info_station8 = new JTextArea();

	public static ArrayList<JLabel> queue_total_list = new ArrayList<JLabel>();
	public static JLabel queue_total_station1 = new JLabel("Total: 0");
	public static JLabel queue_total_station2 = new JLabel("Total: 0");
	public static JLabel queue_total_station3 = new JLabel("Total: 0");
	public static JLabel queue_total_station4 = new JLabel("Total: 0");
	public static JLabel queue_total_station5 = new JLabel("Total: 0");
	public static JLabel queue_total_station6 = new JLabel("Total: 0");
	public static JLabel queue_total_station7 = new JLabel("Total: 0");
	public static JLabel queue_total_station8 = new JLabel("Total: 0");
	
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
	
	public static ArrayList<JTextArea> station_status_list = new ArrayList<JTextArea>();
	public static JTextArea status_station1 = new JTextArea();
	public static JTextArea status_station2 = new JTextArea();
	public static JTextArea status_station3 = new JTextArea();
	public static JTextArea status_station4 = new JTextArea();
	public static JTextArea status_station5 = new JTextArea();
	public static JTextArea status_station6 = new JTextArea();
	public static JTextArea status_station7 = new JTextArea();
	public static JTextArea status_station8 = new JTextArea();
	
	public static JButton addPassenger_station1 = new JButton("Add");
	public static JButton addPassenger_station2 = new JButton("Add");
	public static JButton addPassenger_station3 = new JButton("Add");
	public static JButton addPassenger_station4 = new JButton("Add");
	public static JButton addPassenger_station5 = new JButton("Add");
	public static JButton addPassenger_station6 = new JButton("Add");
	public static JButton addPassenger_station7 = new JButton("Add");
	public static JButton addPassenger_station8 = new JButton("Add");
	
	public Simulator c;
	
	public GUINew() {
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
		
		lblStationQueue.setBounds(10, 298, 120, 14);
		frame.getContentPane().add(lblStationQueue);
		
		lblStation1Queue.setBounds(10, 314, 120, 14);
		frame.getContentPane().add(lblStation1Queue);
		
		lblStation2Queue.setBounds(150, 314, 115, 14);
		frame.getContentPane().add(lblStation2Queue);
		
		lblStation3Queue.setBounds(313, 314, 120, 14);
		frame.getContentPane().add(lblStation3Queue);
		
		lblStation4Queue.setBounds(484, 314, 120, 14);
		frame.getContentPane().add(lblStation4Queue);
		
		lblStation5Queue.setBounds(636, 314, 120, 14);
		frame.getContentPane().add(lblStation5Queue);
		
		lblStation6Queue.setBounds(799, 314, 120, 14);
		frame.getContentPane().add(lblStation6Queue);
		
		lblStation7Queue.setBounds(959, 314, 120, 14);
		frame.getContentPane().add(lblStation7Queue);
		
		lblStation8Queue.setBounds(1116, 314, 120, 14);
		frame.getContentPane().add(lblStation8Queue);
		
		
		station1_queue_scrollpane.setBounds(10, 339, 120, 80);
		frame.getContentPane().add(station1_queue_scrollpane);
		station1_queue_scrollpane.setViewportView(queue_info_station1);
		
		station2_queue_scrollpane.setBounds(145, 339, 120, 80);
		frame.getContentPane().add(station2_queue_scrollpane);
		station2_queue_scrollpane.setViewportView(queue_info_station2);
		
		station3_queue_scrollpane.setBounds(313, 339, 120, 80);
		frame.getContentPane().add(station3_queue_scrollpane);
		station3_queue_scrollpane.setViewportView(queue_info_station3);
		
		station4_queue_scrollpane.setBounds(484, 339, 120, 80);
		frame.getContentPane().add(station4_queue_scrollpane);
		station4_queue_scrollpane.setViewportView(queue_info_station4);
		
		station5_queue_scrollpane.setBounds(636, 339, 120, 80);
		frame.getContentPane().add(station5_queue_scrollpane);
		station5_queue_scrollpane.setViewportView(queue_info_station5);
		
		station6_queue_scrollpane.setBounds(799, 339, 120, 80);
		frame.getContentPane().add(station6_queue_scrollpane);
		station6_queue_scrollpane.setViewportView(queue_info_station6);
		
		station7_queue_scrollpane.setBounds(959, 339, 120, 80);
		frame.getContentPane().add(station7_queue_scrollpane);
		station7_queue_scrollpane.setViewportView(queue_info_station7);
		
		station8_queue_scrollpane.setBounds(1116, 339, 120, 80);
		frame.getContentPane().add(station8_queue_scrollpane);
		station8_queue_scrollpane.setViewportView(queue_info_station8);
		
		
		queue_total_station1.setBounds(10, 430, 120, 14);
		frame.getContentPane().add(queue_total_station1);
		queue_total_list.add(queue_total_station1);
		
		queue_total_station2.setBounds(145, 430, 131, 14);
		frame.getContentPane().add(queue_total_station2);
		queue_total_list.add(queue_total_station2);
		
		queue_total_station3.setBounds(313, 430, 120, 14);
		frame.getContentPane().add(queue_total_station3);
		queue_total_list.add(queue_total_station3);
		
		queue_total_station4.setBounds(484, 430, 131, 14);
		frame.getContentPane().add(queue_total_station4);
		queue_total_list.add(queue_total_station4);
		
		queue_total_station5.setBounds(636, 430, 120, 14);
		frame.getContentPane().add(queue_total_station5);
		queue_total_list.add(queue_total_station5);
		
		queue_total_station6.setBounds(799, 430, 120, 14);
		frame.getContentPane().add(queue_total_station6);
		queue_total_list.add(queue_total_station6);
		
		queue_total_station7.setBounds(959, 430, 120, 14);
		frame.getContentPane().add(queue_total_station7);
		queue_total_list.add(queue_total_station7);
		
		queue_total_station8.setBounds(1116, 430, 120, 14);
		frame.getContentPane().add(queue_total_station8);
		queue_total_list.add(queue_total_station8);
		
		lblStationStatus.setBounds(10, 455, 131, 14);
		frame.getContentPane().add(lblStationStatus);
		
		station1_status_scrollpane.setBounds(10, 500, 250, 66);
		frame.getContentPane().add(station1_status_scrollpane);
		station1_status_scrollpane.setViewportView(status_station1);
		station_status_list.add(status_station1);
		
		station2_status_scrollpane.setBounds(354, 500, 250, 66);
		frame.getContentPane().add(station2_status_scrollpane);
		station2_status_scrollpane.setViewportView(status_station2);
		station_status_list.add(status_station2);
		
		station3_status_scrollpane.setBounds(669, 500, 250, 66);
		frame.getContentPane().add(station3_status_scrollpane);
		station3_status_scrollpane.setViewportView(status_station3);
		station_status_list.add(status_station3);
		
		station4_status_scrollpane.setBounds(986, 500, 250, 66);
		frame.getContentPane().add(station4_status_scrollpane);
		station4_status_scrollpane.setViewportView(status_station4);
		station_status_list.add(status_station4);
		
		station5_status_scrollpane.setBounds(986, 604, 250, 66);
		frame.getContentPane().add(station5_status_scrollpane);
		station5_status_scrollpane.setViewportView(status_station5);
		station_status_list.add(status_station5);
		
		station6_status_scrollpane.setBounds(669, 604, 250, 66);
		frame.getContentPane().add(station6_status_scrollpane);
		station6_status_scrollpane.setViewportView(status_station6);
		station_status_list.add(status_station6);
		
		station7_status_scrollpane.setBounds(357, 604, 250, 66);
		frame.getContentPane().add(station7_status_scrollpane);
		station7_status_scrollpane.setViewportView(status_station7);
		station_status_list.add(status_station7);
		
		station8_status_scrollpane.setBounds(10, 604, 250, 66);
		frame.getContentPane().add(station8_status_scrollpane);
		station8_status_scrollpane.setViewportView(status_station8);
		station_status_list.add(status_station8);
		
		lblStationStatus1.setBounds(10, 480, 131, 14);
		frame.getContentPane().add(lblStationStatus1);
		
		lblStationStatus2.setBounds(354, 480, 120, 14);
		frame.getContentPane().add(lblStationStatus2);
		
		lblStationStatus3.setBounds(669, 475, 120, 14);
		frame.getContentPane().add(lblStationStatus3);
		
		lblStationStatus4.setBounds(986, 475, 125, 14);
		frame.getContentPane().add(lblStationStatus4);
		
		lblStationStatus5.setBounds(986, 579, 115, 14);
		frame.getContentPane().add(lblStationStatus5);
		
		lblStationStatus6.setBounds(669, 579, 120, 14);
		frame.getContentPane().add(lblStationStatus6);
		
		lblStationStatus7.setBounds(354, 579, 120, 14);
		frame.getContentPane().add(lblStationStatus7);
		
		lblStationStatus8.setBounds(10, 579, 120, 14);
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
		addPassenger_station4.setBounds(544, 310, 60, 23);
		frame.getContentPane().add(addPassenger_station4);
		

		
		addPassenger_station5.setBounds(698, 310, 60, 23);
		frame.getContentPane().add(addPassenger_station5);
		
		
		addPassenger_station3.setBounds(371, 310, 60, 23);
		frame.getContentPane().add(addPassenger_station3);
		
		
		addPassenger_station2.setBounds(214, 310, 60, 23);
		frame.getContentPane().add(addPassenger_station2);
		
		
		addPassenger_station1.setBounds(70, 310, 60, 23);
		frame.getContentPane().add(addPassenger_station1);
		
		
		addPassenger_station6.setBounds(859, 310, 60, 23);
		frame.getContentPane().add(addPassenger_station6);
		
		
		addPassenger_station7.setBounds(1019, 310, 60, 23);
		frame.getContentPane().add(addPassenger_station7);
		
		
		addPassenger_station8.setBounds(1176, 310, 60, 23);
		frame.getContentPane().add(addPassenger_station8);
		
		JButton btnRunSimulator = new JButton("Run Simulator");
		btnRunSimulator.setBounds(636, 12, 131, 23);
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
		
		JButton btn_deploy_train = new JButton("Deploy New Train");
		btn_deploy_train.setBounds(484, 12, 120, 23);
		frame.getContentPane().add(btn_deploy_train);
		
		JSpinner spinner_seatcount = new JSpinner();
		spinner_seatcount.setBounds(313, 15, 46, 20);
		frame.getContentPane().add(spinner_seatcount);
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
	
	private void initializeBackend(){
		c = new Simulator();
		c.station_init(); // add's 2nd station to the caltrain system
		c.station_init(); // add's 3nd station to the caltrain system
		c.station_init(); // add's 4th station to the caltrain system
		c.station_init(); // add's 5th station to the caltrain system
		c.station_init(); // add's 6th station to the caltrain system
		c.station_init(); // add's 7th station to the caltrain system
		c.station_init(); // add's 8th station to the caltrain system
		
		c.setGUITwo(this);
	}
}
