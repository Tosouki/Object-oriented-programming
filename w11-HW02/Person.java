class Person {
	String name; // 姓名
	int age;     // 年齡
	int height;  // 身高
	int weight;  // 體重

	Person() {
		this.name = "王大陸";
		this.age = 25;
		this.height = 182;
		this.weight = 75;
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setAge(int age) {
		this.age = age;
	}

	int getAge() {
		return age;
	}

	void setHeight(int height) {
		this.height = height;
	}

	int getHeight() {
		return height;
	}

	void setWeight(int weight) {
		this.weight = weight;
	}

	int getWeight() {
		return weight;
	}

	void showProfile() {
		System.out.println("姓名：" + name + " 年齡：" + age + "身高：" + height + "體重：" + weight);
	}

	void calcBMI() {
		System.out.println("你的BMI值：" + (double)weight / (height * height) * 10000);
	}
}
