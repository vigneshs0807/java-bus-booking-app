package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import week4.Passanger;

public class BusBook {
	
	static int totalseats=4, upper=2, lower=2, id=0;
	static List<Passenger>booked=new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("1.Book Ticket \n 2.Cancel Ticket \n 3.View Ticked");
			Scanner s=new Scanner(System.in);
			int choice=s.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter name:");
				String name=s.next();
				System.out.println("Enter Berth:");
				String berth=s.next();
				Passenger p = new Passenger(++id,name,Berth.valueOf(berth));
				bookTicket(p);
				break;
			
			case 2:
				System.out.println("Enter Passenger id:");
				int pid=s.nextInt();
				cancelTicket(pid);
				break;
				
			case 3:
				System.out.println("Enter Passanger id:");
				int viewid=s.nextInt();
				List<Passenger>filterPass=booked.stream().filter(e->e.getPid() ==viewid).collect(Collectors.toList());
				System.out.println(filterPass);
				break;
				
			}
		}

	}

	

	private static void cancelTicket(int pid) {
		// TODO Auto-generated method stub
		for(Passenger p:booked) {
			booked.remove(p);
			System.out.println("Ticket Cancelled");
			return;
		}
		
	}

	private static void bookTicket(Passenger p) {
		// TODO Auto-generated method stub
		if(p.getPrefBerth()==Berth.UPPER && upper>0) {
			p.setAllocatedBerth(Berth.UPPER);
			upper--;
		}
		else if(p.getPrefBerth()==Berth.LOWER && lower>0) {
			p.setAllocatedBerth(Berth.LOWER);
			lower--;
		}
		else {
			System.out.println("No Seats Available");
			return;
		}
		booked.add(p);
		System.out.println("Ticket Booked "+ p.getPid());
		
		
		}

}
