package br.com.erudio.converter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.erudio.converter.mocks.MockBook;
import br.com.erudio.data.model.Book;
import br.com.erudio.data.vo.v1.BookVO;

public class DozerConverterTest2 {
	MockBook inputObject;

    @Before
    public void setUp() {
        inputObject = new MockBook();
    }

    @Test
    public void parseEntityToVOTest() {
        BookVO output = DozerConverter.parseObject(inputObject.mockEntity(), BookVO.class);
        Assert.assertEquals(Long.valueOf(0L), output.getKey());
        Assert.assertEquals("Author Test0", output.getAuthor());
        Assert.assertEquals("Title Test0", output.getTitle());
        Assert.assertEquals(new BigDecimal(49.00), output.getPrice());
        Assert.assertEquals(new Date(), output.getLaunch_date());
    }

    @Test
    public void parseEntityListToVOListTest() {
        List<BookVO> outputList = DozerConverter.parseListObjects(inputObject.mockEntityList(), BookVO.class);
        BookVO outputZero = outputList.get(0);
        
        Assert.assertEquals(Long.valueOf(0L), outputZero.getKey());
        Assert.assertEquals("Author Test0", outputZero.getAuthor());
        Assert.assertEquals("Title Test0", outputZero.getTitle());
        Assert.assertEquals(new BigDecimal(49.00), outputZero.getPrice());
        Assert.assertEquals(new Date(), outputZero.getLaunch_date());
        
        BookVO outputSeven = outputList.get(7);
        
        Assert.assertEquals(Long.valueOf(7L), outputSeven.getKey());
        Assert.assertEquals("Author Test7", outputSeven.getAuthor());
        Assert.assertEquals("Title Test7", outputSeven.getTitle());
        Assert.assertEquals(new BigDecimal(49.00), outputSeven.getPrice());
        Assert.assertEquals(new Date(), outputSeven.getLaunch_date());
        
        BookVO outputTwelve = outputList.get(12);
        
        Assert.assertEquals(Long.valueOf(12L), outputTwelve.getKey());
        Assert.assertEquals("Author Test12", outputTwelve.getAuthor());
        Assert.assertEquals("Title Test12", outputTwelve.getTitle());
        Assert.assertEquals(new BigDecimal(49.00), outputTwelve.getPrice());
        Assert.assertEquals(new Date(), outputTwelve.getLaunch_date());
    }

    @Test
    public void parseVOToEntityTest() {
        Book output = DozerConverter.parseObject(inputObject.mockVO(), Book.class);
        Assert.assertEquals(Long.valueOf(0L), output.getId());
        Assert.assertEquals("Author Test0", output.getAuthor());
        Assert.assertEquals("Title Test0", output.getTitle());
        Assert.assertEquals(new BigDecimal(49.00), output.getPrice());
        Assert.assertEquals(new Date(), output.getLaunch_date());
    }

    @Test
    public void parserVOListToEntityListTest() {
    	 List<Book> outputList = DozerConverter.parseListObjects(inputObject.mockEntityList(), Book.class);
         Book outputZero = outputList.get(0);
         
         Assert.assertEquals(Long.valueOf(0L), outputZero.getId());
         Assert.assertEquals("Author Test0", outputZero.getAuthor());
         Assert.assertEquals("Title Test0", outputZero.getTitle());
         Assert.assertEquals(new BigDecimal(49.00), outputZero.getPrice());
         Assert.assertEquals(new Date(), outputZero.getLaunch_date());
         
         Book outputSeven = outputList.get(7);
         
         Assert.assertEquals(Long.valueOf(7L), outputSeven.getId());
         Assert.assertEquals("Author Test7", outputSeven.getAuthor());
         Assert.assertEquals("Title Test7", outputSeven.getTitle());
         Assert.assertEquals(new BigDecimal(49.00), outputSeven.getPrice());
         Assert.assertEquals(new Date(), outputSeven.getLaunch_date());
         
         Book outputTwelve = outputList.get(12);
         
         Assert.assertEquals(Long.valueOf(12L), outputTwelve.getId());
         Assert.assertEquals("Author Test12", outputTwelve.getAuthor());
         Assert.assertEquals("Title Test12", outputTwelve.getTitle());
         Assert.assertEquals(new BigDecimal(49.00), outputTwelve.getPrice());
         Assert.assertEquals(new Date(), outputTwelve.getLaunch_date());
    }
}
