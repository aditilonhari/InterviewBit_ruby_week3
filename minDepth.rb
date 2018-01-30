# Definition for a  binary tree node
# class TreeNode
#     attr_accessor :left,:right,:data
#     def initialize(data)
#         @data = data
#         @left = nil
#         @right = nil
#     end
#    
#     def to_str
#       return data.to_s;  
#     end
# end
class Solution
    # @param a : root node of tree
    # @return an integer
    def minDepth(a)
        
        return 0 if a.nil?
        
        result = []
        hash = {}
        hash["node"] = a
        hash["depth"] = 1
        result << hash
        
        until result.empty?

            item = result.shift
            node = item["node"]
            depth = item["depth"]
            
            return depth if node.left.nil? && node.right.nil?
            
            if !node.left.nil?
                temp = {}
                temp["node"] = node.left
                temp["depth"] = depth +1
                result << temp
            end
        
            if !node.right.nil?
                temp = {}
                temp["node"] = node.right
                temp["depth"] = depth +1
                result << temp
            end
        end
    end
end
