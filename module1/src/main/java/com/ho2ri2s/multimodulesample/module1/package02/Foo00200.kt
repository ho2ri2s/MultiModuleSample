package com.ho2ri2s.multimodulesample.module1.package02
import javax.inject.Inject
import com.ho2ri2s.multimodulesample.module1.package01.Foo00199
class Foo00200 @Inject constructor(){
    fun method0() { Foo00199().method5() }
    fun method1() { method0() }
    fun method2() { method1() }
    fun method3() { method2() }
    fun method4() { method3() }
    fun method5() { method4() }
}
