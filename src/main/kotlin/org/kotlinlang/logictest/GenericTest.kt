package org.kotlinlang.logictest

class GenericTest {

    // 제네릭 추가학습 필요
    ////////////////
    class DataSourceOperation<T>
    constructor(
        val data: T?,
        val fullMessages: Array<String>?
    ) {

        fun success(data: T){

        }

    }


    class Resp {
        val aaaa: String = "aa"
        val fm: Array<String>? = null
        val abc = DataSourceOperation<String>(aaaa,fm)
    }



/*
    class DataSourceOperation<T> private constructor(
        private val operationStatus: OperationStatus,
        val data: T?,
        val fullMessages: Array<String>?
    )
*/


}