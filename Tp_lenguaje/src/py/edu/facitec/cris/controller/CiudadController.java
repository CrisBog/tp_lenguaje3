/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.cris.controller;

import java.util.Vector;
import py.edu.facitec.cris.model.Ciudad;

/**
 *
 * @author Cristina
 * 
 */
public interface CiudadController {
    void registrarCiudad(Ciudad ciudad);
    Vector<Ciudad>cargarCombo();
    boolean modificarCiudad(Ciudad ciudad);
    Ciudad buscarCiudadPorCodigo(int codigo);
    void eliminarCiudad(int codigo);
}
