package pl.hordyjewicz.stuffgiveaway.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.hordyjewicz.stuffgiveaway.repository.StuffRepository;


@Service
@Transactional
public class StuffService
{
    @Autowired
    private StuffRepository stuffRepository;

}
