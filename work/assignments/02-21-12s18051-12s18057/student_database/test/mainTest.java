import org.junit.Test;
import static org.junit.Assert.*;

/**  
 *  
 * 
 * @author 21-12S18051 Cindy Hutapea
 * @author 21_12S18057 Andrew Saragih
 */ 
public class mainTest { 
 
  public mainTest() {  
  } 
 
  /**    * Test of add method, of class main.    */   
  @Test   
  public void testAdd() {  
      
    main.reset(); 
 
    main.add("12S17067", "Fradina");     
    assertEquals(1, main.count()); 
 
    main.add("12S18001", "Cindy");     
    assertEquals(2, main.count()); 
 
    main.add("12S18002", "Wiranda");     
    assertEquals(3, main.count()); 
 
    main.add("12S18003", "Citra");     
    assertEquals(4, main.count()); 
 
    main.add("12S18004", "Rosalia"); 
    assertEquals(5, main.count());
  }
  
 /**    
  * Test of find method, of class main.    
  */   
  @Test   
  public void testFind() {  
      
      String result;
      main.reset(); 
 
    main.add("12S17067", "Fradina");     
    main.add("12S18001", "Cindy");     
    main.add("12S18002", "Wiranda");     
    main.add("12S18003", "Citra");     
    main.add("12S18004", "Rosalia"); 
 
    result = main.find("12S17067");     
    assertEquals("12S17067 Fradina", result); 
 
    result = main.find("12S18003");     
    assertEquals("12S18003 Citra", result); 
 
    result = main.find("12S18006");     
    assertEquals("", result);   
  } 

 /**    
  * Test of count method, of class main.    
  */   
  @Test   
  public void testCountNoData() {  
      
    main.reset();
  
 
    assertEquals(0, main.count());   
  } 
 
  /**    
   * Test of count method, of class main.    
   */   
  @Test   
  public void testCountSomeData() {   
      
    main.reset(); 
 
    main.add("12S17067", "Fradina");     
    main.add("12S18001", "Cindy");     
    main.add("12S18002", "Wiranda");    
    main.add("12S18003", "Citra");    
    main.add("12S18004", "Rosalia"); 
 
    assertEquals(5, main.count());   
  }
  
 /**    
  * Test of reset method, of class main.    
  */   
  @Test   
  public void testReset() {  
      
      main.reset();
      assertEquals(0, main.count()); 
 
    main.add("12S17067", "Fradina"); 
    main.add("12S18001", "Cindy");     
    main.reset();     
    assertEquals(0, main.count()); 
 
    main.add("12S18002", "Wiranda");     
    main.add("12S18003", "Citra");     
    main.add("12S18004", "Rosalia");     
    main.reset();     
    assertEquals(0, main.count());   
  } 
} 
 
 