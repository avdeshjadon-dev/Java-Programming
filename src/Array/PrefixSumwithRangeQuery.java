// ------------------- 🔢 Prefix Sum with Range Query (1-Based Indexing) -------------------
//
// 💡 Write a Java program to:
// - Take an array of integers using **1-based indexing** (ignore 0th index).
// - Build its **prefix sum array** in-place.
// - Support **multiple range sum queries** using the prefix array.
//
// 🧠 You will:
// - Use prefix sum logic where `prefix[i] = arr[1] + arr[2] + ... + arr[i]`
// - Answer queries for sum from index `l` to `r` in O(1) using: `prefix[r] - prefix[l-1]`
// - Ensure indexing is 1-based throughout
//
// ❗ Constraints:
// - Indexing must be strictly 1-based (input/output).
// - Give an error if user inputs index 0 or invalid.
//
// ------------------- 🧾 SAMPLE INPUT -------------------
// Enter the size of the array: 6
// Enter all the elements of the array: 10 20 30 40 50 60
// Original Array is: 10 20 30 40 50 60
// Enter the number of queries: 2
//
// Query 1 → From index 2 to 5
// Query 2 → From index 1 to 6
//
// ------------------- 📤 SAMPLE OUTPUT -------------------
// Prefix Sum is: 10 30 60 100 150 210
// Required Sum is: 140
// Required Sum is: 210


package Array;

public class PrefixSumwithRangeQuery {
}
