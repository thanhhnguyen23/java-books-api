package com.thanhhnguyen23.spring.service;

public interface BookService {

	@Override
	public long save(Book book) {
		sessionFactory.getCurrentSession().saveOrUpdate(book);
		return book.getId();
	}

	@Override
	public Book get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> list() {
		List<Book> list = sessionFactory.getCurrentSession().createQuery("from Book").list();
		return list;
	}

	@Override
	public void update(long id, Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
	}

}
