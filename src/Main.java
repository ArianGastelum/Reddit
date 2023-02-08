import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//aqui conectamos con las otras clases
import mx.itson.reddit.entidades.Comentario;
import mx.itson.reddit.entidades.Post;
import mx.itson.reddit.entidades.Usuario;

public class Main {
    public static void main(String[] args) {
       //Se otorga el valor a usuario
        Usuario usuario = new Usuario();
        usuario.setNombre("Gustavo Caldera");
        usuario.setCorreo("gustavo.correro@gmail.com");
        //Se usa para describir lo que dice el post
        Post post = new Post();
        post.setTitulo("Ayuda por favor");
        post.setCuerpo("Apruebeme profe, no sea malo :(");
        post.setFecha(new Date());
        post.setPuntos(0);
        //Aqui utilizamos el list para poner una lista ordenada de los comentarios
        //de cada usuario, ademas de utilizar el date para poner la fecha
        List<Comentario> comentarios = new ArrayList<Comentario>();
        comentarios.add(new Comentario("PepelangaMaster", "A llorar a la llorería", new Date()));
        comentarios.add(new Comentario("JuanitoGamer", "Se tenía que decir y se dijo", new Date()));
        comentarios.add(new Comentario("EduardoLara", "¡Te veo el próximo semestre!", new Date()));
        
        post.setComentario(comentarios);
        //Aqui mandamos imprimir cada una de las cosas que debe de decir el post con todo y sus datos
        System.out.println("Post: " + post.getTitulo());
        System.out.println("Autor: " + usuario.getNombre());
        System.out.println("Cuerpo: " + post.getCuerpo());
        System.out.println("Fecha: " + post.getFecha());
        System.out.println("Puntos: " + post.getPuntos());
        System.out.println("Comentarios: ");
        for (Comentario comentario : comentarios) {
            System.out.println("\tAutor: " + comentario.getUsuario());
            System.out.println("\tComentario: " + comentario.getCuerpo());
            System.out.println("\tFecha: " + comentario.getFecha());
        }
    }
}
