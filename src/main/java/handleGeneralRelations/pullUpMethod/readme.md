## pull-up-method

#### 使用场景

基础重构技巧

#### 操作方法

 - 检查待上移函数，确定是否一致
    - 签名不一致，使用rename-method
    - 函数体不一致，使用substitute-algorithm
 - 方法上移至超类
    - 如果函数中调用了子类方法，则在超类中声明相同签名的抽象方法
    - 如果函数中调用了子类字段，可以使用pull-up-field或在子类实现self-encapsulate-field后在超类声明抽象方法