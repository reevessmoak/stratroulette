package com.company;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowListener;


public class GuiApp extends Frame implements WindowListener,ActionListener {
    TextField weproll = new TextField(20);
    TextField armroll = new TextField(20);;
    TextField medroll = new TextField(20);
    TextField vehroll = new TextField(20);
    TextField drzroll = new TextField(20);
    TextField sprroll = new TextField(20);
    Button wepbut = new Button();
    Button armbut = new Button();
    Button medbut = new Button();
    Button vehbut = new Button();
    Button drzbut = new Button();
    Button sprbut = new Button();




    public static void main(String[] args) {
        GuiApp myWindow = new GuiApp("Strats for Dem Boys");
        myWindow.setSize(450,225);
        myWindow.setVisible(true);
    }

    public GuiApp(String title) {



        super(title);
        setLayout(new FlowLayout());
        addWindowListener(this);

        wepbut = new Button("Food Button");
        add(wepbut);
        add(weproll);
        wepbut.addActionListener(this);

        armbut = new Button("Armor Strats: ");
        add(armbut);
        add(armroll);
        armbut.addActionListener(this);

        medbut = new Button("Med Strats: ");
        add(medbut);
        add(medroll);
        medbut.addActionListener(this);

        vehbut = new Button("Vehicle Strats: ");
        add(vehbut);
        add(vehroll);
        vehbut.addActionListener(this);

        drzbut = new Button("Drop Zone Strats: ");
        add(drzbut);
        add(drzroll);
        drzbut.addActionListener(this);

        sprbut = new Button("Special Rule: ");
        add(sprbut);
        add(sprroll);
        sprbut.addActionListener(this);


    }

    public void actionPerformed(ActionEvent e) {
        if(wepbut == e.getSource()){
                 String[] wepstrats = {"New Asia", "Monsoon", "Nachos", "Bangcock"};
                 String wepword = wepstrats[new Random().nextInt(wepstrats.length)];
                 weproll.setText(wepword);
             }
        else if(armbut == e.getSource()) {
                 String[] armstrats = {"Max Level 2", "Any", "Max Level 1", "None"};
                 String armword = armstrats[new Random().nextInt(armstrats.length)];
                 armroll.setText(armword);
             }
        else if(medbut == e.getSource()){
                 String[] medstrats = {"Stims only", "Bandages only", "Medkits only", "First aids only", "no stims"};
                 String medword = medstrats[new Random().nextInt(medstrats.length)];
                 medroll.setText(medword);
             }
        else if(vehbut == e.getSource()){
                 String[] vehstrats = {"Must find personal vehicle", "boats only", "Dacia only", "Motorcycle Only"};
                 String vehword = vehstrats[new Random().nextInt(vehstrats.length)];
                 vehroll.setText(vehword);
        }
        else if(drzbut == e.getSource()){
                 String[] drzstrats = {"Zharki", "North Georgopol", "Georgopol Containers", "Georgopol Hospital", "South Georgopol",
                 "Gatka", "Swamp Town", "Water Town", "Quarry", "Primorsk", "Ferry Pier", "Severney", "Shooting Range", "Ruins", "Rozhok", "School",
                 "School Apartments", "Military Base", "Stalber", "Yasnaya", "Mansion", "Shelter", "Prison", "Mylta", "Mylta Power", "Mylta Power Factory", "Lipovka", "Novorepnoye", "Kameshiki", "Non-listed"};
                 String drzword = drzstrats[new Random().nextInt(drzstrats.length)];
            drzroll.setText(drzword);
        }
        else if(sprbut == e.getSource()){
                 String[] sprstrats = {"Protect Enemy Squad", "Cannot Shoot First", "Drop with AFKs", "Brightest Available Clothing", "First Weapon = ONLY Weapon",
                         "Tactical info may only be communicated with map markers", "Communicate in allchat only", "Hold Center Circle", "Pacifist: Can only fight when surrounded, otherwise run",
                         "No Airdrops", "All Party Members drop separately", "No scopes only", "360 kills only", "No crouching", "Burn all dead friends/enemies",
                         "Spawn Island leggo", "No crossing bridges on land", "No weapon attachements"};
                 String sprword = sprstrats[new Random().nextInt(sprstrats.length)];
            sprroll.setText(sprword);
        }
    }

    public void windowClosing(WindowEvent e) {
        dispose();
        System.exit(0);
    }


    public void windowOpened(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}

}