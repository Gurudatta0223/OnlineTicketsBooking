package com.ty;

abstract class OnlineTicketCounter {
	
	 abstract  void bookTickets(int noTickets);
	 abstract void cancelTickets(int n);
	 abstract  void checkTickets();
	  int bookedTickets;
}
