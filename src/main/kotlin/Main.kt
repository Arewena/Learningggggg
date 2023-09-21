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


    var team: LCKteam? = null
    //https://kotlinworld.com/255



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


