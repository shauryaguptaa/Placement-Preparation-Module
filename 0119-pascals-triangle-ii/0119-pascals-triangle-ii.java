class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();

        // Initialize the first element of the row to 1.
        result.add(1);

        // Calculate each element in the row using the binomial coefficient formula.
        for (int i = 1; i <= rowIndex; i++) {
            long prevElement = (long) result.get(i - 1);
            // Use the formula C(rowIndex, i) = C(rowIndex, i-1) * (rowIndex - i + 1) / i
            long currentElement = prevElement * (rowIndex - i + 1) / i;
            result.add((int) currentElement);
        }

        return result;
    }
}