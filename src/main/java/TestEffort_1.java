import org.springframework.web.util.WebUtils;
public class TestEffort_1 {

    public static void main(String args[]){
       System.out.println(WebUtils.FORWARD_REQUEST_URI_ATTRIBUTE);
    }
}
class D extends WebUtils{

}



