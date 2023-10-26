const val HERO_NAME = "Madrigal"
         //ИМЯ ГЕРОЯ
var playerLevel = 5
    //Уровень игрока

fun main() {
    println("The hero announces her presence to the world.")
            //«Герой объявляет миру о своем присутствии».

    println(HERO_NAME)
    println(playerLevel)

    val hasBefriendedBarbarians = true
        //подружился с варварами
    val hasAngeredBarbarians = false
        //разозлил варваров
    val playerClass = "paladin"
        //Класс игрока
    val quest: String = obtainQuest(playerLevel, hasAngeredBarbarians,
        hasBefriendedBarbarians, playerClass)
    println("The hero approaches the bounty board. It reads:")
    //«Герой приближается к доске с наградами. На ней написано:»
    println(quest)

    println("Time passes...")
    //"Время проходит..."
    println("The hero returns from her quest.")
    //«Герой возвращается со своих поисков».

    playerLevel +=1
    println(playerLevel)
    }

//
private fun readBountyBoard(){

}

private fun obtainQuest(
    playerLevel: Int,
    hasAngeredBarbarians: Boolean,
    hasBefriendedBarbarians: Boolean,
    playerClass: String
): String {
    val quest: String = when (playerLevel) {
        //квест
        1 -> "Meet Mr. Bubbles in the land of soft things."
        //«Познакомьтесь с мистером Бабблсом в стране мягких вещей».
        in 2..5 -> {
            //Проверить возможность дипломатического решения
            //можно поговорить с варварами
            val canTalkToBarbarians = !hasAngeredBarbarians &&
                    (hasBefriendedBarbarians || playerClass == "barbarian")

            if (canTalkToBarbarians) {
                "Convince the barbarians to call off their invasion."
                //«Убедите варваров прекратить вторжение».
            } else {
                "Save the town from the barbarian invasions."
                //Спасите город от вторжения варваров».
            }
        }

        6 -> "Locate the enchanted sword."
        //«Найди заколдованный меч».
        7 -> "Recover the long-lost artifact of creation."
        //«Вернуть утраченный артефакт творения».
        8 -> "Defeat Nogartse, bringer of death and eater of worlds."
        //«Победить Nogartse, вестника смерти и пожирателя миров».
        else -> "There are no quests right now."
        //«Сейчас квестов нет».
    }
    return quest
}