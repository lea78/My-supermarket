package com.company;

import consolePrompt.AdminMenu;
import consolePrompt.MainMenu;
import product.Order;
import product.StockProduct;
import user.User;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import static product.CartShopping.*;


public class Interface extends JFrame {

    protected static StockProduct product = new StockProduct();
    protected static User user = new User("", "");

    public Interface() {

        /*********************************************/
        /********* Configuration of JFrame ***********/
        /*********************************************/

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(600, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        /********************************************************/
        /************ Instantiation of our object ***************/
        /********************************************************/

        // show
        StockProduct myStock = new StockProduct();

        /***********************************************************/
        /***************** Configuration of JPanel *****************/
        /***********************************************************/

        JPanel paneEnter = new JPanel();
        JPanel paneLogIn = new JPanel();
        JPanel paneSignIn = new JPanel();
        JPanel paneLogInUser = new JPanel();
        JPanel paneMain = new JPanel();
        JPanel paneClient = new JPanel();
        JPanel paneAdmin = new JPanel();

        /***********************************************************/
        /************** Configuration of Layout ********************/
        /***********************************************************/

        paneEnter.setLayout(new FlowLayout(FlowLayout.CENTER));
        paneLogIn.setLayout(new FlowLayout(FlowLayout.CENTER));
        paneMain.setLayout(new FlowLayout(FlowLayout.CENTER));
        paneClient.setLayout(new FlowLayout(FlowLayout.CENTER));
        paneAdmin.setLayout(new FlowLayout(FlowLayout.LEFT));


        /***********************************************************/
        /********* Configuration Components of Panel ***************/
        /***********************************************************/

        // PanelEnter

        JLabel enterSignature = new JLabel("<html><h1>------- Welcome to your -----<br>---- Pineapple Supermarket ----");
        JLabel space9 = new JLabel("                                                                                                                                ");
        JButton enterAppButton = new JButton("<html><h1> - ENTER - </h1></html>" + "press space");
        JLabel space7 = new JLabel("<html><br><br><br><br><br><br><br><br><br><br><br><br><br><br>");
        enterAppButton.setMnemonic(KeyEvent.VK_ENTER);
        JLabel pressSpace = new JLabel("press space to enter");
        paneEnter.setPreferredSize(new Dimension(450, 200));
        paneEnter.setFont(new Font("SCRIPT", Font.BOLD, 18));

        // PaneLogIN
        JLabel marketSignature = new JLabel("<html><h1>------- Pineapple Supermarket -------");
        JLabel space0 = new JLabel("<html><br><br><br><br><br><br><br></html>");
        JLabel space6 = new JLabel("<html><br><br><br><br><br>");
        JButton createAccount = new JButton("SIGN IN");
        JButton logIn = new JButton("LOG IN ");
        JLabel space3 = new JLabel("                                        ");
        JLabel space4 = new JLabel("<html><br><br><br><br><br>");
        JButton exitButton = new JButton("EXIT");
        JLabel space5 = new JLabel("<html><br><br><br><br><br>");
        JButton retourMainMenu = new JButton("RETOUR");
        logIn.setMnemonic(KeyEvent.VK_ENTER);
        paneLogIn.setPreferredSize(new Dimension(450, 200));
        paneLogIn.setFont(new Font("SCRIPT", Font.BOLD, 18));

        // Pane Sign In
        JLabel marketSignatur = new JLabel("<html><h1>--------- Pineapple Supermarket ---------");
        JLabel loginSignIn = new JLabel("            Login        ");
        JTextField loginText = new JTextField();
        loginText.setColumns(33);
        JLabel passWordSignIn = new JLabel("      Password        ");
        JTextField passWordText = new JTextField();
        passWordText.setColumns(33);
        JButton validate = new JButton("VALIDATE");
        JButton returnMain = new JButton("BACK");


        // Pane LogInUser
        JLabel marketSignaturLogIn = new JLabel("<html><h1>--------- Pineapple Supermarket ---------");
        JLabel login = new JLabel("          Login       ");
        JTextField loginUserText = new JTextField();
        loginUserText.setColumns(33);
        JLabel passWord = new JLabel("       Password     ");
        JTextField passUserText = new JTextField();
        passUserText.setColumns(33);
        JButton enterApp = new JButton("ENTER");
        JButton retourMain = new JButton("BACK");


        // PanelMain
        JLabel mainMenu = new JLabel("<html><h1>--- Pineapple Supermarket ---");
        mainMenu.setPreferredSize(new Dimension(450, 200));
        mainMenu.setFont(new Font("SCRIPT", Font.BOLD, 18));
        mainMenu.setHorizontalAlignment(SwingConstants.CENTER);


        JLabel enterUsername = new JLabel("Username : ");
        enterUsername.setPreferredSize(new Dimension(150, 20));

        JTextField userNameText = new JTextField();
        userNameText.setColumns(30);

        JLabel enterPassword = new JLabel("Password : ");
        enterPassword.setPreferredSize(new Dimension(150, 20));

        JTextField userPassText = new JTextField();
        userPassText.setColumns(30);

        JButton enterButton = new JButton("ENTER");


        // PanelClient
        JLabel clientLabel = new JLabel("Client interface ",SwingConstants.CENTER);
        clientLabel.setFont(new Font("Chalkdsuter",Font.CENTER_BASELINE,20));
        clientLabel.setForeground(Color.getHSBColor(7,6,7));
        clientLabel.setPreferredSize(new Dimension(500,80));
        JButton products = new JButton("PRODUCTS");
        JButton addProductsCart = new JButton("ADD PRODUCTS TO CART");
        JButton seeCart = new JButton("SEE CART");
        JLabel ghostSpace = new JLabel("");
        ghostSpace.setPreferredSize(new Dimension(500,70));
        JButton logout = new JButton("LOGOUT");
        JTextArea StockText = new JTextArea();
        StockText.setPreferredSize(new Dimension(500,200));
            //Add to Cart
        JLabel IDofProduct = new JLabel("Type ID of product wanted",SwingConstants.RIGHT);
        IDofProduct.setPreferredSize(new Dimension(170,50));
        IDofProduct.setVisible(false);
        JTextField addID = new JTextField();
        addID.setPreferredSize(new Dimension(50,40));
        addID.setVisible(false);
        JLabel quantityDesired = new JLabel("Quantity",SwingConstants.RIGHT);
        quantityDesired.setPreferredSize(new Dimension(100,50));
        quantityDesired.setVisible(false);
        JTextField addQuantity = new JTextField();
        addQuantity.setPreferredSize(new Dimension(50,40));
        addQuantity.setVisible(false);
        JButton enter = new JButton("ENTER");
        enter.setVisible(false);
        JTextArea myCart = new JTextArea();
        myCart.setPreferredSize(new Dimension(500,100));
        myCart.setVisible(false);



        // PanelAdmin
        JLabel interfaceAdminLabel = new JLabel("ADMIN INTERFACE");
        interfaceAdminLabel.setFont(new Font("Courier New ", Font.BOLD, 18));

        JButton listProductsButton = new JButton("List Products");
        JButton addProductButton = new JButton("Add Product");
        JButton listOrderButton = new JButton("See clients order");
        JTextArea resultArea = new JTextArea(25,30);
        JButton logoutAdmin = new JButton("Logout");

        JButton confirmButton = new JButton("Confirm");
        confirmButton.setVisible(false);

        JLabel labelNewName = new JLabel("Enter a new name: ");
        labelNewName.setVisible(false);

        JTextField textNewName = new JTextField();
        textNewName.setColumns(35);
        textNewName.setVisible(false);


        JLabel labelQuantity = new JLabel("Enter a quantity:    ");
        labelQuantity.setVisible(false);

        JTextField textQuantity = new JTextField();
        textQuantity.setColumns(35);
        textQuantity.setVisible(false);

        JLabel labelPrice = new JLabel("Enter a price:         ");
        labelPrice.setVisible(false);

        JTextField textPrice = new JTextField();
        textPrice.setColumns(35);
        textPrice.setVisible(false);

        JLabel labelID = new JLabel("Enter an ID:           ");
        labelID.setVisible(false);

        JTextField textID = new JTextField();
        textID.setColumns(35);
        textID.setVisible(false);


        //Ne regarde pas ça Pierre-Henri, promis le reste c'est bien !
        JLabel ghost = new JLabel("                                                    ");
        JLabel ghost0 = new JLabel("<html><h1><br>");
        JLabel ghost1 = new JLabel("                                            ");
        JLabel ghost2 = new JLabel("                       ");
        JLabel ghost3 = new JLabel("                             ");
        JLabel ghost4 = new JLabel("                                ");
        JLabel ghost5 = new JLabel("<html><h1><br><br>");
        JLabel ghost6 = new JLabel("                        ");



        /***********************************************************/
        /**************** Add components in Panel ******************/
        /***********************************************************/

        setContentPane(new JLabel(new ImageIcon("/Users/paulmarechal/IdeaProjects/My-supermarket/src/Picture/MainMenu.png")));
        setLayout(new FlowLayout());
        add(enterSignature);
        add(enterAppButton);
        add(space7);
        /*
        paneEnter.add(enterSignature);
        paneEnter.add(enterAppButton);
        paneEnter.add(space7);

         */

        paneLogIn.add(marketSignature);
        paneLogIn.add(space0);
        paneLogIn.add(space4);
        paneLogIn.add(createAccount);
        paneLogIn.add(space5);
        paneLogIn.add(logIn);
        paneLogIn.add(space6);
        paneLogIn.add(space4);
        paneLogIn.add(exitButton);

        paneSignIn.add(marketSignatur);
        paneSignIn.add(loginSignIn);
        paneSignIn.add(loginText);
        paneSignIn.add(passWordSignIn);
        paneSignIn.add(passWordText);
        paneSignIn.add(validate);
        paneSignIn.add(returnMain);

        paneLogInUser.add(marketSignaturLogIn);
        paneLogInUser.add(login);
        paneLogInUser.add(loginUserText);
        paneLogInUser.add(passWord);
        paneLogInUser.add(passUserText);
        paneLogInUser.add(enterApp);
        paneLogInUser.add(retourMain);

        paneMain.add(mainMenu);
        paneMain.add(enterUsername);
        paneMain.add(userNameText);
        paneMain.add(enterPassword);
        paneMain.add(userPassText);
        paneMain.add(enterButton);
        paneMain.add(retourMainMenu);

        paneClient.add(clientLabel);
        paneClient.add(products);
        paneClient.add(addProductsCart);
        paneClient.add(seeCart);
        paneClient.add(IDofProduct);
        paneClient.add(addID);
        paneClient.add(quantityDesired);
        paneClient.add(addQuantity);
        paneClient.add(enter);
        paneClient.add(myCart);
        paneClient.add(ghostSpace);
        paneClient.add(StockText);
        paneClient.add(logout);


        paneAdmin.add(ghost);
        paneAdmin.add(ghost0);
        paneAdmin.add(interfaceAdminLabel);
        paneAdmin.add(ghost1);
        paneAdmin.add(ghost2);
        paneAdmin.add(listProductsButton);
        paneAdmin.add(addProductButton);
        paneAdmin.add(listOrderButton);
        paneAdmin.add(ghost3);
        paneAdmin.add(resultArea);
        paneAdmin.add(labelNewName);
        paneAdmin.add(textNewName);
        paneAdmin.add(labelQuantity);
        paneAdmin.add(textQuantity);
        paneAdmin.add(labelPrice);
        paneAdmin.add(textPrice);
        paneAdmin.add(labelID);
        paneAdmin.add(textID);
        paneAdmin.add(ghost4);
        paneAdmin.add(ghost5);
        paneAdmin.add(ghost6);
        paneAdmin.add(confirmButton);
        paneAdmin.add(logoutAdmin);


        /***********************************************************/
        /****************** User actions management ****************/
        /***********************************************************/

        /*
        setContentPane(paneEnter);
        revalidate();

         */

        // Enter button

        enterAppButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                setContentPane(paneLogIn);
                revalidate();
            }
        });

        // Create Account button
        createAccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                setContentPane(paneSignIn);
                revalidate();
            }
        });

        // Login button
        logIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                setContentPane(paneLogInUser);
                revalidate();
            }
        });

        // Exit button
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                setContentPane(paneEnter);
                revalidate();
            }
        });

        returnMain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                setContentPane(paneEnter);
                revalidate();
            }
        });

        retourMain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                setContentPane(paneEnter);
                revalidate();
            }
        });


        // CLIENTPANE => see product in stock button
        products.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myStock.getProductStock(StockText);
            }
        });

        // CLIENTPANE => add product from stock to cart.
        addProductsCart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ghostSpace.setVisible(false);
                IDofProduct.setVisible(true);
                addID.setVisible(true);
                quantityDesired.setVisible(true);
                addQuantity.setVisible(true);
                enter.setVisible(true);
                myCart.setVisible(true);
            }
        });
        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cartShopping.addFieldToCart(addID,addQuantity);
                cartShopping.displayCart(myCart);
                myStock.getProductStock(StockText);
            }
        });

        // CLIENTPANE => see Cart + confirm order.
        seeCart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane confirmYourPurchase = new JOptionPane();
                int retour = confirmYourPurchase.showConfirmDialog(null,"Do you confirm your purchases ?",
                        "   CART   ",JOptionPane.OK_CANCEL_OPTION);
                if (retour == 0 ){
                    cartShopping.displayCart(StockText);
                    Order orderUser = new Order(userNameText.getText(), cartShopping,cartShopping.getCartTotalAmount(),1);
                    AdminMenu.myOrderList.addOrderToList(orderUser);
                    JOptionPane yourPurchase = new JOptionPane();
                    yourPurchase.showMessageDialog(null,
                            "Thanks to ordered in Pineapple Market ! You will receive your articles soon.",
                            "You order",JOptionPane.PLAIN_MESSAGE);
                    cartShopping.clearShoppingCart();
                }
            }
        });

        listProductsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultArea.setVisible(true);
                ghost3.setVisible(true);
                labelNewName.setVisible(false);
                textNewName.setVisible(false);
                labelQuantity.setVisible(false);
                textQuantity.setVisible(false);
                labelPrice.setVisible(false);
                textPrice.setVisible(false);
                labelID.setVisible(false);
                textID.setVisible(false);
                confirmButton.setVisible(false);
                myStock.getProductStock(resultArea);
                revalidate();

            }
        });

        addProductButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultArea.setVisible(false);
                ghost3.setVisible(false);
                labelNewName.setVisible(true);
                textNewName.setVisible(true);
                labelQuantity.setVisible(true);
                textQuantity.setVisible(true);
                labelPrice.setVisible(true);
                textPrice.setVisible(true);
                labelID.setVisible(true);
                textID.setVisible(true);
                confirmButton.setVisible(true);
                revalidate();


            }



        });

        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (textNewName.getText().isEmpty() || textQuantity.getText().isEmpty() || textPrice.getText().isEmpty() || textID.getText().isEmpty()) {
                    //labelConfirm.setVisible(false);
                    //labelFailure.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Uh-oh!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    //labelConfirm.setVisible(true);
                    //labelFailure.setVisible(false);
                    myStock.addProduct(textNewName.getText(), Integer.parseInt(textQuantity.getText()), Integer.parseInt(textPrice.getText()), Integer.parseInt(textID.getText()));
                }
                textNewName.setText("");
                textQuantity.setText("");
                textPrice.setText("");
                textID.setText("");

            }
        });


        enterApp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                if (loginUserText.getText().equals("admin") && passUserText.getText().equals("admin")) {
                    // Entre dans admin panel
                    setContentPane(paneAdmin);
                    revalidate();
                } else if (loginUserText.getText().equals("guest") && passUserText.getText().equals("guest")) {
                    setContentPane(paneClient);
                    revalidate();
                } else {
                    JLabel dontHaveAccount = new JLabel("Sorry but i don't know your id");
                }
            }
        });

        logoutAdmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                setContentPane(paneEnter);
                revalidate();
            }
        });

        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                setContentPane(paneEnter);
                revalidate();
            }
        });

    }
}

