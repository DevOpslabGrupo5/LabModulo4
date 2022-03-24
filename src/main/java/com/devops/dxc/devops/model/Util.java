package com.devops.dxc.devops.model;

public class Util {
    /**
     * Método para cacular el 10% del ahorro en la AFP.  Las reglas de negocio se pueden conocer en 
     * https://www.previsionsocial.gob.cl/sps/preguntas-frecuentes-nuevo-retiro-seguro-10/
     * 
     * @param ahorro
     * @param sueldo
     * @return
     * 
     * 
     * La Ley estableció un mínimo de entre 0 y 35 UF, y un máximo de 150 UF. 
     * Es decir, entre $1 millón y $4.3 millones aproximadamente. 
     * Para aquellos que tengan un saldo en su cuenta individual menor a $1 millón, 
     * podrán hacer el retiro total de fondos en una cuota.
     * 
     */
    public static int getDxc(int ahorro, int sueldo){
        if(((ahorro*0.1)/getUf()) > 150 ){
            return (int) (150*getUf()) ;
        } else if((ahorro*0.1)<=1000000 && ahorro >=1000000){
            return (int) 1000000;
        } else if( ahorro <=1000000){
            return (int) ahorro;
        } else {
            return (int) (ahorro*0.1);
        }
    }

    public static int diezxciento(int ahorro){
		double diezxciento = ahorro * 0.1;
		System.out.println(diezxciento);
		return (int) diezxciento;
	}
	
	public static Float impuesto(int sueldo){
		Integer sueldoAnual = sueldo*12;
		
		/* 	0,08 si estás en el tercer tramo (renta anual entre $17.864.280 y $29.773.800 de pesos anuales)
			0,135 si estás en el cuarto tramo (renta entre 29,7 a 41,6 millones de pesos anuales)
			0,23 si estás en el quinto (entre 41,6 y 53,5 millones de pesos anuales)
			0,304 si estás en el sexto (entre 53,5 y 71,4 millones de pesos anuales)
			0,35 si estás en el séptimo (más de 71,4 millones de pesos anuales)*/
		
		
		float inpuesto = 0.0f;
		if (sueldoAnual > 17864280 && (sueldoAnual < 29773800)){
			inpuesto =  0.08f;
		}else if(sueldoAnual > 29700000 && (sueldoAnual < 41600000)){
			inpuesto = 0.135f;
		}else if(sueldoAnual > 41600000 && (sueldoAnual < 53500000)){
			inpuesto = 0.23f;
		}else if(sueldoAnual > 53500000 && (sueldoAnual < 71400000)){
			inpuesto = 0.304f;
		}else if(sueldoAnual > 71400000 ){
			inpuesto = 0.35f;
		}
		
		/*System.out.println("Sueldo Anual: "+sueldoAnual); 
		System.out.println("Inpuesto"+inpuesto); */
		return inpuesto;
	}
	
	public static int saldoAhorro(int ahorro) {
		double noventaxciento = ahorro * 0.9;
		return (int) noventaxciento;
	}
    
       
    /**
     * Método que retorna el valor de la UF.  Este método debe ser refactorizado por una integración a un servicio
     * que retorne la UF en tiempo real.  Por ejemplo mindicador.cl
     * @return
     */
    public static int getUf(){
        return 29000;
    }
    
    
}