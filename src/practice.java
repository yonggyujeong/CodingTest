

import java.util.*;

class practice{
    public static void main(String args[]){

        // Array장점 + List 장점 -> 유연하고 빠르게 값을 찾을 수 있음
        // Map : key -> hasp function -> hash -> bucket index -> List -> 데이터 저장
        // hashMap -> not synchronized -> 스레드 safe 한 구현이 필요하지 않다면 -> 싱글스레드환경
        // hashtable -> synchronized -> 멀티스레드환경

        // map은 인터페이스
        // hashtable, hashMap 은 클래스
        Map<String, Integer> map = new Hashtable<>();
        map.put("A", 1);
        map.put("B", 2);
        map.putIfAbsent("A", 2);
        map.containsKey("A");
        map.size();
        map.remove("A");
        map.replace("A", 1);
        System.out.println(map.getOrDefault("C", -1));
        System.out.println(map);




    }
}


