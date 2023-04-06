package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {

	/**
	 * int month: the monht
	 * int day: the day
	 * int year: the year
	 * boolean isHoliday: whether or not it is a holiday
	 */
	private int month;
	private int day;
	private int year;
	private boolean isHoliday;
	
	public Date(int month, int day, int year, boolean isHoliday) {
		this.month=month;
		this.day=day;
		this.year=year;
		this.isHoliday=isHoliday;
	}
	
	public String toString() {
		return month +" / " + day + " / " + year;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}
	
	public static void main(String[] args) {
		Date jack=new Date(30, 6, 2003, false);
		Date dung =new Date(22, 11, 2003, true);
		Date riley=new Date(16,0,2004, false);
		Date j =new Date(30,6,2003, true);
		
		if (jack.equals(j)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		LinkedList<Date> list=new LinkedList<Date>();
		list.add(riley);
		list.add(jack);
		list.add(dung);
		list.add(j);
		System.out.println(list);
		
		HashSet<Date> set=new HashSet<Date>();
		set.add(riley);
		set.add(jack);
		set.add(dung);
		set.add(j);
		System.out.println(set);
		
	}
	
	
    

}
