package com.chris.blog.pokos

var undeadList = mutableMapOf<String, Undead>()

var undead = Undead(name = "bob", hitDice = 10)

fun addUndead(key : String, undead: Undead){
    undeadList[key] = undead
}
