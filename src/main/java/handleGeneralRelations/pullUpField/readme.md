## pull-up-field

#### 使用场景

两个子类拥有相同字段

#### 操作方法

 - 将字段迁移至超类，若字段为private请调整为protected便子类使用
    - 如果使用self-encapsulate-field请忽略