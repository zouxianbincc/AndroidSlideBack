# AndroidSlideBack
工程创建
这个Activity实现了可以滑动左侧边缘退出Activity的功能，类似iOS的交互行为。\<br>
setSlideable(boolean) 方法来设置是否支持滑动\<br>
setPreviousActivitySlideFollow(boolean)方法来设置前一个activity是否跟随滑动\<br>

# 使用
## Add it in your root build.gradle at the end of repositories
allprojects {\<br>
		repositories {\<br>
			...\<br>
			maven { url 'https://jitpack.io' }\<br>
		}\<br>
	}\<br>
## Add the dependency
dependencies {\<br>
	        compile 'com.github.zouxianbincc:AndroidSlideBack:v1.0.0'\<br>
	}\<br>
\<br>
