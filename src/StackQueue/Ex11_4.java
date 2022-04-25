package StackQueue;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Ex11_4 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5;

    public static void save(String input) {
        // offet : 큐에 저장
        // 빈문자를 제외한 문자열이 들어오면
        if (!"".equals(input)) {
            q.offer(input);
        }

        // 큐의 최대 크기를 제한
        if (q.size() > MAX_SIZE) {
            // 큐의 삭제 + 삭제한 자료를 반환하는 메소드(Read + Delete)
            q.remove();
        }
    }

    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        while (true) {
            System.out.println(">>");

            try {
                Scanner s = new Scanner(System.in);
                // 한 라인씩 입력받고, trim(앞 뒤 공백을 지움)
                String input = s.nextLine().trim();

                // 입력 여부 유효성 체크 : 아무 값도 없으면 위로 올림
                if ("".equals(input)) {
                    continue;
                }

                // equalsIgnoreCase 소문자든 대문자든 다 받아들임 Q를 입력하든 q를 입력하든 다 적용
                // 
                if (input.equalsIgnoreCase("q")) {
                    // 자바 프로그램 강제 정상종료 명령
                    // 즉, 무한 루프 탈출
                    System.exit(0);
                    // 입력 값이 help이면 도움말 보여주기
                } else if (input.equalsIgnoreCase("help")) {
                    System.out.println("help - 도움말을 보여줍니다.");
                    System.out.println("q 또는 Q - 프로그램을 종료합니다.");
                    System.out.println("history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
                } else if (input.equalsIgnoreCase("history")) {
                    int i = 0;
                    // 큐에 자료를 저장 : history
                    save(input);

                    // history 명령어를 입력하면
                    // 기존에 저장된 모든 명령어를 화면에 출력
                    LinkedList tmp = (LinkedList) q;
                    // 향상된 for문 같이 반복문을 돌리기위해 변형
                    ListIterator it = tmp.listIterator();

                    while (it.hasNext()) { // it 안에 자료가 없을때까지 반복
                        // next : 자료 읽고 다음으로 넘어감
                        System.out.println(++i + "." + it.next());
                    }
                } else {
                    // 명령문이니깐 자료를 모두 큐에 저장
                    save(input);
                    // 저장된 명령문 출력
                    System.out.println(input);
                }
            } catch (Exception e) {
                System.out.println("입력오류입니다.");
            }
        }

    }
}