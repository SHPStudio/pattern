# 代理模式
  代理模式是让代理方代替真实对象做出想要的动作。 提供一种代理去控制某个对象的访问。
## 一般代理
  就是实现相同的接口，代理方持有真实对象的接口进行调用。
## 普通代理
  由代理去创建真实对象，并进行控制访问。
## 强制代理
  上层只能通过实例的特定代理去进行访问。
## 动态代理
  利用`InvocationHandler`接口，去利用反射去实现在运行中创建一个代理类，然后去执行。
  这种是AOP切面编程的一个非常好的实现方法。可以在这基础上对代理对象的访问进行一些其他的处理。