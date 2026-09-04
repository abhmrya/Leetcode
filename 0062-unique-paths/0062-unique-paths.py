class Solution:
    

    def myfunc(self, left,right, m , n):

        if (left,right) in self.dic:
            return self.dic[(left,right)]

        if left>m or right >n:
            return 0

        if left==m and right==n:
            return 1

        result =  self.myfunc(left+1,right, m , n) + self.myfunc(left , right+1, m ,n )

        self.dic[(left,right)] = result

        return result
        

    def uniquePaths(self, m: int, n: int) -> int:
        self.dic = {}
        if m==1 or n==1:
            return 1
        left = 0
        right = 0
        return self.myfunc(left, right, m-1, n-1)