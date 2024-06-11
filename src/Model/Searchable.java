/**
   COPYRIGHT (C) 2021 Amoriah Tremko. All Rights Reserved.
   Class to fill a person's data.
   Solves IST242 homework assignment #11
   @author Amoriah Tremko
   @version 1.11 2021-04-30
*/
package Model;

public interface Searchable {
    public boolean search(String searchTerm);

    public int getFoundIndex();
    public void setFoundIndex(int tableMemberindex);

    public boolean getFound();
    public void setFound(boolean searchResult);

    public int getSearchByField();
    public void setSearchByField(int fieldIndex);
    
}
