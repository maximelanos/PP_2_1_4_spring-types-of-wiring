package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Egg6 {

    private Deth8 deth;

    public Egg6(Deth8 deth) {
        this.deth = deth;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + deth.toString();
    }
}
