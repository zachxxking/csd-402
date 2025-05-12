
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
 * Zachariah King
 * Assignment 11.2: Java FX Topics
 * 5/11/25
 */

public class VacationItineraryApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create the parent VBox to hold all the days of the trip
        VBox itinerary = new VBox(20);
        itinerary.setPadding(new Insets(20));

        // Create a VBox for each day of the week and populate with activities (HBox)
        itinerary.getChildren().add(createDayItinerary("Monday - 07/07/25", new String[][] {
            {"9:00 AM", "Breakfast at the beach"},
            {"11:00 AM", "Visit the countryside villages"},
            {"2:00 PM", "Lunch at the hotel"},
            {"4:00 PM", "Relax at the beach"}
        }));

        itinerary.getChildren().add(createDayItinerary("Tuesday - 07/08/25", new String[][] {
            {"8:00 AM", "Morning walk along the beach"},
            {"10:00 AM", "Visit a Museum"},
            {"1:00 PM", "Picnic at the beach"},
            {"3:00 PM", "Shopping at the craft fair"}
        }));

        itinerary.getChildren().add(createDayItinerary("Wednesday 07/09/25", new String[][] {
            {"9:00 AM", "Breakfast on the hotel rooftop"},
            {"11:00 AM", "Tour some ruins"},
            {"1:00 PM", "Lunch in a castle"},
            {"4:00 PM", "Explore the underground tunnels"}
        }));

        itinerary.getChildren().add(createDayItinerary("Thursday 07/10/25", new String[][] {
            {"10:00 AM", "Visit the historical sites"},
            {"12:00 PM", "Lunch at the botanical gardens"},
            {"2:00 PM", "Boat party at the beach"},
            {"6:00 PM", "Dinner at the hotel restaurant"}
        }));

        // Add more days if needed...

        // Set up the Scene and Stage
        Scene scene = new Scene(itinerary, 400, 600);
        primaryStage.setTitle("Vacation Itinerary");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Helper method to create a day schedule (VBox for a single day)
    private VBox createDayItinerary(String day, String[][] activities) {
        VBox dayItinerary = new VBox(10);
        dayItinerary.setAlignment(Pos.TOP_LEFT);
        
        // Create the day header
        Label dayLabel = new Label(day);
        dayLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 16px;");
        dayItinerary.getChildren().add(dayLabel);

        // Add the activities for this day
        for (String[] activity : activities) {
            dayItinerary.getChildren().add(createActivitySlot(activity[0], activity[1]));
        }

        return dayItinerary;
    }

    // Helper method to create an activity slot (HBox)
    private HBox createActivitySlot(String time, String activity) {
        HBox activitySlot = new HBox(20);
        activitySlot.setAlignment(Pos.CENTER_LEFT);

        // Create the time label
        Label timeLabel = new Label(time);
        
        // Create the activity label
        Label activityLabel = new Label(activity);

        // Add the labels to the HBox
        activitySlot.getChildren().addAll(timeLabel, activityLabel);

        return activitySlot;
    }

    public static void main(String[] args) {
        launch(args);
    }
}