/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package moviesdatafinal;

import java.net.URL;
import javafx.scene.input.MouseEvent;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaException;
import javafx.scene.media.MediaPlayer;
import javafx.stage.StageStyle;
import moviesdatafinal.database;

/**
 *
 * @author Amr Nabil
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Hyperlink signUp_alreadyHaveAccount;

    @FXML
    private Button signUp_btn;

    @FXML
    private Button signUp_close;

    @FXML
    private TextField signUp_email;

    @FXML
    private AnchorPane signUp_form;

    @FXML
    private Button signUp_minimize;

    @FXML
    private TextField signUp_username;

    @FXML
    private PasswordField signUp_password;

    @FXML
    private Button signin_close;

    @FXML
    private Hyperlink signin_createAccount;

    @FXML
    private AnchorPane signin_form;

    @FXML
    private Button signin_loginBtn;

    @FXML
    private Button signin_minimize;

    @FXML
    private PasswordField signin_password;

    @FXML
    private TextField signin_username;

    @FXML
    void play() {
        String fileName = "/Images/harry_potter_theme.mp3"; // Adjust the file path based on its location within the JAR
        playHitSound(fileName);
    }

    void playHitSound(String fileName) {
        URL url = getClass().getResource(fileName);
        if (url != null) {
            try {
                Media media = new Media(url.toString());
                mediaPlayer = new MediaPlayer(media);
                mediaPlayer.setOnEndOfMedia(() -> {
                    // Reset the flag once the media has ended
                   // mediaPlayer = false;
                });
                mediaPlayer.play();
             //   soundPlayed = true; // Set the flag only when the media starts playing
            } catch (MediaException e) {
                System.err.println("Error playing media: " + e.getMessage());
                // Inform the user about the error
            }
        } else {
            System.err.println("Could not load media file: " + fileName);
            // Inform the user about the error
        }
    }
    // Tools for Database
    private MediaPlayer mediaPlayer;
    private Connection connect;
    private PreparedStatement prepare;
    private Statement statemenet;
    private ResultSet result;

    // Proceeding for email validation
    public boolean validEmail() { // [FIRST LETTER][SECOND LETTER -> BEFORE@] [@] [marcoman] [.] [com]

        Pattern pattern = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
        Matcher match = pattern.matcher(signUp_email.getText());

        Alert alert;
        if (match.find() && match.group().matches(signUp_email.getText())) {
            return true;
        } else {

            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Invalid Email");
            alert.showAndWait();

            return false;
        }

    }

     public void singUP() throws SQLException {

        String sql = "INSERT INTO admin2 (email,username,password) VALUES (?,?,?)";
        String sql1 = "SELECT username FROM admin2";
        connect = database.connectDb();

        try {

            prepare = connect.prepareStatement(sql);
            prepare.setString(1, signUp_email.getText());
            prepare.setString(2, signUp_username.getText());
            prepare.setString(3, signUp_password.getText());
            Alert alert;

            if (signUp_username.getText().isEmpty() || signUp_password.getText().isEmpty() || signUp_email.getText().isEmpty()) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();

                //THE RANGE OF PASSWORD SHOULD BE 8 CHARACTERS
            } else if (signUp_password.getText().length() < 8) {

                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Invalid Password");
                alert.showAndWait();

            } else {
                //IF THE EMAIL IS GOOD, THEN RETURN TURE
                if (validEmail()) {

                    prepare = connect.prepareStatement(sql1);
                    result = prepare.executeQuery();
                    try {
                        prepare = connect.prepareStatement(sql);
                        prepare.setString(1, signUp_email.getText());
                        prepare.setString(2, signUp_username.getText());
                        prepare.setString(3, signUp_password.getText());
                        prepare.execute();
                        System.out.println("hello\n");
                        alert = new Alert(AlertType.INFORMATION);
                        alert.setTitle("Information Message");
                        alert.setHeaderText(null);
                        alert.setContentText("New account is created successfully!");
                        alert.showAndWait();

                        // After successfully creating an account, clear the text field
                        signUp_email.setText("");
                        signUp_username.setText("");
                        signUp_password.setText("");
                        signin_form.setVisible(true);
                        signUp_form.setVisible(false);
                    }catch(SQLException e){
                    alert = new Alert(AlertType.ERROR);
                        alert.setTitle("Error Message");
                        alert.setHeaderText(null);
                        alert.setContentText(signUp_username.getText() + "Already exists!");
                        alert.showAndWait();
                }
                }

            }
        }
    catch (Exception e){
            e.printStackTrace();
    }
}

        
    private double x = 0;
    private double y = 0;

    public void signin() {

        String sql = "SELECT * FROM admin2 WHERE username = ? and password = ?";
        connect = database.connectDb();
        try {

            prepare = connect.prepareStatement(sql);
            prepare.setString(1, signin_username.getText());
            prepare.setString(2, signin_password.getText());
            result = prepare.executeQuery();

            Alert alert;

            // CHECK IF THE USERNAME OF PASSWROD IS EMPTY
            if (signin_username.getText().isEmpty() || signin_password.getText().isEmpty()) {

                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();

            } else {

                if (result.next()) {
                    
                    getData.username=signin_username.getText();
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully logined!");
                    alert.showAndWait();

                    // TO HIDE THE LOGIN FORM 
                    signin_loginBtn.getScene().getWindow().hide();

                    Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));

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

                     play();
                      

                } else {

                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Wrong username/password");
                    alert.showAndWait();

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void switchForm(ActionEvent event) {
        if (event.getSource() == signin_createAccount) {
            signin_form.setVisible(false);
            signUp_form.setVisible(true);
        } else if (event.getSource() == signUp_alreadyHaveAccount) {

            signin_form.setVisible(true);
            signUp_form.setVisible(false);
        }
    
    }

    public void signIn_close() {
        System.exit(0);
    }

    public void signIn_minimize() {

        Stage stage = (Stage) signin_form.getScene().getWindow();
        stage.setIconified(true);
    }

    public void signUp_close() {

        System.exit(0);
    }

    public void signUp_minimize() {
        Stage stage = (Stage) signUp_form.getScene().getWindow();
        stage.setIconified(true);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

}
