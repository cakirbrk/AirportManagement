package com.project.airportM.Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.project.airportM.Business.Custom.CityBO;
import com.project.airportM.Business.Custom.impl.CityBOimpl;
import com.project.airportM.Dto.CityDTO;
import com.project.airportM.Main.AppInitializer;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;

public class CityController {

    public JFXButton btnAdd;
    public JFXTextField txtCityCode;
    public JFXTextField txtDescription;
    public Label lblError;

    private CityBO cityBO= AppInitializer.ctx.getBean(CityBOimpl.class);

    public void setBtnAdd(ActionEvent event) {

        if (txtCityCode.getText() == null || txtCityCode.getText().trim().isEmpty() || txtDescription.getText() == null || txtDescription.getText().trim().isEmpty()) {
            lblError.setVisible(true);
            lblError.setText("Lütfen gerekli yerleri doldurunuz");
        } else {
            //items.add(new AirlineTM(txtairlineCode.getText(), txtdescription.getText()));

            if(btnAdd.getText().equals("Add")) {
                try {
                    boolean result = cityBO.save(new CityDTO(txtCityCode.getText(), txtDescription.getText()));
                    if (result) {
                        new Alert(Alert.AlertType.INFORMATION, "CustomerTM Successfully Added", ButtonType.OK).showAndWait();
                    } else {
                        new Alert(Alert.AlertType.INFORMATION, "Failed To Add CustomerTM", ButtonType.OK).showAndWait();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else{
//                for (AirlineTM airlineTM :items) {
//                    if(airlineTM.getAirlineId().equals(value.getAirlineId())){
//                        airlineTM.setAirlineCode(txtairlineCode.getText());
//                        airlineTM.setDescription(txtdescription.getText());
//                        try {
//                            boolean isUpdated = airlineBO.update(new AirlineDTO(airlineTM.getAirlineCode(), airlineTM.getDescription()));
//                            if(isUpdated){
//                                //tblCustomer.refresh();
//                                new Alert(Alert.AlertType.INFORMATION, "CustomerTM Successfully Updated", ButtonType.OK).showAndWait();
//                                btnAdd.setText("Save");
//                            }else{
//                                new Alert(Alert.AlertType.INFORMATION, "Failed To Update CustomerTM", ButtonType.OK).showAndWait();
//                            }
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                        }
//
//                    }
//
//                }
            }
        }

    }
}
