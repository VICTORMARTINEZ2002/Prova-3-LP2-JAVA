public class Pessoa{
	// Atributos
		private String name;
		private float  altura;
		private int    age;
		private int    ID;

	// Construtores
		public Pessoa(){}
		public Pessoa(String name, float altura, int age, int ID){
			this.name   = name;
			this.setAltura(altura);
			this.setAge(age);
			this.ID     = ID;
		}

	// Gets && Sets
		public String getName(){return this.name;}
		public void setName(String name){
			this.name = name;
		}

		public float getAltura(){return this.altura;}
		public void  setAltura(float altura){
			if(altura>=0){this.altura  = altura;}
		}

		public int  getAge(){return this.age;}
		public void setAge(int age){
			if(age>=0){this.age = age;}
		}

		public int  getID(){return this.ID;}
		public void setID(int ID){this.ID = ID;}

	// Metodos
		public void showInfo(){
			System.out.printf("%-10s - %3d Years - ID: %4d;\n", this.name, this.age, this.ID);
		}	
}