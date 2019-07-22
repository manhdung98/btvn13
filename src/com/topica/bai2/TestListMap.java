package com.topica.bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestListMap {
	
	public static long SumOfPrice(List<Hosting> list) {
		return list.stream().map(Hosting::getPrice).collect(
				Collectors.summingLong(Long::longValue));
	}
	
	public static Map<String, Long> convert(List<Hosting> list, long minPrice){
		Map<String, Long> map = list.stream().filter(host-> host.getPrice() >= minPrice)
				.collect(
	            Collectors.toMap(Hosting::getName, Hosting::getPrice));
		
		return map;
	}
	
	
	
	public static int countHosting(List<Hosting> list, long minPrice) {
		return (int) list.stream().filter(car -> car.getPrice() >= minPrice).count();
	}
	
	
	public static void main(String[] args) {
		int minPrice = 100000;
        List<Hosting> list = new ArrayList<>();
        list.add(new Hosting(1, "google.com", 80000));
        list.add(new Hosting(2, "youtube.com", 90000));
        list.add(new Hosting(3, "amazon.com", 120000));
        list.add(new Hosting(4, "twich.tv", 200000));
        list.add(new Hosting(5, "haivlcom", 100000));
        
        System.out.println(TestListMap.SumOfPrice(list));
        System.out.println(TestListMap.countHosting(list, minPrice));
        System.out.println(TestListMap.convert(list, minPrice));
        
    }
}
