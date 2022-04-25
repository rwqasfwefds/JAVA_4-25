package HashSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class Ex11_10 {
    public static void main(String[] args) {
        // 다형성 : 부모 Set 자식 HashSet
        Set set = new HashSet();

        for(int i = 0; set.size() < 6; i++){
            int num = (int)(Math.random() * 45) + 1;
            set.add(new Integer(num));
        }
        // Set을 이용해 중복을 다 제거 했으니 이제 LinkedList로 변환
        List list = new LinkedList(set);
        // 정렬방법 2가지
        // Arrays.sort(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
