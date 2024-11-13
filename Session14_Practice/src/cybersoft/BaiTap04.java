package cybersoft;

public class BaiTap04 {

	public static void main(String[] args) {
		
		/**
		 * Bài tập 4: Hệ thống quản lý sách trong thư viện (Library Book)
		 * - Mục tiêu: Sử dụng danh sách đối tượng và các thao tác đơn giản.
		 * - Yêu cầu:
		 * 		+ Tạo lớp Book với các thuộc tính: title (tựa sách), author (tác giả), và status (trạng thái sách: “có sẵn” hoặc “đã mượn”)
		 * 		+ Tạo phương thức borrow() để mượn sách (thay đổi trạng thái thành “đã mượn”) và return_book() để trả sách (đổi lại trạng thái “có sẵn”)
		 * 		+ Tạo lớp Library chứa danh sách các đối tượng Book. Thêm phương thức để hiển thị danh sách sách có sẵn và phương thức để mượn và trả sách
		 * 		+ Tạo một thư viện, thêm một số sách vào thư viện, thử mượn và trả sách, và hiển thị danh sách sách có sẵn
		 */
		
		Book book = new Book();
		book.setTitle("Doraemon tập 1");
		book.setAuthor("Fujiko Fujio");
		book.setStatus(true);

		Book book1 = new Book();
		book1.setTitle("Doraemon tập 2");
		book1.setAuthor("Fujiko Fujio");
		book1.setStatus(true);

		Book book2 = new Book();
		book2.setTitle("Doraemon tập 3");
		book2.setAuthor("Fujiko Fujio");
		book2.setStatus(true);

		Library library = new Library();
		library.getBooks().add(book);
		library.getBooks().add(book1);
		library.getBooks().add(book2);
		library.showBook();

		System.out.println();

		// Mượn sách
		for (Book item : library.getBooks()) {
			if (item.getTitle().equals("Doraemon tập 2")) {
				if (item.isStatus()) {
					item.borrow();
					break;
				} else {
					System.out.println("Sách này đã được mượn");
				}
			}
		}
		library.showBook();
	}

}
