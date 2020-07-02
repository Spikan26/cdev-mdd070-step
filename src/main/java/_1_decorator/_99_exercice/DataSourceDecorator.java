package _1_decorator._99_exercice;

public class DataSourceDecorator implements DataSource {

    private DataSource datasource;

    DataSourceDecorator(DataSource source) {
        this.datasource = source;
    }

    @Override
    public void writeData(String data) {
        datasource.writeData(data);
    }

    @Override
    public String readData() {
        return datasource.readData();
    }
}
