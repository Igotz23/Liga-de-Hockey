package fItxategiakSortu;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import T1ERRONKA.SailkapenaPanel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class SailkapenaPDFsortu {

	



	    public static void exportToPDF(ArrayList<String[]> data, String filePath) {
	        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
	            // Escribir la cabecera del archivo PDF
	            outputStream.write("%PDF-1.4\n".getBytes());

	            // Crear un objeto de página
	            writePage(outputStream, data);

	            // Escribir el final del archivo PDF
	            outputStream.write("%%EOF".getBytes());

	            System.out.println("PDF generado correctamente en: " + filePath);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    private static void writePage(FileOutputStream outputStream, ArrayList<String[]> data) throws IOException {
	        // Escribir el encabezado de la página
	        outputStream.write("1 0 obj\n".getBytes());
	        outputStream.write("<<\n".getBytes());
	        outputStream.write("/Type /Page\n".getBytes());
	        outputStream.write("/Parent 3 0 R\n".getBytes());
	        outputStream.write("/Resources 2 0 R\n".getBytes());
	        outputStream.write("/Contents 4 0 R\n".getBytes());
	        outputStream.write(">>\n".getBytes());
	        outputStream.write("endobj\n".getBytes());

	        // Escribir los recursos
	        outputStream.write("2 0 obj\n".getBytes());
	        outputStream.write("<<\n".getBytes());
	        outputStream.write(">>\n".getBytes());
	        outputStream.write("endobj\n".getBytes());

	        // Escribir el contenido de la página
	        outputStream.write("4 0 obj\n".getBytes());
	        outputStream.write("<<\n".getBytes());
	        outputStream.write("/Length 83\n".getBytes()); // La longitud del contenido (necesitarás ajustar esto)
	        outputStream.write(">>\n".getBytes());
	        outputStream.write("stream\n".getBytes());

	        // Escribir los datos de la tabla
	        StringBuilder tableContent = new StringBuilder();
	        for (String[] row : data) {
	            for (String cell : row) {
	                tableContent.append(cell).append("\t");
	            }
	            tableContent.append("\n");
	        }
	        outputStream.write(tableContent.toString().getBytes());

	        outputStream.write("endstream\n".getBytes());
	        outputStream.write("endobj\n".getBytes());
	    }

	    public static void main(String[] args) {
	    	SailkapenaPanel sailkapenaPanel = new SailkapenaPanel("denboraldia");
	    	ArrayList<String[]> data = new ArrayList<>();
	        DefaultTableModel model = (DefaultTableModel) sailkapenaPanel.table.getModel();
	        for (int row = 0; row < model.getRowCount(); row++) {
	            String[] rowData = new String[model.getColumnCount()];
	            for (int column = 0; column < model.getColumnCount(); column++) {
	                rowData[column] = model.getValueAt(row, column).toString();
	            }
	            data.add(rowData);
	        }
	    }
	}
	        
