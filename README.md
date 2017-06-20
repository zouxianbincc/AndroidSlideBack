# AndroidSlideBack
工程创建
这个Activity实现了可以滑动左侧边缘退出Activity的功能，类似iOS的交互行为。
#setSlideable(boolean) 方法来设置是否支持滑动
#setPreviousActivitySlideFollow(boolean)方法来设置前一个activity是否跟随滑动

# 使用
# Add it in your root build.gradle at the end of repositories
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
# Add the dependency
dependencies {
	        compile 'com.github.zouxianbincc:AndroidSlideBack:v1.0.0'
	}

