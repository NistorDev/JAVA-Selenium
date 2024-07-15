import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.time.Duration;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

    public class AppTest extends JFrame {

    //variabila cu site.ul
        static String OneUp = "https://one-up.me/";

        static int load = 180;
    //user creditentials
        static String numar; 
        static String parola; 

    // calea catre cookie
        static String temp = "close-pc-btn-handler";
        static String temp1 = "//*[@id=\"close-pc-btn-handler\"]";
    //calea catre mail inputBox

        static String temp5 = "//*[@id=\"email\"]";

    // calea catre casuta de parola
        static String temp2 = "//*[@id=\"password\"]";
    // calea catre inputCod box
        static String temp3 = "/html/body/div[1]/div/div/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div/div[1]/div[2]/div/div[2]/input";

    //static String stringNr  = {"1"};
        static String[] forNr = {"1"};
        static String temp4 = "";
        static String[] coduri = temp4.split(" ");

        // cale buton inchidere cod gresit
        static String temp6 = "/html/body/div[1]/div/div/div/div[5]/div/div[2]/div/div/div/div[4]/div/div/div";
        //
        static String temp7="/html/body/div[1]/div/div/div/div[5]/div/div[2]/div/div/div/div[4]/div/div/div/div";

    //idee de metoda random functionala( utilizata la introducerea codurilor pentru a nu parea robotizat)
    //driver.manage().timeouts().implicitlyWait((int)(Math.random()*30), TimeUnit.SECONDS);





        static String text1;
        static String text2;
        static String text3;

        public AppTest() {
            //obiectul frame creeaza corpul aplicatiei
            JFrame frame = new JFrame("CodIn");
            JPanel panel = new JPanel(); //panel de test, nu are utilitate
            //frame.add(panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);

            //informatii despre layout
            frame.setLayout(new FlowLayout());
            frame.setLayout(null);
            //frame.setBackground(Color.green);

            frame.setSize(580, 400); //dimensiunea aplicatiei
            frame.setLocation(0, 0);//locatia unde se deschide aplicatia pe ecran
            frame.setVisible(true);// vizibilitatea aplicatiei
            //background color
            frame.getContentPane().setBackground(new Color(37, 146, 172));// culoarea de fundal

            //label insert box numar
            JLabel inUser = new JLabel("Numar telefon");
            inUser.setBounds(10, 0, 180, 30);
            inUser.setEnabled(true);
            frame.add(inUser);

            //label passordIn box
            JLabel inPasswd = new JLabel("Introdu Parola");
            //inPasswd.setPreferredSize(new Dimension(300, 10 ));
            //inPasswd.setBounds(0, 300, size.width, size.height);
            //inPasswd.setVerticalTextPosition(50);
            //inPasswd.setHorizontalAlignment(JLabel.LEFT);
            inPasswd.setBounds(10, 70, 180, 10);
            //inPasswd.setLocation(10, 70);
            inPasswd.setEnabled(true);
            inPasswd.setVisible(true);
            inPasswd.setBackground(Color.black);
            frame.add(inPasswd);

            //label codinsert box
            JLabel inCod = new JLabel("Introdu coduri");
            inCod.setBounds(10, 145, 180, 30);
            frame.add(inCod);

            //buton pentru a prelua informatiile din textBox si porneste aplicatia
            JButton submit = new JButton("Start");
            //submit.setLocation(375, 240);
            submit.setBounds(75, 270, 100, 35);
            submit.setVisible(true);
            frame.add(submit);

            // buton care inchide browserul
            JButton close = new JButton("Inchide Browser");
            //submit.setLocation(375, 240);
            close.setBounds(250, 270, 160, 35);
            close.setVisible(true);
            frame.add(close);

            //textBox user
            JTextField userText = new JTextField("");
            userText.setLocation(10, 25);
            frame.add(userText);
            userText.setSize(450, 35);
            //userText.getPreferredSize();

            //textBox parola
            JTextField passwdText = new JTextField("");
            frame.add(passwdText);
            passwdText.setLocation(10, 100);
            passwdText.setSize(450, 35);

            //textBox coduri
            JTextField codText = new JTextField("");
            frame.add(codText);
            codText.setLocation(10, 180);
            codText.setSize(450, 35);


            String cod = codText.getText();
            //System.out.println(cod);

            //obiectul driver
            FirefoxDriver driver = new FirefoxDriver();

            //defineste dimensiunea si pozitia site.ului
            driver.manage().window().setSize(new Dimension(1000, 750));
            // Move the window to the top left of the primary monitor
            driver.manage().window().setPosition(new Point(3900, 0));

            //eventul care preia datele din textField si le stocheaza
            submit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    numar = userText.getText();
                    parola = passwdText.getText();
                    temp4 = codText.getText();

                    System.out.println(numar);
                    System.out.println(parola);
                    System.out.println(temp4);

                    String[] coduri1 = temp4.split(" ");


                    if(actionEvent.getSource()==submit){

                        //test transformare string to list
                        //System.out.println(Arrays.toString(coduri));
                        String temp9 = "/html/body/div[1]/div/div/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div/div[1]/div/div/div/div[1]/div/div[2]/div[2]/div/div/div/div[1]/div/div/div/div[1]/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div/div[2]/div[2]";









                        //obiectul scanner
                        Scanner scan = new Scanner(System.in);

                        //defineste dimensiunea si pozitia site.ului
                        driver.manage().window().setSize(new Dimension(1000, 750));
                        // Move the window to the top left of the primary monitor
                        driver.manage().window().setPosition(new Point(3900, 0));


                        //deschide browser.ul
                        driver.get(OneUp);


                        //asteapta sa apara fereastra cookie
                        WebElement asteaptaCookie = new WebDriverWait(driver, Duration.ofSeconds(load))
                                .until(ExpectedConditions.elementToBeClickable(By.xpath(temp1)));

                        //inchide cookie
                        boolean cookie = driver.findElement(By.cssSelector("#close-pc-btn-handler")).isEnabled();
                        if (cookie == true) {
                            System.out.println("verificat");
                            driver.findElement(By.cssSelector("#close-pc-btn-handler")).click();
                            driver.manage().timeouts().implicitlyWait(load, TimeUnit.SECONDS);
                        } else {
                            System.out.println("err");
                        }


                        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        //driver.findElement(By.cssSelector("#close-pc-btn-handler")).click();

                        // apasa pe caseta insert numar/mail
                        driver.manage().timeouts().implicitlyWait(load, TimeUnit.SECONDS);
                        //driver.findElement(By.cssSelector("div.r-1peese0:nth-child(2)")).click();

                        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

                        //verifica daca e prezenta casuta pentru numar/email
                        boolean mail = driver.findElement(By.id("email")).isEnabled();
                        if (mail == true) {
                            WebElement prezentaEmail = new WebDriverWait(driver, Duration.ofSeconds(load))
                                    .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#email")));

                            System.out.println("verificat");
                            System.out.println(numar);
                        } else {
                            System.out.println("err");
                        }
                        //verifica daca a disparut cookie
                        boolean cookie2 = driver.findElement(By.cssSelector("#close-pc-btn-handler")).isDisplayed();

                        if(numar==""){
                            driver.close();
                        }
                        //introduce numarul de telefon

                        if (mail == true) {
                            WebElement asteaptaCookie1 = new WebDriverWait(driver, Duration.ofSeconds(load))
                                    .until(ExpectedConditions.elementToBeClickable(By.xpath(temp5)));
                            //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                            driver.manage().timeouts().implicitlyWait((int) (Math.random() * 30), TimeUnit.SECONDS);
                            if(numar!=null) {
                                driver.findElement(By.cssSelector("#email")).sendKeys(numar);
                                System.out.println(numar);
                            } else {
                                driver.close();
                            }
                            driver.findElement(By.cssSelector("#email")).sendKeys(Keys.ENTER);
                        } else {
                            System.out.println("err");
                        }

                        WebElement asteaptaNumar = new WebDriverWait(driver, Duration.ofSeconds(load))
                                .until(ExpectedConditions.elementToBeClickable(By.xpath(temp9)));
                        boolean temp8 = driver.findElement(By.cssSelector("div.r-1k1m43q:nth-child(2)")).isDisplayed();
                        if(temp8==true){
                            driver.close();
                        }

                        //introduce parola
                        boolean pass = driver.findElement(By.cssSelector("#password")).isEnabled();

                        if(parola==null){
                            driver.close();
                        }
                        if (pass == true) {

                            WebElement asteaptaPass = new WebDriverWait(driver, Duration.ofSeconds(load))
                                    .until(ExpectedConditions.elementToBeClickable(By.xpath(temp2)));
                            driver.findElement(By.cssSelector("#password")).sendKeys(parola);
                            driver.findElement(By.cssSelector("#password")).sendKeys(Keys.ENTER);
                        } else {
                            System.out.println("err");
                        }
                        //introduce coduri
                        WebElement asteaptaCodBox = new WebDriverWait(driver, Duration.ofSeconds(load))
                                .until(ExpectedConditions.elementToBeClickable(By.xpath(temp3)));
                        boolean inputCod = driver.findElement(By.xpath(temp3)).isEnabled();
                        if (inputCod == true) {
                            WebElement asteaptaInput = new WebDriverWait(driver, Duration.ofSeconds(load))
                                    .until(ExpectedConditions.elementToBeClickable(By.xpath(temp3)));
                            System.out.println("Verificat");
                            driver.findElement(By.xpath(temp3)).click();


                        } else {
                            driver.close();
                            System.out.println("err");

                            //idee de metoda random functionala( utilizata la introducerea codurilor pentru a nu parea robotizat)
            /*WebElement asteapta = new WebDriverWait(driver, Duration.ofSeconds((int)Math.random()*30))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath(temp3)));

               driver.manage().timeouts().implicitlyWait((int)(Math.random()*30), TimeUnit.SECONDS);
        */
                        }

                        /*WebElement asteaptaCod = new WebDriverWait(driver, Duration.ofSeconds(load))
                                .until(ExpectedConditions.elementToBeClickable(By.xpath(temp3)));
                        for(int i =0; i< coduri1.length; i++){

                            driver.findElement(By.xpath(temp3)).sendKeys(coduri1[]);
                            driver.findElement(By.xpath(temp3)).sendKeys(Keys.ENTER);
                            System.out.println(coduri1);
                        }*/

                        // introduce coduri
                        /*WebElement asteaptaCod = new WebDriverWait(driver, Duration.ofSeconds(load))
                                .until(ExpectedConditions.elementToBeClickable(By.xpath(temp3)));
                        for (String i : coduri1) {
                            driver.manage().timeouts().implicitlyWait(load, TimeUnit.SECONDS);
                            int rand = (int) (Math.random() * 100);
                            try {
                                Thread.sleep((int) rand);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                            driver.manage().timeouts().implicitlyWait(load, TimeUnit.SECONDS);


                            driver.findElement(By.xpath(temp3)).sendKeys(i); //+ Keys.ENTER);
                            String temp6 = driver.findElement(By.xpath(temp3)).getAttribute("value");
                            if(temp6 != null) {
                                driver.findElement(By.xpath(temp3)).sendKeys(Keys.ENTER);
                                System.out.println(i);
                            }
                        }*/

                        // introduce codurile in ordine, unul cate unul
                        WebElement asteaptaCod = new WebDriverWait(driver, Duration.ofSeconds(load))
                                .until(ExpectedConditions.elementToBeClickable(By.xpath(temp3)));
                        int s = 0;
                        while( s<coduri1.length){
                            driver.findElement(By.xpath(temp3)).sendKeys(coduri1[s]);
                            int rand = (int) (Math.random() * 100);
                            try {
                                Thread.sleep((int) rand);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                            driver.findElement(By.xpath(temp3)).sendKeys(Keys.ENTER);
                            driver.findElement(By.xpath(temp3)).click();
                            WebElement asteaptaBtnInchide = new WebDriverWait(driver, Duration.ofSeconds(load))
                                    .until(ExpectedConditions.elementToBeClickable(By.xpath(temp6)));
                            try {
                                Thread.sleep((int) rand);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                            driver.findElement(By.xpath(temp6)).click();
                            driver.findElement(By.xpath(temp3)).click();
                            s++;
                        }


                        /*for (String in : forNr) {
                            0742695052
                            Drrrk!@!1
                            a a1 a2 a3
                            System.out.println(Arrays.toString(coduri1));
                        }*/

                        /*
                        System.out.println("Inchizi?");
                        scan.nextLine();
                        String close = "da";
                        if (close == "da") {
                            driver.close();
                        }*/



                    }
                }
            });

            close.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    if(actionEvent.getSource()==close){
                        driver.close();

                    }

                }
            });









                    //frame.pack();

        }

        public static void main(String[] args) throws InterruptedException {

            //initiaza aplicatia grafica
            AppTest app = new AppTest();
            app.frameInit();
            JButton startDriver = new JButton("Start1");
            startDriver.setBounds(375, 450, 100, 35);
            startDriver.setVisible(true);
            app.add(startDriver);
            boolean empty = AppTest.parola.isEmpty();
            //Thread.sleep(50);


            /*
            //test transformare string to list
                //System.out.println(Arrays.toString(coduri));

                //obiectul driver
                FirefoxDriver driver = new FirefoxDriver();


                //obiectul scanner
                Scanner scan = new Scanner(System.in);

                //defineste dimensiunea si pozitia site.ului
                driver.manage().window().setSize(new Dimension(1000, 750));
                // Move the window to the top left of the primary monitor
                driver.manage().window().setPosition(new Point(3900, 0));


                //deschide browser.ul
                driver.get(OneUp);


                //asteapta sa apara fereastra cookie
                WebElement asteaptaCookie = new WebDriverWait(driver, Duration.ofSeconds(20))
                        .until(ExpectedConditions.elementToBeClickable(By.xpath(temp1)));

                //inchide cookie
                boolean cookie = driver.findElement(By.cssSelector("#close-pc-btn-handler")).isEnabled();
                if (cookie == true) {
                    System.out.println("verificat");
                    driver.findElement(By.cssSelector("#close-pc-btn-handler")).click();
                    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                } else {
                    System.out.println("err");
                }


                //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                //driver.findElement(By.cssSelector("#close-pc-btn-handler")).click();

                // apasa pe caseta insert numar/mail
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                //driver.findElement(By.cssSelector("div.r-1peese0:nth-child(2)")).click();

                //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

                //verifica daca e prezenta casuta pentru numar/email
                boolean mail = driver.findElement(By.id("email")).isEnabled();
                if (mail == true) {
                    WebElement prezentaEmail = new WebDriverWait(driver, Duration.ofSeconds(20))
                            .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#email")));

                    System.out.println("verificat");
                } else {
                    System.out.println("err");
                }
                //verifica daca a disparut cookie
                boolean cookie2 = driver.findElement(By.cssSelector("#close-pc-btn-handler")).isDisplayed();


                //introduce numarul de telefon

                if (mail == true) {
                    WebElement asteaptaCookie1 = new WebDriverWait(driver, Duration.ofSeconds(20))
                            .until(ExpectedConditions.elementToBeClickable(By.xpath(temp5)));
                    //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                    driver.manage().timeouts().implicitlyWait((int) (Math.random() * 30), TimeUnit.SECONDS);
                    driver.findElement(By.cssSelector("#email")).sendKeys(numar);
                    driver.findElement(By.cssSelector("#email")).sendKeys(Keys.ENTER);
                } else {
                    System.out.println("err");
                }
                //introduce parpla
                boolean pass = driver.findElement(By.cssSelector("#password")).isEnabled();
                if (pass == true) {

                    WebElement asteaptaPass = new WebDriverWait(driver, Duration.ofSeconds(30))
                            .until(ExpectedConditions.elementToBeClickable(By.xpath(temp2)));
                    driver.findElement(By.cssSelector("#password")).sendKeys(parola);
                    driver.findElement(By.cssSelector("#password")).sendKeys(Keys.ENTER);
                } else {
                    System.out.println("err");
                }
                //introduce coduri
                WebElement asteaptaCodBox = new WebDriverWait(driver, Duration.ofSeconds(30))
                        .until(ExpectedConditions.elementToBeClickable(By.xpath(temp3)));
                boolean inputCod = driver.findElement(By.xpath(temp3)).isEnabled();
                if (inputCod == true) {
                    WebElement asteaptaInput = new WebDriverWait(driver, Duration.ofSeconds(30))
                            .until(ExpectedConditions.elementToBeClickable(By.xpath(temp3)));
                    System.out.println("Verificat");
                    driver.findElement(By.xpath(temp3)).click();


                } else {
                    System.out.println("err");

                    //idee de metoda random functionala( utilizata la introducerea codurilor pentru a nu parea robotizat)
            /*WebElement asteapta = new WebDriverWait(driver, Duration.ofSeconds((int)Math.random()*30))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath(temp3)));

               driver.manage().timeouts().implicitlyWait((int)(Math.random()*30), TimeUnit.SECONDS);
        */  /*
                }
                // introduce coduri
                WebElement asteaptaCod = new WebDriverWait(driver, Duration.ofSeconds(30))
                        .until(ExpectedConditions.elementToBeClickable(By.xpath(temp3)));
                for (String i : forNr) {
                    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                    int rand = (int) (Math.random() * 100);
                    try {
                        Thread.sleep((int) rand);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    driver.manage().timeouts().implicitlyWait(rand, TimeUnit.SECONDS);
                    driver.findElement(By.xpath(temp3)).sendKeys(coduri);
                    System.out.println(Arrays.toString(coduri));
                }

                for (String in : forNr) {
                    System.out.println(coduri);
                }


                System.out.println("Inchizi?");
                scan.nextLine();
                String close = "da";
                if (close == "da") {
                    driver.close();
                }
            */
        }


    }

