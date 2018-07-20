import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
class num1
{
public static void main(String args[])throws Exception
{
FileWriter fw=new FileWriter("abc.txt",true); 
fw.write("this is sri studying in swrn located in srp and my friends are lalli 8309052949,annie 9494504848and head is 6302280059");
fw.flush();
fw.close();
FileReader fr=new FileReader("abc.txt");
fr.read();
while(fr.read()!=null)
{
 System.out.println(fr.read());
}
}
}

