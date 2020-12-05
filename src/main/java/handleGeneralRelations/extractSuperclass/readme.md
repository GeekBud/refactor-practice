## extract-superclass

#### 使用场景

两个类有相似的特性

#### 操作方法

 - 新建抽象超类
 - 使用pull-up-filed、pull-up-method、pull-up-constructor-body将子类的共通元素上移至超类
    - 如果子类函数签名不同，使用rename-method修改为相同签名，再使用pull-up-method
    - 如果子类函数签名相同，但函数本体不同，在超类声明为抽象函数
    - 如果子类函数本体不同，但作用一致，使用substitute-algorithm替换函数本体，再使用pull-up-method
 - 继续筛选子类函数体，如果有相同部分可以使用extract-method后pull-up-method，如果子类中某个函数整体流程大体相似，可以考虑使用form-template-method

