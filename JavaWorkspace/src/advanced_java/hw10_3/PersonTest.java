package advanced_java.hw10_3;

//***************************
//파일명: PersonTest.java
//작성자: 201914089 오동재
//작성일: 2023-04-06
//내용: hw10_3
//***************************

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class PersonTest {
    public static void main(String[] args) {
    	
    	double heightTotal = 0;
    	double weightTotal = 0;
    	int length = Person.persons.size();
    	
    	List<Person> list = Person.persons;
    	
    	for(Person p : list) {
    		heightTotal += p.getHeight();
    		weightTotal += p.getWeight();
    	}
    	
        System.out.println("평균 신장 : " + average(heightTotal, length, (t, l) -> (t / l)));
        System.out.println("평균 체중 : " + average(weightTotal, length, (t, l) -> (t / l)));
    }

    public static double average(Double total, int length, BiFunction<Double, Integer, Double> bifunction) {
    	return bifunction.apply(total, length);
    }
}

class Person {
    private String name;
    private int height, weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + "(" + height + ", " + weight + ")";
    }

    static List<Person> persons = Arrays.asList(
            new Person("황진이", 160, 45), new Person("이순신", 180, 80),
            new Person("김삿갓", 175, 65), new Person("홍길동", 170, 68),
            new Person("배장화", 155, 48)
    );
}