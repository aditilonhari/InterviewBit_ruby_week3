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
    def preorderTraversal(a)
        return [] if a.nil?
        
        results = []
        results << a.data
        results.concat preorderTraversal(a.left)
        results.concat preorderTraversal(a.right)
    
        results
    end
end
