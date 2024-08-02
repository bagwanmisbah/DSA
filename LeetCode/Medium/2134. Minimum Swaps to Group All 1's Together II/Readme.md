![leemed1](https://github.com/user-attachments/assets/d434905b-034b-44f9-86e1-e764ec8f79b4)
    I arrived to the conclusion ,rather quickly, that we dont need to perform actual swapping
BRUTE 
1.getting indices of all 1's and storing them in a list
then calculating and checking their difference 

    l1=[0,0,1,0,1,1]
    size=len(l1)

    def getindices(lst,el):
        tlist=[index for index,value in enumerate(lst) if value==el]
        return tlist
    
    iclist=getindices(l1,1)
    print(iclist)
  output:

    [2, 4, 5]

  Now based around output we increment count and not perform actual swapping 
  For non-Circular cases 
  ![WhatsApp Image 2024-08-02 at 4 38 10 PM](https://github.com/user-attachments/assets/795ef0ae-aa16-40f3-94f9-1017c6af95f1)
  ![leemed1](https://github.com/user-attachments/assets/606bcc2b-cb5b-4625-9b7c-23bea02c8c98)
  summing up entirely + for circular cases 
  ![WhatsApp Image 2024-08-02 at 4 38 10 PM (1)](https://github.com/user-attachments/assets/87dec86c-02e0-4639-985e-3cbf61d65bde)
  ![leemedcirc1](https://github.com/user-attachments/assets/dc574c6c-790f-498f-87f5-9db0540f66a2)

  In Online compiler :
 
     l1=[1,1,0,0,1]
    size=len(l1)

    def getindices(lst,el):
        tlist=[index for index,value in enumerate(lst) if value==el]
        return tlist
    
    iclist=getindices(l1,1)
    print(iclist)

    def calc_swap(l2):
        swapc=0
        totalc=[]
        n=len(l2)
        if(l2[0]==0 and l2[-1]==n-1):
            initdiff=2
        else:
            initdiff=1
        totalc=[]
        for i in range(len(l2)-initdiff):
            j=i+1
            diff=l2[j]-l2[i]
            if(diff<=1):
                pass
            elif(diff>=2):
                swapc=diff-1
                totalc.append(swapc)
        return totalc

    print(calc_swap(iclist))
    print(sum(calc_swap(iclist)))

[Problem Description]
(https://leetcode.com/problems/minimum-swaps-to-group-all-1s-together-ii/?envType=daily-question&envId=2024-08-02)
        
Intermediate thoughts-solutions
for i in l1:
    if l1[size-1]==1 and l1[0]==1:
        pass
    elif l1[size-1]==0 and l1[0]==1:
idlist=[]
for i in l1:
    if i==1:
        idlist.append(l1.index(i))

print(idlist)

for i in iclist:
    swapcounter=0
    tempdiff
    j=i+1
    if(l1[j]-l1[i]==1): #1 s are beside eaach other
        pass
    elif(l1[j]-l1[i]==2):
        swapcounter=
        
        
        
    


  
  

  

  
  
