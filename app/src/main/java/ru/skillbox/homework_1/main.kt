package ru.skillbox.homework_1

fun main() {
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
      alphabet.mapIndexed() { index, char -> if (index % 2 == 1) { print("$char ")} }
}