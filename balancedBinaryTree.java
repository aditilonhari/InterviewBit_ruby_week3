# Definition for a  binary tree node
# class TreeNode
#     attr_accessor :left,:right,:data
#     def initialize(data)
#         @data = data
#         @left = nil
#         @right = nil
#     end
# end
class Solution
    # @param a : root node of tree
    # @return an integer
    def isBalanced(a)
        
        return 1 if a == nil
        
        leftHeight = calcHeight(a.left)
        rightHeight = calcHeight(a.right)
        
        return 1 if (isBalanced(a.right) == 1) && (isBalanced(a.left) == 1) && (leftHeight - rightHeight).abs <= 1
        
        return 0
    end
    
    def calcHeight(a)
        return 0 if a == nil        
        
        left = 1 + calcHeight(a.left)
        right = 1 + calcHeight(a.right)
        
        return left > right ? left : right
    end
end
