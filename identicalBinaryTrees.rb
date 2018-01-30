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
    # @param b : root node of tree
    # @return an integer
    def isSameTree(a, b)
        return 1 if a.nil? && b.nil?
        return 0 if a.nil? || b.nil?
        return 0 if a.data != b.data

        return isSameTree(a.left, b.left) || isSameTree(a.right, b.right)
    end
end
