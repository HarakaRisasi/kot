package com.example.myapplication
import android.app.Activity
import android.app.ActivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.databinding.ActivityMainBinding


// View binding.
// Это фитча позволяет писать болле простой код чтобы взаимодействовать с View.
// В большинстве случаев привязка просмотра заменяет findViewById.
class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingClass = ActivityMainBinding.inflate(layoutInflater)

        setContentView(bindingClass.root)

        bindingClass.textView3.text = "Binding Works"
    }


}

//
//---------------------------------------------------------------------------------------
//
// Код исполняется в методах.
//
//---------------------------------------------------------------------------------------
//
// У Activity есть 7 основных функций(методов) жизненного цикла и запускаются они в разный момент.
// 01 - onCreate()
// 02 - onStart()
// 03 - onResume()
// 04 - onPause()
// 05 - onStop()
// 06 - onRestart()
// 07 - onDestroy()
// Система вызывает данные функции при изменении состояния Activity.
//
//---------------------------------------------------------------------------------------
//
// onCreate()
// Данная функция вызывается когда activity впервые создано.
// По оканчанию создания activity , activity входит в состояние Created . В функции onCreate() ,
// мы пишем код который нам нужно запустить только один раз за весь жизненный цикл activity.
// Например в  функции onCreate() мы можем заполнять какой либо список который не будет меняться или выбираем цвет элементов и.т.д .
// Данная функция принимает параметр savedInstanceState, это есть Bundle а именно это объект который содержит предыдущее состояние activity.
// Если activity не существовало ранее то значение объекта Bundle равно null.
//
// onStart()
// Когда Activity входит в состояние Started state, система вызывает данную фуекцию. Функция onStart()
// делает видимым Activity для пользователя, Activity выходит на передний план и становится интерактивным
// для пользователя. Например это отличное место для кода инициализации UI (User Interface)  компонентов.
//
// Функция onStart()
// Выполняется очень быстро, и как в случае с Created state,  activity не находится в состоянии Started state.
// Как только функция вызвана activity сразу переходит в Resumed state, и система вызывает функцию onResume().
//
// onResume()
// Когда activity входит в состояние Resumed state, оно становится на передний план, и тогда система вызывает метод onResume().
// Это состояние в котором приложение взаимодействует с пользователем.
// Приложение находится в данном состоянии до тех пор пока что либо не произойдет и оно уйдет с первого плана (например входящий звонок).
//
// Когда процесс прерван  activity входит в состояние Paused state, и система вызывает функцию onPause().
//
// Если  activity возврощается в состояние Resumed state из состояния Paused state,
// система снова вызывает функцию onResume().
// По этой причине мы должны инициализировать компоненты в функцииonResume(),
// которые мы остановили в функции onPause(),
// а также инициализируем все компоненты которые нужно инициализировать в состоянии Resumed state.
//
// onPause()
// Система вызывает данный метод как только поймет что пользователь покидает приложение
// (это не означает что  activity будет уничтожено),
// это означает что activity больше не находиться на переднем плане (оно может быть видно например в multi-window mode).
// Используйте функцию onPause() для операций которые должны быть остановленны во время паузы,
// пока  Activity находиться в состоянии Paused state, и ожидается скорое возобновление работы activity.
// Есть несколько причин почему activity входит в данное состояние.
//
// Например:
// - Какие либо действия прервали работу приложения, как описано ввыше в функции onResume(). Это основные причины.
//
// - В Android 7.0 (API level 24) или выше, несколько приложений могут работать в  multi-window mode.
// Так как только одно приложение  находиться на переднем плане,
// система вводит в состояние паузы все остальные activity.
//
// - Когда появляется на экране диалоговое окно которое не полностью перекрывает наше activity,
// activity входит в состояние паузы так как оно уже не на переднем плане.
//
// onStop()
// Когда activity больше не видно на экране, оно входит в состояние Stopped state, и ситема вызывает функцию onStop().
// Это происходит например когда новое activity перекрывает весь экран.
// А также данная функция  onStop() может быть вызвана когда activity завершилось.
//
// В функции onStop() нам нужно освободить все ресурсы которые нам не нужны , когда приложение не видно на экране.
//
// onDestroy()
// Эта функция вызываеться когда activity “разрушенно” по причине:
//
// - Activity закончило свою работу (пользователь нажал на кнопку выхода из приложения или была запущенна функция finish() ),
//
// - Система “разрушила” activity по причине поворота экрана или использования   multi-window mode.
//
// Данный метод это последний метод который вызывает activity перед тем как activity будет “разрушено”.
//
// В функции onDestroy() мы должны быть “освобождены все ресурсы которые не были освобождены в функции onStop().
//
// onRestart()
// Эта функция вызывается, когда activity было остановлено и запустился метод onStop(),
// а Activity было после этого снова запущено.
//
//---------------------------------------------------------------------------------------
// Типы переменных (Типы есть классы).
// Указателем для определения типа данных помимио автоматического служит еще и буква
// которую ставлю в конце литерала.
// "L" - long ...
// var x = 120L // числа от -128 до 127, занимает 1 байт.
//
// var a: Byte = 120 // числа от -128 до 127, занимает 1 байт.
// var b: Short = 120 // числа от -32768 до 32767, занимает 2 байта.
// var c: Int = 120 // числа от -2147483648 до 2147483647, занимает 4 байта.
// var d: Long = 120 // числа от -9233372036854775808 до 9223372036854775807, занимает 8 байт.
//
// var f: Float = 5.8F // числа от -3.4*10^38 до 3.4*10^38, занимает 4 байта.
// var g: Double = 120.5 // числа от -5.0*10^-324 до 1.7*10^308, занимает 8 байт.
//
// В Kotlin типы данных - это классы, а значит что у каждого из них есть свой функционал.
// Пример: Приведем переменную "f" типа Float в Int.
// var test1 = f.toInt()
//
//---------------------------------------------------------------------------------------
//
// onCreate - цикл жизни activity.
//
// override fun onCreate(nameOf_class: Bundle?) {
// super.onCreate(nameOf_class)
//
// Взять ресурс из категории "layout" при помощи ссылки на него через "R"
// В данном примере я как бы говорю "Что надо взять всю разметку из layout.activity_main
// и взять ее в тот момент, когда все ресурсы будут готовы (в момент выполнения onCreate)"
// setContentView(R.layout.activity_main)
// }
//
// Событие, которое происходит при нажатии(взаимодействии) на элемент называется
// Аргументы view с наследованием(:) View добавляются затем чтобы активировать
// onClick у того View на который эта функция будет влиять.
//
//---------------------------------------------------------------------------------------
//
// /**
// * Эта функция при нажатии на view<Button id:button_test>
// *     изменяет переменную text внутри view<TextView id:textView_3>
// *
// * Для ее работы требуется изменить атрибут onClick для view<Button id:button_test>
// *     на значение <onClickTest> - тоесть имя этой функции.
// */
// fun onClickTest(view : View){
// //Получаю доступ к View<name> по его id.
// //TextView - это класс.
// val textV = findViewById<TextView>(R.id.textView_3)
//
// textV.text = "Hello from Haraka!"
// }
//
//---------------------------------------------------------------------------------------
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main) //Настроить разметку, в которой все рисуеся.
//
//        // Цель получить ссылку на какой-нибудь объект и после с ним уже что-то делать.
//        // var tv - имя переменной.
//        // : Textview - здесь указано, что за элемент я ищу.(Класс TextView)
//        // = findViewById(R.id.textView_3) - как его найти?(По ID с именем textView_3)
//        var tv : TextView = findViewById(R.id.textView_3) //Создаю коробку и кладу в нее View с идентификатором
//
//        //Теперь есть доступ к классу и его функциям.
//        // Получаю доступ к методу text и теперь могу его изменить.
//        tv.text = "Haraka!"
//    }