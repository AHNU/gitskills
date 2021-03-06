package com.service;

import java.util.List;

import com.entity.News;

public interface NewsService {
	public List<News> findNewsList(News news) throws Exception;

	public List<News> findNewsListByPage(News news,Integer page,Integer n) throws Exception; //找出该页新闻
	
	public List<News> findhotNewsList(News news) throws Exception;

	public List<News> findhot7NewsList(News news) throws Exception;

	public List<News> findhot30NewsList(News news) throws Exception;

	public List<News> findSort2NewsList(News news) throws Exception;

	public List<News> findSort7NewsList(News news) throws Exception;
	
	public List<News> findSortNewsList(News news) throws Exception;

	public News findNewsById(Integer id) throws Exception;

	public void edit_do(News news) throws Exception;

	public void delete_do(Integer id) throws Exception;

	public void add_do(News news) throws Exception;
	
	public byte[] getNewsPic(Integer id) throws Exception; //根据id获取封面图片信息

}
