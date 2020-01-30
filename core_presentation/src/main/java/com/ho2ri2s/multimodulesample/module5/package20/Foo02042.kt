package com.ho2ri2s.multimodulesample.module5.package20
import javax.inject.Inject
class Foo02042 @Inject constructor(){
    fun method0() { Foo02041().method5() }
    fun method1() { method0() }
    fun method2() { method1() }
    fun method3() { method2() }
    fun method4() { method3() }
    fun method5() { method4() }
}
