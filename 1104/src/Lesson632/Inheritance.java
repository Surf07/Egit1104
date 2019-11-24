package Lesson632;



class Parent{

	public Parent() {
		System.out.println("Parent no arg constructor");
	}

	public Parent(String arg) {
		System.out.println("Parent one arg constructor arg = " + arg);
	}
}

class Child extends Parent{

	public Child() {
		//  super();コメントを外しても同じ。本来、子コンストラクタは先頭で親コンストラクタを呼び出さなければならない。
		//  このとき親コンストラクタの引数などは関係ない。親コンストラクタが複数ある場合はどれを呼んでもいい。
		//  super("default")、但し先頭以外で親コンストラクタを呼び出すことは出来ない。子コンストラクタで親コンストラクタが
		//  呼ばれていない場合、引数なしの親コンストラクタが自動で呼び出される。

		System.out.println("Child no args constructor");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Parent parent = new Parent();
		Parent parent2 = new Parent("test");

		Child child = new Child();
	}
}
