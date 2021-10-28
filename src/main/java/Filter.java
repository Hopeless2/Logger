import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");
        List<Integer> result = new ArrayList<>();
        for (int i : source) {
            if (i >= treshold) {
                result.add(i);
                logger.log("Элемент " + "'" + i + "'" + "подходит");
            } else {
                logger.log("Элемент " + "'" + i + "'" + "не подходит");
            }
        }
        logger.log(String.format("%s из %s элементов прошли фильтр", result.size(), source.size()));
        return result;
    }
}
