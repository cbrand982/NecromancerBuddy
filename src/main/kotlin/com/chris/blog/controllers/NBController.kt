package com.chris.blog.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import com.chris.blog.pokos.Undead
@Controller
class NBController {
    @GetMapping("/")
    fun blog (model : Model): String{
        var undead = Undead("Skel",1,1,1,1,1)
        undead.takeDamage(1)
        model["title"] = undead
        return "blog"
    }
}
