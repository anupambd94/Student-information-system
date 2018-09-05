/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentinfo;

/**
 *
 * @author PROG-LAB
 */
public class Student {
    
    String StudentName = "",StudentAddress = "",StudentDept = "";
    int StudentId = 0;
    
    void SetStudnetName(String newName)
    {
      StudentName =  newName; 
    }
    
    void SetStudnetAddress(String newAddress)
    {
      StudentAddress =  newAddress; 
    }
    
    void SetStudnetDept(String newDept)
    {
      StudentDept =  newDept; 
    }
    
    void SetStudnetId(int newId)
    {
      StudentId =  newId; 
    }
    
    
    String GetStudnetName()
    {
      return StudentName ; 
    }
    
    String GetStudnetAddress()
    {
      return StudentAddress; 
    }
    
    String GetStudnetDept()
    {
      return StudentDept; 
    }
    
    int GetStudnetId()
    {
      return StudentId; 
    }
    
    
}
