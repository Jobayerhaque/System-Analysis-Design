/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Agent47
 */
public class Association {
    
       public static void main (String args[]){
            
           Customer cust1 = new Customer("Jobayer", "jobayer636", "636585");
           Address addr1 = new Address(03, 02, "Badda Link Road", "23/KA", "Gulshan", "Dhaka");
           
           System.out.println(cust1.customer() + " " + addr1.address());
           
           
           Admin admin1 = new Admin("HR", "hr9768", "hr@13579");
           Address addr2 = new Address (03, 9, "Sonargaon road", "SHA/13", "Dhanmondi", "Dhaka");
           
           
           System.out.println(admin1.admin() + " " + addr2.address());
           
           
        }
    
    
}
