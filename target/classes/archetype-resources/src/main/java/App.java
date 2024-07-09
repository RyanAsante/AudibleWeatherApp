package $org.example;

import org.apache.http.HttpEntity
import org.apache.http.entity.BasicHttpEntity;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        HttpEntity httpEntity = new BasicHttpEntity();

        print(httpEntity)
        System.out.println("");
    }

    public static void testMain(){
        System.out.println("hrllo");
    }
}
