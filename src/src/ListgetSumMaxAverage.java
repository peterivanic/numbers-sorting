import java.util.ArrayList;
import java.util.List;


class ListgetSumMaxAverage {

    public static void main(String[] args) {

        List<Float> list = new ArrayList<>();

        list.add((float) 1.0);
        list.add((float) 5.0);
        list.add((float) 9.0);
        list.add((float) 4);
        list.add((float) 10);
        list.add((float) 2);
        list.add((float) 17.0);

        System.out.println(list.get(0));
        float max = 0;
        for (int f = 0; f < list.size(); f++) {
            if (max < list.get(f)) {
                max = list.get(f);
            }
        }
        System.out.println(max);

        float sum = 0;
        for (int s = 0; s < list.size(); s++) {
            sum = sum + list.get(s);

        }
        System.out.println(sum);

        float size = list.size();
        System.out.println(size);

        float average = sum / size;
        System.out.println(average);
    }
}
