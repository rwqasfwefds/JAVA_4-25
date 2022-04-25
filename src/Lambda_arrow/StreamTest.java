package Lambda_arrow;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class StreamTest {
    public static void main(String[] args) {
        String[] strArr = {"data1", "data2", "data3"};

        // 향상 된 for문
        // for(String str : strArr){
        //     System.out.println(str);
        // }

        // stream을 이용해서 코드를 더 줄여보자
        // stream : java에서의 함수형 프로그래밍

        // 1, 2, 3은 원래 배열형태인데 Arrays.asList를 쓰면
        // List로 변환 한 마디로 "Array를 List로 변환"
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<String> strList = Arrays.asList("Hwang", "Hong", "Kang");

        // 지나가면서 정렬방법 정리 : 2가지
        Arrays.sort(strArr); // 매개변수에 배열형태로 들어가야 됨
        Collections.sort(strList); // Collections.sort()는 매개변수에 자료구조 형태로 들어가야 됨

        // forEach 사용
        // 스트림으로 바꾼 자료형을 단순 출력
        System.out.println("====== forEach ======");
        strList.stream().sorted().forEach(x -> System.out.println(x));

        // filter 사용
        // 스트림 요소마다 비교문을 만족(true)하는 요소로 구성된 자료를 반환
        System.out.println("====== filter ======");
        intList.stream().filter(x -> x <= 2).forEach(System.out::println);

        // map 사용
        // 스트림의 각 요소마다 수행할 연산을 구현할 때 사용
        System.out.println("====== map ======");
        intList.stream().map(x -> x * x).forEach(System.out::println);

        // limit 사용
        // 요소의 건수를 추출(2건만 추출)
        System.out.println("====== limit ======");
        intList.stream().limit(2).forEach(System.out::println);

        // Skip 사용
        // 시작부터 그 인덱스까지를 제외하고 새로운 스트림을 생성
        System.out.println("====== Skip ======");
        intList.stream().skip(2).forEach(System.out::println);

        // sorted 사용
        // 정렬하는 메소드로 기본적으로 오름차순으로 정렬
        System.out.println("====== sorted(오름차순) ======");
        Arrays.asList(1, 4, 3, 2).stream().sorted().forEach(System.out::println);

        System.out.println("====== sorted(내림차순) ======");
        Arrays.asList(1, 4, 3, 2).stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
