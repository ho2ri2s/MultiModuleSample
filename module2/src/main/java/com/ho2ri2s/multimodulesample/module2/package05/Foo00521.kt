package com.ho2ri2s.multimodulesample.module2.package05
import javax.inject.Inject
class Foo00521 @Inject constructor(){
    fun method0() { Foo00520().method5() }
    fun method1() { method0() }
    fun method2() { method1() }
    fun method3() { method2() }
    fun method4() { method3() }
    fun method5() { method4() }
}
