package com.empresa.service;

import java.util.List;
import com.empresa.entity.Medicamento;

public interface MedicamentoService {

	public abstract Medicamento insertaMedicamento (Medicamento obj);
	
	public abstract List<Medicamento> listaMedicamento(); 
}

