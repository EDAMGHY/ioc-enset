package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    private IDao dao;

    public MetierImpl(@Qualifier("dao2") IDao dao) {
        this.dao = dao;
    }

//    public MetierImpl() {
//    }


    @Override
    public double calcul() {
        double temp = dao.getData();
        double result = temp *23;
        return result;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
