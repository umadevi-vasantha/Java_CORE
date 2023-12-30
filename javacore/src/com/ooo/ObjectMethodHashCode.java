package com.ooo;

public class ObjectMethodHashCode {
	
	String title;
	String author;
	
	public ObjectMethodHashCode(String title, String author){
		this.title=title;
		this.author=author;
	}
	
	@Override
	public int hashCode() {
		int result = this.title.hashCode();
		result =31 * result + this.author.hashCode();
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectMethodHashCode book1 = new ObjectMethodHashCode("Java Programming", "Uma");
		ObjectMethodHashCode book2 = new ObjectMethodHashCode("Java Programming", "Uma");
		ObjectMethodHashCode book3 =new ObjectMethodHashCode("Git Commands", "Uma");
		System.out.println(book1.hashCode());
		System.out.println(book2.hashCode());
		System.out.println(book3.hashCode());
        System.out.println(book1.hashCode() == book2.hashCode());
        System.out.println(book3.hashCode() == book2.hashCode());

	}

}
