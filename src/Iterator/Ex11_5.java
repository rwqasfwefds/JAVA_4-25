package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class Ex11_5 {
    public static void main(String[] args) {
        // 향상된 for문을 돌리기 위해선 지네릭스를 써서 무슨 타입인지 정해줘야 함
        ArrayList<String> list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        // Iterator를 이용한 for문 = 향상된 for문과 비슷
        // Iterator it = list.iterator();

        // while(it.hasNext()){
        //     Object obj = it.next();
        //     System.out.println(obj);
        // }

        // 향상된 for문
        for(String s : list){
            System.out.println(s);
        }
    }
}
