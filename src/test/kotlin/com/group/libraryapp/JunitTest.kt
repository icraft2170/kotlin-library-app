package com.group.libraryapp

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class JunitTest {

    companion object {
        @JvmStatic
        @BeforeAll
        fun beforeAll() {
            println("모든 테스트 시작 전")
        }

        @JvmStatic
        @AfterAll
        fun afterAll() {
            println("모든 테스트 시작 후")
        }
    }


    @BeforeEach
    internal fun setUp() {
        println("각 테스트 시작 전")
    }

    @AfterEach
    internal fun tearDown() {
        println("각 테스트 시작 후")
    }

    @Test
    fun test1() {
        println("Test1")
    }

    @Test
    fun test2() {
        println("Test2")
    }
}