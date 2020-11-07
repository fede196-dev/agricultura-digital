package ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.services;

import ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.mappers.VarUvaMapper;
import ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.domain.VarUva;
import ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.entities.VarUvaEntity;
import ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.repositories.VarUvaRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VarUvaService {
    @Autowired
    VarUvaRepositry varUvaRepositry;
    @Autowired
    VarUvaMapper varUvaMapper;

    public List<VarUva> findAll() {
        List<VarUvaEntity> varUvaEntities = varUvaRepositry.findAll();
        List<VarUva> varUvas = new ArrayList<>();

        varUvaEntities
                .forEach(
                        varUvaEntity ->
                                varUvas.add(varUvaMapper.mapVarUvaEntityToVarUva(varUvaEntity))
                );
        return varUvas;
    }

    public VarUva add (VarUva varUva){
        //Agregar Exepcion findByNombre
        VarUvaEntity varUvaEntity = varUvaMapper.mapVarUvaToVarUvaEntity(varUva);

        varUvaEntity = varUvaRepositry.save(varUvaEntity);

        varUva.setId_uva(varUvaEntity.getId_uva());

        return varUva;
    }

    public String delete(Long id){
        varUvaRepositry.deleteById(id);
        return "Deleted.";
    }

    public String edit(VarUva varUva) {
        Optional<VarUvaEntity> optionalVarUvaEntity = varUvaRepositry.findById(varUva.getId_uva());
        if (optionalVarUvaEntity.isPresent()) {
            VarUvaEntity editar= optionalVarUvaEntity.get();
            VarUvaEntity editado = new VarUvaEntity();

            editado.setId_uva(varUva.getId_uva());
            editado.setNom_uva(varUva.getNom_uva());
            editado.setDescripcion(varUva.getDescripcion());


                    if (editado.equals(editar)) {
                        return "No se efectuaron cambios en la variedad de Uva";
                    }
                    else {
                            varUvaRepositry.save(editado);
                            return "Datos de uva Actualizado";
                    }

        }
        else {
            return "Error, no se encuentra uva";

        }
    }

}
//    public VarUvaEntity add (VarUvaEntity varUvaEntity){
//
//        varUvaEntity = varUvaRepositry.save(varUvaEntity);
//
//        varUvaEntity.setId_uva(varUvaEntity.getId_uva());
//
//        return varUvaEntity;
//    }