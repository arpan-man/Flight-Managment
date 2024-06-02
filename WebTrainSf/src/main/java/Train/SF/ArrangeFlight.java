package Train.SF;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;

@JsonAutoDetect
public class ArrangeFlight {
	private String flightname;
	private String depfrom;
	private String depto;
	private String leavedate;
	private String departuretime;
	private String arrivaltime;
	private String numofseats;
	private String costperseat;

	ArrangeFlight() {
	}

	@JsonCreator
	public static ArrangeFlight newInstance() {
		return new ArrangeFlight();
	}

	public String getFlightname() {
		return flightname;
	}

	public String getDepfrom() {
		return depfrom;
	}

	public String getDepto() {
		return depto;
	}

	public String getLeavedate() {
		return leavedate;
	}

	public String getDeparturetime() {
		return departuretime;
	}

	public String getArrivaltime() {
		return arrivaltime;
	}

	public String getNumofseats() {
		return numofseats;
	}

	public String getCostperseat() {
		return costperseat;
	}

	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}

	public void setDepfrom(String depfrom) {
		this.depfrom = depfrom;
	}

	public void setDepto(String depto) {
		this.depto = depto;
	}

	public void setLeavedate(String leavedate) {
		this.leavedate = leavedate;
	}

	public void setDeparturetime(String departuretime) {
		this.departuretime = departuretime;
	}

	public void setArrivaltime(String arrivaltime) {
		this.arrivaltime = arrivaltime;
	}

	public void setNumofseats(String numofseats) {
		this.numofseats = numofseats;
	}

	public void setCostperseat(String costperseat) {
		this.costperseat = costperseat;
	}

}