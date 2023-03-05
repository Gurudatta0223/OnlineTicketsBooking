package com.ty;

import java.util.Scanner;

public class IRTCT {
	public static void main(String[] args) {
		
		Scanner As=new Scanner(System.in);
		System.out.println("Welcome to IRTCT");
		
		while(true) {
			System.out.println("1.Booking Tickets\n2.Cancel Tickets \n3.Check No Tickets available\n4.No Of Tickets Booked\n5.Exit");
			
			System.out.println("Enter Your Choice from list");
			int ch=As.nextInt();
		switch(ch) {

		case 1:System.out.println("Enter No of Tickets to Booking");
			int tickets=As.nextInt();
			OnlineTicketCounterimpl.bookTickets(tickets);
		break;

		case 2:System.out.println("Enter No of Tickets to Canceling");
			int ctickets=As.nextInt();
			OnlineTicketCounterimpl.cancelTickets(ctickets);
		break;

		case 3:	OnlineTicketCounterimpl.checkTickets();
		break;

		case 4:System.out.println("No of Tickets Booked: "+OnlineTicketCounterimpl.bookedTickets);
		break;

		case 5: System.out.println("Thank you ");
			System.exit(0);

		default: System.out.println("your choice is not in the list");
			
		}
			System.out.println("----------------------------");
		}
	}
}
