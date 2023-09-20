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


fun main(args: Array<String>) {
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


