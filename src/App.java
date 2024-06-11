/**
   COPYRIGHT (C) 2021 Amoriah Tremko. All Rights Reserved.
   Class to fill a person's data.
   Solves IST242 homework assignment #11
   @author Amoriah Tremko
   @version 1.11 2021-04-30
*/
import Controller.Controller;
import Model.Model;
import View.View;

public class App
{
    public static void main(String[] args)
    {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);
    }
}