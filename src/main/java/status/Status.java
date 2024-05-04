// IT22070876
// Mathota Arachchi S S
// Group 7.1

package status;

public class Status {
	private String statusid;
	private String tour;
	private String accomodation;
	private String transport;
	private String itinerary;
	
	public Status(String statusid, String tour, String accomodation, String transport, String itinerary) {
		
		this.statusid = statusid;
		this.tour = tour;
		this.accomodation = accomodation;
		this.transport = transport;
		this.itinerary = itinerary;
	}

	public String getStatusid() {
		return statusid;
	}


	public String getTour() {
		return tour;
	}


	public String getAccomodation() {
		return accomodation;
	}


	public String getTransport() {
		return transport;
	}


	public String getItinerary() {
		return itinerary;
	}
}