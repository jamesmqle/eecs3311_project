package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.security.KeyPair;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

import javax.swing.*;

import Authentication.AuthenticationFacade;
import Authentication.DatabaseTable;
import Authentication.User;
import DataFetcher.DataFetcherFacade;
import GUI.UIElements.CustomButton;
import GUI.UIElements.CustomComboBox;
import Viewer.ViewerFacade;
import com.google.gson.JsonObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainUI extends JFrame {

    JPanel viewerPanel;

    JButton recalculateBtn;
    JButton addViewBtn;
    JButton removeViewBtn;

    CustomComboBox<String> viewsList;
    CustomComboBox<String> countriesList;
    Map<String, String> countriesNames;
    CustomComboBox<String> fromList;
    CustomComboBox<String> toList;

    DatabaseTable countriesDatabase = new DatabaseTable("src/main/resources/database/countries.csv");

    public MainUI() {
        super("World Data Analyzer");

        String path = "src/main/resources/Icon.png";
        ImageIcon iconImg = new ImageIcon(path);
        super.setIconImage(iconImg.getImage());

        // Set top bar
        JLabel chooseCountryLabel = new JLabel("Choose a country: ");
        countriesNames = new TreeMap<>();
        for (JsonObject country : countriesDatabase.getData()) {
            countriesNames.put(country.get("name").getAsString(), country.get("key").getAsString());
        }
        countriesList = new CustomComboBox<>(new Vector(countriesNames.keySet()));
        countriesList.addActionListener(this::actionPerformed);

        JLabel from = new JLabel("From");
        JLabel to = new JLabel("To");
        Vector<String> years = new Vector<>();
        for (int i = 2021; i >= 2010; i--) {
            years.add("" + i);
        }
        fromList = new CustomComboBox<>(years);
        toList = new CustomComboBox<>(years);

        JPanel north = new JPanel();
        north.setLayout(new OverlayLayout(north));

        JPanel northBottom = new JPanel();
        JPanel northTop = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        northTop.setOpaque(false);
        northBottom.add(chooseCountryLabel);
        northBottom.add(countriesList);
        northBottom.add(from);
        northBottom.add(fromList);
        northBottom.add(to);
        northBottom.add(toList);

        // display username
        userDisplay(northTop);

        north.add(northTop);
        north.add(northBottom);

        // Set bottom bar
        recalculateBtn = new CustomButton("Recalculate");
        recalculateBtn.addActionListener(this::actionPerformed);

        JLabel viewsLabel = new JLabel("Available Views: ");

        Vector<String> viewsNames = new Vector<String>();
        viewsNames.add("Pie Chart");
        viewsNames.add("Line Chart");
        viewsNames.add("Bar Chart");
        viewsNames.add("Scatter Chart");
        viewsNames.add("Time Series");
        viewsNames.add("Report");
        viewsList = new CustomComboBox<String>(viewsNames);
        Image plusImage = new ImageIcon("src/main/resources/plus.png").getImage();
        addViewBtn = new CustomButton(new ImageIcon(plusImage.getScaledInstance(10,10,java.awt.Image.SCALE_SMOOTH)));
        addViewBtn.setPreferredSize(new Dimension(25, 25));
        addViewBtn.addActionListener(this::actionPerformed);
        Image minusImage = new ImageIcon("src/main/resources/minus.png").getImage();
        removeViewBtn = new CustomButton(new ImageIcon(minusImage.getScaledInstance(10,10,java.awt.Image.SCALE_SMOOTH)));
        removeViewBtn.setPreferredSize(new Dimension(25, 25));
        removeViewBtn.addActionListener(this::actionPerformed);

        JLabel methodLabel = new JLabel("        Choose analysis method: ");

        Vector<String> methodsNames = new Vector<String>();
        methodsNames.add("Total Population");
        methodsNames.add("Mortality");
        methodsNames.add("Mortality vs Expenses");
        methodsNames.add("Mortality vs Expenses & Hospital Beds");
        methodsNames.add("Mortality vs GDP");
        methodsNames.add("Unemployment vs GDP");
        methodsNames.add("Unemployment");

        CustomComboBox<String> methodsList = new CustomComboBox<String>(methodsNames);

        JPanel south = new JPanel();
        south.add(viewsLabel);
        south.add(viewsList);
        south.add(addViewBtn);
        south.add(removeViewBtn);

        south.add(methodLabel);
        south.add(methodsList);
        south.add(recalculateBtn);

        JPanel east = new JPanel();

        // Set charts region
        viewerPanel = new JPanel();
        viewerPanel.setSize(1250, 700);
        viewerPanel.setLayout(new GridLayout(2, 0));

        getContentPane().add(north, BorderLayout.NORTH);
        getContentPane().add(east, BorderLayout.EAST);
        getContentPane().add(south, BorderLayout.SOUTH);
        getContentPane().add(viewerPanel, BorderLayout.WEST);
    }

    public void userDisplay(JPanel north){
        User currentUser = AuthenticationFacade.getInstance().currentUser;
        JLabel userLabel = new JLabel("Username: " + currentUser.getUsername());
        north.add(userLabel);
    }

    public void addViewer(JPanel viewer) {
        viewerPanel.add(viewer);
        GUI.getInstance().refreshMainUI();
    }

    public void removeViewer(JPanel viewer) {
        viewerPanel.remove(viewer);
        GUI.getInstance().refreshMainUI();
    }

    public String getFromYear() {
        return fromList.getSelectedItem().toString();
    }

    public String getToYear() {
        return toList.getSelectedItem().toString();
    }

    public String getCountry() {
        return countriesNames.get(countriesList.getSelectedItem().toString());
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == recalculateBtn) {

            DataFetcherFacade.getInstance().dateRange.setRange(getFromYear(), getToYear());
            DataFetcherFacade.getInstance().country.setCountry(getCountry());

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            for (JsonObject jsonObject: DataFetcherFacade.getInstance().fetchData("SP.POP.TOTL")) { // AG.LND.AGRI.ZS
                System.out.println(gson.toJson(jsonObject));
            }
        } else if (e.getSource() == addViewBtn) {
            ViewerFacade.getInstance().addViewer(viewsList.getSelectedItem().toString());
        } else if (e.getSource() == removeViewBtn) {
            ViewerFacade.getInstance().removeViewer(viewsList.getSelectedItem().toString());
        } else if (e.getSource() ==  fromList) {
        } else if (e.getSource() ==  toList) {
        }
    }

}