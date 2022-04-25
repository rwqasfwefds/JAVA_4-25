package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class Ex11_1 {
    public static void main(String[] args) {
        // 항상 DB, 자료구조(Collection) : CRUD
        // C : Create (자료에 넣기)
        // R : Read (자료를 읽기)
        // U : Update (일부 자료 수정하기)
        // D : Delete (자료 삭제하기)
        ArrayList list1 = new ArrayList(10);
        // ArrayList 자료구조 C : Create = add()
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1, 4));
        print(list1, list2);

        // Collections의 정적메소드 호출(클래스 메소드, 전역 메소드)
        // 전역 메소드니깐 new연산자로 인스턴스화 안 시켜도 됨
        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);

        System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");
        print(list1, list2);

        // ArrayList 자료구조 U : Update = set()
        list2.set(3, "AA");
        print(list1, list2);

        System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));

        print(list1, list2);

        for (int i = list2.size() - 1; i >= 0; i--) {
            // ArrayList 자료구조 R : Read = get()
            if (list1.contains(list2.get(i))) {
                // ArrayList 자료구조 D : Delete = remove()
                list2.remove(i);
            }
        }
        print(list1, list2);
    }

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println();
    }
}
