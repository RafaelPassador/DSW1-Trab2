package br.ufscar.dc.dsw.service.spec;

import java.util.List;

import br.ufscar.dc.dsw.domain.Fotografia;

public interface IFotografiaService {
	Fotografia searchById(Long id);

	List<Fotografia> buscarTodos();

	void salvar(Fotografia fotografia);

	void excluir(Long id);
}
