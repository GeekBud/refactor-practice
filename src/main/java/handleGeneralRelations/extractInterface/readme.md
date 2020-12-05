## exract-interface

#### 使用场景

当某操作有多个类进行实现时，对该操作的引用不应依赖操作的实现类（类），而是操作本人（接口）

#### 操作方法

 - 将多个类中相同的操作提炼成接口
 
#### 扩展方式

 - 实现接口即可完成扩展，因引用处依赖接口而非实现类，故无需修改