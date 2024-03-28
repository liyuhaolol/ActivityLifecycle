# Activity声明周期统计

用来统计App整个运行中，各个actvity综合的生命周期，可以判断app是否在前台显示，是否可见等功能


## 框架引用方法

- 在gradle中:
```gradle
    implementation("io.github.liyuhaolol:ActivityLifecycle:1.0.2")
```

## 使用方法

```java
/**
*在Application中注册方法
*/
public class Application {
  @Override
    public void onCreate(){
        super.onCreate();
        ...
        //注册activity生命周期统计
        registerActivityLifecycleCallbacks(new ActivityLifecycleListener());
      }
}
```

# 实体类方法说明

## ActivityLifecycleListener


```java
/**
* @return app当前是否可见
*/
boolean isApplicationVisible()

/**
* @return app当前是否在前台
*/
boolean isApplicationInForeground()
```

## 注意事项

- 判断app是否可见判断是start跟stop之间的关系，判断app是否在前台是resume跟pause之间的关系。一般推送后判断前台是使用后者。
