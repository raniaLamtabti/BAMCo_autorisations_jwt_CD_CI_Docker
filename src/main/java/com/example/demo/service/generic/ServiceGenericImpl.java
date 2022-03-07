package com.example.demo.service.generic;

import com.example.demo.repository.generic.GenericRepository;
import com.example.demo.repository.generic.GenericRepositoryImpl;
import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ServiceGenericImpl<T,D> implements ServiceGeneric<T,D> {

    @Autowired(required=true)
    private GenericRepository<T> genericRepository;
    private ModelMapper mapper = new ModelMapper();

    private final Class<T> entityClass;
    private final Class<D> dtoClass;

    public ServiceGenericImpl( Class<T> entityClass, Class<D> dtoClass) {
        this.entityClass = entityClass;
        this.dtoClass = dtoClass;

    }

    @SuppressWarnings("unchecked")
    private Class<T> getEntityClass() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass())
                .getActualTypeArguments()[0];
    }


    @Override
    public List<D> findAll() throws Exception {
        try {
            List<T> entities = genericRepository.findAll();
            return entities.stream().map(entity -> (D) mapper.map(entity, dtoClass)).collect(Collectors.toList());
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public D findById(Long id) throws Exception {
        try {
            Optional<T> entity = genericRepository.findById(id);
            return entity.map(entity1 -> (D) mapper.map(entity1, dtoClass)).orElse(null);

        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public D save(D entity) throws Exception {
        try {
            mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT).setPropertyCondition(Conditions.isNotNull());
            T entity1 = mapper.map(entity, getEntityClass());
            return mapper.map(genericRepository.save(entity1), dtoClass);

        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public D update(D entity) throws Exception {
        try {
            mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT).setPropertyCondition(Conditions.isNotNull());
            T entity1 = mapper.map(entity, getEntityClass());
            return mapper.map(genericRepository.save(entity1), dtoClass);

        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void delete(Long id) throws Exception {
        try {
            genericRepository.deleteById(id);
        } catch (Exception e) {
            throw e;
        }

    }
}
