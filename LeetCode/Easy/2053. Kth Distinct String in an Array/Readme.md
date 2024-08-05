[Problem Statement-2053. Kth Distinct String in an Array](https://leetcode.com/problems/kth-distinct-string-in-an-array/submissions/1345623047?envType=daily-question&envId=2024-08-05).

In order to find and store string and their occurences we can use Dictionary data type
therefore for

    l1 = ["d", "b", "c", "b", "c", "a"]

  dictionary elem_count will contain 
  
    {'d': 1, 'b': 2, 'c': 2, 'a': 1} 

  since d occurred once, b occurred twice and so on 

Now we store this is another dictionary ,such that only strings that occured once are added into it

Finally , in a list we only store the key values of characters that occured once 

This problem can be optimsed further by using collections?

Here's the Practice code :

    def countDistinct(arr, k):
      elem_count = {}  # an empty dictionary
      l2 = {}
      l3=[]
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
            
      for key,value in l2.items():
          l3.append(key)

      print(elem_count)
      k = k - 1
      print(l3)
      return l3[k]
    

