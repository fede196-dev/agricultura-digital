package ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.mappers;

import ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.domain.VarUva;
import ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.entities.VarUvaEntity;
import org.springframework.stereotype.Component;

@Component
public class VarUvaMapper {


    public VarUva mapVarUvaEntityToVarUva(VarUvaEntity varUvaEntityEntity){
        VarUva varUva = new VarUva();
        varUva.setId_uva(varUvaEntityEntity.getId_uva());
        varUva.setNom_uva(varUvaEntityEntity.getNom_uva());
        varUva.setDescripcion(varUvaEntityEntity.getDescripcion());
        return varUva;
    }

    public VarUvaEntity mapVarUvaToVarUvaEntity(VarUva varUva){
        return new VarUvaEntity(varUva.getId_uva(),varUva.getNom_uva(),varUva.getDescripcion());
    }

}
