package my.homework.Task51;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        Person person1 = new Person("Tom", "Holland", 25);
        Person person2 = new Person("Bob", "Zoiberg", 36);
        Person person3 = new Person("Kate", "Winset", 18);
        Person person4 = new Person("Jake", "Jilenholl", 44);
        Person person5 = new Person("Toby", "Makguaer", 45);
        Person person6 = new Person("Daemon", "Salvatore", 25);
        Person person7 = new Person("Zack", "Snayder", 25);
        Person person8 = new Person("Zack", "Snayder", 25);
        Person person9 = new Person("Zack", "Snayder", 25);
        Person person10 = new Person("Zack", "Snayder", 25);


        DataOutputStream dos;

        {
            try {
                dos = new DataOutputStream(new FileOutputStream("data2.bin"));
                dos.writeUTF(person1.name);
                dos.writeUTF(person1.surname);
                dos.writeInt(person1.age);

                dos.writeUTF(person2.name);
                dos.writeUTF(person2.surname);
                dos.writeInt(person2.age);

                dos.writeUTF(person3.name);
                dos.writeUTF(person3.surname);
                dos.writeInt(person3.age);

                dos.writeUTF(person4.name);
                dos.writeUTF(person4.surname);
                dos.writeInt(person4.age);

                dos.writeUTF(person5.name);
                dos.writeUTF(person5.surname);
                dos.writeInt(person5.age);

                dos.writeUTF(person6.name);
                dos.writeUTF(person6.surname);
                dos.writeInt(person6.age);

                dos.writeUTF(person7.name);
                dos.writeUTF(person7.surname);
                dos.writeInt(person7.age);

                dos.writeUTF(person8.name);
                dos.writeUTF(person8.surname);
                dos.writeInt(person8.age);

                dos.writeUTF(person9.name);
                dos.writeUTF(person9.surname);
                dos.writeInt(person9.age);

                dos.writeUTF(person10.name);
                dos.writeUTF(person10.surname);
                dos.writeInt(person10.age);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}