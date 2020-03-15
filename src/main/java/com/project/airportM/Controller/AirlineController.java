package com.project.airportM.Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.project.airportM.Business.Custom.AirlineBO;
import com.project.airportM.Business.Custom.impl.AirlineBOimpl;
import com.project.airportM.Dto.AirlineDTO;
import com.project.airportM.Main.AppInitializer;
import com.project.airportM.Util.AirlineTM;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;


public class AirlineController {

    public JFXButton btnAdd;
    public JFXTextField txtairlineCode;
    public JFXTextField txtdescription;
    public Label lblError;
    public AirlineTM value;
    public ObservableList<AirlineTM> items;

    private AirlineBO airlineBO= AppInitializer.ctx.getBean(AirlineBOimpl.class);

    public void initialize(){

    }


    public void setBtnAdd(ActionEvent event) {

        if (txtairlineCode.getText() == null || txtairlineCode.getText().trim().isEmpty() || txtdescription.getText() == null || txtdescription.getText().trim().isEmpty()) {
            lblError.setVisible(true);
            lblError.setText("Lütfen gerekli yerleri doldurunuz");
        } else {
            //items.add(new AirlineTM(txtairlineCode.getText(), txtdescription.getText()));

            if(btnAdd.getText().equals("Add")) {
                try {
                    boolean result = airlineBO.save(new AirlineDTO(txtairlineCode.getText(), txtdescription.getText()));
                    if (result) {
                        new Alert(Alert.AlertType.INFORMATION, "CustomerTM Successfully Added", ButtonType.OK).showAndWait();
                    } else {
                        new Alert(Alert.AlertType.INFORMATION, "Failed To Add CustomerTM", ButtonType.OK).showAndWait();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else{
                for (AirlineTM airlineTM :items) {
                    if(airlineTM.getAirlineId().equals(value.getAirlineId())){
                        airlineTM.setAirlineCode(txtairlineCode.getText());
                        airlineTM.setDescription(txtdescription.getText());
                        try {
                            boolean isUpdated = airlineBO.update(new AirlineDTO(airlineTM.getAirlineCode(), airlineTM.getDescription()));
                            if(isUpdated){
                                //tblCustomer.refresh();
                                new Alert(Alert.AlertType.INFORMATION, "CustomerTM Successfully Updated", ButtonType.OK).showAndWait();
                                btnAdd.setText("Save");
                            }else{
                                new Alert(Alert.AlertType.INFORMATION, "Failed To Update CustomerTM", ButtonType.OK).showAndWait();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }

                }
            }
        }

    }


}
