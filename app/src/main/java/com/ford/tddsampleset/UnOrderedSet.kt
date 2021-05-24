package com.ford.tddsampleset

class UnOrderedSet<T> {

    init {}

    fun add(obj: T) { }

    fun insert(obj: T, index: Int) {}

    fun contains(obj: T) {}

    fun getItem(index: Int): T { return Object() as T }

    fun remove(obj: T) {}

    fun getAll(): List<T> { return emptyList() }

    fun size(): Int { return 0 }
}