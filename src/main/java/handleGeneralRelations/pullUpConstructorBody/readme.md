## pull-up-constructor-body

#### 使用场景

你在各个子类中拥有构造函数，而本体大致相同

#### 操作方法

 - 在超类中新增构造函数，并在子类中调用它
 - 如果子类中重复代码散乱，请使用extract-method、pull-up-method进行，对于对子类有依赖不能被上移的方法请使用声明抽象类