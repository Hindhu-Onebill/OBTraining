//Sorting elements of class using comparable

package com.onebill.corejava.Day9Assignment;

import java.util.LinkedHashSet;
import java.util.TreeSet;
 
// Implement the Comparable interface
class User implements Comparable<User>{
    
    private int id;
    
    public User(int id){
        this.id = id;
    }
 
    public int getId(){
        return this.id;
    }
    
    public String toString(){
        return "User -> " + getId();
    }
 
    //define the compareTo method
    public int compareTo(User otherUser) {
        return this.getId() - otherUser.getId();
    }
}
 
public class LinkedHashSetComparable {
 
    public static void main(String[] args) {
        
        LinkedHashSet<User> lhSetUsers = new LinkedHashSet<User>();
 
        lhSetUsers.add( new User(3) );
        lhSetUsers.add( new User(1) );
        lhSetUsers.add( new User(2) );
        
        TreeSet<User> tSet = new TreeSet<User>( lhSetUsers );
        
        System.out.println("TreeSet contains: " + tSet);
    }
}