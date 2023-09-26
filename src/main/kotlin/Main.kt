import java.util.Dictionary

class Challengers {
    companion object {

        val team = "DRX Challengers"
        fun players() {
            println("DRX Deokdam")
        }
    }
}



class LCKteam {
    var name = ""
    var place = 0
}

abstract class T1 {
    abstract fun members()
}

open class GEN {
    var before: String  = "SSG"
        set(value) {
            field = value
            println(field)
        }
        get() {
            println("호출됨")
            return field
        }
    open fun members() {
        before = "123"
        println("Doran, Peanut, Chovy, Peyz")
    }
}

class T1Members : T1() {

    override fun members() {
        println("Zeus, Oner, Faker, Gumayusi, Keria")
    }
}

//제네릭
//(E -> Element), (K -> Key), (N -> Number), (T -> Type), (V -> Value)
class Gene<T> (val t: T) {
    val arr1: Array<String> = arrayOf("IU가", "뭐하는", "아이유?")
    val arr2: Array<String?> = arrayOf("총을", "대충쏘면", "설렁탕") //Nullable
}

class GENMembers : GEN() {
    override fun members() {
        println("Doran, Peanut, Chovy, Peyz, Delight")
    }
}

data class Roster(var name: String, var number: Int)

enum class DplusKIA {
    CANNA, CANYON, SHOWMAKER, DEFT, KELLIN
}

//Public 생략 가능, 어디에서나 접근 가능
public class A() { fun printA() {println("a")} }

//같은 모듈안에서만 접근 가능(큰 프로젝트 아니면 잘 안씀)
internal class B() {fun printB() {println("b")}}

//하위 클래스 안에서만 접근 가능 (최상위 선언에 적용 불가
//protected class C() {fun printC() {println("c")}}

//같은 파일 내에서만 접근가능
private  class D() {fun printD() {println("d")}}


fun main(args: Array<String>) {

    val add = {x: Int, y: Int -> x + y}
    println(add(1, 2))

    for (member in DplusKIA.entries) {println(member.toString())}

    //반복문 개념?
    repeat(5) { index ->
        println("T1WIN $index")
    }

    T1Members().members()
    GENMembers().members()
    GEN().members()
    //Hashmap(Hash 기법을 활용해서 데이터를 보관하는 자료 구조)와 Map의 차이점?
    //ㄴ다양한 길이를 가진 데이터를 고정된 길이를 가진 데이터로 매핑한 값(더 빠른 속도로 처리 가능)
    // lateinit은 초기화 이후에 값을 변경할수 있지만 lazy는 불가능.

    val place = listOf("KT", "GEN", "HLE", "DK", "T1") // 수정 불가능
    val playOff = mutableListOf("GEN", "T1", "KT", "HLE", "DK") //수정 가능

    val mapPlace = mapOf(1 to "KT", 2 to "GEN", 3 to "HLE", 4 to "DK", 5 to "T1") // Py의 dict랑 똑같은 개념
    val poPlace = mutableMapOf(1 to "GEN", 2 to "T1", 3 to "KT", 4 to "HLE", 5 to "DK")

    val setPlace = setOf("KT", "GEN", "HLE", "DK", "T1") // 중복 허용 안함, Py의 set과 똑같은 개념
    val setPo = mutableSetOf("GEN", "T1", "KT", "HLE", "DK")



    val DK = Roster("", 0)
    val result = DK.apply {
        name = "CCSDK"
        number = 5
    }

    val DRX = run {
        val name = "RCFPB"
        val number = 5
        Roster(name, number)
    }

    val KT = Roster("", 0)
    val rKT = KT.let {
        it.name = "KCBAL"
        it.number = 5
        it
    }

    //Data Destructing
    //주 생성자의 프로퍼티의 대해 컴파일러가 알아서 Component를 만들어줌
    //https://velog.io/@vov3616/Android-Destructuring-%EC%9E%90%EC%84%B8%ED%9E%88-%EC%95%8C%EC%95%84%EB%B3%B4%EC%9E%90
    //keeping in mind having maintainable code has higher priority than writing less boilerplate or syntactic sugar

    //위치를 기반으로 참조하기 때문에 새 코드의 추가에 유의할것
    fun DestrutingExample(): Pair<Int, String> {return (Pair(1, "123"))}

    val (name, number) = result
    val (num, str) = DestrutingExample() //함수 리턴값으로도 사용 가능
    println("$num, $str")
    println("$name, $number")


    var team: LCKteam? = null



    lateinit var text: String
    val textLength: Int by lazy {
        text.length
    }
    text = "this is a text"
    println(textLength)

//    val NS = Challengers.team
//    println(NS)
//    Challengers.players()
}


