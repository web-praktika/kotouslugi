package ru.praktika.kotouslugi.util;

import ru.praktika.kotouslugi.exception.ServiceException;

@FunctionalInterface
public interface FunctionSE<T>  {
    T apply(T t) throws ServiceException;
}

