**组合模式**

牵扯到整体与组合的时候就要考虑是否使用组合模式
树状结构的时候也可以考虑用到组合模式

组合模式分安全模式和透明模式

安全模式是一个通用的Component抽象类 方法都不是抽象的
透明模式是把所有的方法都放到抽象类中不管叶子还是树枝都有相同的结构，如果处理不当可能会出异常。