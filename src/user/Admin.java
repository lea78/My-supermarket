package user;

import consolePrompt.AdminMenu;
import consolePrompt.Menu;


public class Admin extends User {

    /****************************************************/
    /*************** Attributes/Instances ***************/
    /****************************************************/

    //Empty for now

    /****************************************************/
    /***********           Constructor        ***********/
    /****************************************************/

    public Admin(String username, String password) {
        super(username, password);
    }

    /****************************************************/
    /***********            Methods           ***********/
    /****************************************************/


    public static Menu getMenu() {
        return new AdminMenu();
    }

    /****************************************************/
    /***********            Getters           ***********/
    /****************************************************/



    /****************************************************/
    /***********            Setters           ***********/
    /****************************************************/


}
