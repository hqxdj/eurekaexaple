package unit;

import org.junit.Test;

import java.io.File;

/**
 * @program: eurekaexaple
 * @description:
 * @author: xdj
 * @create: 2019-03-22 14:02
 */

public class UnitTest {

    @Test
    public void testFile() {

        File file = new File("D:/train/train.txt");
//        System.out.println(file.getParent());
        System.out.println(file.isAbsolute());
    }



}
