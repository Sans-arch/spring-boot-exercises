package fleitas.santiago.exerciciossb.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import fleitas.santiago.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {
	
	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
}
