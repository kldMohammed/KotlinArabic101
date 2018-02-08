#مقدمة:


كوتلن هي لغة برمجة جديدة طورت بواسطة شركة JetBrains و اللغة تعمل علي منصة الجافا او `JVM`
وتترجم الي ال `ByteCode`
وايضا تترجم للغة الجافا سكربت وايضا الآن تترجم `Native` علي انظمة التشغيل
 `windows` , `Osx` , `linux`
 وايضا الآن تترجم الي لغة ال `Ojective-c`


 - يوجد كود مرفق لكل الامثلة في هذا الشرح
 -بعد تحميل الكود المرفق يمكنك قراءة كل الشرح والرجوع اليه من غير الوصول الي الشبكة ؛ موجود في الملف `readme.md`


 - الي اللقاء في مرة آخرى في شرح المزيد من لغة الكوتلن
 -تم تناول بعض المواضيع أو اغلبيتها بدون شرح غير مفصل أي أنه اذا لم تكن لديك خلفية برمجية لن تستطيع فهم بعض المواضيع
 -بعد تنزيل الملف يجب فتحه بمحرر نصوص يدعم اللغة العربية

#أساسيات:


 -الفاصلة المنقوطة `;` اختيارية ولا حاجة لكتابتها في نهاية كل أمر ، اعتقد ان هناك مكان واحد فقط يتطلب ان تضعها فيه في هذه اللغة.
 -التعليقات شبيهة بتلك التي توجد في  لغات  `c#`, `c++` , `java` و كل عائلة لغات ال `C`.
 - اسم الملف لا يجب ان يطابق اسم الكلاس `class` كما موجود في الجافا .
 - يمكنك تعريف اكثر من كلاس `class` في نفس الملف
  -ايضا اسم الحزمة `package ` لا يجب ان يطابق مسار الملف او اسم الملف
 -تشبه الجافا سكربت في انك تسطيع تعريف دالة خارج الكلاس ولا حاجه لتعرف الدوال الخاص بك كــ `static member` كما في الجافا .
 -كوتلن لديها ما يسمى بال `string template` وهي ممتعة حقا مثال لها :`"$firstName $lastName"` للمتغيرات البسيطة او للعبارات الاكثر تعقيدا مثل `"${person.name} is ${1 * 2}"`
 وهي بسيطة حقا داخل السلسلة الحرفية تضع علامة `$` قبل اسم المتغير و بهذه الطريقة يمكنك ان تصل لقيمته ، ملحوظة يمكنك استخدام طريقة دمج السلاسل الحرفية كــ `"hello " + "world"` ، لكن هذه يجعلك تبدو غبيا.

 اول برنامج بلغة الكوتلين : Hello World
 
 

 ```
 fun main(args : Array<String>) {
     print("Hello World")
 }
 ```

 بسيط أليس كذلك ؟ لاحظ لا يوجد أي تعريف لكلاس لكتابة الدالة `main`

 مثال آخر يوضح كيفية استخدام الstring template لطباعة قيمة متغيرين.

```
fun main(args : Array<String>) {
    val firstName : String = "Khalid"
    println("Hello i'm $firstName")
}
```
##المتغيرات:


-في الكوتلن توجد كلمتان محجوزتان لتعريف المتغيرات **var** و **val** .
-استخدم **var** اذا كانت قيم المتغير سوف تتغير اثناء تشغيل البرنامج ، استخدم **val** اذا كانت قيمة المتغير لن تتغير بعد اول اسناد قيمة لهذا المتغير اي أن قيمته لا تتغير.
-كلمة **val** نعادل كلمة **final** في الجافا.
-المتغير الذي تم تعريفه بواسطة ***val**يجب اعطاءه قيمة ابتدائية.
-لا تشبه الجافا وال C# في كيفية كتابة نوع البيانات جيث هنا يأتي بعد اسم المتغير `var firstName : String`.
 -انواع البيانات الرقمية الأولية (الموجودة اصلا في اللغة) كـالتالي: Double, Float, Long, Int, Short, Byte. جميع انواع البيانات في الكوتلن تبدأ بأحرف كبيرة .
- باقي الانواع هي : Char, String, Boolean.
- الكلمة المحجوزة والشائعة في لغات البرمجة `void` في الكوتلن تسمي `Unit`

###Null


-في كوتلن يمكنك ان تحدد ان هذا المتغير يمكن أن يأخذ القيمة `null` او لا ، القرار متروك لك ، كذلك يمكن تطبيق هذا المفهوم علي انواع البيانات ال `Primitive` او انواع البيانات المعرفة بواسطة المستخدم كــ الكائن الذي يتم انشاءه من كلاس ما.
المتغير الذي يمكن أن يكون خالي او `null` يمكن تحديده عند الاعلان عنه بالعلامة `?` مثال : `var firstName: String?` .
-يمكنك أخذ قيمة متغير غير خالي `not null` واسناد قيمته لمتغير `nullable`
انظر للكود المصدر المرفق في :

###مستنتج نوع البيانات Type inference


-كوتلن لديها مستكشف او مستنتج نوع البيانات في المترجم الخاص بها اي انه لا داعي لكتابة نوع البيانات ، المترجم يستطيع ان يعرف النوع من خلال القيمة التي تم اسنادها للمتغير .مثل `val age=25`
- لكن اذا اردت تعريف متغير و اسناذ القيمة لاحقا يجب تحديد نوع البيانات في هذه الحالة .
```
fun main(args: Array<String>) {
    //the compile will infer type from the assigned value no need to write String
    val name = "Khalid"
    val age = 25
    val isAProgrammer = true
    //but if you want to assign value latter you should explicitly write data type
    val myFavNumber: Int
    myFavNumber = 16
}
```

#الدوال Functions


-سوف نمضي وقتا طويلا هنا لأن الدوال في كوتلن لها اشكال كثيرة ، خذ وقتك في فهمها ولا تستعجل : قائمة باشكال الدوال في كوتلن


- Single expression function.
- Optional parameter.
- Positional argument and named argument.
- Variable argument.
- Single expression function.
- Function type.
- Function literals.
- Callable references.
- Extension functions.
- Infix function call.
- Local function.
- Closure.
- Generic function.
- Operator overloading.

بالأسفل امثلة للدوال في الكوتلن

```
fun main(args : Array<String>) {
    greet(englishGreeting())
    greet(arabicGreeting())
}

fun greet(msg : String){
    println(msg)
}

fun englishGreeting() : String = "Hello "


fun arabicGreeting():String {
    return "السلام عليكم و رحمة الله تعالي و بركاته"
}
```

-يتم تعريف الدالة بواسطة الكلمة المحجوزة `fun`
-الدالة يمكن أن ترجع قيمة و يتم تحديد نوع القيمة الراجعة بعد اسم الدالة كما في المتغيرات نوع البيان يأتي بعد اسم المتغير.
-في المثال السابق الدالتين `englishGreeting()` , `arabicGreeting()` يرجعان قيمة من النوع String.
- الدالة englishGreeting() تسمي *single expression function*.وذلك لانها في سطر واحد ولا توجد اقواس بداية او نهاية .
- الدالة greet() لا ترجع أي قيمة كالدوال الـ `void` في الجافا و هنا كما ذكرت سابقا تسمي `Unit` و كما قلت ان الكوتلن لديها مستكشف نوع البيان في المتغيرات فهو هنا ايضا موجود اي يمكننا ان نحذف نوع البيان الراجع والمترجم سوف يعرف النوع الراجع من القيمة المرجعة .
هي الميزة توفر جهد و زمن في كتابة الكود.
- في الكوتلن كل المعاملات التي يتم ارسالها للداله تتعبر للقراءة فقط ؛ اي بمعني انه لا يمكنك ان تسبقها بكلمة **val** , **var** ؛ كما في المثال السابق.

##Single Expression Function


هي طريقة مختصرة لكتابة الدالة ؛ في حالة انه كانت تنفذ عبارة واحدة فقط.
```
fun main(args : Array<String>) {
    val result = add(2,3)
    display("$result")
}

fun add(x: Int, y: Int) = x + y
fun display(message:String) = println(message)
```

كما تلاحظ بالمثال السابق ان نوع البيانات الذي ترجعه الدالة يتم التعرف عليه بواسطة المترجم ولا حاجة لكتابته ولكن يمكنك كتابته كالتالي
 fun add(x: Int, y: Int):Int = x + y

##Default (Optional) parameter المعاملات الاختيارية او الافتراضية
-كوتلن تمكنك من اسناد قيمة افتراضية للمعامل مما يجعله اختياري

```

fun main(args : Array<String>) {
    showMessage()
    showMessage("Good morning")
}

fun showMessage (msg : String = "Hello World"){
    println("$msg")
}
```

##Named Argument


كوتلن تمكنك من ذكر اسم المعامل ثم قيمته اثناء استدعاء الدالة  وتمكنك ايضا من الخلط بين ترتيب المعاملات ؛ اي
ذكر ارسال اخر معامل اولا و الاول ثالثا وهكذا؛ لا يجب ان ترسل كل المعاملات بالترتيب كما في الجافا
اذا خلطت بين الاتنين يجب البدء بالمعاملات التي في موقعها ثم المعاملات التي تم تحديدها باسمها `Named Argument`
```
fun main(args : Array<String>) {
    greet(firstName = "Khalid", lastName = "Mohammed")
    greet(lastName = "Ahmed", firstName = "Ali")
    greet("Afraa", "Ismail")
    greet("Amna", lastName = "Ahmed")
    call("Khalid", age = 25, location = "Sudan")
}

fun greet(firstName : String, lastName : String){
    println("Good morning $firstName $lastName")
}

fun call(name : String, location : String, age : Int){
    println("Call $name who lives at $location and he is $age old")
}
```

###Variable arguments


-ارسال معاملات غير محدودة للدالة ؛ يتم ذلك بواسطة الكلمة المحجوزة ***vararg***
تستطيع ارسال اي عدد متغيرات تريده هنا .
```
fun main(args : Array<String>) {
  names("Khalid", "Omer", "Osman" , "Amna" , "Omnia")
}

fun names(vararg  names : String){
  for(n in names){
    println("$n")
  }
}
```
 - اذا كان ***vararg*** ليس اخر معامل في الدالة في هذه الحالة يجب استخدام المعاملات المسمية `Named Arguments` لتوضح للمترجم ان اخر قيمة تم ارسالها ليست تابعة لل ***vararg***.

 ```
 fun main(args : Array<String>) {
     names("Khalid", "Omer", "Osman", age = 20)
 }

 fun names(vararg  names : String, age : Int){
     for(n in names){
         println("$n is $age old")
     }
 }
 ```

 -الـ***vararg*** ينتج عنها مصفوفة معاملات ؛ حيث يمكنك ان تجري  عليه بعض عمليات المصفوفة مثل ان تعرف طول الـ***vararg***
 او الوصول الي معامل حسب موقعه كما في المصفوفات.
 - تستطيع ارسال الـ***vararg*** الي ***vararg*** اخر و ذلك بكتابة علامة النجمة `*`  قبله.

 ##Function Types and Function Literals انواع الدوال


 نوع الدالة هو النوع المُضمن في تعريف الدالة `Function Signature` ونوع القيمة الراجعة هو النوع الذي يأتي بعد المعامل `->` علامة الناقص و اصغر من في اللغة الانجليزية
 بأبسط صورة تكون بالشكل التالي :
 سأكتب السطر البرمجي والشرح في السطر الذي يليه كي لا يحدث لبث في الموضوع
 `() -> Unit`
 دالة لا تأخذ اي معامل ولا ترجع قيمة أي ان `Unit` تعني انه لا توجد قيمة راجعة مثل `void` في اللغات الآخرى.

 `() -> String`
 دالة لا تاخذ اي معامل و ترجع قيمة من النوع `String`

`(String) -> Unit`
دالة تأخذ معامل من النوع الحرفي `String` ولا ترجع اي شي

`(String, Float) -> Unit`
دالة تأخذ معاملين من النوع  `String`, `Float` ولا ترجع أي شي

###Different ways to write function literals



```
val m = { (x : String) -> println("$x") }
val n : (String) -> Unit = { x -> println("$x") }
val o : (String) -> Unit = { (x : String) -> println("$x") }

fun main(args : Array<String>) {
    m("good morning")
    n("good morning")
    o("good morning")
}
```

##Function expansion


- اذا كان لديك دالة و اخر معامل فيها نوع دالة يمكنك ان تمدده او تبدله بــ `{}` كما في المثال

```
fun main(args : Array<String>) {
    val a =  calculate(1) { x -> 10 + x } //11
    val b = calculate(2) { x -> 20 * x } //40

    println("a = $a, b = $b")
}

fun calculate(a : Int,  calc : (Int) -> Int) : Int{
    return calc(a)
}
```

##Extension function


بأبسط صورة هي دوال لم تكن موجوده اصلا في الكلاس انت تضيفها له وهي تمكنك من اضافة مميزات للكلاس
و هي مفيده كثيرا


```

fun Int.show() {
    println("this number is $this")}


fun String.greet(){
    println("hello $this")
}

fun String.lastElement() :Int{
    return (length -1)
}

fun main(args: Array<String>) {
    "Khalid".greet() // print hello hello khalid
    val last = "Khalid".lastElement() //print 5
    println(last)
    5.show()


}
```

### Extension function in infix form


 -اذا كانت الدالة تستقبل معامل واحد فقط يمكن ان نقول عنها انها `infix` و يمكن تجاهل او عدم كتابة الــ `.` عند استدعائها كما في المثال التالي
```
fun main(args : Array<String>) {
   val res = 1 add 2
   println("$res")
}

fun Int.add (one : Int) : Int = this + one
```

##Variable arguments and function type argument


 ايضا يمكننا استعمال الـ ***vararg*** مع نوع نوع الدالة كما يلي

fun main(args : Array<String>) {
    names("Khalid", "Mohammed", "Ali", print = {name  -> println (name)})
    //and also you can write in this way
    names("Khalid", "Mohammed", "Ali", print = { println(it) })
    //and also you can write in this way , as i say earlier
    names("Khalid", "Mohammed", "Ali"){ println(it)}
}

fun names(vararg  names : String, print : (String) -> Unit){
    for(n in names){
        print(n)
    }
}

- ***ملحوظة*** : هناك بعد المواضيع تجاوزتها في الدوال و لا تنسى خذ وقتك في فهمها و لا تنسى تجربة كل شي و البحث عن كل شي لم اتحدث عنه بالتفصيل

#Control Structures


##If statement


-جملة `if` في لغة كوتلن شبيه باللغات الاخرى


```
fun main(args : Array<String>) {
  val total = 10

  if (total > 5){
      println("$total is greater than 5")
  }else if (total > 10){
      println("$total is greater than 10")
  }else{
      println("$total is less than 6")
  }
}
```

##When Expression (switch in other language)


- هي شبيهة بال `switch case` في اللغات الآخرى

```
fun main(args: Array<String>) {
    val age = 1
    when(age){
        1 -> println("its one ")
        2 -> println("its two ")
        else -> print("Wrong number")
    }
}
```

###المدى range


كوتلن وفرت مفهوم جديد و هو المدى  ومن اسمه ظاهر ماذا يعني
و يتم تعريف المدي بهذا الشكل
```
val choices = 1..10
 val ch = 'A'..'Z'
```
و هنا قمت بتحديد مدي محدد لقيمة المتغير بالاعلى و هي من بين 0 الي 100 و هذا المفهوم مفيد جدا في الحلفات التكرارية


و لكن دعوني ارجع للعبارة السابقة `when` و نستخدم المدي فيها
```
 val number = 5
    when(number){
        in 0..5-> println("in 0 to 5")
        in 5..10 -> println("from 5 to 10")
        else -> println("out of range")
    }
```

##for loop

-حلقة `for` هنا قد تختلف قليلا في طريقة الكتابة لكن طريقة العمل واحدة
- هنا هي اسهل و سلسلة اكثر تستخدم فيها المعامل `in` للتكرار ولا تحتاج لكتابة معامل زيادة كما في اللغات الآخرى

```
fun main(args: Array<String>) {
    //iterate and print number from 1 to 100
    val range= 1..100
    for (n in range){
        println(n)
    }
    //also can iterate over string
    val name="Khalid"
    for (c in name){
        println(c)
    }
    //iterate for array
    val array = arrayOf(1,2,3,4,5)
    for (a in array){
        println(a)
    }
}
```

##while and do while


- لا تختلف كثيرا عن اللغات الآخرى

```
fun main(args: Array<String>) {
    whileLoop()
    doWhile()
}

fun whileLoop() {
    var x = 0
    while (x < 5) {
        println(x)
        x++
    }
}

fun doWhile() {
    var y = 6
    do {
        println(y)
        y++
    } while (y < 10)
}
```

