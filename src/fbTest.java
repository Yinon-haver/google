import java.util.*;


public class fbTest {
    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
      //System.out.println(checkTowStrings("decba","abcde"));
      //System.out.println(checkString("decba","abcde"));

//        int [] array = {1,2,3,4,6,7,8,9,10};
//        System.out.println(findNumber(array, 10));

//
//        String decode = "3{b2{ca}}";
//        System.out.println(decode(decode));
//
//        String hello ="Hi,  how   are  you  ?";
//       System.out.print( delletChar(hello,' '));

//        String sen ="Hi how are you , how was your day?";
//        split(sen,'h');

//
//
//        int mat[][] =
//        {
//            {1, 2, 3, 4},
//            {5, 6, 7, 8},
//            {9, 10, 11, 12},
//            {13, 14, 15, 16}
//        };
//
//        rotateMatrix(mat);


//int [] a = {1,3,2,4,6,1};
//        minJumps(a);


//
//        int [] a = {1, 2, 3, 6};
//        int [] b ={3,4,5,6,7,8,9,10};
//        findCommonNumbers(a,b);


//        int [] arr =  {1, 2, 3, 1, 4, 5, 2, 3, 6};
//       int k = 3;
//        MaximumOfAllSubarraysOfSizeK(arr,arr.length,k);


//        int arr[] = {10,5, 2, 7, 1, 9,1,1,1,1,1};
//        lenOfLongSubarr(arr,arr.length,15);

//        int arr[] = {10, 90, 49, 2, 1, 5, 23};
//        int n = arr.length;
//        sortInWave(arr, n);




//        int arr[] = { 11, 13, 21, 3 };
//        int n = arr.length;
//        printNGE(arr, n);

//
//        String inputString = "abcbbbbcccbdddadacb";
//        System.out.println(        LongestSubstringWithMUniqueCharacters(inputString,2));


//
//       String text = "BACDGABCDA" , paet = "ABCD";
//       AnagramSubstringSearch(paet,text);

//       ArrayList<String> a =new ArrayList<>();
//       ArrayList<String> b =new ArrayList<>();
//
//       a.add("dcba");
//       a.add("abcd");
//       a.add("cdab");
//       b.add("abcd");
//       b.add("abcd");
//       b.add("abcd");
//
//     ArrayList<String> ans =  twins(a,b);


//       int [] arr = { 10, 5, 2, 7, 1, 9 };
//        int k = 15;
//        LongestSubArrayHavingSumK(arr,k);

//isEditDistanceOne("cat","at");

//        int [] arr = {1,2,9,8};
//       System.out.print( addNumberToArrayOfDigit(arr,1));

//        String s_a ="8402";
//        String s_b ="4201";
//
//        subtract(s_a, s_b);

//        int [] arr = {2,3,4};
//        int n = 2;
//        Permutations(arr,n);

//        String str = "aabbcbbaa";
//       System.out.println( is_palindrom(str));

//        String [] words={"foo", "bar"};
//        String s="barfoothefoobarman";
//        findSubstring(s,words);

//
//        int arr[] = {9, 2, 3, 4, 5, 6, 7, 8, 18, 0};
//        int n = arr.length;
//        int maxDiff = maxIndexDiff(arr, n);
//        System.out.println(maxDiff);


//        minimumSquare(13,29);

//        int arr[] = {2,5,4};
//        int k = 1;
//
//        KswapPermutationLargestNumber(arr, arr.length, k);
//
//        System.out.print("Largest permutation "
//                + "after " + k + " swaps:\n");
//
//        for (int i = 0; i <  arr.length; ++i)
//            System.out.print(arr[i] + " ");

//isPower(9);
//
//        String s ="XZ";
//        microsoftColumToNumber(s);
//
//        String commentString = "Hello /* this is a table */ Prashant";
//        System.out.println(removeComment(commentString.toCharArray()));

    }
    // Function to calculate largest permutation after
    // atmost K swaps
    static void KswapPermutationLargestNumber(int arr[], int n, int k) {

        // Auxiliary dictionary of storing the position
        // of elements
        int pos[] = new int[n+1];

        for (int i = 0; i < n; ++i)
            pos[arr[i]] = i;

        for (int i = 0; i < n && k > 0; ++i) {

            // If element is already i'th largest,
            // then no need to swap
            if (arr[i] == n-i)
                continue;

            // Find position of i'th largest value, n-i
            int temp = pos[n-i];

            // Swap the elements position
            pos[arr[i]] = pos[n-i];
            pos[n-i] = i;

            // Swap the ith largest value with the
            // current value at ith place
            int tmp1 = arr[temp];
            arr[temp] = arr[i];
            arr[i] = tmp1;

            // decrement number of swaps
            --k;
        }
    }




    // Returns min number of squares needed
    static int minimumSquare(int a, int b) {
        int result = 0, rem = 0;

        int big=Math.max(a,b);
        int min=Math.min(a,b);
        // Iterate until small size side is
        // greater then 0
        while (big > 0) {
            // Update result
            result += min/big;
            rem = min % big;
            min = big;
            big = rem;
        }

        return result;
    }


    static void swap(int a,int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }



    /* For a given array arr[], returns the maximum j-i such that
   arr[j] > arr[i] */
    static int maxIndexDiff(int arr[], int n)
    {
        int maxDiff;
        int i, j;

        int RMax[] = new int[n];
        int LMin[] = new int[n];

        /* Construct LMin[] such that LMin[i] stores the minimum value
           from (arr[0], arr[1], ... arr[i]) */
        LMin[0] = arr[0];
        for (i = 1; i < n; ++i)
            LMin[i] = Math.min(arr[i], LMin[i - 1]);

        /* Construct RMax[] such that RMax[j] stores the maximum value
           from (arr[j], arr[j+1], ..arr[n-1]) */
        RMax[n - 1] = arr[n - 1];
        for (j = n - 2; j >= 0; --j)
            RMax[j] = Math.max(arr[j], RMax[j + 1]);

        /* Traverse both arrays from left to right to find optimum j - i
           This process is similar to merge() of MergeSort */
        i = 0; j = 0; maxDiff = -1;
        while (j < n && i < n) {
            if (LMin[i] < RMax[j]) {
                maxDiff =Math.max(maxDiff, j - i);
                j = j + 1;
            }
            else i = i + 1;
        }

        return maxDiff;
    }



    public  static List<Integer> findSubstring(String s, String[] words) {

// You are given a string, s, and a list of words, words, that are all of the same length.
// Find all starting indices of substring(s) in s that is a concatenation of each word in words exactly once and without any intervening characters.
//
//  For example, given: s="barfoothefoobarman" & words=["foo", "bar"], return [0,9].
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(s==null||s.length()==0||words==null||words.length==0){
            return result;
        }

        //frequency of words
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(String w: words){
            if(map.containsKey(w)){
                map.put(w, map.get(w)+1);
            }else{
                map.put(w, 1);
            }
        }

        int len = words[0].length();

        for(int j=0; j<len; j++){
            HashMap<String, Integer> currentMap = new HashMap<String, Integer>();
            int start = j;//start index of start
            int count = 0;//count totoal qualified words so far

            for(int i=j; i<=s.length()-len; i=i+len){
                String sub = s.substring(i, i+len);
                if(map.containsKey(sub)){
                    //set frequency in current map
                    if(currentMap.containsKey(sub)){
                        currentMap.put(sub, currentMap.get(sub)+1);
                    }else{
                        currentMap.put(sub, 1);
                    }

                    count++;

                    while(currentMap.get(sub)>map.get(sub)){
                        String left = s.substring(start, start+len);
                        currentMap.put(left, currentMap.get(left)-1);

                        count--;
                        start = start + len;
                    }


                    if(count==words.length){
                        result.add(start); //add to result

                        //shift right and reset currentMap, count & start point
                        String left = s.substring(start, start+len);
                        currentMap.put(left, currentMap.get(left)-1);
                        count--;
                        start = start + len;
                    }
                }else{
                    currentMap.clear();
                    start = i+len;
                    count = 0;
                }
            }
        }

        return result;
    }



    public static boolean is_palindrom(String s){

        for(int t=0; t < s.length()/2; t++){
            if(s.charAt(t) != s.charAt(s.length()-t-1)){
                return false;
            }
        }
        return true;
    }



    static  void Permutations(int [] input, int n ){
        int j;
        int index;
        int number;
        int length = input.length;
        double total_permutations = Math.pow((double) length, (double) n );

        for ( int i = 0 ; i < total_permutations ; i++ ) {
            number = i;
            for ( j = 0 ; j < n ; j++ ) {
                index = number%length;
                System.out.print(input[index]+",");
                number /= length;
            }

            System.out.println("\n");
        }
    }



    static String subtract(String s_a, String s_b) {
        StringBuffer sb = new StringBuffer();
        int i=0,j=0;
        int a, b, c =0 ;
        while (i<s_a.length()) {
            a = s_a.charAt(i) - 48;
            b = s_b.charAt(i)-48;
            if (a > b) {
                sb.append(a - c - b);
                i++; j++;
                c = 0;
            } else {
                sb.append(10 + a - c - b);
                i++; j++;
                c = 1;
            }
        }
        return sb.reverse().toString();
    }


    static Boolean isOperand(char c) {
        // If the character is a digit
        // then it must be an operand
        if(c >= 48 && c <= 57)
            return true;
        else
            return false;
    }


    static double evaluatePrefix(String exprsn) {
        Stack<Double> Stack = new Stack<Double>();

        for (int j = exprsn.length() - 1; j >= 0; j--) {

            // Push operand to Stack
            // To convert exprsn[j] to digit subtract
            // '0' from exprsn[j].
            if (isOperand(exprsn.charAt(j)))
                Stack.push((double)(exprsn.charAt(j) - 48));

            else {

                // Operator encountered
                // Pop two elements from Stack
                double o1 = Stack.peek();
                Stack.pop();
                double o2 = Stack.peek();
                Stack.pop();

                // Use switch case to operate on o1
                // and o2 and perform o1 O o2.
                switch (exprsn.charAt(j)) {
                    case '+':
                        Stack.push(o1 + o2);
                        break;
                    case '-':
                        Stack.push(o1 - o2);
                        break;
                    case '*':
                        Stack.push(o1 * o2);
                        break;
                    case '/':
                        Stack.push(o1 / o2);
                        break;
                }
            }
        }

        return Stack.peek();
    }



    static int minJumps(int arr[]) {
        if (arr.length <= 1)
            return 0;

        // Return -1 if not possible to jump
        if (arr[0] == 0)
            return -1;

        // initialization
        int maxReach = arr[0];
        int step = arr[0];
        int jump = 1;


        // Start traversing array
        for (int i = 1; i < arr.length; i++)
        {
            // Check if we have reached the end of the array
            if (i == arr.length - 1)
                return jump;

            // updating maxReach
            maxReach = Math.max(maxReach, i+arr[i]);

            // we use a step to get to the current index
            step--;

            // If no further steps left
            if (step == 0)
            {
                //  we must have used a jump
                jump++;

                //Check if the current index/position  or lesser index
                // is the maximum reach point from the previous indexes
                if(i>=maxReach)
                    return -1;

                // re-initialize the steps to the amount
                // of steps to reach maxReach from position i.
                step = maxReach - i;
            }
        }

        return -1;
    }

    // by 90 degrees in anti-clockwise direction
   static void rotateMatrix(int mat[][])
    {
        int N=4;
        // Consider all squares one by one
        for (int x = 0; x < N / 2; x++)
        {
            // Consider elements in group of 4 in
            // current square
            for (int y = x; y < N-x-1; y++)
            {
                // store current cell in temp variable
                int temp = mat[x][y];

                // move values from right to top
                mat[x][y] = mat[y][N-1-x];

                // move values from bottom to right
                mat[y][N-1-x] = mat[N-1-x][N-1-y];

                // move values from left to bottom
                mat[N-1-x][N-1-y] = mat[N-1-y][x];

                // assign temp to left
                mat[N-1-y][x] = temp;
            }
        }
    }





    static void PrintMinNumberForPattern(String arr) {

//        Input: D        Output: 21
//        Input: I        Output: 12
//        Input: DD       Output: 321
//        Input: II       Output: 123
//        Input: DIDI     Output: 21435
//        Input: IIDDD    Output: 126543
//        Input: DDIDDIID Output: 321654798
        // Initialize current_max (to make sure that
        // we don't use repeated character
        int curr_max = 0;

        // Initialize last_entry (Keeps track for
        // last printed digit)
        int last_entry = 0;

        int j;

        // Iterate over input array
        for (int i=0; i<arr.length(); i++) {
            // Initialize 'noOfNextD' to get count of
            // next D's available
            int noOfNextD = 0;

            switch(arr.charAt(i))
            {
                case 'I':
                    // If letter is 'I'

                    // Calculate number of next consecutive D's
                    // available
                    j = i+1;
                    while (arr.charAt(j) == 'D' && j < arr.length())
                    {
                        noOfNextD++;
                        j++;
                    }

                    if (i==0)
                    {
                        curr_max = noOfNextD + 2;

                        // If 'I' is first letter, print incremented
                        // sequence from 1
                        System.out.println(++last_entry);
                        System.out.println(curr_max);

                        // Set max digit reached
                        last_entry = curr_max;
                    }
                    else
                    {
                        // If not first letter

                        // Get next digit to print
                        curr_max = curr_max + noOfNextD + 1;

                        // Print digit for I
                        last_entry = curr_max;
                        System.out.println(last_entry);
                    }

                    // For all next consecutive 'D' print
                    // decremented sequence
                    for (int k=0; k<noOfNextD; k++)
                    {
                        System.out.println( --last_entry);
                        i++;
                    }
                    break;

                // If letter is 'D'
                case 'D':
                    if (i == 0)
                    {
                        // If 'D' is first letter in sequence
                        // Find number of Next D's available
                        j = i+1;
                        while (arr.charAt(j) == 'D' && j < arr.length())
                        {
                            noOfNextD++;
                            j++;
                        }

                        // Calculate first digit to print based on
                        // number of consecutive D's
                        curr_max = noOfNextD + 2;

                        // Print twice for the first time
                        System.out.println( curr_max + " " + (curr_max - 1));

                        // Store last entry
                        last_entry = curr_max - 1;
                    }
                    else
                    {
                        // If current 'D' is not first letter

                        // Decrement last_entry
                        System.out.println( last_entry-1);
                        last_entry--;
                    }
                    break;
            }
        }
        System.out.print(" ");
    }



    static ArrayList<Integer> findCommonNumbers(int [] a, int [] b){
        ArrayList<Integer> ans = new ArrayList<>();
        int minLe = Math.min(a.length,b.length);
        int i =0;
        int j =0;
        while (i< minLe){
           if(a[i] < b[j]){
               i++;
           }else if (a[i] > b[j]){
               j++;
           }else {
               ans.add(a[i]);
               i++;
               j++;
           }
        }
        return ans;
    }


    static boolean isPower(int n) {
//        Input:  n = 8
//        Output: true
//        8 can be expressed as 2^3
        for (int x = 2; x <= Math.sqrt(n); x++) {
            int p = x;

            while (p <= n) {
                p = p * x;
                if (p == n)
                    return true;
            }
        }
        return false;
    }


    /* prints element and NGE pair for
    all elements of arr[] of size n */
    static void printNGE(int arr[], int n) {
        int i = 0;
        Stack<Integer> s = new Stack<>();
        int element, next;

        /* push the first element to stack */
        s.push(arr[0]);

        // iterate for rest of the elements
        for (i = 1; i < n; i++) {
            next = arr[i];

            if (s.isEmpty() == false) {

                // if stack is not empty, then
                // pop an element from stack
                element = s.pop();

                /* If the popped element is smaller than
                   next, then a) print the pair b) keep
                   popping while elements are smaller and
                   stack is not empty */
                while (element < next) {
                    System.out.println(element + " --> " + next);
                    if (s.isEmpty() == true)
                        break;
                    element = s.pop();
                }

                /* If element is greater than next, then
                   push the element back */
                if (element > next)
                    s.push(element);
            }

            /* push next to stack so that we can find next
               greater for it */
            s.push(next);
        }

        /* After iterating over the loop, the remaining
           elements in stack do not have the next greater
           element, so print -1 for them */
        while (s.isEmpty() == false) {
            element = s.pop();
            next = -1;
            System.out.println(element + " -- " + next);
        }
    }

    static int lenOfLongSubarr(int arr[], int n, int k) {
        HashMap<Integer,Integer> um = new HashMap<>();
        int sum = 0, maxLen = 0;

        // traverse the given array
        for (int i = 0; i < n; i++) {

            // accumulate sum
            sum += arr[i];

            // when subarray starts from index '0'
            if (sum == k)
                maxLen = i + 1;

            // make an entry for 'sum' if it is
            // not present in 'um'
            if (!um.containsKey(sum))
                um.put(sum,i);

            // check if 'sum-k' is present in 'um'
            // or not
            if (um.containsKey(sum - k) ) {
                // update maxLength
                if (maxLen < (i - um.get(sum - k)))
                    maxLen = i - um.get(sum - k);
            }
        }
        // required maximum length
        return maxLen;
    }

    // This function sorts arr[0..n-1] in wave form, i.e.,
    // arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4]....
    static void sortInWave(int arr[], int n){
        // Traverse all even elements
        for (int i = 0; i < n; i+=2){
            // If current even element is smaller
            // than previous
            if (i>0 && arr[i-1] > arr[i])
                swap(arr, i-1, i);

            // If current even element is smaller
            // than next
            if (i<n-1 && arr[i] < arr[i+1])
                swap(arr, i, i + 1);
        }
    }

    static void swap(int arr[], int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void MaximumOfAllSubarraysOfSizeK(int arr[],int n, int k) {
        // Create a Double Ended Queue, Qi that will store indexes of array elements
        // The queue will store indexes of useful elements in every window and it will
        // maintain decreasing order of values from front to rear in Qi, i.e.,
        // arr[Qi.front[]] to arr[Qi.rear()] are sorted in decreasing order
        Deque<Integer> Qi = new LinkedList<Integer>();

        /* Process first k (or first window) elements of array */
        int i;
        for(i = 0; i < k; ++i) {
            // For very element, the previous smaller elements are useless so
            // remove them from Qi
            while(!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()])
                Qi.removeLast();   // Remove from rear

            // Add new element at rear of queue
            Qi.addLast(i);
        }

        // Process rest of the elements, i.e., from arr[k] to arr[n-1]
        for( ;i < n; ++i) {
            // The element at the front of the queue is the largest element of
            // previous window, so print it
            System.out.print(arr[Qi.peek()] + " ");

            // Remove the elements which are out of this window
            while((!Qi.isEmpty()) && Qi.peek() <= i-k)
                Qi.removeFirst();

            // Remove all elements smaller than the currently
            // being added element (remove useless elements)
            while((!Qi.isEmpty()) && arr[i] >= arr[Qi.peekLast()])
                Qi.removeLast();


            // Add current element at the rear of Qi
            Qi.addLast(i);

        }

        // Print the maximum element of last window
        System.out.print(arr[Qi.peek()]);
    }


    // Print all subsets of given set[]
    static void printSubsets(char set[]) {
        int n = set.length;

        // Run a loop for printing all 2^n
        // subsets one by obe
        for (int i = 0; i < (1<<n); i++) {
            System.out.print("{ ");

            // Print current subset
            for (int j = 0; j < n; j++){
                // (1<<j) is a number with jth bit 1
                // so when we 'and' them with the
                // subset number we get which numbers
                // are present in the subset and which
                // are not
                if ((i & (1 << j)) > 0)
                    System.out.print(set[j] + " ");

            }
            System.out.println("}");
        }
    }



    static int [] addNumberToArrayOfDigit(int [] arr , int number){
        int arrLength = arr.length-1;
        int curry=0;

        while (number > 0 || arrLength > 0 ){

            int numberToAdd = arr[arrLength] + number%10 + curry;
            curry = numberToAdd/10;

            arr[arrLength--]=numberToAdd%10;
            number/=10;
        }

        if(curry!=0)arr[arrLength]=curry;

        return arr;
    }

    //Check if edit distance between two strings is one
    static boolean isEditDistanceOne(String s1, String s2) {

        // Find lengths of given strings
        int m = s1.length(), n = s2.length();

        // If difference between lengths is
        // more than 1, then strings can't
        // be at one distance
        if (Math.abs(m - n) > 1)
            return false;

        int count = 0; // Count of edits

        int i = 0, j = 0;
        while (i < m && j < n) {
            // If current characters don't match
            if (s1.charAt(i) != s2.charAt(j)) {
                if (count == 1) return false;

                // If length of one string is
                // more, then only possible edit
                // is to remove a character
                if (m > n)
                    i++;
                else if (m < n)
                    j++;
                else{
                // If lengths of both strings
                // is same
                    i++;
                    j++;
                }

                // Increment count of edits
                count++;
            }

            else {
                // If current characters match
                i++;
                j++;
            }
        }

        // If last character is extra
        // in any string
        if (i < m || j < n)
            count++;

        return count == 1;
    }

    // Returns n'th term in
    // look-and-say sequence
    static String countnAnddSay(int n) {
        // Base cases
        if (n == 1)     return "1";
        if (n == 2)     return "11";


        String str = "11";
        for (int i = 3; i <= n; i++) {

            str += '$';
            int len = str.length();

            int cnt = 1; // Initialize count
            // of matching chars
            String tmp = ""; // Initialize i'th
            // term in series
            char []arr = str.toCharArray();

            // Process previous term
            // to find the next term
            for (int j = 1; j < len; j++) {
                // If current character
                // does't match
                if (arr[j] != arr[j - 1]) {
                    // Append count of
                    // str[j-1] to temp
                    tmp += cnt ;

                    // Append str[j-1]
                    tmp += arr[j - 1];

                    // Reset count
                    cnt = 1;
                }

                // If matches, then increment
                // count of matching characters
                else cnt++;
            }

            // Update str
            str = tmp;
        }

        return str;
    }





    public static int microsoftColumToNumber(String str){
        int result =0;


        for (int i =str.length()-1 ,pow=0; i >= 0 ; i--,pow++) {
            result+= (str.charAt(i)-'A'+ 1) * (Math.pow(26,pow));

        }
        return result;
    }
    public static String removeComment(char str[]) {

        boolean commentStringStart = false;
        boolean commentStringEnd = false;
        String finalString = "";

        for(int i = 0; i < str.length ; i++) {
            if(str[i] == '/' && str[i+1] == '*') {
                commentStringStart = true;
            }
            if(str[i] == '*' && (str[i+1] == '/' && commentStringStart)) {
                commentStringEnd = true;
                i = i + 1;
                continue;
            }
            if(!commentStringStart || commentStringEnd) {
                finalString = finalString + str[i];
            }
        }
        return finalString;
    }
    public static String LongestSubstringWithMUniqueCharacters(String inputString , int key){
        int start =0 , end =0 , windowsSize =1, windosStart=0 ;

        HashMap<Character,Integer> hash = new HashMap<>();
        hash.put(inputString.charAt(0),1);

        for (int i = 1; i <inputString.length() ; i++) {

            char ch = inputString.charAt(i);
            if (hash.containsKey(ch)){
                hash.put(ch,hash.get(ch)+1);
            }else {
                hash.put(ch,1);
            }

            end++;

            while (!isLessThanM(hash,key)){
                int temp = hash.get(inputString.charAt(start));
                hash.put(inputString.charAt(start),--temp);
                start++;
            }

            if(end - start > windowsSize){
                windowsSize = end - start +1;
                windosStart = start;
             }
        }
        return inputString.substring(windosStart,windosStart+windowsSize);
    }

    public static boolean isLessThanM(HashMap<Character,Integer> hash, Integer m)
    {
        int count =0;
        for(Character key:hash.keySet())
            if(hash.get(key) > 0) count++;

        return (count <= m);
    }

    // Function to find smallest window containing
    // all characters of 'pat'
    static String findTheSmallestWindowInAStringContainingAllCharactersOfAnotherString(String str, String pat){
//        Input :  string = "this is a testaaaaa stringistt"
//        pattern = "tist"
//        Output :  Minimum window is "t stri"
//        Explanation: "t stri" contains all the characters
//        of pattern.
//
//        Input :  string = "geeksforgeeks"
//        pattern = "ork"
//        Output :  Minimum window is "ksfor"


        int len1 = str.length();
        int len2 = pat.length();

        // check if string's length is less than pattern's
        // length. If yes then no such window can exist
        if (len1 < len2)
        {
            System.out.println("No such window exists");
            return "";
        }

        int hash_pat[] = new int[256];
        int hash_str[] = new int[256];

        // store occurrence ofs characters of pattern
        for (int i = 0; i < len2; i++)
            hash_pat[pat.charAt(i)]++;

        int start = 0, start_index = -1, min_len = Integer.MAX_VALUE;

        // start traversing the string
        int count = 0;  // count of characters
        for (int j = 0; j < len1 ; j++) {
            // count occurrence of characters of string
            hash_str[str.charAt(j)]++;

            // If string's char matches with pattern's char
            // then increment count
            if (hash_pat[str.charAt(j)] != 0 && hash_str[str.charAt(j)] <= hash_pat[str.charAt(j)] )
                count++;

            // if all the characters are matched
            if (count == len2) {
                // Try to minimize the window i.e., check if
                // any character is occurring more no. of times
                // than its occurrence  in pattern, if yes
                // then remove it from starting and also remove
                // the useless characters.
                while ( hash_str[str.charAt(start)] > hash_pat[str.charAt(start)] || hash_pat[str.charAt(start)] == 0) {

                    if (hash_str[str.charAt(start)] > hash_pat[str.charAt(start)])
                        hash_str[str.charAt(start)]--;
                    start++;
                }

                // update window size
                int len_window = j - start + 1;
                if (min_len > len_window) {
                    min_len = len_window;
                    start_index = start;
                }
            }
        }

        // If no window found
        if (start_index == -1) {
            System.out.println("No such window exists");
            return "";
        }

        // Return substring starting from start_index
        // and length min_len
        return str.substring(start_index, start_index + min_len);
    }

    public static String[] split(String sentence , char c) {
        int length = 0 ;

        for (int i = 0; i <sentence.length() ; i++) {
            if (sentence.charAt(i ) == ' ' ||sentence.charAt(i ) ==',' ){
                length++;
            }
        }
        length++;
        String [] ans = new String[length];
        int indexArry = 0;
        int indexAns = 0;

        while (indexArry < sentence.length()) {
            String temp = "";

            while ((indexArry < sentence.length() ) && (sentence.charAt(indexArry) != c ) &&  (sentence.charAt(indexArry)!=' ' )  ) {
                temp+=sentence.charAt(indexArry++);
            }
            ans[indexAns++]=temp;
            indexArry++;
        }
        return ans;
    }

    public static ArrayList<String> twins (List<String> a, List<String> b){
        ArrayList<String> ans = new ArrayList<>();
        String No ="No";
        String Yes="Yes";
        for (int i = 0; i < b.size() ; i++) {
            boolean checlAns = checkString(a.get(i),b.get(i));
            if (checlAns==true){
                ans.add(Yes);
            }else {
                ans.add(No);
            }
        }
        return ans;
    }

    public static boolean checkString (String firsr , String second){
        long startTime = System.nanoTime();
        if(firsr.length() != second.length()) return false;
        Set<Character> evenSet = new HashSet<>();
        Set<Character> oddSet = new HashSet<>();
        for (int i=0; i<firsr.length(); i++) {
            char c = firsr.charAt(i);
            if (i%2 == 0)
                evenSet.add(c);
            else
                oddSet.add(c);
        }
        for (int i = 0; i < second.length(); i++) {
            int evenOrOdd = i%2;
            if(evenOrOdd==0){
                if(!evenSet.contains(second.charAt(i))) return false;
            }
            else {
                if(!oddSet.contains(second.charAt(i)))return false;
            }
        }
        long endTime = System.nanoTime();
        System.out.println("That checkString func take  " + (endTime - startTime) + " milliseconds ,and the answer is:");
        return true;
    }

    static void permutate(String[] words, int depth, String permutation){
        if (depth == words.length){
            System.out.println(permutation);
        }
        else {
            String w = words[depth];
            for (int i = 0; i < w.length(); i++){
                permutate(words, depth + 1, permutation + w.charAt(i));
            }
        }
    }

    public static boolean checkTowStrings (String first ,String second){
        long startTime = System.nanoTime();
        if(first.length() != second.length()) return false;

        char [] firstCharArry = first.toCharArray();
        char [] secondCharArry = second.toCharArray();
        HashMap<Character,Integer> firstStringCharMap = new HashMap<>();

        for (int i = 0; i < firstCharArry.length; i++) {//O(n)
            firstStringCharMap.put(firstCharArry[i],i);
        }
        for (int i = 0; i < secondCharArry.length; i++) { //O(n)
            if (firstStringCharMap.containsKey(secondCharArry[i])){
               int evenOrOdd = firstStringCharMap.get(secondCharArry[i]) % 2;
               if (firstStringCharMap.get(secondCharArry[i]) != null &&  evenOrOdd == i%2) {
                   swapKeyInMap(firstStringCharMap, firstCharArry[i], secondCharArry[i]);
                   swapChars(firstCharArry, firstStringCharMap.get(second.charAt(i)), i);
                  printCharArray(firstCharArry);
               } else {return false;}
            }else {
                return false;
            }
        }
        long endTime =System.nanoTime();
        System.out.println("That checkTowStrings func take  " + (endTime - startTime) + " milliseconds ,and the answer is:");
        return Arrays.equals(firstCharArry, secondCharArry); //O(n)
    }

    public static void  swapKeyInMap(Map<Character,Integer> m, char key1, char key2){ //O(1)
        int value = m.get(key1);
        m.put(key1, m.get(key2));
        m.put(key2, value);
    }

    static  void swapChars(char []  ch, int i, int j) {//O(1)
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    public static void printCharArray(char [] arr){ //O(1)
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.print("-->");
    }

    public static boolean findNumber(int [] array ,int target){

        int start =0;
        int end = array.length-1;
        while (start<=end){
            int mid = (end+start)/2;
            if (array[mid]==target){
                return true;
            } else if(array[mid]>target){
                end = mid-1;
            }else {
                start=mid+1;
            }
        }
        return false;
    }

    public static String decode(String str){

        //String decode = "3{b2{ca}}";  input !

        Stack<String> charactersStack = new Stack<>();
        Stack<Integer> integersStack = new Stack<>();

        for (int i = 0; i <str.length() ; i++) {
            char temp = str.charAt(i);
            if (Character.isDigit(temp)){
                int number = temp -'0';
                integersStack.push(number);
            }else {
                charactersStack.push(String.valueOf(temp));
            }
        }

        while (!charactersStack.isEmpty() && !integersStack.isEmpty()){

            String pop = charactersStack.pop();
            String peek = charactersStack.peek();
            String temp ="";

            if(pop.equals("}")){
                charactersStack.pop();
            }
            else if(!pop.equals("{") && peek.equals("{")){
                int intStackpop = integersStack.pop();
                temp+=pop;
                for (int i = 0; i < intStackpop-1; i++) {
                    temp+=pop;
                }
              charactersStack.pop();
              charactersStack.push(temp);
            }
           else if (!pop.equals("{")&& !peek.equals("{")){
                temp+=peek+pop;
                charactersStack.pop();
                charactersStack.push(temp);
            }

        }

    return charactersStack.pop();
    }

    public static String addSpaces(String str , int numberOfSpaceToAdd){

        char[] charArray = new char[str.length() + numberOfSpaceToAdd];
        int newPlace = str.length()+ numberOfSpaceToAdd -1;

        for (int i = str.length()-1; i >=0 ; i--) {
            charArray[newPlace]=str.charAt(i);
            newPlace--;
            charArray[newPlace] =' ';
            newPlace--;
        }
        return new String(charArray);
    }

    public static String delletChar (String str , char c){
        char [] charArray = str.toCharArray();
        int numberOfJump = 0;
        for (int i = 0; i <charArray.length ; i++) {
            if(charArray[i] == c && charArray[i+1] == c ){
                numberOfJump++;
            }else {
                charArray[i-numberOfJump]= charArray[i];
            }
        }
        return new String(Arrays.copyOf(charArray, charArray.length - numberOfJump)) ;
    }

    static boolean compare(char arr1[], char arr2[]) {
        for (int i = 0; i < 256; i++)
            if (arr1[i] != arr2[i])
                return false;
        return true;
    }

    // This function search for all permutations
    // of pat[] in txt[]
    static void AnagramSubstringSearch(String pat, String txt)  {
//    1) Input:  txt[] = "BACDGABCDA"  pat[] = "ABCD"
////    Output:   Found at Index 0
////    Found at Index 5
////    Found at Index 6
////            2) Input: txt[] =  "AAABABAA" pat[] = "AABA"
////    Output:   Found at Index 0
////    Found at Index 1
////    Found at Index 4

        int M = pat.length();
        int N = txt.length();

        // countP[]:  Store count of all
        // characters of pattern
        // countTW[]: Store count of current
        // window of text
        char[] countP = new char[256];
        char[] countTW = new char[256];
        for (int i = 0; i < M; i++) {
            (countP[pat.charAt(i)])++;
            (countTW[txt.charAt(i)])++;
        }

        // Traverse through remaining characters
        // of pattern
        for (int i = M; i < N; i++) {
            // Compare counts of current window
            // of text with counts of pattern[]
            if (compare(countP, countTW)) {
                System.out.println("Found at Index " + (i - M));
            }

            // Add current character to current
            // window
            (countTW[txt.charAt(i)])++;

            // Remove the first character of previous
            // window
            countTW[txt.charAt(i-M)]--;
        }

        // Check for the last window in text
        if (compare(countP, countTW)){
            System.out.println("Found at Index " + (N - M));
        }
    }

}