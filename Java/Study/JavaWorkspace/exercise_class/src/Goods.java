public class Goods {
	int goods_num;
	int price;
	String kind;
	String maker;
}

class Foods extends Goods {
	int shelf_life;
	String kind;
	String taste;
}

class House_G extends Goods {
	String size; // (Big, Medium, Small)
	String color;
}

class Electronic_P extends House_G {
	String volt;
	int weight;
	int height;
}

class Writing_implements extends Goods {

}