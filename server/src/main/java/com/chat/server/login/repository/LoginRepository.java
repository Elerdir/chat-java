package com.chat.server.login.repository;

import com.chat.server.login.model.LoginEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class LoginRepository implements JpaRepository<LoginEntity, String> {
    @Override
    public List<LoginEntity> findAll() {
        return null;
    }

    @Override
    public List<LoginEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<LoginEntity> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<LoginEntity> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(LoginEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends LoginEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends LoginEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends LoginEntity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<LoginEntity> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends LoginEntity> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends LoginEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<LoginEntity> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    /**
     * @param s
     * @deprecated
     */
    @Override
    public LoginEntity getOne(String s) {
        return null;
    }

    /**
     * @param s
     * @deprecated
     */
    @Override
    public LoginEntity getById(String s) {
        return null;
    }

    @Override
    public LoginEntity getReferenceById(String s) {
        return null;
    }

    @Override
    public <S extends LoginEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends LoginEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends LoginEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends LoginEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends LoginEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends LoginEntity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends LoginEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
