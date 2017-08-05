#享元模式
    享元模式是池技术的重要实现方式。使用共享对象可有效的支持大量的细粒度的对象。
##主要用途
    主要用途就是实现池技术，细粒度小的对象的特点可能就是多并且杂，但是他们可能有很多相同的地方，把相同的对象放入池中。
    通过工厂模式从池中获取缓存的对象。
##构成
    享元对象由两部分组成：内部状态和外部状态。
    内部状态：是对象可以共享出来的信息，不会随着环境的改变而改变。
    外部状态：是对象依赖的一个标记，他是一批对象的统一标识，相当于缓冲对象的索引，通过这个索引就可以找到这一类对象。
##实例
    报考问题：报考信息由编号、考试地点、考试科目和准考证邮寄地址组成。
    实现：可以按照考试地点和考试科目作为key来获取生成该系列的对象。放入工厂中的缓存池Map中，每次通过工厂获取对象时
    就可以根据这个key来获取池中的对象了。