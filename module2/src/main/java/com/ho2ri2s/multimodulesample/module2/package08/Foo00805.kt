package com.ho2ri2s.multimodulesample.module2.package08
import javax.inject.Inject
class Foo00805 @Inject constructor(){
    fun method0() { Foo00804().method5() }
    fun method1() { method0() }
    fun method2() { method1() }
    fun method3() { method2() }
    fun method4() { method3() }
    fun method5() { method4() }
}
