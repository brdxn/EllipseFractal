import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 
import javafx.scene.shape.Ellipse; 
import javafx.scene.paint.Color;
 
 
public class EllipseFractal extends Application { 
   public void start(Stage stage) { 
    
      Group root = new Group(); 
      drawFractal(root, 0.6f, 0);
   
      Scene scene = new Scene(root, 600, 300); 
   
      stage.setTitle("Drawing an Ellipse"); 
    
      stage.setScene(scene); 
    
      stage.show();
   } 
 
  
   public void drawFractal(Group root, float scale, int level) {
      if (level == 10) {
         return;
      }
      Ellipse ellipse = new Ellipse(); 
   
      ellipse.setCenterX(300.0f); 
      ellipse.setCenterY(150.0f); 
      ellipse.setRadiusX(150.0f * scale); 
      ellipse.setRadiusY(75.0f * scale);
      ellipse.setStroke(Color.BLACK);
      ellipse.setFill(Color.rgb(200, 200, 200, 0.5));
      ellipse.setStrokeWidth(3);
     
      root.getChildren().add(ellipse);
    
      drawFractal(root, scale * 1.2f, level + 1);
   
   
   }
 
   public static void main(String args[]){ 
      launch(args); 
   } 
}