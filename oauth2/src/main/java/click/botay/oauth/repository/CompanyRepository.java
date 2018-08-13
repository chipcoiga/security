package click.botay.oauth.repository;

import click.botay.oauth.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by locle on 13/08/2018.
 */
public interface CompanyRepository extends JpaRepository<Company, Long>{
}
