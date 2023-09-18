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
    open fun members() {
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


fun main(args: Array<String>) {
    T1Members().members()
    GENMembers().members()
    GEN().members()
    //Hashmap(Hash 기법을 활용해서 데이터를 보관하는 자료 구조)와 Map의 차이점?
    //ㄴ다양한 길이를 가진 데이터를 고정된 길이를 가진 데이터로 매핑한 값(더 빠른 속도로 처리 가능)
    // lateinit은 초기화 이후에 값을 변경할수 있지만 lazy는 불가능.
    val DRX = LCKteam().apply {
        name = "DRX"
        place = 6
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


