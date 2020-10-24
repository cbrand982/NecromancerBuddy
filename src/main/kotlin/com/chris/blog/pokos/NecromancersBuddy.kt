package com.chris.blog.pokos

var undeadList = mutableMapOf<String, Undead>()

fun addUndead(key : String, undead: Undead){
    undeadList[key] = undead
}
