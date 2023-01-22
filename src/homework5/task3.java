package homework5;
//Дано два числа, например 3 и 56, значение которых хранятся в переменных.

//a)Необходимо составить следующие текстовые строки:

//b)   Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().

//c)   Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().

public class task3 {
    public static void main(String[] args) {
        int b = 3;
        int c = 53;

        StringBuilder str = new StringBuilder();
        str.append(b);
        str.append(" + ");
        str.append(c);
        str.append(" = ");
        str.append(b+c);
        System.out.println(str);

        StringBuilder str2 = new StringBuilder();
        str2.append(b);
        str2.append(" - ");
        str2.append(c);
        str2.append(" = ");
        str2.append(b-c);
        System.out.println(str2);

        StringBuilder str3 = new StringBuilder();
        str3.append(b);
        str3.append(" * ");
        str3.append(c);
        str3.append(" = ");
        str3.append(b*c);
        System.out.println(str3);
//b)   Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
        str.delete(7, 8);
        str.insert(7 ,"равно:");
        System.out.println(str);
//c)   Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
        str2.replace(7,9, "равно:");
        System.out.println(str2);
    }
}


