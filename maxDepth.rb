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
    def maxDepth(a)
        
        return 0 if a == nil
        
        left = 1 + maxDepth(a.left)
        right = 1 + maxDepth(a.right)
        
        return left > right ? left : right 
    end
end
