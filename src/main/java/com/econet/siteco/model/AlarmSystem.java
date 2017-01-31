package com.econet.siteco.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Aaron on 11/23/2016.
 */
@Entity
@Table(name = "alarm_system")
public class AlarmSystem extends TowerElement {
    private String manufacturer;
    @Column(name = "controller_type")
    private String controllerType;
    private Integer sensors;
    private Integer monitors;
    @Column(name = "alarm_capturing")
    private String alarmCapturing;
    @Column(name = "backup_battery")
    private String backupBattery;
    @Column(name = "communication_interface")
    private String communicationInterface;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getControllerType() {
        return controllerType;
    }

    public void setControllerType(String controllerType) {
        this.controllerType = controllerType;
    }

    public Integer getSensors() {
        return sensors;
    }

    public void setSensors(Integer sensors) {
        this.sensors = sensors;
    }

    public Integer getMonitors() {
        return monitors;
    }

    public void setMonitors(Integer monitors) {
        this.monitors = monitors;
    }

    public String getAlarmCapturing() {
        return alarmCapturing;
    }

    public void setAlarmCapturing(String alarmCapturing) {
        this.alarmCapturing = alarmCapturing;
    }

    public String getBackupBattery() {
        return backupBattery;
    }

    public void setBackupBattery(String backupBattery) {
        this.backupBattery = backupBattery;
    }

    public String getCommunicationInterface() {
        return communicationInterface;
    }

    public void setCommunicationInterface(String communicationInterface) {
        this.communicationInterface = communicationInterface;
    }
}
