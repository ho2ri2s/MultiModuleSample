package com.ho2ri2s.multimodulesample.module3.package10
import javax.inject.Inject
class Foo01000 @Inject constructor(){
    fun method0() {}
    fun method1() { method0() }
    fun method2() { method1() }
    fun method3() { method2() }
    fun method4() { method3() }
    fun method5() { method4() }
}
