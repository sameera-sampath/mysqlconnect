package com.example.demo.model;

import com.example.demo.DataSourceConfiguration;
import com.example.demo.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DemoApplication.class, DataSourceConfiguration.class})
public class ProductMapperTest {
    @Autowired
    ProductMapper articleMapper;

    @Test
    public void whenRecordsInDatabase_shouldReturnArticleWithGivenId() {
        Product article = articleMapper.getProduct(1L);

        assertThat(article).isNotNull();
        assertThat(article.getId()).isEqualTo(1L);
        assertThat(article.getName()).isEqualTo("iPhone X");
        assertThat(article.getPrice()).isEqualTo(999.99f);
    }
}
