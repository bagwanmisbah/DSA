#73ms Beats 64.47%

class Solution:
    def canBeEqual(self, target: List[int], arr: List[int]) -> bool:
        target=sorted(target)
        arr=sorted(arr)
        for i in range(len(target)):
            if target[i]!=arr[i]:
                return False
        return True

#86ms Beats 10.43%
class Solution:
    def canBeEqual(self, target: List[int], arr: List[int]) -> bool:
        return sorted(target) == sorted(arr)


        


