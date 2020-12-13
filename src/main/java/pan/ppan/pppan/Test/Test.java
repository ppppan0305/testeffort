package pan.ppan.pppan.Test;

import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;

public class Test {
//
    public void tttest(String ar) throws IOException {
        Path schemaPath = new Path("hdfs:/tmp/schema.avsc");
        System.out.println(ar);
        FileSystem fs = schemaPath.getFileSystem(null);
    }

    public static void main(String args[]){

//        Test t1 = new Test();
//
//        try{
//            t1.tttest("xxx");
//        }
//        catch (Exception e ){
//        }
    }
}
