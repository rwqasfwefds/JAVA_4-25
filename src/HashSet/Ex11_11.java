package HashSet;

import java.util.HashSet;
import java.util.Objects;

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name + ":" + age;
    }

    // 객체 중복을 제거하려면 equals와 hashCode 오버라이딩이 필요
    public boolean equals(Object obj){
        // Person이 아니면 메소드 탈출(종료)
        if(!(obj instanceof Person)){
            return false;
        }
        // Person 형변환 가능
        Person p = (Person)obj;
        // true를 리턴하면 중복이라는 말임
        return name.equals(p.name) && age == p.age;
    }

    public int hashCode(){
        // 매개변수에 들어있는 놈들로 주소를 하나 내줌
        // 그러니깐 예를들어 첫 번째 Person을 생성할때 생성자에 "David"와 10을 넣으면
        // 이 리턴값으로 "David"와 10이 있는 해쉬코드 즉 주소를 하나 생성해줌
        // 근데 만약 이 첫번째 주소가 "0x10"이라는 주소를 받았는데
        // 두 번째 생성자에서도 똑같이 생성자에 생성자에 "David"와 10을 넣으면
        // 이미 "David"와 10가 만들어진 주소가 있잖슴?
        // 그러면 두개가 동시에 들어가게 되버리면 하나는 쫑나잖아
        // 그래서 이건 판단할 때 써야되는거임
        // 이 메소드는 두 개의 생성자의 주소값을 비교함
        return Objects.hash(name, age);
    }
}

@SuppressWarnings({ "unchecked", "rawtypes" })
public class Ex11_11 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("abc");
        set.add("abc");
        set.add(new Person("David", 10));
        set.add(new Person("David", 10));

        System.out.println(set);
    }
}
