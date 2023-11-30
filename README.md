# www_lab_week_02

1) Tạo file persistence.xml để cấu hình kết nối với cơ sở dữ liệu.
2) Phần backend:
   - Models: Các lớp entity sử dụng các annotation như (@Table, @Entity, @ID, @Column, @OneToMany, @ManyToOne,...) để thiết kế và ánh xạ qua csdl theo yêu cầu đề bài.
   - Enums: Các trường như EmployeeStatus, hay EnumProduct được lưu dưới dạng enum với các thuộc tính như là ACTIVE, IN_ACTIVE, TERMINATED.
   - Repositories: Tạo các lớp repository chứa các kết nối với cơ sở dữ liệu thông qua file persistence.xml, khởi tạo các transaction, thực hiện CRUD đơn giản như insert, update, delete, find, getALL.
   - Services: Tạo các lớp service để thực hiện việc xử lý logic và tương tác với phần frontend. Trong bài làm thì em có phương thức đặc biệt như là
       + deletePro(long id), em sẽ thực hiện tìm kiếm Optional<Product> op= productRepository.findbyId(id). Nếu có tồn tại thì em set status thành terminated.
3) Phần frontend:
   - Có controllers để xử lý các luồng.
   - danh_sach_sp.jsp: lấy hết các product có trạng thái khác Terminated, trong đó có Update, ADD và Delete (delete em sẽ đổi trạng thái thành terminated nên sẽ không hiện lên danh sách nữa)
   - Update và add thì em thực hiện như bình thường. Load các trang cap_nhat_sanpham.jsp, them_san_pham.jsp để thực hiện.
