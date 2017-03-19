package com.company.Lesson_38_Binary_search.Task_01;

import com.company.Lesson_38_Binary_search.Task_01.Common.BmpReader;
import com.company.Lesson_38_Binary_search.Task_01.Common.JpgReader;
import com.company.Lesson_38_Binary_search.Task_01.Common.PngReader;

/**
 * Created by Pc on 05.02.2017.
 *//* Factory method pattern
1. Создай enum класс ImageReader с списоком доступных форматов BMP, JPG, PNG;
1. Создай интерфейс-маркер ImageReader
2. В отдельных файлах в пакете common создай классы JpgReader, PngReader, BmpReader,
которые реализуют интерфейс ImageReader.
3. Создай класс ImageReaderFactory с одним методом.
3.1. Подумай, как он должен называться.
3.2. Подумай, какие модификаторы должны быть у этого метода.
4. Этот метод должен:
4.1. для каждого значения из ImageTypes возвращать соответствующий Reader, например, для ImageTypes.JPG - JpgReader;
4.2. если передан неправильный параметр, то выбросить исключение IllegalArgumentException("Неизвестный тип картинки").
5. Реализовать метод main. Запустить программу.
*/
public class ImageReaderFactory {
    public static ImageReaders getReader(ImageReader types){
        if (ImageReader.BMP == types){
            return new BmpReader();
        }else if(ImageReader.JPG == types){
            return new JpgReader();
        }else if (ImageReader.PNG == types){
            return new PngReader();
        }else throw new IllegalArgumentException("Неизвестный тип картинки");
    }}

