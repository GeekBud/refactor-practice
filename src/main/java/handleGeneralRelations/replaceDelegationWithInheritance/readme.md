### replace-delegation-with-inheritance

#### 适用场景
 
 本技巧和replace-inheritance-with-delegation相反
  
 - 当发现自己需要使用委托类中的几乎全部函数，并且花费了很大力气编写极简的委托函数，请使用该技巧

#### 操作方法

 - 声明继承关系
 - 移除全部极简委托方法
 - 移除超类私有变量