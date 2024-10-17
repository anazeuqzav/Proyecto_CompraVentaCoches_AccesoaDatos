package com.compraventa.vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JTextField marcaField;
    private JTextField modeloField;
    private JTextField matriculaField;
    private JTextField añoField;
    private JTextField fechaVentaField;
    private JTextArea cocheArea;
    private JButton agregarButton;
    private JButton listarButton;

    public Ventana() {
        setTitle("Compraventa de coches");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Encabezado para el nombre de la empresa y la imagen
        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new BorderLayout());

        // Nombre de la empresa
        JLabel tituloEmpresa = new JLabel("MotorTrade - Compraventa de Coches", JLabel.CENTER);
        tituloEmpresa.setFont(new Font("Arial", Font.BOLD, 18));
        headerPanel.add(tituloEmpresa, BorderLayout.NORTH);

        // Logotipo de la empresa
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/logo.png"));
        Image image = imageIcon.getImage();
        Image resizedImage = image.getScaledInstance(150, 70, java.awt.Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        JLabel imagenLabel = new JLabel(resizedIcon);
        headerPanel.add(imagenLabel, BorderLayout.CENTER);

        // Añade el encabezado
        add(headerPanel, BorderLayout.NORTH);

        JPanel inputPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);  // Añadir espacios entre los componentes
        gbc.anchor = GridBagConstraints.WEST;

        // Input de Marca
        gbc.gridx = 0;
        gbc.gridy = 0;
        inputPanel.add(new JLabel("Marca:"), gbc);
        marcaField = new JTextField(15);
        gbc.gridx = 1;
        inputPanel.add(marcaField, gbc);

        // Input de Modelo
        gbc.gridx = 0;
        gbc.gridy = 1;
        inputPanel.add(new JLabel("Modelo:"), gbc);
        modeloField = new JTextField(15);
        gbc.gridx = 1;
        inputPanel.add(modeloField, gbc);

        // Input de Matricula
        gbc.gridx = 0;
        gbc.gridy = 2;
        inputPanel.add(new JLabel("Matricula:"), gbc);
        matriculaField = new JTextField(15);
        gbc.gridx = 1;
        inputPanel.add(matriculaField, gbc);

        // Input de Año
        gbc.gridx = 0;
        gbc.gridy = 3;
        inputPanel.add(new JLabel("Año:"), gbc);
        añoField = new JTextField(15);
        gbc.gridx = 1;
        inputPanel.add(añoField, gbc);

        // Input de Fecha de Venta
        gbc.gridx = 0;
        gbc.gridy = 4;
        inputPanel.add(new JLabel("Fecha de Venta:"), gbc);
        fechaVentaField = new JTextField(15);
        gbc.gridx = 1;
        inputPanel.add(fechaVentaField, gbc);

        add(inputPanel, BorderLayout.CENTER);

        // Panel para los botones
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        agregarButton = new JButton("Agregar Coche");
        listarButton = new JButton("Listar Coche");
        buttonPanel.add(agregarButton);
        buttonPanel.add(listarButton);

        // Añadie el panel de botones la parte inferior
        add(buttonPanel, BorderLayout.SOUTH);

        // Área de texto para mostrar los coches
        cocheArea = new JTextArea(5, 25);
        cocheArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(cocheArea);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 20));
        add(scrollPane, BorderLayout.EAST);
    }

    // Métodos
    public String getMarca(){
        return marcaField.getText();
    }
    public String getModelo(){
        return modeloField.getText();
    }
    public String getMatricula(){
        return matriculaField.getText();
    }
    public String getAño(){
        return añoField.getText();
    }
    public String getfechaVenta(){
        return fechaVentaField.getText();
    }
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }
    public void mostrarCoches(String coches) {
        cocheArea.setText(coches);
    }

    public void setAgregarButtonListener(ActionListener listener) {
        agregarButton.addActionListener(listener);
    }
    public void setListarButtonListener(ActionListener listener) {
        listarButton.addActionListener(listener);
    }
}