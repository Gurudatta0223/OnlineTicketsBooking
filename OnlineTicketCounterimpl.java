package com.ty;

public class OnlineTicketCounterimpl {

	static int noOfTickets=100;

	static void checkTickets() {
		System.out.println("No of tickets available: "+noOfTickets);
	}
	static int bookedTickets;

	static void bookTickets(int noTickets) {

		if(noTickets<noOfTickets) {
			System.out.println("Tickets Booked successfully");
			noOfTickets-=noTickets;
			bookedTickets+=noTickets;
		}
		else {
			try {
				String message=noTickets+" No Of Tickets Not Available";
				throw new InsufficientTickets(message);
			}
			catch(RuntimeException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	static void cancelTickets(int n) {
		if(bookedTickets>n) {
			noOfTickets+=n;
			System.out.println("Tickets cancel Successfully");
			bookedTickets-=n;
		}
		else {
			try {
				String message=n+" No Of Tickets Not booked you";
				throw new InsufficientTickets(message);
			}
			catch(RuntimeException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
