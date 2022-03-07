package my.homework;

import java.math.BigInteger;

public class Task13 {
    public static void main(String[] args) {
        System.out.println(multNumber());

    }

public static BigInteger multNumber() {
    var result = BigInteger.ONE; //использовал класс из пакета java.math т.к число получится слишком большим
    var i = 1;
    do {
        var value = BigInteger.valueOf(i); //вызвал метод valueOf() для преобразования числа
        result = result.multiply(value);//метод multiply , потмоу что с большими числами нельзя использовать "*" и др.
        i ++;
    } while (i <=25);
    return result;
}
}
