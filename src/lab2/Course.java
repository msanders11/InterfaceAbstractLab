/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author msanders11
 */
public interface Course {
    
    public abstract void setCourseName(String courseName);
    
    public abstract String getCourseName();
    
    public abstract void setCourseNumber(String courseNumber);
    
    public abstract String getCourseNumber();
    
    public abstract void setCredits(double credits);
    
    public abstract double getCredits();
    
    
}
