package com.chris.blog.pokos

class Undead(var name: String, var hitDice: Int, var totalHitPoints: Int, var currentHitPoints: Int, var attackBonus: Int, var diceNumber: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Undead

        if (name != other.name) return false
        if (hitDice != other.hitDice) return false
        if (totalHitPoints != other.totalHitPoints) return false
        if (currentHitPoints != other.currentHitPoints) return false
        if (attackBonus != other.attackBonus) return false
        if (diceNumber != other.diceNumber) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + hitDice
        result = 31 * result + totalHitPoints
        result = 31 * result + currentHitPoints
        result = 31 * result + attackBonus
        result = 31 * result + diceNumber
        return result
    }

    override fun toString(): String {
        return "Undead(name='$name', hitDice=$hitDice, totalHitPoints=$totalHitPoints, currentHitPoints=$currentHitPoints, attackBonus=$attackBonus, diceNumber=$diceNumber)"
    }

}