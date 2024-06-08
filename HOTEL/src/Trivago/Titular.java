package Trivago;


public class Titular{

	public String nombres, apellidos,direccion, curp, nacionalidad, correo, telefono;
	public boolean extranjero;
	public int numHabitacion;

    public Titular() {
    }
        
        
        
	/*Setters
	public void	setNombres(String x)		{	this.nombres = x;	}
	public void	setApellidos(String x)		{	this.apellidos = x;	}
	public void	setNacionalidad(String x)	{	this.nacionalidad = x;	}
	public void	setCorreo(String x)		{	this.correo = x;	}
	public void	setExtranjero(boolean x)	{	this.extranjero = x;	}
	public void	setTelefono(String x)		{	this.telefono = x;	}

	//Getters
	public String	getNombres()		{	return this.nombres;		}
	public String	getApellidos()		{	return this.apellidos;		}
	public String	getNacionalidad()	{	return this.nacionalidad;	}
	public String	getCorreo()		{	return this.correo;		}
	public String	getTarjeta()		{	return this.tarjeta;		}
	public boolean	getExtranjero()		{	return this.extranjero;		}
	public boolean	getEfectivo()		{	return this.efectivo;		}
	public int	getTelefono()		{	return this.telefono;		}
        */

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isExtranjero() {
        return extranjero;
    }

    public void setExtranjero(boolean extranjero) {
        this.extranjero = extranjero;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }	
}