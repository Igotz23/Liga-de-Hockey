package frogak;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class frogaPDF {

    public static void exportToPDF(ArrayList<String[]> data, String filePath) {
        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            writePDF(outputStream, data);
            System.out.println("PDF generado correctamente en: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writePDF(FileOutputStream outputStream, ArrayList<String[]> data) throws IOException {
        // Escribir la cabecera del archivo PDF
        outputStream.write("%PDF-1.4\n".getBytes());

        // Crear un objeto de página
        int pageCount = 1;
        writePage(outputStream, data, pageCount);

        // Escribir el final del archivo PDF
        outputStream.write("%%EOF".getBytes());
    }

    private static void writePage(FileOutputStream outputStream, ArrayList<String[]> data, int pageCount) throws IOException {
        // Escribir el encabezado de la página
        outputStream.write(String.format("%d 0 obj\n", pageCount).getBytes());
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
        outputStream.write(String.format("/Length %d\n", 0).getBytes()); // La longitud del contenido (necesitarás ajustar esto)
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
        ArrayList<String[]> data = new ArrayList<>();
        data.add(new String[]{"Nombre", "Edad", "Género"});
        data.add(new String[]{"Juan", "25", "Masculino"});
        data.add(new String[]{"María", "30", "Femenino"});
        exportToPDF(data, "tabla.pdf");
    }
}
