from typing import List
class Solution:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        # First create a dictionary to store the chars as keys and their occurrences as values
        elem_count = {}  # elem_count dictionary will store all chars and their occurrences
        l2 = []  # l2 list will store only the chars that have one occurrence

        # Count the occurrences of each element in arr
        for el in arr:
            if el in elem_count:
                elem_count[el] += 1
            else:
                elem_count[el] = 1

        # Collect elements that appear exactly once
        for key, value in elem_count.items():
            if value == 1:
                l2.append(key)

        # Ensure that k is within the bounds of the l2 list
        if k <= len(l2):
            return l2[k-1]
        else:
            return ""

# Example usage
sol = Solution()
arr1 = ["d", "b", "c", "b", "c", "a"]
arr2=["aaa","aa","a"]
arr3=["a","b","a"]

k = 3
print(sol.kthDistinct(arr1, 2))  # Expected output: "a"
print(sol.kthDistinct(arr2, 1))
print(sol.kthDistinct(arr3, 3))
