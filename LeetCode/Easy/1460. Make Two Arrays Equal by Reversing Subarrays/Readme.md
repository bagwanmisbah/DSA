
In both Arrays, number of elements are the same so we dont need to take care of trailing unequal elements

Basic logic is to determine whether elements in the arr Array have a corresponding element in target ,

if they do then any reversal of subarray can be made in order to make it equal to target

keep in mind ,like all the other leetcode problems we dont have to actually perform reversal of subarray (●'◡'●)

     (╯°□°）╯︵ ┻━┻

i made no considerations to check for testcases if both lists are empty, or target array is itself empty or vice-versa 
      
      (¬‿¬)

first solution : requiring a loop 

        target=[1,3,4,2]
        arr=[3,2,1,4]
        target=sorted(target)
        arr=sorted(arr)

    def fun1():
        for i in range(len(target)):
            if target[i]!=arr[i]:
                return False
            return True
  second :directly checking 

    def fun2():
        if target==arr:
            return True
        return False

    print(fun1())
    print(fun2())
#Note :
this will work 
    
    target.sort()
    arr.sort()
    if target == arr:
        return True
    return False

but this wont:
    
    if target.sort()==arr.sort():
            return True
        return False

because target.sort() sorts the list in-place and returns None ,When you compare target.sort() with arr.sort(), 

you are actually comparing None with None, because both sort() calls return None.

One liner would be :

    return sorted(target)==sorted(arr)

