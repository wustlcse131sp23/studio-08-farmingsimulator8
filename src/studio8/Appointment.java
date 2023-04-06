package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Appointment {

	private Date date;
	private Time time;
	
	public Appointment(Date date, Time time) {
		this.date=date;
		this.time=time;
	}
	public Time getTime() {
		return this.time;
	}
	public Date getDate() {
		return this.date;
	}
	
	public String toString() {
		return this.getTime() + " ; " + this.getDate();		
	}
	
	public static void main(String[] args) {
		Time a=new Time(11, 37, false);
		Time b=new Time(4, 16, true);
		Time c=new Time(11,37,true);
		
		Date jack=new Date(30, 6, 2003, false);
		Date dung =new Date(22, 11, 2003, true);
		Date riley=new Date(16,0,2004, false);
		Date j =new Date(30,6,2003, true);
		
		Appointment e=new Appointment(riley, a);
		Appointment f=new Appointment(jack,b);
		Appointment g=new Appointment(j,b);
		Appointment h=new Appointment (dung,a);
		
	/*	LinkedList<Appointment> list=new LinkedList<Appointment>();
		list.add(e);
		list.add(f);
		list.add(g);
		list.add(h);
		System.out.println(list);*/
		
		HashSet<Appointment> calendar=new HashSet<Appointment>();
		calendar.add(e);
		calendar.add(f);
		calendar.add(g);
		calendar.add(h);
		System.out.println(calendar);
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}

	
}
