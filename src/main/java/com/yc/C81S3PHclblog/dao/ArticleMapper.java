package com.yc.C81S3PHclblog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.yc.C81S3PHclblog.bean.Article;

public interface ArticleMapper {

	@Select("select * from article order by id desc")
	List<Article> selectNewArticle();

}
