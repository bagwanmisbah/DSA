class Solution:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        elem_count = {}  # an empty dictionary
        l2 = {}
        l3 = []
        # Count the occurrences of each element
        for el in arr:
            if el in elem_count:
                elem_count[el] += 1
            else:
                elem_count[el] = 1

        # Collect elements that appear exactly once
        for key, value in elem_count.items():
            if value == 1:
                l2[key] = value

        for key, value in l2.items():
            l3.append(key)


        if k <= len(l3):
            return l3[k - 1]
        else:
            return ""

      
