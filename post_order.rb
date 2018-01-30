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
    # @return an array of integers
    def postorderTraversal(a)
        return [] if a.nil?
        
        results = []
        results.concat postorderTraversal(a.left)
        results.concat postorderTraversal(a.right)
        results << a.data
        
        results
    end
end
