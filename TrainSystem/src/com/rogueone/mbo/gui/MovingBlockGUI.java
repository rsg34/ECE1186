/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rogueone.mbo.gui;

/**
 *
 * @author kylemonto
 */
public class MovingBlockGUI extends javax.swing.JPanel {

    /**
     * Creates new form MovingBlockGUI
     */
    public MovingBlockGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        MboPane = new javax.swing.JScrollPane();
        MboPanel = new javax.swing.JPanel();
        TrainSchedulePanel = new javax.swing.JPanel();
        TrainSchedule = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        PersonnelSchedulePanel = new javax.swing.JPanel();
        PersonnelSchedule = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        TestInputsPanel = new javax.swing.JPanel();
        MboOkButton1 = new javax.swing.JButton();
        MboSuggestedSpeedLabel = new javax.swing.JLabel();
        MboSuggestedSpeedField = new javax.swing.JTextField();
        MboAntennaFailureButton = new javax.swing.JToggleButton();
        MboEbrakeButton = new javax.swing.JToggleButton();
        MboSuggestedAuthorityLabel = new javax.swing.JLabel();
        MboSuggestedAuthorityField = new javax.swing.JTextField();
        MboUnitLabel = new javax.swing.JLabel();
        MboUnitLabel2 = new javax.swing.JLabel();
        MboModePanel = new javax.swing.JPanel();
        FixedBlockRadio = new javax.swing.JRadioButton();
        MovingBlockRadio = new javax.swing.JRadioButton();
        SelectTrainPrompt = new javax.swing.JLabel();
        TrainDropdown = new javax.swing.JComboBox<>();
        ControlModeLabel = new javax.swing.JLabel();
        SystemStatusLabel = new javax.swing.JLabel();
        MboLabel = new javax.swing.JLabel();
        MboStatusLabel = new javax.swing.JLabel();
        VariancePanel = new javax.swing.JPanel();
        SystemIsInLabel = new javax.swing.JLabel();
        CurrentModeLabel = new javax.swing.JLabel();
        CurrentSpeedLabel = new javax.swing.JLabel();
        SuggestedSpeedLabel = new javax.swing.JLabel();
        SelectedTrainLabel = new javax.swing.JLabel();
        TrainIdValue = new javax.swing.JLabel();
        CurrentSpeedValue = new javax.swing.JLabel();
        SuggestedSpeedValue = new javax.swing.JLabel();
        DifferenceValue = new javax.swing.JLabel();
        SchedulerInputsPanel = new javax.swing.JPanel();
        UploadScheduleButton = new javax.swing.JButton();
        UploadScheduleLabel = new javax.swing.JLabel();
        GenerateScheduleLabel = new javax.swing.JLabel();
        ThroughputRadio = new javax.swing.JRadioButton();
        NumTrainsRadio = new javax.swing.JRadioButton();
        ThroughputInput = new javax.swing.JTextField();
        NumTrainsInput = new javax.swing.JTextField();
        MboUnits3 = new javax.swing.JLabel();
        MboUnits4 = new javax.swing.JLabel();
        MboOkButton2 = new javax.swing.JButton();
        DetailedScheduleButton = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        MboPanel.setPreferredSize(new java.awt.Dimension(1000, 650));

        TrainSchedulePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Train Schedule"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0010", "Red Line", "B", "6", "SHADYSIDE", "4:15 PM", "1340", "30mph", "35 mph", "12"},
                {"3452", "Red Line", "H", "24", "PENN STATION", "4:12 PM", "1400", "68 mph", "70 mph", "32"},
                {"4209", "Green Line", "F", "21", "WHITED", "4:16 PM", "1235", "66mph", "70 mph", "20"},
                {"1112", "Green Line", "P", "91", "CASTLE SHANNON", "4:20 PM", "1305", "55 mph", "55 mph", "3"},
                {"3453", "Red Line", "G", "21", "SWISSVILLE", "4:12 PM", "1850", "55 mph", "55mph", "40"},
                {"1215", "Red Line", "A", "1", "SHADYSIDE", "4:21 PM", "2120", "40 mph", "40 mph", "32"},
                {"2222", "Red Line", "U", "77", "N/A", "N/A ", "1720", "10 mph", "35 mph", "0"},
                {"0934", "Green Line", "K", "63", "GLENBURY", "4:17 PM", "1230", "70 mph", "70 mph", "42"}
            },
            new String [] {
                "Train ID", "Line", "Track Section", "Block", "Next Station", "Time of Arrival", "Authority", "Current Speed", "Suggested ", "Passengers"
            }
        ));
        TrainSchedule.setViewportView(jTable1);

        javax.swing.GroupLayout TrainSchedulePanelLayout = new javax.swing.GroupLayout(TrainSchedulePanel);
        TrainSchedulePanel.setLayout(TrainSchedulePanelLayout);
        TrainSchedulePanelLayout.setHorizontalGroup(
            TrainSchedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrainSchedulePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TrainSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        TrainSchedulePanelLayout.setVerticalGroup(
            TrainSchedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TrainSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        PersonnelSchedulePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Personnel Schedule"));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Andy Jones", "-", "-", "9 am - 5:30 pm", "2pm - 10:30pm", "2pm - 10:30pm", "9am - 5:30pm", " 8am - 4:30pm"},
                {"William Smith", "12pm - 8:30pm", "-", "12pm - 8:30pm", "12pm - 8:30pm", "-", "12pm - 8:30pm", "12pm - 8:30pm"},
                {"Colin Rich", "-", "8am - 4:30pm", "-", "8am - 4:30pm", "8am - 4:30pm", "8am - 4:30pm", "2pm - 10:30pm"},
                {"Daniel Todd", "2pm - 10:30pm", "2pm - 10:30pm", "2pm - 10:30pm", "-", "2pm - 10:30pm", "-", "8am - 4:30pm"},
                {"Eli White", "6am - 2:30pm", "6am - 2:30pm", "6am - 2:30pm", "6am - 2:30pm", "-", "6am - 2:30pm", "6am - 2:30pm"},
                {"Francis Finch", "2pm - 10:30pm", "10am - 6:30pm", "2pm - 10:30pm", "-", "-", "10am - 6:30pm", "2pm - 10:30pm"},
                {"Gary Johnson", "12pm - 8:30pm", "12pm - 8:30pm", "-", "12pm - 8:30pm", "12pm - 8:30pm", "12pm - 8:30pm", "-"},
                {"Harold Brown", "7am - 5:30pm", "7am - 5:30pm", "7am - 5:30pm", "7am - 5:30pm", "7am - 5:30pm", "-", "-"},
                {"Ian Davis", "10am - 6:30pm", "-", "10am - 6:30pm", "2pm - 10:30pm", "10am - 6:30pm", "-", "10am - 6:30pm"}
            },
            new String [] {
                "Name", "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat", "Sun"
            }
        ));
        PersonnelSchedule.setViewportView(jTable2);

        javax.swing.GroupLayout PersonnelSchedulePanelLayout = new javax.swing.GroupLayout(PersonnelSchedulePanel);
        PersonnelSchedulePanel.setLayout(PersonnelSchedulePanelLayout);
        PersonnelSchedulePanelLayout.setHorizontalGroup(
            PersonnelSchedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonnelSchedulePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PersonnelSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
                .addContainerGap())
        );
        PersonnelSchedulePanelLayout.setVerticalGroup(
            PersonnelSchedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PersonnelSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        TestInputsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Test Inputs"));

        MboOkButton1.setText("OK");
        MboOkButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MboOkButton1ActionPerformed(evt);
            }
        });

        MboSuggestedSpeedLabel.setText("Suggested Speed:");

        MboAntennaFailureButton.setText("Toggle Antenna Failure");

        MboEbrakeButton.setText("Toggle Emergency Brake");

        MboSuggestedAuthorityLabel.setText("Suggested Authority:");

        MboUnitLabel.setText("km/hr");

        MboUnitLabel2.setText("km");

        javax.swing.GroupLayout TestInputsPanelLayout = new javax.swing.GroupLayout(TestInputsPanel);
        TestInputsPanel.setLayout(TestInputsPanelLayout);
        TestInputsPanelLayout.setHorizontalGroup(
            TestInputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TestInputsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TestInputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TestInputsPanelLayout.createSequentialGroup()
                        .addComponent(MboSuggestedSpeedLabel)
                        .addGap(18, 18, 18)
                        .addComponent(MboSuggestedSpeedField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MboUnitLabel))
                    .addGroup(TestInputsPanelLayout.createSequentialGroup()
                        .addComponent(MboSuggestedAuthorityLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MboSuggestedAuthorityField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MboUnitLabel2))
                    .addComponent(MboEbrakeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(TestInputsPanelLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(MboOkButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TestInputsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MboAntennaFailureButton, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        TestInputsPanelLayout.setVerticalGroup(
            TestInputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TestInputsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TestInputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MboSuggestedSpeedLabel)
                    .addComponent(MboSuggestedSpeedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MboUnitLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TestInputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MboSuggestedAuthorityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MboSuggestedAuthorityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MboUnitLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MboOkButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MboEbrakeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(MboAntennaFailureButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        MboModePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Mode"));

        buttonGroup1.add(FixedBlockRadio);
        FixedBlockRadio.setText("Fixed Block ");
        FixedBlockRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FixedBlockRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(MovingBlockRadio);
        MovingBlockRadio.setSelected(true);
        MovingBlockRadio.setText("Moving Block");

        SelectTrainPrompt.setText("Select train to interact with:");

        TrainDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0010","0934","1112","1215","2222","3452","3453","4209", }));
        TrainDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrainDropdownActionPerformed(evt);
            }
        });

        ControlModeLabel.setText("Control Mode: ");

        SystemStatusLabel.setForeground(new java.awt.Color(0, 204, 51));
        SystemStatusLabel.setText("AUTOMATIC");

        MboLabel.setText("MBO: ");

        MboStatusLabel.setForeground(new java.awt.Color(0, 204, 51));
        MboStatusLabel.setText("ENABLED");

        javax.swing.GroupLayout MboModePanelLayout = new javax.swing.GroupLayout(MboModePanel);
        MboModePanel.setLayout(MboModePanelLayout);
        MboModePanelLayout.setHorizontalGroup(
            MboModePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MboModePanelLayout.createSequentialGroup()
                .addGroup(MboModePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MboModePanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(MboModePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SelectTrainPrompt)
                            .addComponent(TrainDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(MboModePanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(FixedBlockRadio)
                        .addGap(18, 18, 18)
                        .addComponent(MovingBlockRadio))
                    .addGroup(MboModePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(MboModePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ControlModeLabel)
                            .addComponent(MboLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(MboModePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MboStatusLabel)
                            .addComponent(SystemStatusLabel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MboModePanelLayout.setVerticalGroup(
            MboModePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MboModePanelLayout.createSequentialGroup()
                .addGroup(MboModePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ControlModeLabel)
                    .addComponent(SystemStatusLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MboModePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MboLabel)
                    .addComponent(MboStatusLabel))
                .addGap(24, 24, 24)
                .addGroup(MboModePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FixedBlockRadio)
                    .addComponent(MovingBlockRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(SelectTrainPrompt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TrainDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        VariancePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Variance"));

        SystemIsInLabel.setText("System is in:");

        CurrentModeLabel.setText("Moving Block Mode");

        CurrentSpeedLabel.setText("Current train speed:");

        SuggestedSpeedLabel.setText("Suggested train speed:");

        SelectedTrainLabel.setText("Selected train ID:");

        TrainIdValue.setText("0010");

        CurrentSpeedValue.setText("30 mph");

        SuggestedSpeedValue.setText("35 mph");

        DifferenceValue.setText("(+5 mph)");

        javax.swing.GroupLayout VariancePanelLayout = new javax.swing.GroupLayout(VariancePanel);
        VariancePanel.setLayout(VariancePanelLayout);
        VariancePanelLayout.setHorizontalGroup(
            VariancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VariancePanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(VariancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VariancePanelLayout.createSequentialGroup()
                        .addComponent(SuggestedSpeedLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SuggestedSpeedValue)
                        .addGap(18, 18, 18)
                        .addComponent(DifferenceValue))
                    .addComponent(CurrentSpeedLabel)
                    .addGroup(VariancePanelLayout.createSequentialGroup()
                        .addGroup(VariancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SystemIsInLabel)
                            .addComponent(SelectedTrainLabel))
                        .addGap(21, 21, 21)
                        .addGroup(VariancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CurrentModeLabel)
                            .addGroup(VariancePanelLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(VariancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CurrentSpeedValue)
                                    .addComponent(TrainIdValue))))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        VariancePanelLayout.setVerticalGroup(
            VariancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VariancePanelLayout.createSequentialGroup()
                .addGroup(VariancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SystemIsInLabel)
                    .addComponent(CurrentModeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(VariancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelectedTrainLabel)
                    .addComponent(TrainIdValue))
                .addGap(13, 13, 13)
                .addGroup(VariancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CurrentSpeedLabel)
                    .addComponent(CurrentSpeedValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(VariancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SuggestedSpeedLabel)
                    .addComponent(SuggestedSpeedValue)
                    .addComponent(DifferenceValue))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SchedulerInputsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Scheduler Inputs"));

        UploadScheduleButton.setText("Upload");
        UploadScheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadScheduleButtonActionPerformed(evt);
            }
        });

        UploadScheduleLabel.setText("Upload new personnel schedule (.xlsx)");

        GenerateScheduleLabel.setText("Generate new train schedule using desired...");

        buttonGroup2.add(ThroughputRadio);
        ThroughputRadio.setSelected(true);
        ThroughputRadio.setText("Throughput");
        ThroughputRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThroughputRadioActionPerformed(evt);
            }
        });

        buttonGroup2.add(NumTrainsRadio);
        NumTrainsRadio.setText("Number of active trains ");
        NumTrainsRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumTrainsRadioActionPerformed(evt);
            }
        });

        ThroughputInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThroughputInputActionPerformed(evt);
            }
        });

        MboUnits3.setText("passengers/hr");

        MboUnits4.setText("trains");

        MboOkButton2.setText("OK");
        MboOkButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MboOkButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SchedulerInputsPanelLayout = new javax.swing.GroupLayout(SchedulerInputsPanel);
        SchedulerInputsPanel.setLayout(SchedulerInputsPanelLayout);
        SchedulerInputsPanelLayout.setHorizontalGroup(
            SchedulerInputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SchedulerInputsPanelLayout.createSequentialGroup()
                .addComponent(GenerateScheduleLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(SchedulerInputsPanelLayout.createSequentialGroup()
                .addGroup(SchedulerInputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SchedulerInputsPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(SchedulerInputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(SchedulerInputsPanelLayout.createSequentialGroup()
                                .addComponent(ThroughputRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ThroughputInput, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SchedulerInputsPanelLayout.createSequentialGroup()
                                .addGroup(SchedulerInputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(MboOkButton2)
                                    .addComponent(NumTrainsRadio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NumTrainsInput, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SchedulerInputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MboUnits3)
                            .addComponent(MboUnits4)))
                    .addGroup(SchedulerInputsPanelLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(UploadScheduleButton)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SchedulerInputsPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(UploadScheduleLabel)
                .addGap(53, 53, 53))
        );
        SchedulerInputsPanelLayout.setVerticalGroup(
            SchedulerInputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SchedulerInputsPanelLayout.createSequentialGroup()
                .addComponent(UploadScheduleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UploadScheduleButton)
                .addGap(24, 24, 24)
                .addComponent(GenerateScheduleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SchedulerInputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ThroughputRadio)
                    .addComponent(ThroughputInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MboUnits3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SchedulerInputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumTrainsRadio)
                    .addComponent(NumTrainsInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MboUnits4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MboOkButton2)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        DetailedScheduleButton.setText("View detailed train schedule");
        DetailedScheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailedScheduleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MboPanelLayout = new javax.swing.GroupLayout(MboPanel);
        MboPanel.setLayout(MboPanelLayout);
        MboPanelLayout.setHorizontalGroup(
            MboPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MboPanelLayout.createSequentialGroup()
                .addGroup(MboPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MboPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(MboPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MboPanelLayout.createSequentialGroup()
                                .addComponent(TestInputsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SchedulerInputsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MboPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(VariancePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DetailedScheduleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(MboPanelLayout.createSequentialGroup()
                                .addComponent(MboModePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PersonnelSchedulePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(276, 276, 276))))
                    .addComponent(TrainSchedulePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        MboPanelLayout.setVerticalGroup(
            MboPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MboPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(MboPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MboModePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PersonnelSchedulePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TrainSchedulePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MboPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(MboPanelLayout.createSequentialGroup()
                        .addComponent(VariancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DetailedScheduleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SchedulerInputsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TestInputsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        MboPane.setViewportView(MboPanel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 77;
        gridBagConstraints.ipady = 77;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(MboPane, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void MboOkButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MboOkButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MboOkButton1ActionPerformed

    private void TrainDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrainDropdownActionPerformed
        // TODO add your handling code here;:
    }//GEN-LAST:event_TrainDropdownActionPerformed

    private void FixedBlockRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FixedBlockRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FixedBlockRadioActionPerformed

    private void UploadScheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadScheduleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UploadScheduleButtonActionPerformed

    private void ThroughputRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThroughputRadioActionPerformed
        if(ThroughputRadio.isSelected())
        {
            NumTrainsInput.setEnabled(false);
            MboUnits4.setEnabled(false);
            ThroughputInput.setEnabled(true);
            MboUnits3.setEnabled(true);
        }
    }//GEN-LAST:event_ThroughputRadioActionPerformed

    private void ThroughputInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThroughputInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ThroughputInputActionPerformed

    private void MboOkButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MboOkButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MboOkButton2ActionPerformed

    private void NumTrainsRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumTrainsRadioActionPerformed
        if(NumTrainsRadio.isSelected())
        {
            NumTrainsInput.setEnabled(true);
            MboUnits4.setEnabled(true);
            ThroughputInput.setEnabled(false);
            MboUnits3.setEnabled(false);
        }
    }//GEN-LAST:event_NumTrainsRadioActionPerformed

    private void DetailedScheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailedScheduleButtonActionPerformed
         TrainScheduleGUI trainSchedule = new TrainScheduleGUI();
        trainSchedule.setVisible(true);
    }//GEN-LAST:event_DetailedScheduleButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ControlModeLabel;
    private javax.swing.JLabel CurrentModeLabel;
    private javax.swing.JLabel CurrentSpeedLabel;
    private javax.swing.JLabel CurrentSpeedValue;
    private javax.swing.JButton DetailedScheduleButton;
    private javax.swing.JLabel DifferenceValue;
    private javax.swing.JRadioButton FixedBlockRadio;
    private javax.swing.JLabel GenerateScheduleLabel;
    private javax.swing.JToggleButton MboAntennaFailureButton;
    private javax.swing.JToggleButton MboEbrakeButton;
    private javax.swing.JLabel MboLabel;
    private javax.swing.JPanel MboModePanel;
    private javax.swing.JButton MboOkButton1;
    private javax.swing.JButton MboOkButton2;
    private javax.swing.JScrollPane MboPane;
    private javax.swing.JPanel MboPanel;
    private javax.swing.JLabel MboStatusLabel;
    private javax.swing.JTextField MboSuggestedAuthorityField;
    private javax.swing.JLabel MboSuggestedAuthorityLabel;
    private javax.swing.JTextField MboSuggestedSpeedField;
    private javax.swing.JLabel MboSuggestedSpeedLabel;
    private javax.swing.JLabel MboUnitLabel;
    private javax.swing.JLabel MboUnitLabel2;
    private javax.swing.JLabel MboUnits3;
    private javax.swing.JLabel MboUnits4;
    private javax.swing.JRadioButton MovingBlockRadio;
    private javax.swing.JTextField NumTrainsInput;
    private javax.swing.JRadioButton NumTrainsRadio;
    private javax.swing.JScrollPane PersonnelSchedule;
    private javax.swing.JPanel PersonnelSchedulePanel;
    private javax.swing.JPanel SchedulerInputsPanel;
    private javax.swing.JLabel SelectTrainPrompt;
    private javax.swing.JLabel SelectedTrainLabel;
    private javax.swing.JLabel SuggestedSpeedLabel;
    private javax.swing.JLabel SuggestedSpeedValue;
    private javax.swing.JLabel SystemIsInLabel;
    private javax.swing.JLabel SystemStatusLabel;
    private javax.swing.JPanel TestInputsPanel;
    private javax.swing.JTextField ThroughputInput;
    private javax.swing.JRadioButton ThroughputRadio;
    private javax.swing.JComboBox<String> TrainDropdown;
    private javax.swing.JLabel TrainIdValue;
    private javax.swing.JScrollPane TrainSchedule;
    private javax.swing.JPanel TrainSchedulePanel;
    private javax.swing.JButton UploadScheduleButton;
    private javax.swing.JLabel UploadScheduleLabel;
    private javax.swing.JPanel VariancePanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
