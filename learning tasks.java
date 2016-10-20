
/*
Создать класс прямоугольник. Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle {
    public int top;
    public int left;
    public int width;
    public int height;
    public int Rectangle1;

    public Rectangle(int left, int top, int width, int height) {
        this.Rectangle1 = left + top + width + height;
    }

    public Rectangle(int left, int top) {
        this.Rectangle1 = left + top;
    }

    public Rectangle(int left, int top, int width) {
        this.Rectangle1 = left + top + width;
    }

    public Rectangle(Rectangle rect) {
        this.top = rect.top;
        this.left = rect.left;
        this.width = rect.width;
        this.height = rect.height;
    }
}



/* По 50 объектов Cat и Dog.(Java-машина должна начать уничтожать неиспользуемые объекты).
*/

public class Solution
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 50; i++)
        {
            Cat cat = new Cat();
            Dog dog = new Dog();
        }
    }
}
class Cat
{
    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("Cat destroyed");
    }
}

class Dog
{
    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("Dog destroyed");
    }
}



/*
Реализовать статический метод double getDistance(x1, y1, x2, y2).
Он должен вычислять расстояние между точками.
*/

public class Util
{
    public static double getDistance(int x1, int y1, int x2, int y2)
    {

        double a = ((x2-x1)*(x2-x1))  +  ((y2-y1)*(y2-y1)) ;
        return Math.sqrt( a );

    }
}


/*
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString()
int readInt()
double readDouble()
boolean readBoolean()
*/
        import java.io.BufferedReader;
        import java.io.InputStreamReader;

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        return a;

    }

    public static int readInt() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());

    }

    public static double readDouble() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String c = reader.readLine();
        double c1 = Double.parseDouble(c);
        return c1;
    }

    public static boolean readBoolean() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        if (s.equals("true")) return true;
        else return false;
    }
}



/*
Cделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) – возвращает строку повторенную count раз.
String multiply(String s) – возвращает строку повторенную 5 раз.
*/

public class StringHelper
{
    public static String multiply(String s)
    {
        String result = " ";
        for (int i = 0; i < 5; i++){
            result += s;
        }
        return result;
    }

    public static String multiply(String s, int count)
    {
        String result = " ";
        for (int i = 0; i > count; i++){
            result += s;
        }
        return result;
    }
}


//    Сумма элементов массива

public class Main {

    public static void main(String[] args) throws IOException
    {
            int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};
            int sum = 0;
            for (int i = 0; i < list.length; i++) {

                sum += list[i];
            }

            System.out.println("Sum is " + sum);
    }
  }




//    Поиск минимального элемента в массиве:

public class Main {

        public static void main(String[] args) throws IOException {

            int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2};

            int min = list[0];
            for (int i = 0; i < list.length; i++)
            {
                if (list[i] < min)
                    min = list[i];
            }

            System.out.println("Min is " + min);
        }
    }


//Ввести 10 строк с клавиатуры и вывести их на экран в обратном порядке:

  public class MyClass {

      public static void main(String[] args) {
          Reader r = new InputStreamReader(System.in);
          BufferedReader reader = new BufferedReader(r);

          ArrayList<String> list = new ArrayList<String>();
          for (int i = 0; i < 10; i++) {
              String s = reader.readLine();
              list.add(s);
          }

          for (int i = 0; i < list.size(); i++) {
              int j = list.size() - i - 1;
              System.out.println(list.get(j));
          }
      }
  }



/*Максимальное среди массива на 20 чисел
    1. В методе initializeArray():
        Создайте массив на 20 чисел
        Считайте с консоли 20 чисел и заполните ими массив
    2. Метод max(int[] array) должен находить максимальное число из элементов массива*/

    public class Main
    {
        public static void main(String[] args) throws Exception
        {
            int[] array = initializeArray();
            int max = max(array);
            System.out.println(max);
        }
        public static int[] initializeArray() throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int[] arr = new int[20];
            for (int i = 0; i < arr.length; i++) {
                arr[i]= Integer.parseInt(reader.readLine());
            }
            return arr;
        }
        public static int max(int[] array) {
            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                if ( array[i]>max)
                    max=array[i];
            }
            return max;
        }
    }



/* 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/
        import java.io.BufferedReader;
        import java.io.InputStreamReader;

    public class Solution
    {
        public static void main(String[] args) throws Exception
        {
            {
                BufferedReader g = new BufferedReader(new InputStreamReader(System.in));

                String[] lis = new String[10];

                for (int d = 0; d < 10; d++)
                {
                    lis[d] = g.readLine();
                }
                int[] x = new int[10];
                for (int t = 0; t < 10; t++)
                {
                    x[t] = lis[t].length();
                    System.out.println(x[t]);

                }
            }
        }



/* Один большой массив и два маленьких:
   Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
   Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/
        import java.io.BufferedReader;
        import java.io.InputStreamReader;

        public class Solution
        {
            public static void main(String[] args) throws Exception
            {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int[] arrayBig = new int[20];

                for (int i = 0; i < arrayBig.length; i++)
                {
                    String s = reader.readLine();
                    arrayBig[i] = Integer.parseInt(s);
                }
                int[] array1 = new int[10];
                int[] array2 = new int[10];
                System.arraycopy(arrayBig, 0, array1, 0, array1.length);
                System.arraycopy(arrayBig, array1.length, array2, 0, array2.length);

                System.out.println(array2);

            }

        }
