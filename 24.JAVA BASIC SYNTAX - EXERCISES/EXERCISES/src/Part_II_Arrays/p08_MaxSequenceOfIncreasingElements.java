package Part_II_Arrays;

import java.util.*;

public class p08_MaxSequenceOfIncreasingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        List<Integer> bestElements = new ArrayList<Integer>();
        List<Integer> currentsElements = new ArrayList<Integer>();
        for (int i = 1; i < elements.length; i++) {
            int element = elements[i];
            int startElement = elements[i - 1];
            if (element > startElement) {
                if(Arrays.asList(currentsElements).contains(startElement)
                        || currentsElements.size() == 0){
                    currentsElements.add(startElement);
                }

                currentsElements.add(element);
            }

            if (bestElements.size() < currentsElements.size()) {
                bestElements = new ArrayList<Integer>(currentsElements);;
            }

            if (element <= startElement) {
                currentsElements.clear();
            }
        }


        String result = "";
        for (Integer bestElement : bestElements) {
            result += bestElement + " ";
        }

        System.out.println(result);
    }
}
