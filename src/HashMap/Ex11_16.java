package HashMap;

import java.util.*;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Ex11_16 {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        // HashMap 자료를 저장하는 메소드(키, 값) : Create
        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234");

        Scanner s = new Scanner(System.in);

        while(true)
        {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");

            // 입력값의 앞 뒤 공백 제거
            String id = s.nextLine().trim();

            System.out.print("password : ");
            // 입력값의 앞 뒤 공백 제거 : 같은것 비교할 때 공백이 있으면 안됨
            String password = s.nextLine().trim();
            System.out.println();

            // HashMap 자료구조의 키값이 있는지 확인하는 메소드
            // 있으면 true , 없으면 false 
            if(!map.containsKey(id))
            {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue; // 아래 로직 실행 안시키고 반복문 재 실행
            }

            // id 있으면 패스워드 같은지 체크
            // get : 매개변수 key(id)를 넣으면 HashMap의 값(password)
            if(!(map.get(id)).equals(password))
            {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            }
            else
            {
                System.out.println("id와 비밀번호가 일치합니다.");
                break; // 무한루프 종료
            }
        }
    }
}