package com.example.gem_1;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Pagination;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.Desktop;
import java.util.Objects;

import javafx.fxml.FXML;


public class GEMController {
      private Stage stage;
      private Scene scene;
      private Parent root;
      @FXML
     private Pagination pagination = new Pagination();
    public void switchToLogin(ActionEvent event) throws IOException {
    root = FXMLLoader.load(getClass().getResource("login_reg.fxml"));
    stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}
    public void switchToWorkShops(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("workshops.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToEducationalWing(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("EducationalWing.fxml")));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToRamsesStatu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("statuOfRamses.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToHome(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("GEM_1.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToRestorationCenter(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("restorationCenter.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchTotutankhamunsTreasure(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("tutankhamunsTreasures.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToExhibitionTechnology(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("exhibitionTechnology.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToOpening(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("opening.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void switchToArtifactCollection(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("artifactCollection.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void GoToBook(ActionEvent event) throws URISyntaxException, IOException {
      Desktop.getDesktop().browse(new URI("https://visit-gem.com/en/tours"));
    }
    @FXML
    void GoToLocation(ActionEvent event) throws URISyntaxException, IOException {
    Desktop.getDesktop().browse(new URI("https://www.google.com/maps/place/Grand+Egyptian+Museum/@29.9946422,31.1249986,17z/data=!3m1!4b1!4m6!3m5!1s0x14584534984a8ad1:0x45764c5bc4ec261a!8m2!3d29.9946422!4d31.1228099!16zL20vMGRoOTN3?entry=ttu"));
    }
    @FXML
    void faceBook(ActionEvent event) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://www.facebook.com/GrandEgyptianMuseum/"));
    }
    @FXML
    void instagram(ActionEvent event) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://www.instagram.com/grandegyptianmuseum/"));
    }
    @FXML
    public void initialize(){
        pagination.setPageCount(30);
        pagination.setPageFactory((Integer pageIndex) ->{
            return createPageContent(pageIndex);
        });

    }

    private Node createPageContent(int pageIndex){
        VBox pageBox = new VBox(10);
        ImageView imageView = new ImageView();
        switch (pageIndex){
            case  0:
                imageView.setImage(new Image(getClass().getResource("/imgs/P1.jpg").toExternalForm()));
                if (imageView.getImage().isError()){
                    System.out.println("err loading imag");
                }
                break;
            case  1:
                imageView.setImage(new Image(getClass().getResource("/imgs/P2.jpg").toExternalForm()));
                if (imageView.getImage().isError()){
                    System.out.println("err loading imag");
                }
                break;
            case  2:
                imageView.setImage(new Image(getClass().getResource("/imgs/P3.jpg").toExternalForm()));
                if (imageView.getImage().isError()){
                    System.out.println("err loading imag");
                }
                break;
            case  3:
                imageView.setImage(new Image(getClass().getResource("/imgs/P4.jpg").toExternalForm()));
                if (imageView.getImage().isError()){
                    System.out.println("err loading imag");
                }
                break;
            case  4:
                imageView.setImage(new Image(getClass().getResource("/imgs/P5.jpg").toExternalForm()));
                if (imageView.getImage().isError()){
                    System.out.println("err loading imag");
                }
            case  5:
                imageView.setImage(new Image(getClass().getResource("/imgs/g6.jpg").toExternalForm()));
                if (imageView.getImage().isError()){
                    System.out.println("err loading imag");
                }
                break;
            case  6:
                imageView.setImage(new Image(getClass().getResource("/imgs/g7.jpg").toExternalForm()));
                if (imageView.getImage().isError()){
                    System.out.println("err loading imag");
                }
                break;
            case  7:
                imageView.setImage(new Image(getClass().getResource("/imgs/g8.jpg").toExternalForm()));
                if (imageView.getImage().isError()){
                    System.out.println("err loading imag");
                }
                break;
            case  8:
                imageView.setImage(new Image(getClass().getResource("/imgs/g9.jpg").toExternalForm()));
                if (imageView.getImage().isError()){
                    System.out.println("err loading imag");
                }
                break;
            case  9:
                imageView.setImage(new Image(getClass().getResource("/imgs/g10.jpg").toExternalForm()));
                if (imageView.getImage().isError()){
                    System.out.println("err loading imag");
                }
                break;
            case  10:
                imageView.setImage(new Image(getClass().getResource("/imgs/g11.jpg").toExternalForm()));
                if (imageView.getImage().isError()){
                    System.out.println("err loading imag");
                }
                break;
            case  11:
                imageView.setImage(new Image(getClass().getResource("/imgs/g12.jpg").toExternalForm()));
                if (imageView.getImage().isError()){
                    System.out.println("err loading imag");
                }
                break;
            case  12:
                imageView.setImage(new Image(getClass().getResource("/imgs/g13.jpg").toExternalForm()));
                if (imageView.getImage().isError()){
                    System.out.println("err loading imag");
                }
                break;
            case  13:
                imageView.setImage(new Image(getClass().getResource("/imgs/g14.jpg").toExternalForm()));
                if (imageView.getImage().isError()){
                    System.out.println("err loading imag");
                }
                break;
            case  14:
                imageView.setImage(new Image(getClass().getResource("/imgs/g15.jpg").toExternalForm()));
                if (imageView.getImage().isError()){
                    System.out.println("err loading imag");
                }
                break;
            case  15:
                imageView.setImage(new Image(getClass().getResource("/imgs/g16.jpg").toExternalForm()));
                if (imageView.getImage().isError()){
                    System.out.println("err loading imag");
                }
                break;
            case  16:
                imageView.setImage(new Image(getClass().getResource("/imgs/g17.jpg").toExternalForm()));
                if (imageView.getImage().isError()){
                    System.out.println("err loading imag");
                }
                break;
            case  17:
                imageView.setImage(new Image(getClass().getResource("/imgs/g18.jpg").toExternalForm()));
                if (imageView.getImage().isError()){
                    System.out.println("err loading imag");
                }
                break;
            case  18:
                imageView.setImage(new Image(getClass().getResource("/imgs/g19.jpg").toExternalForm()));
                if (imageView.getImage().isError()){
                    System.out.println("err loading imag");
                }
                break;
            case  19:
                imageView.setImage(new Image(getClass().getResource("/imgs/g20.jpg").toExternalForm()));
                if (imageView.getImage().isError()){
                    System.out.println("err loading imag");
                }
                break;
            case  20:
                imageView.setImage(new Image(getClass().getResource("/imgs/g21.jpg").toExternalForm()));
                if (imageView.getImage().isError()){
                    System.out.println("err loading imag");
                }
                break;
            case  21:
                imageView.setImage(new Image(getClass().getResource("/imgs/g22.jpg").toExternalForm()));
                if (imageView.getImage().isError()){
                    System.out.println("err loading imag");
                }
                break;
            case  22:
                imageView.setImage(new Image(getClass().getResource("/imgs/g23.jpg").toExternalForm()));
                if (imageView.getImage().isError()){
                    System.out.println("err loading imag");
                }
                break;
            case  23:
                imageView.setImage(new Image(getClass().getResource("/imgs/g24.jpg").toExternalForm()));
                if (imageView.getImage().isError()){
                    System.out.println("err loading imag");
                }
                break;
            case  24:
                imageView.setImage(new Image(getClass().getResource("/imgs/g25.jpg").toExternalForm()));
                if (imageView.getImage().isError()){
                    System.out.println("err loading imag");
                }
                break;
            case  25:
                imageView.setImage(new Image(getClass().getResource("/imgs/g26.jpg").toExternalForm()));
                if (imageView.getImage().isError()){
                    System.out.println("err loading imag");
                }
                break;
            case  26:
                imageView.setImage(new Image(getClass().getResource("/imgs/g27.jpg").toExternalForm()));
                if (imageView.getImage().isError()){
                    System.out.println("err loading imag");
                }
                break;
            case  27:
                imageView.setImage(new Image(getClass().getResource("/imgs/g28.jpg").toExternalForm()));
                if (imageView.getImage().isError()){
                    System.out.println("err loading imag");
                }
                break;
            case  28:
                imageView.setImage(new Image(getClass().getResource("/imgs/g29.jpg").toExternalForm()));
                if (imageView.getImage().isError()){
                    System.out.println("err loading imag");
                }
                break;
            case  29:
                imageView.setImage(new Image(getClass().getResource("/imgs/g30.jpg").toExternalForm()));
                if (imageView.getImage().isError()){
                    System.out.println("err loading imag");
                }
                break;
            default:
                imageView.setImage(new Image(getClass().getResource("/imgs/default.jpg").toExternalForm()));
                if (imageView.getImage().isError()){
                    System.out.println("err loading imag");
                }
                break;

        }
        imageView.setFitWidth(800);
        imageView.setFitHeight(400);
        imageView.setPreserveRatio(true);
        pageBox.getChildren().add(imageView);
        return pageBox;
    }

}
