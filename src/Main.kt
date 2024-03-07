fun main() {
   //1 дз

   //String название которого состоит из нескольких слов
   var lessonJavaGood: String = ""



   //Константа NUM типа данных int
   val NUM = 1488


   //Переменная word типа данных String
   var word = "Ilyas"

   //Задаём значение переменной объявленной в самом начале
   lessonJavaGood = "$NUM $word"


   //Вывод на экран значение всех переменных в одну строку
   println("lessonJavaGood: $lessonJavaGood, NUM: $NUM, word:$word")


   //Условная конструкция
   when{
      NUM < 0-> println("Вы сохронили отрицательное число")
      NUM > 0-> println("Вы сохронили положительное число")
      else -> println("Вы сохранили нуль" )
   }
}