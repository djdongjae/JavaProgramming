package hansotbap.suhyeon.hw10_3;
/*
파일명:hw10_3.java
작성자:201914009 김수현
작성일:4/6
내용 : 람다식과 함수형 인터페이스를 활용한 신장,체중 평균 구하는 프로그램
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;


public class hw10_3{
    public static void main(String[] args) {
        Double height_all=0.0;
        Double weight_all=0.0;
        for(Person i : Person.persons){
            height_all += i.getHeight();
            weight_all += i.getWeight();
        }
        System.out.println("hw10_3: 김수현");
        System.out.println("평균 신장 : " + average(Person.persons.size(),height_all,(a,b)->b/a));
        System.out.println("평균 체중 : " + average(Person.persons.size(),weight_all,(a,b)->b/a));
    }

    public static double average(int l,Double h, BiFunction<Integer,Double,Double> f) {
        Double res = f.apply(l,h);
        return res;

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
