public class DataConverter {

    int data;

    public DataConverter(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int convertToMB(int data){
        return data/1024;
    }
}
