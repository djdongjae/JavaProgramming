package data_structure.test;

import java.util.Calendar;

public class Calendar1 {

    /*
     * 달력 출력
     *
     * firstDayOfWeek: 1일의 요일
     *    월:1, 화:2, 수:3, 목:4, 금:5, 토:6, 일:7
     *
     * lastDay: 마지막 날짜
     */
    static void printCalendar(int firstDayOfWeek, int lastDay) {
    	for(int i=0; i<(firstDayOfWeek-1); i++) {
    		System.out.print("   ");
    	}
    	for(int i=0; i<(8-firstDayOfWeek); i++) {
    		System.out.print(i+1 + "  ");
    	}
    	System.out.println();
    	int count = 1;
    	for(int j=(9-firstDayOfWeek); j<=lastDay; j++) {
    		if(count <= 7) {
    			if(j < 10) {
    				System.out.print(j + "  ");
    			} else {
    				System.out.print(j + " ");
    			}
    			count += 1;
    		} else {
    			System.out.println();
    			if(j < 10) {
    				System.out.print(j + "  ");
    			} else {
    				System.out.print(j + " ");
    			}
    			count = 2;
    		}
    	}
    }

    public static void main(String[] args) {
        // 2015년 7월
        int year = 2015, month = 7;

        // 2015년 7월 1일의 요일 구하기
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1, 0, 0);
        int 요일 = calendar.get(Calendar.DAY_OF_WEEK);

        // 2015년 7월의 마지막 날짜 구하기
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.DATE, -1);
        int 마지막날 = calendar.get(Calendar.DATE);

        // 달력 출력
        printCalendar(요일, 마지막날);
    }
}