
public class Triangulo {
	/* atributos */
	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	
	/* construtor */
	public Triangulo(double ladoA, double ladoB, double ladoC) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

   /* métodos get e set */
	public double getLadoA() {
		return ladoA;
	}


	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}


	public double getLadoB() {
		return ladoB;
	}


	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}


	public double getLadoC() {
		return ladoC;
	}


	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}
	
	/* método para calcular a área*/
	
	public double area() {
		double p = (ladoA+ladoB+ladoC)/2;
		return Math.sqrt(p*(p-ladoA) * (p-ladoB) * (p-ladoC));
		
		
	}
	
    public String toString() {
    	
    	return "Área: " + String.format("%.4f", area());
    }
}
