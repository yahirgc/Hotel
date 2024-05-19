package Trivago;


public class Titular{

	public String nombres, apellidos, nacionalidad, correo, tarjeta;
	private boolean extranjero, efectivo;
	private int telefono;

	//Setters
	public void	setNombres(String x)		{	this.nombres = x;	}
	public void	setApellidos(String x)		{	this.apellidos = x;	}
	public void	setNacionalidad(String x)	{	this.nacionalidad = x;	}
	public void	setCorreo(String x)		{	this.correo = x;	}
	public void	setTarjeta(String x)		{	this.tarjeta = x;	}
	public void	setExtranjero(boolean x)	{	this.extranjero = x;	}
	public void	setEfectivo(boolean x)		{	this.efectivo = x;	}
	public void	setTelefono(int x)		{	this.telefono = x;	}

	//Getters
	public String	getNombres()		{	return this.nombres;		}
	public String	getApellidos()		{	return this.apellidos;		}
	public String	getNacionalidad()	{	return this.nacionalidad;	}
	public String	getCorreo()		{	return this.correo;		}
	public String	getTarjeta()		{	return this.tarjeta;		}
	public boolean	getExtranjero()		{	return this.extranjero;		}
	public boolean	getEfectivo()		{	return this.efectivo;		}
	public int	getTelefono()		{	return this.telefono;		}





	



	public Titular(){}



	
}