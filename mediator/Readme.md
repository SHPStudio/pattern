# 中介者模式
## 介绍
  中介者模式就类似于现实中的中介，把不同系统间进行解耦和，让不同系统间紧密的关系还有通信
  都通过一个中介者来交互，也就是形成一个星形的拓扑结构。
## 使用场景
  1. 现实中的中介，比如房屋中介 你只需要跟中介说要找房子，其他事情都是中介去搞，搞好之后叫你去看。
  2. MVC模式中的Controller，他是视图层和模型层的中介者，把模型数据传给视图层，视图层进行相关修改数据的操作也是通过控制层进行中转。
## 事例
   公司一般分为 销售、采购和库存三大结构。
   采购需要采购产品
   销售需要销售产品
   库存也就是存放产品的地方