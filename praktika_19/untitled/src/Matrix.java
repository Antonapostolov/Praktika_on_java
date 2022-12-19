import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class Matrix<T extends Number> {
    private T[][] matrix;
    private int rowsQuantity;
    private int columnsQuantity;

    public Matrix(T[][] matrix) {
        this.matrix = matrix;
        this.rowsQuantity = matrix.length;
        this.columnsQuantity = matrix[0].length;
    }

    public Matrix add(Matrix a) {
        if (rowsQuantity != a.getRowsQuantity() || columnsQuantity != a.getColumnsQuantity()) return null;
        Double[][] m = new Double[rowsQuantity][columnsQuantity];
        for (int i = 0; i < rowsQuantity; i++) {
            for (int j = 0; j < columnsQuantity; j++) {
                m[i][j] = matrix[i][j].doubleValue() + a.getMatrix()[i][j].doubleValue();
            }
        }
        return new Matrix(m);
    }

    public Matrix subtract(Matrix a) {
        return this.add(a.multiply(-1));
    }

    public <T extends Number> Matrix multiply(T a) {
        Double[][] m = new Double[rowsQuantity][columnsQuantity];
        for (int i = 0; i < rowsQuantity; i++) {
            for (int j = 0; j < columnsQuantity; j++) {
                m[i][j] = a.doubleValue() * matrix[i][j].doubleValue();
            }
        }
        return new Matrix(m);
    }

    public <T extends Number> Matrix divide(T a) {
        return this.multiply(1 / a.doubleValue());
    }

    public Matrix multiply(Matrix a) {
        if (this.getColumnsQuantity() != a.getRowsQuantity()) return null;
        Double[][] m = new Double[rowsQuantity][a.getColumnsQuantity()];
        for (int i = 0; i < rowsQuantity; i++) {
            for (int j = 0; j < a.getColumnsQuantity(); j++) {
                m[i][j] = 0.0;
            }
        }
        for (int i = 0; i < rowsQuantity; i++) {
            for (int j = 0; j < a.getColumnsQuantity(); j++) {
                for (int k = 0; k < columnsQuantity; k++) {
                    m[i][j] += matrix[i][k].doubleValue() * a.getMatrix()[k][j].doubleValue();
                }
            }
        }
        return new Matrix(m);
    }

    public int getRowsQuantity() {
        return rowsQuantity;
    }

    public int getColumnsQuantity() {
        return columnsQuantity;
    }

    public T[][] getMatrix() {
        return matrix;
    }

    private NumberFormat getNumberFormat(Locale locale) {
        NumberFormat nf = NumberFormat.getInstance(locale);
        nf.setMinimumFractionDigits(3);
        nf.setMaximumFractionDigits(3);
        return nf;
    }

    public void toFile(FileWriter fw, String matrixName) throws IOException {
        NumberFormat nf = getNumberFormat(Locale.ROOT);
        fw.write("Matrix " + matrixName + ":\n");
        for (int i = 0; i < rowsQuantity; i++) {
            for (int j = 0; j < columnsQuantity; j++) {
                fw.write(nf.format(matrix[i][j]) + "\t");
            }
            fw.write("\n");
        }
        fw.write("\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Matrix)) return false;

        Matrix<?> gMatrix = (Matrix<?>) o;

        if (rowsQuantity != gMatrix.rowsQuantity) return false;
        if (columnsQuantity != gMatrix.columnsQuantity) return false;
        return Arrays.deepEquals(matrix, gMatrix.matrix);
    }

    @Override
    public int hashCode() {
        int result = Arrays.deepHashCode(matrix);
        result = 31 * result + rowsQuantity;
        result = 31 * result + columnsQuantity;
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        NumberFormat nf = getNumberFormat(Locale.ROOT);
        for (int i = 0; i < rowsQuantity; i++) {
            for (int j = 0; j < columnsQuantity; j++) {
                sb.append(nf.format(matrix[i][j]));
                sb.append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}