package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Time {

	/**
	 * int hour: the hour 
	 * int minute: the minute
	 * boolean format: if true, 24 hour time; if false, 12 hour time
	 */
	private int hour;
	private int minute;
	private boolean format;
	
	public Time(int hour, int minute, boolean format) {
		this.hour=hour;
		this.minute=minute;
		this.format=format;
	}
	public  boolean getFormat() {
		return this.format;
	}
	public int getHour() {
		return this.hour;
	}
	
	public String toString() {
		if (format == true) {
			return hour + " : " +minute;
		}
		else {
			if (hour<12)
				return hour + " : " + minute;
			else
				return hour-12 + " : " + minute;
		}
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}
	
	public static void main(String[] args) {
		Time a=new Time(11, 37, false);
		Time b=new Time(4, 16, true);
		Time c=new Time(11,37,true);
		
		LinkedList<Time> list=new LinkedList<Time>();
		list.add(a);
		list.add(b);
		list.add(c);
		System.out.println(list);
		
		HashSet<Time> set=new HashSet<Time>();
		set.add(a);
		set.add(b);
		set.add(c);
		System.out.println(set);
	}
	
}