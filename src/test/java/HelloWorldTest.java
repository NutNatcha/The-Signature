/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.the.signature.listener.DotenvContextListener;
import com.the.signature.models.ENV;
import com.the.signature.models.HelloWorld;
import com.the.signature.utils.ConnectionBuilder;
import io.github.cdimascio.dotenv.Dotenv;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author huag1
 */
public class HelloWorldTest extends ConnectDatabaseTest{

    public HelloWorldTest() {
    }


    @Test
    public void testHelloWorld(){
        
        HelloWorld expect = HelloWorld.getHelloWorld();
        Assert.assertNotNull(expect);
    }
}
