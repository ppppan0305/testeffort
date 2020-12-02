import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.kitesdk.data.spi.DefaultConfiguration;
import org.springframework.core.*;
import java.io.IOException;

public class TestEffort_1 {
    public void tttest() throws IOException {
        Path schemaPath = new Path("hdfs:/tmp/schema.avsc");
        FileSystem fs = schemaPath.getFileSystem(DefaultConfiguration.get());
    }
    public static void main(String args[]){
        TestEffort_1 t1 = new TestEffort_1();
        try{
            System.out.println("gdh"+JdkVersion.getJavaVersion());
            t1.tttest();
        }
        catch (Exception e ){

        }
    }
}




