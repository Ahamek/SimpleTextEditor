package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MainPanelController {

    @FXML
    private Button clearButton;

    @FXML
    private TextArea inputTextArea;

    @FXML
    private TextArea outputTextArea;

    @FXML
    private Button reverseTextButton;

    @FXML
    private Button trimButton;

    @FXML
    void initialize() {
        displayOnlyTextArea();
        clearButtonAction();
        reverseButtonAction();
        trimButtonAction();
    }

    private void trimButtonAction() {
        trimButton.addEventFilter(ActionEvent.ACTION, actionEvent -> {
            String timedText = inputTextArea.getText().trim().replaceAll(" +", " ");
            outputTextArea.setText(timedText);
        });
    }

    private void reverseButtonAction() {
        reverseTextButton.addEventFilter(ActionEvent.ACTION, actionEvent -> {
            String reversedText = new StringBuilder(inputTextArea.getText())
                    .reverse()
                    .toString();
            outputTextArea.setText(reversedText);
        });
    }

    private void displayOnlyTextArea() {
        outputTextArea.setEditable(false);
    }

    private void clearButtonAction() {
        clearButton.addEventFilter(ActionEvent.ACTION, actionEvent -> {
            inputTextArea.setText("");
            outputTextArea.setText("");
        });
    }
}

