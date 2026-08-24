class Solution:
    def clearDigits(self, s: str) -> str:
        lst =  []

        for i in s:
            if i.isdigit():
                lst.pop()
            else:
                lst.append(i)
        return "".join(lst)