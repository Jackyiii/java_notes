package com.note.JavaSE.Oop;

public class Oop4 {
	//栈 存放基础数据类型和自定义对象的引用
	//堆 主要存储创建的对象，即new出来的对象
	//方法区 javac 加载存放class文件 字节码文件
	
	// Student s= new Students()
	//s.name
	//s.age
	//....
	//Student s1=new Student()
	//s1.name
	//...
	//jvm 会讲student 测试类的文件加载到方法区
	//student学生的class 加载到方法区
	//压栈 main方法
	//创建学生的对象
	//堆内存开辟区域
	//栈s的引用指向堆内存的内存地址
	//给成员变量进行赋值
	//jvm给堆内存重新开辟内存空间
	//s1指向新的内存地址
	//堆内存当中给成员变量赋值
}
