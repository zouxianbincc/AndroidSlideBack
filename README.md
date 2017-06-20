
##AndroidSlideBack
这个Activity实现了可以滑动左侧边缘退出Activity的功能，类似iOS的交互行为



##SlideBack有哪些功能？

* setSlideable(boolean) 方法来设置是否支持滑动
    
* setPreviousActivitySlideFollow(boolean)方法来设置前一个activity是否跟随滑动
* setShadowResource(resId)设置边缘的阴影的资源


##使用
Add it in your root build.gradle at the end of repositories
```javascript
allprojects {
    	repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Add the dependency
```javascript
dependencies {
	        compile 'com.github.zouxianbincc:AndroidSlideBack:v1.0.0'
	}
```
##注意
在Activity实现中。setContentView时，只能传一个View,不能传一个layoutResID。
因为 SlideBackAppCompatActivity重写的setContentView(View view);
所以  setContentView(R.layout.activity_main2) 时，左滑返回是无效的
### BaseActivity
```javascript
/**
 * 这个是基类。为了统一实现左滑返回，也可以单个Activity中实现，只要继承SlideBackAppCompatActivity,
 * 在super.onCreate(savedInstanceState);之前调用setSlideable（）方法就行，但是每个项目中都有自己的基类，
 * 所以最好是让自己的基类继承SlideBackAppCompatActivity。因为SlideBackAppCompatActivity本身是继承AppCompatActivity的。
 * 如果不是继承Activity的，只有拿源码来修改ActivityInterfaceImpl里的继承实现
 *
 * 警告：在Activity实现中。setContentView时，只能传一个View,不能传一个layoutResID。
 * 因为 SlideBackAppCompatActivity重写的setContentView(View view);
 * 所以  setContentView(R.layout.activity_main2) 时，左滑返回是无效的
 */
public abstract class BaseActivity extends SlideBackAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //设置是否可以左滑返回，必须在super.onCreate（）之前
        setSlideable(isActivitySlideBack());

        super.onCreate(savedInstanceState);

    }

    public abstract boolean isActivitySlideBack();


}
```
###允许左滑返回的Activity

```javascript
/**
 * 允许左滑返回的Activity
 */
public class Main3Activity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        

        //要想能左滑返回上一个Activity
        //设置setContentView必须是setContentView(view)
        //不能传一个layoutID
        setContentView(LayoutInflater.from(this).inflate(R.layout.activity_main3,null,false));

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Main3Activity.this, Main3Activity.class));

            }
        });
    }

    @Override
    public boolean isActivitySlideBack() {
        //允许左滑返回
        return true;
    }
}
```

##关于作者


