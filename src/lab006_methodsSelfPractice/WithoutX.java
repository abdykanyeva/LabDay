package lab006_methodsSelfPractice;

import com.sun.tools.javac.Main;
import jdk.swing.interop.SwingInterOpUtils;

import javax.imageio.metadata.IIOMetadataFormatImpl;

public class WithoutX {
    public static void main(String[] args) {

        String str = "red";



        if(str.substring(0, 1).equalsIgnoreCase("x") && str.substring(str.length() - 1).equalsIgnoreCase("x")) {
                System.out.println(str.substring(1, str.length() -1));
            }
        if(str.substring(0, 1).equalsIgnoreCase("x")){
            System.out.println(str.substring(1));
            }

        if(str.substring(str.length() - 1).equalsIgnoreCase("x")){
            System.out.println(str.substring(0, str.length() - 1));
        }


            }

}
