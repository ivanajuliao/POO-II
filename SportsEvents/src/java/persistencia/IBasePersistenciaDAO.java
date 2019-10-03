/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;

/**
 *
 * @author Ivana
 */
public interface IBasePersistenciaDAO {
    
    public void criar(Object bean);
    public void atualizar(Object bean);
    public void deletar(int id);
    public Object exibirPorID(int id);
    public List<Object> exibirTodos();
    
}
