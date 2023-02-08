package mx.itson.reddit.entidades;

import java.util.Date;
//
public class Comentario {
    private String usuario;
    private String cuerpo;
    private Date fecha;

    public Comentario(String usuario, String cuerpo, Date fecha) {
        this.usuario = usuario;
        this.cuerpo = cuerpo;
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
