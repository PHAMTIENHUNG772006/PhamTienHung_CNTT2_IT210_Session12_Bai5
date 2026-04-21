Spring Boot quản lý các cấu hình mặc định thông qua cơ chế “Default Properties” được định nghĩa sẵn trong framework
Danh sách đầy đủ các cấu hình này có thể tìm thấy trong tài liệu chính thức của Spring Boot tại phần Common Application Properties



Phần 1 – Kịch bản lỗi

1 Sai vị trí ảnh đại diện (Avatar)

Nếu ảnh không đặt trong src/main/resources/static/images, Spring Boot sẽ không thể phục vụ file tĩnh.

Kết quả: giao diện HTML hiển thị đường dẫn ảnh nhưng trình duyệt báo lỗi 404 (không tìm thấy).

2 Sai cấu hình Port hoặc Context Path

Nếu trong application.properties cấu hình server.port=8081 nhưng máy đã có ứng dụng khác chiếm port này → xung đột, ứng dụng không khởi động.

Nếu viết sai key (ví dụ: context.path=/med-manager thay vì server.servlet.context-path=/med-manager) → ứng dụng chạy nhưng không đúng URL, dẫn đến lỗi 404 khi truy cập.

3 Thiếu dependency trong build.gradle

Nếu quên thêm implementation 'org.springframework.boot:spring-boot-starter-web', ứng dụng sẽ không có khả năng chạy web server (Tomcat embedded).

Kết quả: không thể khởi động hoặc không có khả năng xử lý request HTTP.