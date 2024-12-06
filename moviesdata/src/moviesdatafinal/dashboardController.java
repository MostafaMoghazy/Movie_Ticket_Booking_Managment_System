/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviesdatafinal;

import java.util.HashMap;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.scene.control.TextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author legion
 */
public class dashboardController implements Initializable {

    @FXML
    private TableView<customerData> customer_tableView;
    @FXML
    private AnchorPane main_slide;
    @FXML
    private Button addMovies_btn;

    @FXML
    private Button addMovies_clearBtn;

    @FXML
    private TableColumn<fmoviesdata, String> addMovies_col_date;

    @FXML
    private TableColumn<fmoviesdata, String> addMovies_col_duration;

    @FXML
    private TableColumn<fmoviesdata, String> addMovies_col_genre;

    @FXML
    private TableColumn<fmoviesdata, String> addMovies_col_genre1;

    @FXML
    private TableColumn<fmoviesdata, String> addMovies_col_movieTitle;

    @FXML
    private TableColumn<fmoviesdata, String> addMovies_col_movieTitle1;

    @FXML
    private Label addMovies_col_normalClass_price;

    @FXML
    private Spinner<Integer> addMovies_col_normalClass_quantity;

    @FXML
    private TableColumn<fmoviesdata, String> addMovies_col_showingDate;

    @FXML
    private Label addMovies_col_specialClass_price;

    @FXML
    private Spinner<Integer> addMovies_col_specialClass_quantity;

    @FXML
    private DatePicker addMovies_date;

    @FXML
    private DatePicker addMovies_date1;

    @FXML
    private Button addMovies_deleteBtn;

    @FXML
    private TextField addMovies_duration;

    @FXML
    private AnchorPane addMovies_form;

    @FXML
    private Label addMovies_genre1;

    @FXML
    private TextField addMovies_genre2;

    @FXML
    private ImageView addMovies_imageView;

    @FXML
    private ImageView addMovies_imageview;

    @FXML
    private Button addMovies_import;

    @FXML
    private Button addMovies_insertBtn;

    @FXML
    private Label addMovies_movieTitle1;

    @FXML
    private TextField addMovies_movieTitle2;

    @FXML
    private TextField addMovies_search;

    @FXML
    private Button addMovies_selectMovie;

    @FXML
    private TableView<fmoviesdata> addMovies_table;

    @FXML
    private TableView<fmoviesdata> addMovies_tableView;

    @FXML
    private Label addMovies_title;

    @FXML
    private Button addMovies_updateBtn;

    @FXML
    private TableView<fmoviesdata> addScreening_tableView;

    @FXML
    private Button availableMovies_btn;

    @FXML
    private Button availableMovies_buyBtn;

    @FXML
    private Button availableMovies_clearBtn;

    @FXML
    private AnchorPane availableMovies_form;

    @FXML
    private Button availableMovies_receiptBtn;

    @FXML
    private Label availableMovies_total;

    @FXML
    private FontAwesomeIcon close;

    @FXML
    private Button customers_btn;

    @FXML
    private Button customers_clearBtn;

    @FXML
    private TableColumn<customerData, String> customers_col_date;

    @FXML
    private TableColumn<customerData, String> customers_col_movieTitle;

    @FXML
    private TableColumn<customerData, String> customers_col_ticketNumber;

    @FXML
    private TableColumn<customerData, String> customers_col_time;

    @FXML
    private Label customers_date;

    @FXML
    private Button customers_deleteBtn;

    @FXML
    private AnchorPane customers_form;

    @FXML
    private Label customers_genre;

    @FXML
    private Label customers_movieTitle;

    @FXML
    private TextField customers_search;

    @FXML
    private Label customers_ticketNumber;

    @FXML
    private Label customers_time;

    @FXML
    private Label dashboard_availableMovies;

    @FXML
    private Button dashboard_btn;

    @FXML
    private AnchorPane dashboard_form;

    @FXML
    private Label dashboard_totalEarnToday;

    @FXML
    private Label dashboard_totalSoldTickets;

    @FXML
    private Button editScreening_btn;

    @FXML
    private TableColumn<fmoviesdata, String> editScreening_col_current;

    @FXML
    private TableColumn<fmoviesdata, String> editScreening_col_duration;

    @FXML
    private TableColumn<fmoviesdata, String> editScreening_col_genre;

    @FXML
    private TableColumn<fmoviesdata, String> editScreening_col_movieTitle;

    @FXML
    private ComboBox<?> editScreening_current;

    @FXML
    private Button editScreening_delete;

    @FXML
    private AnchorPane editScreening_form;

    @FXML
    private ImageView editScreening_imageView;

    @FXML
    private TextField editScreening_search;

    @FXML
    private Label editScreening_title;

    @FXML
    private Button editScreening_update;

    @FXML
    private FontAwesomeIcon minimize;

    @FXML
    private FontAwesomeIcon signOut;

    @FXML
    private AnchorPane topForm;

    @FXML
    private Label username;
    @FXML
    private ImageView image1;

    @FXML
    private ImageView image2;

    @FXML
    private ImageView image3;

    @FXML
    private ImageView image4;

    public void slider() {
        new Thread() {
            @Override
            public void run() {
                int count = 0;
                try {
                    while (true) {
                        switch (count) {
                            case 0:
                                Thread.sleep(5000);
                                TranslateTransition slider1 = new TranslateTransition();
                                slider1.setNode(image1);
                                slider1.setDuration(Duration.seconds(3));
                                slider1.setToX(0);
                                slider1.play();

                                TranslateTransition slider2 = new TranslateTransition();
                                slider2.setNode(image2);
                                slider2.setDuration(Duration.seconds(3));
                                slider2.setToX(0);
                                slider2.play();

                                TranslateTransition slider3 = new TranslateTransition();
                                slider3.setNode(image3);
                                slider3.setDuration(Duration.seconds(3));
                                slider3.setToX(-600);
                                slider3.play();

                                TranslateTransition slider4 = new TranslateTransition();
                                slider4.setNode(image4);
                                slider4.setDuration(Duration.seconds(3));
                                slider4.setToX(-1200);
                                slider4.play();
                                count = 1;
                                break;
                            case 1:
                                Thread.sleep(5000);
                                TranslateTransition slider5 = new TranslateTransition();
                                slider5.setNode(image1);
                                slider5.setDuration(Duration.seconds(3));
                                slider5.setToX(600);
                                slider5.play();

                                TranslateTransition slider6 = new TranslateTransition();
                                slider6.setNode(image2);
                                slider6.setDuration(Duration.seconds(3));
                                slider6.setToX(600);
                                slider6.play();

                                TranslateTransition slider7 = new TranslateTransition();
                                slider7.setNode(image3);
                                slider7.setDuration(Duration.seconds(3));
                                slider7.setToX(0);
                                slider7.play();

                                TranslateTransition slider8 = new TranslateTransition();
                                slider8.setNode(image4);
                                slider8.setDuration(Duration.seconds(3));
                                slider8.setToX(-600);
                                slider8.play();
                                count = 2;
                                break;
                            case 2:
                                Thread.sleep(5000);
                                TranslateTransition slider9 = new TranslateTransition();
                                slider9.setNode(image1);
                                slider9.setDuration(Duration.seconds(3));
                                slider9.setToX(1200);
                                slider9.play();

                                TranslateTransition slider10 = new TranslateTransition();
                                slider10.setNode(image2);
                                slider10.setDuration(Duration.seconds(3));
                                slider10.setToX(1200);
                                slider10.play();

                                TranslateTransition slider11 = new TranslateTransition();
                                slider11.setNode(image3);
                                slider11.setDuration(Duration.seconds(3));
                                slider11.setToX(600);
                                slider11.play();

                                TranslateTransition slider12 = new TranslateTransition();
                                slider12.setNode(image4);
                                slider12.setDuration(Duration.seconds(3));
                                slider12.setToX(0);
                                slider12.play();
                                count = 3;
                                break;
                            case 3:
                                Thread.sleep(5000);
                                TranslateTransition slider13 = new TranslateTransition();
                                slider13.setNode(image1);
                                slider13.setDuration(Duration.seconds(3));
                                slider13.setToX(1200);
                                slider13.play();

                                TranslateTransition slider14 = new TranslateTransition();
                                slider14.setNode(image2);
                                slider14.setDuration(Duration.seconds(3));
                                slider14.setToX(1200);
                                slider14.play();

                                TranslateTransition slider15 = new TranslateTransition();
                                slider15.setNode(image3);
                                slider15.setDuration(Duration.seconds(3));
                                slider15.setToX(1200);
                                slider15.play();

                                TranslateTransition slider16 = new TranslateTransition();
                                slider16.setNode(image4);
                                slider16.setDuration(Duration.seconds(3));
                                slider16.setToX(600);
                                slider16.play();
                                count = 0;
                                break;

                        }
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        }.start();
    }

    private Image image;
    private Connection connect;
    private PreparedStatement prepare;
    private Statement statement;
    private ResultSet result;
    private SpinnerValueFactory<Integer> SPinner1;
    private SpinnerValueFactory<Integer> SPinner2;

    private float price1 = 0;
    private float price2 = 0;
    private float total = 0;
    private int qty1 = 0;
    private int qty2 = 0;
    private int qty = 0;
    private int num = 0;

    public void receipt() {
        if (total > 0) {

            HashMap map = new HashMap();
            map.put("CustomerID", num);

            try {
                JasperDesign jDesign = JRXmlLoader.load("D:\\.projects\\MovieTicketBookingManagmentSystem\\moviesdata\\src\\moviesdatafinal\\repyou.jrxml");
                JasperReport jReport = JasperCompileManager.compileReport(jDesign);
                JasperPrint jPrint = JasperFillManager.fillReport(jReport, map, connect);
                JasperViewer.viewReport(jPrint, false);

            } catch (JRException ex) {
            }
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("invalid :3");
            alert.showAndWait();

        }
    }

    private int totalMovies;

    public void totalAvailableMovies() {
        String sql = "SELECT COUNT(id) FROM movie WHERE current = 'Showing'";
        connect = database.connectDb();

        try {

            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            if (result.next()) {

                totalMovies = result.getInt("count(id)");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void displaytotalAvailableMovies() {
        totalAvailableMovies();
        dashboard_availableMovies.setText(String.valueOf(totalMovies));
    }

    private double totalIncome;

    public void totalIncomeToday() {
        Date date = new Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        String sql = "SELECT SUM(total) FROM customer WHERE date ='"
                + String.valueOf(sqlDate) + "'";

        connect = database.connectDb();

        try {
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            if (result.next()) {

                totalIncome = result.getDouble("SUM(total)");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void displaytotalIncomeToday() {
        totalIncomeToday();
        dashboard_totalEarnToday.setText("$" + String.valueOf(totalIncome));
    }

    private int soldTickets;

    public void countTickets() {
        Date date = new Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        String sql = "SELECT SUM(quantity) FROM customer WHERE date ='"
                + String.valueOf(sqlDate) + "'";
        connect = database.connectDb();
        try {
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            if (result.next()) {
                soldTickets = result.getInt("SUM(quantity)");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void displaytotalSoldTickets() {
        countTickets();
        dashboard_totalSoldTickets.setText(String.valueOf(soldTickets));
        soldTickets = 0;
    }

    public void searchCustomer() {
        FilteredList<customerData> filter = new FilteredList<>(cusList, e -> true);
        customers_search.textProperty().addListener((observable, oldValue, newValue) -> {
            filter.setPredicate(predicateCustomer -> {

                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }

                String searchKey = newValue.toLowerCase();
                if (predicateCustomer.getId().toString().contains(searchKey)) {
                    return true;
                } else if (predicateCustomer.getTitle().toLowerCase().contains(searchKey)) {
                    return true;
                } else if (predicateCustomer.getDate().toString().contains(searchKey)) {
                    return true;
                } else {
                    return false;
                }
            });
        });
        SortedList<customerData> sort = new SortedList<>(filter);
        sort.comparatorProperty().bind(customer_tableView.comparatorProperty());
        customer_tableView.setItems(sort);
    }

    public ObservableList<customerData> customerList() {
        ObservableList<customerData> customerL = FXCollections.observableArrayList();

        String sql = "SELECT * FROM customer";
        connect = database.connectDb();

        try {
            customerData customerD;
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            while (result.next()) {
                customerD = new customerData(result.getInt("id"), result.getString("type"),
                        result.getString("movieTitle"), result.getInt("quantity"),
                        result.getDouble("total"), result.getDate("date"), result.getTime("time"));
                customerL.add(customerD);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return customerL;
    }

    private ObservableList<customerData> cusList;

    public void showCustomerList() {
        cusList = customerList();
        customers_col_ticketNumber.setCellValueFactory(new PropertyValueFactory<>("id"));
        customers_col_movieTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        customers_col_date.setCellValueFactory(new PropertyValueFactory<>("date"));
        customers_col_time.setCellValueFactory(new PropertyValueFactory<>("time"));
        customer_tableView.setItems(cusList);
    }

    public void selectCustomerList() {
        customerData custID = customer_tableView.getSelectionModel().getSelectedItem();
        int num = customer_tableView.getSelectionModel().getSelectedIndex();

        if ((num - 1) < -1) {
            return;
        }
        customers_ticketNumber.setText(String.valueOf(custID.getId()));
        customers_movieTitle.setText(custID.getTitle());
        customers_date.setText(String.valueOf(custID.getDate()));
        customers_time.setText(String.valueOf(custID.getTime()));
    }

    public void clearCustomer() {
        customers_ticketNumber.setText("");
        customers_movieTitle.setText("");
        customers_date.setText("");
        customers_time.setText("");
    }

    public void deleteCustomer() {
        String sql = "DELETE FROM customer WHERE id = '" + customers_ticketNumber.getText() + "'";
        connect = database.connectDb();

        try {

            Alert alert;
            statement = connect.createStatement();

            if (customers_ticketNumber.getText().isEmpty()
                    || customers_movieTitle.getText().isEmpty()
                    || customers_date.getText().isEmpty()
                    || customers_time.getText().isEmpty() == true) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("please selsect customer first");
                alert.showAndWait();
            } else {
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("are you sure you want to delete" + customers_movieTitle.getText() + "?");
                Optional<ButtonType> option = alert.showAndWait();
                if (option.get() == ButtonType.OK) {
                    statement.executeUpdate(sql);
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("successfully removed!");
                    alert.showAndWait();
                    clearCustomer();
                    showCustomerList();
                } else {
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //
    public void buy() {
        String sql = "INSERT INTO customer (type ,movieTitle,quantity,total ,date,time ) VALUES (?,?,?,?,?,?)";
        connect = database.connectDb();
        String type = "";
        if (price1 > 0 && price2 == 0) {
            type = "Special Class";

        } else if (price2 > 0 && price1 == 0) {
            type = "Normal Class ";
        } else if (price2 > 0 && price1 > 0) {
            type = "Special & Normal Class";
        }
        Date date = new Date();
        java.sql.Date setDate = new java.sql.Date(date.getTime());

        try {
            qty = qty1 + qty2;
            LocalTime localtime = LocalTime.now();
            Time time = Time.valueOf(localtime);

            prepare = connect.prepareStatement(sql);
            prepare.setString(1, type);
            prepare.setString(2, addMovies_title.getText());
            prepare.setString(3, String.valueOf(qty));
            prepare.setString(4, String.valueOf(total));
            prepare.setString(5, String.valueOf(setDate));
            prepare.setString(6, String.valueOf(time));

            Alert alert;

            if (addMovies_imageView.getImage() == null || addMovies_movieTitle1.getText().isEmpty()) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("please select the movie first");
                alert.showAndWait();
            } else if (price1 == 0 && price2 == 0) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("please indicate the quantity of ticket you want to purchase");
                alert.showAndWait();

            } else {
                prepare.executeUpdate();
                alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information Message");
                alert.setHeaderText(null);
                alert.setContentText("successfully purchase");
                alert.showAndWait();

                String sqll = "SELECT * FROM customer";
                prepare = connect.prepareStatement(sqll);
                result = prepare.executeQuery();
                num = 0;

                while (result.next()) {
                    num = result.getInt("id");
                }

                String sql2 = "INSERT INTO customer_info (customer_id ,type,quantity,total,movieTitle) VALUES (?,?,?,?,?)";
                prepare = connect.prepareStatement(sql2);
                prepare.setString(1, String.valueOf(num));
                prepare.setString(2, type);
                prepare.setString(3, String.valueOf(qty));
                prepare.setString(4, String.valueOf(total));
                prepare.setString(5, addMovies_title.getText());

                prepare.execute();
                clearpurchaseTicketInfo();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clearpurchaseTicketInfo() {

        SPinner1 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10, 0);
        SPinner2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10, 0);
        addMovies_col_specialClass_quantity.setValueFactory(SPinner1);
        addMovies_col_normalClass_quantity.setValueFactory(SPinner2);
        addMovies_col_specialClass_price.setText("$0.0");
        addMovies_col_normalClass_price.setText("$0.0");
        availableMovies_total.setText("$0.0");
        addMovies_movieTitle1.setText("");
        addMovies_genre1.setText("");
        addMovies_date1.setValue(null);
        addMovies_imageView.setImage(null);
        price1 = 0;
        price2 = 0;
        qty1 = 0;
        qty2 = 0;
        qty = 0;

        addMovies_title.setText("");

    }

    public void showSpinnerValue() {

        SPinner1 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10, 0);
        SPinner2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10, 0);
        addMovies_col_specialClass_quantity.setValueFactory(SPinner1);
        addMovies_col_normalClass_quantity.setValueFactory(SPinner2);
        availableMovies_total.setText("$0,0");
    }

    public void getSpinnerValue(MouseEvent event) {

        qty1 = addMovies_col_specialClass_quantity.getValue();
        qty2 = addMovies_col_normalClass_quantity.getValue();
        qty = qty2 + qty2;
        price1 = (qty1 * 25);
        price2 = (qty2 * 10);
        total = (price1 + price2);

        addMovies_col_specialClass_price.setText("$" + String.valueOf(price1));
        addMovies_col_normalClass_price.setText("$" + String.valueOf(price2));
        availableMovies_total.setText("$" + String.valueOf(total));
    }

    public void selectMovie() {

        Alert alert;

        if (addMovies_movieTitle1.getText().isEmpty()
                || addMovies_genre1.getText().isEmpty() || addMovies_date1.getValue() == null) {

            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("please select the movie first");
            alert.showAndWait();
        } else {

            String Uri = "file:" + getData.path;

            image = new Image(Uri, 136, 180, false, true);
            addMovies_imageView.setImage(image);

            addMovies_title.setText(getData.title);
            /*
             * addMovies_movieTitle1.setText("");
             * addMovies_genre1.setText("");
             * addMovies_date1.setValue(null);
             */
        }
    }

    public void selectAvailableMovies() {

        fmoviesdata movD = addMovies_tableView.getSelectionModel().getSelectedItem();
        int num = addMovies_tableView.getSelectionModel().getSelectedIndex();

        if ((num - 1) < -1) {
            return;
        }
        addMovies_movieTitle1.setText(movD.getTitle());
        addMovies_genre1.setText(movD.getGenre());
        addMovies_date1.setValue(movD.getDate().toLocalDate());
        getData.path = movD.getImage();
        getData.title = movD.getTitle();

    }

    public ObservableList<fmoviesdata> avilableMoviesList() {
        ObservableList<fmoviesdata> listAvMovies = FXCollections.observableArrayList();

        String sql = "SELECT * FROM movie WHERE current = 'Showing'";

        connect = database.connectDb();

        try {
            prepare = connect.prepareStatement(sql);

            result = prepare.executeQuery();

            fmoviesdata movD;

            while (result.next()) {
                movD = new fmoviesdata(result.getInt("id"),
                        result.getString("movieTitle"),
                        result.getString("genre"),
                        result.getString("duration"),
                        result.getString("image"),
                        result.getDate("date"),
                        result.getString("current"));
                listAvMovies.add(movD);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return listAvMovies;
    }

    private ObservableList<fmoviesdata> availableMoviesList;

    public void showAvaiableMovies() {
        availableMoviesList = avilableMoviesList();

        addMovies_col_movieTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        addMovies_col_genre.setCellValueFactory(new PropertyValueFactory<>("genre"));
        addMovies_col_showingDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        addMovies_tableView.setItems(availableMoviesList);

    }

    //
    public void movieId() {

        String sql = "SELECT count(id) FROM movie";
        connect = database.connectDb();

        try {
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            if (result.next()) {
                getData.movieId = result.getInt("count(id)");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void searchEditScreening() {

        FilteredList<fmoviesdata> filter = new FilteredList(editScreeningL, e -> true);
        editScreening_search.textProperty().addListener((Observable, oldValue, newValue) -> {
            filter.setPredicate(PredicateMoviesData -> {

                if (newValue.isEmpty() || newValue == null) {
                    return true;
                }

                String searchKey = newValue.toLowerCase();

                if (PredicateMoviesData.getTitle().toLowerCase().contains(searchKey)) {
                    return true;
                } else if (PredicateMoviesData.getGenre().toLowerCase().contains(searchKey)) {
                    return true;
                } else if (PredicateMoviesData.getDuration().toLowerCase().contains(searchKey)) {
                    return true;

                } else if (PredicateMoviesData.getCurrent().toLowerCase().contains(searchKey)) {
                    return true;
                }

                return false;
            });
        });
        SortedList<fmoviesdata> sortData = new SortedList<>(filter);

        sortData.comparatorProperty().bind(addScreening_tableView.comparatorProperty());
        addScreening_tableView.setItems(sortData);

    }

    public void updateEditScreening() {
        String sql = "UPDATE movie SET current= '" + editScreening_current.getSelectionModel().getSelectedItem()
                + "'WHERE movieTitle= '" + editScreening_title.getText() + "'";

        connect = database.connectDb();

        try {

            statement = connect.createStatement();
            Alert alert;
            if (editScreening_title.getText().isEmpty() || editScreening_imageView.getImage() == null
                    || editScreening_current.getSelectionModel().isEmpty()) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error message");
                alert.setHeaderText(null);
                alert.setContentText("please select the movie first");
                alert.showAndWait();
            } else {
                statement.executeUpdate(sql);
                alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("information message");
                alert.setHeaderText(null);
                alert.setContentText("successfully Update!");
                alert.showAndWait();
                showEditScreening();
                clearEditScreening();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void clearEditScreening() {
        editScreening_title.setText("");
        editScreening_imageView.setImage(null);
        // editScreening_current.setSelectionModel(null);
    }

    public void selectEditScreening() {
        fmoviesdata movD = addScreening_tableView.getSelectionModel().getSelectedItem();
        int num = addScreening_tableView.getSelectionModel().getFocusedIndex();

        if ((num - 1) < -1) {
            return;
        }
        String uri = "file:" + movD.getImage();
        image = new Image(uri, 138, 183, false, true);
        editScreening_imageView.setImage(image);
        editScreening_title.setText(movD.getTitle());
    }

    private String[] currentList = { "Showing", "End Showing" };

    // @SuppressWarnings("empty-statement")
    public void comboBox() {
        List<String> listCurrent = new ArrayList<>();

        for (String data : currentList) {

            listCurrent.add(data);

        }

        ObservableList ListC = FXCollections.observableArrayList(listCurrent);
        editScreening_current.setItems(ListC);
    }

    public ObservableList<fmoviesdata> editScreeningList() {

        ObservableList<fmoviesdata> editSList = FXCollections.observableArrayList();

        String sql = "SELECT * FROM movie ";
        connect = database.connectDb();

        try {

            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            fmoviesdata movD;

            while (result.next()) {
                movD = new fmoviesdata(result.getInt("id"),
                        result.getString("movieTitle"),
                        result.getString("genre"),
                        result.getString("duration"),
                        result.getString("image"),
                        result.getDate("date"),
                        result.getString("current"));

                editSList.add(movD);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return editSList;

    }

    private ObservableList<fmoviesdata> editScreeningL;

    public void showEditScreening() {
        editScreeningL = editScreeningList();

        editScreening_col_movieTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        editScreening_col_genre.setCellValueFactory(new PropertyValueFactory<>("genre"));
        editScreening_col_duration.setCellValueFactory(new PropertyValueFactory<>("duration"));
        editScreening_col_current.setCellValueFactory(new PropertyValueFactory<>("current"));

        addScreening_tableView.setItems(editScreeningL);
    }

    public void searchAddMovies() {

        FilteredList<fmoviesdata> filter = new FilteredList<>(listAddMovies, e -> true);

        addMovies_search.textProperty().addListener((observable, oldValue, newValue) -> {

            filter.setPredicate(predicateMoviesData -> {

                if (newValue.isEmpty() || newValue == null) {
                    return true;
                }
                String keySearch = newValue.toLowerCase();

                if (predicateMoviesData.getTitle().toLowerCase().contains(keySearch)) {
                    return true;
                } else if (predicateMoviesData.getGenre().toLowerCase().contains(keySearch)) {
                    return true;
                } else if (predicateMoviesData.getDuration().toLowerCase().contains(keySearch)) {
                    return true;
                } else if (predicateMoviesData.getDate().toString().contains(keySearch)) {
                    return true;
                }

                return false;

            });
        });
        SortedList<fmoviesdata> sortData = new SortedList<>(filter);
        sortData.comparatorProperty().bind(addMovies_table.comparatorProperty());
        addMovies_table.setItems(sortData);
    }

    public void deleteAddMovies() {

        String sql = "DELETE FROM movie WHERE movieTitle ='"
                + addMovies_movieTitle2.getText() + "'";

        try {

            statement = connect.createStatement();

            Alert alert;

            if (addMovies_movieTitle2.getText().isEmpty()
                    || addMovies_genre2.getText().isEmpty()
                    || addMovies_duration.getText().isEmpty()
                    || addMovies_date.getValue() == null
                    || addMovies_imageview.getImage() == null) {

                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please select the movie first");
                alert.showAndWait();

            } else {

                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to delete "
                        + addMovies_movieTitle2.getText() + "?");

                Optional<ButtonType> option = alert.showAndWait();

                if (ButtonType.OK.equals(option.get())) {

                    statement.executeUpdate(sql);

                    showAddMoviesList();
                    clearAddMoviesList();
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully delete!");
                    alert.showAndWait();
                    editScreeningList();
                    showEditScreening();
                    avilableMoviesList();
                    showAvaiableMovies();

                } else {
                    return;

                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void updateAddMovies() {
        String uri = getData.path;
        uri = uri.replace("\\", "\\\\");
        String sql = "UPDATE movie SET movieTitle ='" + addMovies_movieTitle2.getText()
                + "', genre ='" + addMovies_genre2.getText()
                + "',duration ='" + addMovies_duration.getText()
                + "', image ='" + uri
                + "', date = '" + addMovies_date.getValue()
                + "' WHERE id ='" + String.valueOf(getData.movieId) + "'";

        connect = database.connectDb();
        try {
            statement = connect.createStatement();

            Alert alert;
            if (addMovies_movieTitle2.getText().isEmpty()
                    || addMovies_genre2.getText().isEmpty()
                    || addMovies_duration.getText().isEmpty()
                    || addMovies_imageview.getImage() == null
                    || addMovies_date.getValue() == null) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please selsct the movie first");
                alert.showAndWait();

            } else {
                statement.executeUpdate(sql);

                alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information Message");
                alert.setHeaderText(null);
                alert.setContentText("Successfully update " + addMovies_movieTitle2.getText());
                alert.showAndWait();

                showAddMoviesList();
                clearAddMoviesList();
                editScreeningList();
                showEditScreening();
                avilableMoviesList();
                showAvaiableMovies();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void insertAddMovies() {

        String sql1 = "SELECT * FROM movie WHERE movieTitle = '" + addMovies_movieTitle2.getText() + " '";

        connect = database.connectDb();
        Alert alert;
        try {
            statement = connect.createStatement();
            result = statement.executeQuery(sql1);

            if (result.next()) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText(addMovies_movieTitle2.getText() + "Was already exist!");
                alert.showAndWait();
            } else {
                if (addMovies_movieTitle2.getText().isEmpty()
                        || addMovies_genre2.getText().isEmpty()
                        || addMovies_duration.getText().isEmpty()
                        || addMovies_imageview.getImage() == null
                        || addMovies_date.getValue() == null) {
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Please fill all blank fields!");
                    alert.showAndWait();

                } else {

                    String sql = "INSERT INTO movie (id,movieTitle, genre, duration,image, date,current) values(?,?,?,?,?,?,?)";

                    String uri = getData.path;
                    uri = uri.replace("\\", "\\\\");
                    movieId();
                    String mId = String.valueOf(getData.movieId + 1);

                    prepare = connect.prepareStatement(sql);
                    prepare.setString(1, mId);
                    prepare.setString(2, addMovies_movieTitle2.getText());
                    prepare.setString(3, addMovies_genre2.getText());
                    prepare.setString(4, addMovies_duration.getText());
                    prepare.setString(5, uri);
                    prepare.setString(6, String.valueOf(addMovies_date.getValue()));
                    prepare.setString(7, "undetermined");

                    prepare.execute();

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully add new movies!");
                    alert.showAndWait();

                    clearAddMoviesList();
                    showAddMoviesList();
                    editScreeningList();
                    showEditScreening();
                    avilableMoviesList();
                    showAvaiableMovies();
                }
            }
            // if we insert a title already existing in the database

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void clearAddMoviesList() {
        addMovies_movieTitle2.setText("");
        addMovies_genre2.setText("");
        addMovies_duration.setText("");
        addMovies_imageview.setImage(null);
        addMovies_date.setValue(null);

    }

    public void importImage() {
        FileChooser open = new FileChooser();
        open.setTitle("Open Image File");
        open.getExtensionFilters().add(new ExtensionFilter("Image FIle", "*png", "*jpg"));

        Stage stage = (Stage) addMovies_form.getScene().getWindow();
        File file = open.showOpenDialog(stage);

        if (file != null) {
            image = new Image(file.toURI().toString(), 127, 167, false, true);
            addMovies_imageview.setImage(image);
            getData.path = file.getAbsolutePath();
        }
    }

    public ObservableList<fmoviesdata> addMoviesList() {
        ObservableList<fmoviesdata> listData = FXCollections.observableArrayList();
        String sql = " SELECT * FROM movie";
        connect = database.connectDb();

        try {
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            fmoviesdata movD;

            while (result.next()) {
                movD = new fmoviesdata(result.getInt("id"),
                        result.getString("movieTitle"),
                        result.getString("genre"),
                        result.getString("duration"),
                        result.getString("image"),
                        result.getDate("date"), result.getString("current"));
                listData.add(movD);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;

    }

    private ObservableList<fmoviesdata> listAddMovies;

    public void showAddMoviesList() {
        listAddMovies = addMoviesList();

        addMovies_col_movieTitle1.setCellValueFactory(new PropertyValueFactory<>("Title"));
        addMovies_col_genre1.setCellValueFactory(new PropertyValueFactory<>("genre"));
        addMovies_col_duration.setCellValueFactory(new PropertyValueFactory<>("duration"));
        addMovies_col_date.setCellValueFactory(new PropertyValueFactory<>("date"));
        addMovies_table.setItems(listAddMovies);
    }

    public void selectAddMoviesList() {
        fmoviesdata movD = addMovies_table.getSelectionModel().getSelectedItem();
        int num = addMovies_table.getSelectionModel().getSelectedIndex();

        if ((num - 1) < -1) {
            return;
        }
        getData.path = movD.getImage();
        getData.movieId = movD.getId();
        addMovies_movieTitle2.setText(movD.getTitle());
        addMovies_genre2.setText(movD.getGenre());
        addMovies_duration.setText(movD.getDuration());
        String getDate = String.valueOf(movD.getDate());
        String uri = "file:" + movD.getImage();
        image = new Image(uri, 127, 167, false, true);
        addMovies_imageview.setImage(image);
        addMovies_date.setValue(movD.getDate().toLocalDate());
    }

    double x = 0;
    double y = 0;

    public void logOut() {
        signOut.getScene().getWindow().hide();
        try {
            Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

            Stage stage = new Stage();
            Scene scene = new Scene(root);

            root.setOnMousePressed((MouseEvent event) -> {
                x = event.getSceneX();
                y = event.getSceneY();

            });

            root.setOnMouseDragged((MouseEvent event) -> {

                stage.setX(event.getScreenX() - x);
                stage.setY(event.getScreenY() - y);
            });

            stage.initStyle(StageStyle.TRANSPARENT);

            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void dashboard() {
        dashboard_form.setVisible(true);
        addMovies_form.setVisible(false);
        availableMovies_form.setVisible(false);
        editScreening_form.setVisible(false);
        customers_form.setVisible(false);

        dashboard_btn.setStyle("-fx-background-color: #09203F");
        addMovies_btn.setStyle("-fx-background-color: transparent");
        availableMovies_btn.setStyle("-fx-background-color: transparent");
        editScreening_btn.setStyle("-fx-background-color: transparent");
        customers_form.setStyle("-fx-background-color: transparent");

    }

    public void switchForm(ActionEvent event) {
        if (event.getSource() == dashboard_btn) {
            main_slide.setVisible(true);

            dashboard_form.setVisible(true);
            addMovies_form.setVisible(false);
            availableMovies_form.setVisible(false);
            editScreening_form.setVisible(false);
            customers_form.setVisible(false);

            dashboard_btn.setStyle("-fx-background-color: #09203F");
            addMovies_btn.setStyle("-fx-background-color: transparent");
            availableMovies_btn.setStyle("-fx-background-color: transparent");
            editScreening_btn.setStyle("-fx-background-color: transparent");
            customers_form.setStyle("-fx-background-color: transparent");
            displaytotalSoldTickets();
            displaytotalIncomeToday();
            displaytotalAvailableMovies();

        } else if (event.getSource() == addMovies_btn) {
            main_slide.setVisible(false);
            dashboard_form.setVisible(false);
            addMovies_form.setVisible(true);
            availableMovies_form.setVisible(false);
            editScreening_form.setVisible(false);
            customers_form.setVisible(false);

            dashboard_btn.setStyle("-fx-background-color: transparent");
            addMovies_btn.setStyle("-fx-background-color: #09203F");
            availableMovies_btn.setStyle("-fx-background-color: transparent");
            editScreening_btn.setStyle("-fx-background-color: transparent");
            customers_form.setStyle("-fx-background-color: transparent");
            showAddMoviesList();
            clearAddMoviesList();

        } else if (event.getSource() == availableMovies_btn) {
            main_slide.setVisible(false);
            dashboard_form.setVisible(false);
            addMovies_form.setVisible(false);
            availableMovies_form.setVisible(true);
            editScreening_form.setVisible(false);
            customers_form.setVisible(false);

            dashboard_btn.setStyle("-fx-background-color: transparent");
            addMovies_btn.setStyle("-fx-background-color: transparent");
            availableMovies_btn.setStyle("-fx-background-color: #09203F");
            editScreening_btn.setStyle("-fx-background-color: transparent");
            customers_form.setStyle("-fx-background-color: transparent");
            showAvaiableMovies();
            clearpurchaseTicketInfo();

        } else if (event.getSource() == editScreening_btn) {
            main_slide.setVisible(false);
            dashboard_form.setVisible(false);
            addMovies_form.setVisible(false);
            availableMovies_form.setVisible(false);
            editScreening_form.setVisible(true);
            customers_form.setVisible(false);

            dashboard_btn.setStyle("-fx-background-color: transparent");
            addMovies_btn.setStyle("-fx-background-color: transparent");
            availableMovies_btn.setStyle("-fx-background-color: transparent");
            editScreening_btn.setStyle("-fx-background-color: #09203F");
            customers_form.setStyle("-fx-background-color: transparent");
            showEditScreening();
            clearEditScreening();

        } else if (event.getSource() == customers_btn) {
            main_slide.setVisible(false);
            dashboard_form.setVisible(true);
            addMovies_form.setVisible(false);
            availableMovies_form.setVisible(false);
            editScreening_form.setVisible(false);
            customers_form.setVisible(true);

            dashboard_btn.setStyle("-fx-background-color: transparent");
            addMovies_btn.setStyle("-fx-background-color: transparent");
            availableMovies_btn.setStyle("-fx-background-color: transparent");
            editScreening_btn.setStyle("-fx-background-color: transparent");
            customers_form.setStyle("-fx-background-color:#09203F");
            showCustomerList();

        }
    }

    public void displayUsername() {

        username.setText(getData.username);
    }

    public void close() {
        System.exit(0);
    }

    public void minimize() {
        Stage stage = (Stage) topForm.getScene().getWindow();
        stage.setIconified(true);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dashboard();
        slider();
        displayUsername();
        showAddMoviesList();
        showEditScreening();
        comboBox();
        showAvaiableMovies();
        showSpinnerValue();
        showCustomerList();
        displaytotalSoldTickets();
        displaytotalIncomeToday();
        displaytotalAvailableMovies();

    }

}
