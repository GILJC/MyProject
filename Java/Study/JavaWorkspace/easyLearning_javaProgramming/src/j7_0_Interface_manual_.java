
// 인터페이스를 상속하려면 extends 키워드를 사용한다.
interface 자식인터페이스 extends 부모인터페이스 {
}

// 인터페이스를 구현하려면 implements 키워드를 사용한다.
class 자식클래스 implements 부모인터페이스 {
}

//상속할 인터페이스가 여러 개라면 쉼포(,)로 연결한다.
interface 자식인터페이스 extends 부모인터페이스1, 부모인터페이스2 {
}

class 자식클래스 implements 부모인터페이스1, 부모인터페이스2 {
}

// 인터페이스는 다중 상속할 수 있다.
class 자식클래스 extends 브모클래스 implements 부모인터페이스1, 부모인터페이스2 {
}

// 클래스는 다중 상속할 수 없다.
class 자식클래스 extends 부모클래스1,부모클래스2
{		->  (X)
}
