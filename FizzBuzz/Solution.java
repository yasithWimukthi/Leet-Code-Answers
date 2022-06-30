class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> resultArr = new ArrayList();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                resultArr.add("FizzBuzz");
            } else if (i % 3 == 0) {
                resultArr.add("Fizz");
            } else if (i % 5 == 0) {
                resultArr.add("Buzz");
            } else {
                resultArr.add(Integer.toString(i));
            }
        }
        return resultArr;
    }
}