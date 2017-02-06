/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rogueone.trackmodel.gui;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import trackmodel.TrackModel;

/**
 *
 * @author kylemonto
 */
public class TrackModelGUI extends javax.swing.JPanel {

    /** Creates new form TrackModelGUI */
    public TrackModelGUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        trackDataFileChooser = new javax.swing.JFileChooser();
        trackModelTabbedPane = new javax.swing.JTabbedPane();
        trackOverviewPanel = new javax.swing.JPanel();
        trackLayoutPanel = new javax.swing.JPanel();
        trackLayoutLabel = new javax.swing.JLabel();
        trackFailureModesPanel = new javax.swing.JPanel();
        trackCircuitFailureButton = new javax.swing.JButton();
        brokenRailFailureButton = new javax.swing.JButton();
        powerOutageFailureButton = new javax.swing.JButton();
        trackPositionsPanel = new javax.swing.JPanel();
        trainPositionsScrollPane = new javax.swing.JScrollPane();
        trainPositionsTable = new javax.swing.JTable();
        trackConfigurationPanel = new javax.swing.JPanel();
        trackConfigurationLoadButton = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        trackDetailsPanel = new javax.swing.JPanel();
        trackDetailsSelectionPanel = new javax.swing.JPanel();
        lineSectionPanel = new javax.swing.JPanel();
        lineSectionComboBox = new javax.swing.JComboBox<>();
        sectionSelectionPanel = new javax.swing.JPanel();
        sectionSelectionComboBox = new javax.swing.JComboBox<>();
        blockSelectionPanel = new javax.swing.JPanel();
        blockSelectionComboBox = new javax.swing.JComboBox<>();
        componentSelectionPanel = new javax.swing.JPanel();
        componentSelectionComboBox = new javax.swing.JComboBox<>();
        trackDetailsDetailsPanel = new javax.swing.JPanel();
        lineDetailsPanel = new javax.swing.JPanel();
        lineDetailsScrollPane = new javax.swing.JScrollPane();
        lineDetailsTable = new javax.swing.JTable();
        sectionDetailsPanel = new javax.swing.JPanel();
        sectionDetailsScrollPane = new javax.swing.JScrollPane();
        sectionDetailsTable = new javax.swing.JTable();
        blockDtailsPanel = new javax.swing.JPanel();
        blockDetailsScrollPane = new javax.swing.JScrollPane();
        blockDetailsTable = new javax.swing.JTable();
        componentDetailsPanel = new javax.swing.JPanel();
        componentDetailsScrollPane = new javax.swing.JScrollPane();
        componentDetailsTable = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(1070, 720));
        setMinimumSize(new java.awt.Dimension(1070, 720));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1070, 720));
        setVerifyInputWhenFocusTarget(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        trackLayoutPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Track Layout"));

        trackLayoutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rogueone/images/layout_small.jpg")));

        javax.swing.GroupLayout trackLayoutPanelLayout = new javax.swing.GroupLayout(trackLayoutPanel);
        trackLayoutPanel.setLayout(trackLayoutPanelLayout);
        trackLayoutPanelLayout.setHorizontalGroup(
            trackLayoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trackLayoutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(trackLayoutLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        trackLayoutPanelLayout.setVerticalGroup(
            trackLayoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trackLayoutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(trackLayoutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                .addContainerGap())
        );

        trackFailureModesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Failure Modes"));
        trackFailureModesPanel.setLayout(new java.awt.GridLayout(1, 3));

        trackCircuitFailureButton.setText("Track Circuit");
        trackFailureModesPanel.add(trackCircuitFailureButton);

        brokenRailFailureButton.setText("Broken Rail");
        brokenRailFailureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brokenRailFailureButtonActionPerformed(evt);
            }
        });
        trackFailureModesPanel.add(brokenRailFailureButton);

        powerOutageFailureButton.setText("Power  Outage");
        trackFailureModesPanel.add(powerOutageFailureButton);

        trackPositionsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Train Positions"));

        trainPositionsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Red", "3", "19", "1357"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Line", "Section", "Block", "ID"
            }
        ));
        trainPositionsScrollPane.setViewportView(trainPositionsTable);

        javax.swing.GroupLayout trackPositionsPanelLayout = new javax.swing.GroupLayout(trackPositionsPanel);
        trackPositionsPanel.setLayout(trackPositionsPanelLayout);
        trackPositionsPanelLayout.setHorizontalGroup(
            trackPositionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trackPositionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(trainPositionsScrollPane)
                .addContainerGap())
        );
        trackPositionsPanelLayout.setVerticalGroup(
            trackPositionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, trackPositionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(trainPositionsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        trackConfigurationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Track Configuration"));

        trackConfigurationLoadButton.setText("Load Data File");
        trackConfigurationLoadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trackConfigurationLoadButtonMouseClicked(evt);
            }
        });
        trackConfigurationLoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trackConfigurationLoadButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout trackConfigurationPanelLayout = new javax.swing.GroupLayout(trackConfigurationPanel);
        trackConfigurationPanel.setLayout(trackConfigurationPanelLayout);
        trackConfigurationPanelLayout.setHorizontalGroup(
            trackConfigurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(trackConfigurationLoadButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        trackConfigurationPanelLayout.setVerticalGroup(
            trackConfigurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(trackConfigurationLoadButton, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Track Status"));

        jLabel7.setForeground(new java.awt.Color(0, 153, 51));
        jLabel7.setText("Light 243 successfully repaired on block 19");

        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Broken rail on block 9418");

        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("Track circuit failure on block 174");

        jLabel10.setForeground(new java.awt.Color(0, 153, 51));
        jLabel10.setText("Power restored to block 89");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addContainerGap(320, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout trackOverviewPanelLayout = new javax.swing.GroupLayout(trackOverviewPanel);
        trackOverviewPanel.setLayout(trackOverviewPanelLayout);
        trackOverviewPanelLayout.setHorizontalGroup(
            trackOverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trackOverviewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(trackLayoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(trackOverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(trackConfigurationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(trackPositionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(trackFailureModesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        trackOverviewPanelLayout.setVerticalGroup(
            trackOverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trackOverviewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(trackOverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(trackLayoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(trackOverviewPanelLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(trackPositionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(trackConfigurationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(trackFailureModesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(165, Short.MAX_VALUE))
        );

        trackModelTabbedPane.addTab("Track Overview", trackOverviewPanel);

        trackDetailsPanel.setMaximumSize(new java.awt.Dimension(1060, 710));
        trackDetailsPanel.setMinimumSize(new java.awt.Dimension(1060, 710));
        trackDetailsPanel.setPreferredSize(new java.awt.Dimension(1060, 710));

        trackDetailsSelectionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selection", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24))); // NOI18N
        trackDetailsSelectionPanel.setLayout(new java.awt.GridLayout(1, 4));

        lineSectionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Line"));

        lineSectionComboBox.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lineSectionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Green", "Red" }));

        javax.swing.GroupLayout lineSectionPanelLayout = new javax.swing.GroupLayout(lineSectionPanel);
        lineSectionPanel.setLayout(lineSectionPanelLayout);
        lineSectionPanelLayout.setHorizontalGroup(
            lineSectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lineSectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lineSectionComboBox, 0, 219, Short.MAX_VALUE)
                .addContainerGap())
        );
        lineSectionPanelLayout.setVerticalGroup(
            lineSectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lineSectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lineSectionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        trackDetailsSelectionPanel.add(lineSectionPanel);

        sectionSelectionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Section"));

        sectionSelectionComboBox.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        sectionSelectionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S1", "S2", "S3" }));

        javax.swing.GroupLayout sectionSelectionPanelLayout = new javax.swing.GroupLayout(sectionSelectionPanel);
        sectionSelectionPanel.setLayout(sectionSelectionPanelLayout);
        sectionSelectionPanelLayout.setHorizontalGroup(
            sectionSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sectionSelectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sectionSelectionComboBox, 0, 219, Short.MAX_VALUE)
                .addContainerGap())
        );
        sectionSelectionPanelLayout.setVerticalGroup(
            sectionSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sectionSelectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sectionSelectionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        trackDetailsSelectionPanel.add(sectionSelectionPanel);

        blockSelectionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Block"));

        blockSelectionComboBox.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        blockSelectionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B1", "B2", "B3", "B4", "B5" }));

        javax.swing.GroupLayout blockSelectionPanelLayout = new javax.swing.GroupLayout(blockSelectionPanel);
        blockSelectionPanel.setLayout(blockSelectionPanelLayout);
        blockSelectionPanelLayout.setHorizontalGroup(
            blockSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blockSelectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blockSelectionComboBox, 0, 219, Short.MAX_VALUE)
                .addContainerGap())
        );
        blockSelectionPanelLayout.setVerticalGroup(
            blockSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blockSelectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blockSelectionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        trackDetailsSelectionPanel.add(blockSelectionPanel);

        componentSelectionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Component"));

        componentSelectionComboBox.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        componentSelectionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Light 1", "Light 2", "Wayside 1", "Station 3" }));

        javax.swing.GroupLayout componentSelectionPanelLayout = new javax.swing.GroupLayout(componentSelectionPanel);
        componentSelectionPanel.setLayout(componentSelectionPanelLayout);
        componentSelectionPanelLayout.setHorizontalGroup(
            componentSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(componentSelectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(componentSelectionComboBox, 0, 219, Short.MAX_VALUE)
                .addContainerGap())
        );
        componentSelectionPanelLayout.setVerticalGroup(
            componentSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(componentSelectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(componentSelectionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        trackDetailsSelectionPanel.add(componentSelectionPanel);

        trackDetailsDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24))); // NOI18N
        trackDetailsDetailsPanel.setLayout(new java.awt.GridLayout(4, 1));

        lineDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Line"));

        lineDetailsTable.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lineDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"2", "Red", "27", "93"}
            },
            new String [] {
                "ID", "Line", "Num Sections", "Num Blocks"
            }
        ));
        lineDetailsTable.setFocusable(false);
        lineDetailsTable.setRowHeight(40);
        lineDetailsScrollPane.setViewportView(lineDetailsTable);

        javax.swing.GroupLayout lineDetailsPanelLayout = new javax.swing.GroupLayout(lineDetailsPanel);
        lineDetailsPanel.setLayout(lineDetailsPanelLayout);
        lineDetailsPanelLayout.setHorizontalGroup(
            lineDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lineDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lineDetailsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 943, Short.MAX_VALUE)
                .addContainerGap())
        );
        lineDetailsPanelLayout.setVerticalGroup(
            lineDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lineDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lineDetailsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );

        trackDetailsDetailsPanel.add(lineDetailsPanel);

        sectionDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Section"));

        sectionDetailsTable.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        sectionDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"654", "5", "182", "20"}
            },
            new String [] {
                "ID", "Section", "Length", "Num Blocks"
            }
        ));
        sectionDetailsTable.setRowHeight(40);
        sectionDetailsScrollPane.setViewportView(sectionDetailsTable);

        javax.swing.GroupLayout sectionDetailsPanelLayout = new javax.swing.GroupLayout(sectionDetailsPanel);
        sectionDetailsPanel.setLayout(sectionDetailsPanelLayout);
        sectionDetailsPanelLayout.setHorizontalGroup(
            sectionDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sectionDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sectionDetailsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 943, Short.MAX_VALUE)
                .addContainerGap())
        );
        sectionDetailsPanelLayout.setVerticalGroup(
            sectionDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sectionDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sectionDetailsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );

        trackDetailsDetailsPanel.add(sectionDetailsPanel);

        blockDtailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Block"));

        blockDetailsTable.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        blockDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"123", "122", "124", "N", "Y", "50", "10", "30", "20"}
            },
            new String [] {
                "ID", "Previous", "Next", "Forward", "Backward", "Size", "Grade", "Elevation", "Speed Limit"
            }
        ));
        blockDetailsTable.setRowHeight(40);
        blockDetailsScrollPane.setViewportView(blockDetailsTable);

        javax.swing.GroupLayout blockDtailsPanelLayout = new javax.swing.GroupLayout(blockDtailsPanel);
        blockDtailsPanel.setLayout(blockDtailsPanelLayout);
        blockDtailsPanelLayout.setHorizontalGroup(
            blockDtailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blockDtailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blockDetailsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 943, Short.MAX_VALUE)
                .addContainerGap())
        );
        blockDtailsPanelLayout.setVerticalGroup(
            blockDtailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blockDtailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blockDetailsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );

        trackDetailsDetailsPanel.add(blockDtailsPanel);

        componentDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Component"));

        componentDetailsTable.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        componentDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"890", "Light", "Green", "Inbound", "Operational"}
            },
            new String [] {
                "ID", "Type", "Value", "Direction", "Status"
            }
        ));
        componentDetailsTable.setRowHeight(40);
        componentDetailsScrollPane.setViewportView(componentDetailsTable);

        javax.swing.GroupLayout componentDetailsPanelLayout = new javax.swing.GroupLayout(componentDetailsPanel);
        componentDetailsPanel.setLayout(componentDetailsPanelLayout);
        componentDetailsPanelLayout.setHorizontalGroup(
            componentDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(componentDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(componentDetailsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 943, Short.MAX_VALUE)
                .addContainerGap())
        );
        componentDetailsPanelLayout.setVerticalGroup(
            componentDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(componentDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(componentDetailsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );

        trackDetailsDetailsPanel.add(componentDetailsPanel);

        javax.swing.GroupLayout trackDetailsPanelLayout = new javax.swing.GroupLayout(trackDetailsPanel);
        trackDetailsPanel.setLayout(trackDetailsPanelLayout);
        trackDetailsPanelLayout.setHorizontalGroup(
            trackDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trackDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(trackDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(trackDetailsSelectionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(trackDetailsDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        trackDetailsPanelLayout.setVerticalGroup(
            trackDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trackDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(trackDetailsSelectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trackDetailsDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        trackModelTabbedPane.addTab("Track Details", trackDetailsPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(trackModelTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(trackModelTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void brokenRailFailureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brokenRailFailureButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brokenRailFailureButtonActionPerformed

    private void trackConfigurationLoadButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trackConfigurationLoadButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_trackConfigurationLoadButtonMouseClicked

    private void trackConfigurationLoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trackConfigurationLoadButtonActionPerformed
        JFileChooser trackDataFileChooser = new JFileChooser();
        int returnVal = trackDataFileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File trackDataFile = trackDataFileChooser.getSelectedFile();
            try {
                TrackModel.parseDataFile(trackDataFile);
            }
            catch (IOException ex) {
                System.out.println("problem accessing file"+trackDataFile.getAbsolutePath());
            }
            catch (InvalidFormatException ex) {
                System.out.println("Please select a .xlsx file.");
            }
        } else if (returnVal == JFileChooser.CANCEL_OPTION){
           System.out.println("File access cancelled by user.");
        }
        trackDataFileChooser.setVisible(true);
    }//GEN-LAST:event_trackConfigurationLoadButtonActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane blockDetailsScrollPane;
    private javax.swing.JTable blockDetailsTable;
    private javax.swing.JPanel blockDtailsPanel;
    private javax.swing.JComboBox<String> blockSelectionComboBox;
    private javax.swing.JPanel blockSelectionPanel;
    private javax.swing.JButton brokenRailFailureButton;
    private javax.swing.JPanel componentDetailsPanel;
    private javax.swing.JScrollPane componentDetailsScrollPane;
    private javax.swing.JTable componentDetailsTable;
    private javax.swing.JComboBox<String> componentSelectionComboBox;
    private javax.swing.JPanel componentSelectionPanel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel lineDetailsPanel;
    private javax.swing.JScrollPane lineDetailsScrollPane;
    private javax.swing.JTable lineDetailsTable;
    private javax.swing.JComboBox<String> lineSectionComboBox;
    private javax.swing.JPanel lineSectionPanel;
    private javax.swing.JButton powerOutageFailureButton;
    private javax.swing.JPanel sectionDetailsPanel;
    private javax.swing.JScrollPane sectionDetailsScrollPane;
    private javax.swing.JTable sectionDetailsTable;
    private javax.swing.JComboBox<String> sectionSelectionComboBox;
    private javax.swing.JPanel sectionSelectionPanel;
    private javax.swing.JButton trackCircuitFailureButton;
    private javax.swing.JButton trackConfigurationLoadButton;
    private javax.swing.JPanel trackConfigurationPanel;
    private javax.swing.JFileChooser trackDataFileChooser;
    private javax.swing.JPanel trackDetailsDetailsPanel;
    private javax.swing.JPanel trackDetailsPanel;
    private javax.swing.JPanel trackDetailsSelectionPanel;
    private javax.swing.JPanel trackFailureModesPanel;
    private javax.swing.JLabel trackLayoutLabel;
    private javax.swing.JPanel trackLayoutPanel;
    private javax.swing.JTabbedPane trackModelTabbedPane;
    private javax.swing.JPanel trackOverviewPanel;
    private javax.swing.JPanel trackPositionsPanel;
    private javax.swing.JScrollPane trainPositionsScrollPane;
    private javax.swing.JTable trainPositionsTable;
    // End of variables declaration//GEN-END:variables

}