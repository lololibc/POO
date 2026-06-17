package poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) throws BibliotecaException {
        Biblioteca biblioteca = new Biblioteca();

        Usuario fulano = new Usuario("fulano");
        biblioteca.usuarios.add(fulano);
        Usuario ciclano = new Usuario("ciclano");
        biblioteca.usuarios.add(ciclano);

        Livro biblia = new Livro("Biblia");
        biblioteca.livros.add(biblia);

        //TODO
        try {
            biblioteca.emprestar("Biblia", fulano);
        } catch (EmprestimoInvalidoException e){
            IO.println("Erro:" + e.getMessage());
        } catch (LivroInvalidoException e ){
            IO.println("Erro:" +e.getMessage());
        } catch (MaximoEmprestimosException e){
            IO.println("Erro:" +e.getMessage());
        }

    }
}
