## extract-subclass

#### 使用场景

类中的特性只被某些（而非全部）实例用到，此时可新建一个子类，将上面所说的那一部分特性移到子类中。

#### 操作方法

 - 新建子类
 - 对下移特性逐一使用push-down-method、push-down-field
 - 对下移特性依赖字段进行self-encapsulate-field，开启多态取值通道