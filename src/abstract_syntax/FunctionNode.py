from .Node import Node
from .TypeNode import TypeNode
from .ParameterNode import ParameterNode
from .BlockNode import BlockNode

from typing import List

class FunctionNode(Node):
    def __init__(self, identifier: str, block: BlockNode,params: List[ParameterNode] = [], _type:TypeNode=None) -> None:
        super().__init__()
        self.identifier   = identifier
        self.params = params
        self.block   = block 
        self._type = _type
    
    def __eq__(self, other):
        ident = self.identifier == other.identifier
        params = self.params == other.params
        block = self.block == other.block
        _type = self._type == other._type
        return isinstance(other, FunctionNode) and ident and params and block and _type
    
    def __repr__(self):
        return f"FunctionNode(identifier={self.identifier}, params={self.params}, block={self.block}, type = {self._type})"