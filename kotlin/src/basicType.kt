package my.demo

/*
    kotlin中,万物皆对象
 */
fun main(args: Array<String>) {
    numbersExpression()
    charactersExpression()
}


/*
    Numbers--数值型
    与Java中数值型类似,但没有隐含的类型转换,
    并且字符型在kotlin中不属于数值型,这点与Java不同
    Type |Bit Width
    Double| 64
    Float| 32
    Long| 64
    Int| 32
    Short| 16
    Byte| 8
 */
fun numbersExpression() {
    //数值型定义
    val decimals = 1234
    val longInt = 1234L
    val hexaDecimals = 0x0F
    val binaries = 0b000100101
    val doublenum = 0.234   //default
    val floatnum = 0.234F   //0.234f

    //使用下划线,增强数值型数据的可读性
    val oneMillion = 1_000_000
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010


    /*
        在Java中,数值型是原始类型,在使用过程能够自动装箱,拆箱(Box),而在kotlin中everything is object,即数值类型本身就是装箱的(Boxed)
     */
    val a: Int = 1000
    println(a === a)
    val boxedA: Int? = a
    val boxedB: Int? = a
    println(boxedA === boxedB)  //false
    println(boxedA == boxedB)   //true

    /*
        显示转换
        kotlin中,小类型并不是大类型的特殊类型
     */
//    val b:Byte = 1
//    val a:Int = b 无法直接转换,只能采用显示转换,从小类型向大类型转换
    val b: Byte = 1
    val i: Int = b.toInt()
    //在表达式中隐式转换
    val l: Long = 1L + 3

    /*
        位运算符
        operator | meaning
        shl      | shift left <<
        shr      | shift right >>
        ushr     | unsigned shift right >>>
        and      | bitwise and
        or       | bitwise or
        xor      | bitwise xor
        inv      | bitwise inversion
     */
    val x = ( 1 shl 2 ) and 0x00_0F_F0_00 //shift left 左移


    toPrintlnNumber(listOf(decimals, longInt, hexaDecimals, binaries, doublenum, floatnum, oneMillion, hexBytes, bytes,
            x))

    /*
        浮点型
        1. 是否相等: a == b     a != b
        2. 比较运算符: a < b     a > b   a <= b  a >= b
        3. 范围区间: a..b   x in a..b    x !in a..b
        浮点运算遵循 IEEE 754

        当浮点类型比较的对象不是静态类型时,应当实现equals和comparable接口,如:Any
        通常约定:
        NaN 和它自己相等
        NaN 大于任何数值型数据
        -0.0 比 0.0 小
     */
}

/**
 * 输出数字集合
 */
fun toPrintlnNumber(list: List<Number>) {
    for (item in list) {
        println(item)
    }
}


/**
 * 字符型数据
 */
fun charactersExpression() {
    /*
        在kotlin中,字符型数据不能当做数字
     */
}
