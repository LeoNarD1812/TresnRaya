/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.ter.dao;

import java.util.List;
import pe.edu.upeu.ter.modelo.ResultadoTO;

public interface ResultadoDaoI {
    
    public List<ResultadoTO> listarResultados();
    public int crearResultado(ResultadoTO re);
    public int actualizarResultado(ResultadoTO re);
    public void borrarTodosLosResultados();
}
