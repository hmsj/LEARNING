package es.uc3m.tiw.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@Table(name="usuario")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idUsuario;

	private String apellido;

	private int cuenta;

	private String descripcion;

	private int direccion;

	private String intereses;

	private String listaDeseos;

	private String nombre;

	private String username;

	//bi-directional many-to-one association to AlumnoCurso
	@OneToMany(mappedBy="usuario")
	private List<AlumnoCurso> alumnoCursos;

	//bi-directional many-to-one association to AlumnoLeccion
	@OneToMany(mappedBy="usuario")
	private List<AlumnoLeccion> alumnoLeccions;

	//bi-directional many-to-one association to ProfesorCurso
	@OneToMany(mappedBy="usuario")
	private List<ProfesorCurso> profesorCursos;

	public Usuario() {
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getCuenta() {
		return this.cuenta;
	}

	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getDireccion() {
		return this.direccion;
	}

	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}

	public String getIntereses() {
		return this.intereses;
	}

	public void setIntereses(String intereses) {
		this.intereses = intereses;
	}

	public String getListaDeseos() {
		return this.listaDeseos;
	}

	public void setListaDeseos(String listaDeseos) {
		this.listaDeseos = listaDeseos;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<AlumnoCurso> getAlumnoCursos() {
		return this.alumnoCursos;
	}

	public void setAlumnoCursos(List<AlumnoCurso> alumnoCursos) {
		this.alumnoCursos = alumnoCursos;
	}

	public AlumnoCurso addAlumnoCurso(AlumnoCurso alumnoCurso) {
		getAlumnoCursos().add(alumnoCurso);
		alumnoCurso.setUsuario(this);

		return alumnoCurso;
	}

	public AlumnoCurso removeAlumnoCurso(AlumnoCurso alumnoCurso) {
		getAlumnoCursos().remove(alumnoCurso);
		alumnoCurso.setUsuario(null);

		return alumnoCurso;
	}

	public List<AlumnoLeccion> getAlumnoLeccions() {
		return this.alumnoLeccions;
	}

	public void setAlumnoLeccions(List<AlumnoLeccion> alumnoLeccions) {
		this.alumnoLeccions = alumnoLeccions;
	}

	public AlumnoLeccion addAlumnoLeccion(AlumnoLeccion alumnoLeccion) {
		getAlumnoLeccions().add(alumnoLeccion);
		alumnoLeccion.setUsuario(this);

		return alumnoLeccion;
	}

	public AlumnoLeccion removeAlumnoLeccion(AlumnoLeccion alumnoLeccion) {
		getAlumnoLeccions().remove(alumnoLeccion);
		alumnoLeccion.setUsuario(null);

		return alumnoLeccion;
	}

	public List<ProfesorCurso> getProfesorCursos() {
		return this.profesorCursos;
	}

	public void setProfesorCursos(List<ProfesorCurso> profesorCursos) {
		this.profesorCursos = profesorCursos;
	}

	public ProfesorCurso addProfesorCurso(ProfesorCurso profesorCurso) {
		getProfesorCursos().add(profesorCurso);
		profesorCurso.setUsuario(this);

		return profesorCurso;
	}

	public ProfesorCurso removeProfesorCurso(ProfesorCurso profesorCurso) {
		getProfesorCursos().remove(profesorCurso);
		profesorCurso.setUsuario(null);

		return profesorCurso;
	}

}