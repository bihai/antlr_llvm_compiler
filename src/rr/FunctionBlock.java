package rr;

public class FunctionBlock {
    private StringBuilder builder = new StringBuilder();
    private int registerId = 1;

    public FunctionBlock() {

    }

    public int getRegister() {
        return registerId++;
    }

    public void setRegister(int r) {
        registerId = r;
    }

    public void emit(String str) {
        builder.append(str);
    }

    public String getString() {
        return builder.toString();
    }
}
