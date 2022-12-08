package dev.sora.relay.cheat.command

import dev.sora.relay.cheat.BasicThing

abstract class Command(vararg alias: String) : BasicThing() {

    val alias: Array<String>

    init {
        if (alias.isEmpty()) {
            throw IllegalArgumentException("there must be an name for a command")
        }
        this.alias = alias.map { it }.toTypedArray()
    }

    abstract fun exec(args: Array<String>)
}