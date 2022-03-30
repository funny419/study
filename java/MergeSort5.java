import java.util.List;
import java.util.ArrayList;

public class MergeSort5 {
    public <T> List<T> mergeSort(List<T> numbers) {
        if (numbers.size() <= 1) {
            return numbers;
        }

        List<T> right = new ArrayList<T>();
        List<T> left = new ArrayList<T>();

        int middle = numbers.size()/2;
        for (T num : numbers.subList(0,middle)) {
            left.add(num);
        }

        for (T num : numbers.subList(middle,numbers.size())) {
            right.add(num);
        }

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left,right);
    }

    private <T> List<T> merge(List<T> leftHalf,List<T> rightHalf) {
        List<T> result = new ArrayList();
        while (leftHalf.size() > 0 || rightHalf.size() > 0) {
            if (leftHalf.size() > 0 && rightHalf.size() > 0) {
                boolean diff = false;

                try {
                    diff = Integer.parseInt(leftHalf.get(0).toString()) <= Integer.parseInt(rightHalf.get(0).toString());
                } catch (NumberFormatException e) {
                    if (leftHalf.get(0).toString().compareTo(rightHalf.get(0).toString()) <= 0)
                        diff = true;
                }
                
                if (diff) {
                    result.add(leftHalf.get(0));
                    if (leftHalf.size() > 1) {
                        leftHalf = leftHalf.subList(1,leftHalf.size());
                    } else {
                        leftHalf = new ArrayList<T>();
                    }
                } else {
                    result.add(rightHalf.get(0));
                    if (rightHalf.size() > 1) {
                        rightHalf = rightHalf.subList(1,rightHalf.size());
                    } else {
                        rightHalf = new ArrayList<T>();
                    }
                }
            } else if (leftHalf.size() > 0) {
                result.add(leftHalf.get(0));
                if (leftHalf.size() > 1) {
                    leftHalf = leftHalf.subList(1,leftHalf.size());
                } else {
                    leftHalf = new ArrayList<T>();
                }
            } else if (rightHalf.size() > 0) {
                result.add(rightHalf.get(0));
                if (rightHalf.size() > 0) {
                    rightHalf = rightHalf.subList(1,rightHalf.size());
                } else {
                    rightHalf = new ArrayList<T>();
                }
            }
        }

        return result;
    }
}
