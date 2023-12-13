package edu.tareas.listatareas.dao.services;

import edu.tareas.listatareas.models.model.ListadoNota;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IListadoNotasServicesImpl {

    public List<ListadoNota> findAll();
    public Page<ListadoNota> findAll(Pageable pageable);
    public ListadoNota findById(String id_listado);
    public ListadoNota save(ListadoNota listadoNota);
    public void detele (ListadoNota listadoNota);
    public List<ListadoNota> findListaByTermino (String termino);



}
