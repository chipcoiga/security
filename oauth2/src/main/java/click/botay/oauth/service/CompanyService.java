package click.botay.oauth.service;

import click.botay.oauth.domain.Company;

import java.util.List;

/**
 * Created by locle on 13/08/2018.
 */
public interface CompanyService {
    List<Company> getAll();

    Company get(Long id);
}
