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
Interface for table data information
*/
public interface TableData
{

    public void loadTable();
    public ArrayList<TableMember> getTable();
    public ArrayList<String> getHeaders();
    public ArrayList<String> getLine(int line);
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine);

}
