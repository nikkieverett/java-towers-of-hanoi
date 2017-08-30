import java.util.HashSet;

public class HanoiTowerRod extends HashSet<Integer> {
    public HanoiTowerRod () {
        super();
    }

    @Override
    public boolean add (Integer e) {
        return false;
    }

    public Integer removeTop () {
        Integer smallest = findSmallestValue();

        if (this.size() == 0) {
            return null;
        }
        super.remove(findSmallestValue());
        return smallest;
    }

    public Integer findSmallestValue () {
        Integer response = Integer.MAX_VALUE;

        for (Integer i : this) {
            if (i < response) {
                response = i;
            }
        }
        return response;
    }

    public Integer findLargestValue () {
        return null;
    }

}
