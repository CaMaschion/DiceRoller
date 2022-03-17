package com.example.diceroller

import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 *
 *
 * As funções de teste precisam ter a anotação @ Test, importada da biblioteca org.junit.test.
 * A anotação @Test informa ao compilador que o método a seguir é um teste, o que permite que ele seja executado como tal.
 */
class ExampleUnitTest {
    @Test
   fun generate_numbers(){
       val dice = Dice(6)
        val rollResult = dice.roll()
        assertTrue("The value of rollResult was not between 1 and 6", rollResult in 1..6)

   }
}


//A lib JUnit aciona os testes de unidade e permite marcar um código como sendo
//de teste para que ele possa ser compilado e executado de forma a testar o código de apps.
