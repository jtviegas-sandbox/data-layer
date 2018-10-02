package org.aprestos.labs.datalayer;

import org.aprestos.labs.datalayer.services.DataService;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DataLayerTests {

  @Autowired
  private DataService dataService;
  
  @Test
  public void test_get() {
    
    Assert.assertTrue( 0 <= dataService.get().size()); 
    
  }

}
