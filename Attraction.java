import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Attraction{
	// Atributos
		private String    name;
		private String    desc;
		private int       capc;
		private ArrayList<Pessoa>         CUclients;
		private HashMap<Pessoa, Integer>  EXclients;

	// Construtores
		public Attraction(){
			this.CUclients = new ArrayList<Pessoa>();
			this.EXclients = new HashMap<Pessoa, Integer>();
		}
		public Attraction(String name, String desc, int capc){
			this.name = name;
			this.desc = desc;
			this.capc = capc;
			this.CUclients = new ArrayList<Pessoa>();
			this.EXclients = new HashMap<Pessoa, Integer>();
		}

	// Gets && Sets
		public String getName(){return this.name;}
		public void   setName(String name){
			this.name = name;
		}

		public String getDesc(){return this.desc;}
		public void   setDesc(String desc){
			this.desc = desc;
		}

		public int  getCapc(){return this.capc;}
		public void setCapc(int capc){
			this.capc = capc;
		}

		public ArrayList getCUclients(){return this.CUclients;}
		public void    	 setCUclients(ArrayList array){
			this.CUclients = array;
		}

		public HashMap getEXclients(){return this.EXclients;}
		public void    setEXclients(HashMap hsmap){
			this.EXclients = hsmap;
		}

	// Metodos	
		//Show:
			public void showCUClients(){
				System.out.printf("Imprimindo Atuais Clientes:\n");
				for(int i=0; i<=this.CUclients.size()-1; i++){
					System.out.printf("\t%d. %s;\n", i, CUclients.get(i).getName());
				}
				System.out.println();
			}	

			public void showEXClients(){
				System.out.printf("Imprimindo EX-Clientes:\n");
				int i=1;
				for(Map.Entry<Pessoa, Integer> elem : EXclients.entrySet()){
					System.out.printf("\t%d. %s - %d;\n", i, elem.getKey().getName(), elem.getValue());
				}
				System.out.println();
			}	

			public void showInfo(){
				System.out.printf("%-15s: %s;\n", this.name, this.desc);
				System.out.printf("Capacidade: %d/%d;\n", this.CUclients.size(), this.capc);
				this.showCUClients();
				this.showEXClients();
			}

		//Action:	
			public boolean addClient(Pessoa p){
				if(this.CUclients.size() < this.capc){
					if(!CUclients.contains(p)){
						CUclients.add(p);
						return true;
					}
				}
				return false;
			}

			public boolean extClient(Pessoa p){
				if(CUclients.contains(p)){
					CUclients.remove(p);										// Retiro dos clientes em uso; 			
					EXclients.put(p, EXclients.containsKey(p) ? EXclients.get(p) + 1 : 1);  // Adiciono nos ex-clientes;
				}
				return false;
			}

			public boolean extAllClient(){
				while(CUclients.size()>0){
					this.extClient(CUclients.get(0));
				}
				return false;
			}


}