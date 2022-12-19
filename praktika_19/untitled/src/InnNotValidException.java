import java.math.BigInteger;

public class InnNotValidException extends Exception {

    private BigInteger innNum;

    public InnNotValidException(BigInteger inn){
        super("ИНН  "+ inn + " НЕВЕРНЫЙ!");
        innNum = inn;
    }

    public BigInteger getInnNum() {
        return innNum;
    }
}