/**
   COPYRIGHT (C) 2021 Amoriah Tremko. All Rights Reserved.
   Class to fill a person's data.
   Solves IST242 homework assignment #11
   @author Amoriah Tremko
   @version 1.11 2021-04-30
*/
package Model;
import java.util.ArrayList;

/*
Interface for table member information
*/
public interface TableMember
{
    public String getAttribute(int n);
    public ArrayList<String> getAttributes();
    public String getAttributeName(int n);
    public ArrayList<String> getAttributeNames();
}
