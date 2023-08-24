package com.example.tlshelper.utils;

public class Constant {
    public static String HOST_NAME = "https://hotrosinhvienthuyloi.edu.vn";

    public static String JSON_HCM_DISTRICT_TO_WARDS = "{\"Quận 1\":[\"Bến Nghé\",\"Bến Thành\",\"Cô Giang\",\" Cầu Kho\",\"Cầu Ông Lãnh\",\"Đa Kao\",\"Nguyễn Cư Trinh\",\"Nguyễn Thái Bình\",\"Phạm Ngũ Lão\",\"Tân Định\"],\"Quận 3\":[\"1\",\"2\",\"3\",\"4\",\"5\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"Võ Thị Sáu\"],\"Quận 4\":[\"1\",\"2\",\"3\",\"4\",\"6\",\"8\",\"9\",\"10\",\"13\",\"14\",\"15\",\"16\",\"18\"],\"Quận 5\":[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\"],\"Quận 6\":[1,2,3,4,5,6,7,8,9,10,11,12,13,14],\"Quận 7\":[\"Bình Thuận\",\"Phú Mỹ\",\"Phú Thuận\",\"Tân Hưng\",\"Tân Kiểng\",\"Tân Phong\",\"Tân Phú\",\"Tân Quy\",\"Tân Thuận Đông\",\"Tân Thuận Tây\"],\"Quận 8\":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16],\"Quận 10\":[1,2,4,5,6,7,8,9,10,11,12,13,14,15],\"Quận 11\":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16],\"Quận 12\":[\"An Phú Đông\",\"Đông Hưng Thuận\",\"Hiệp Thành\",\"Tân Chánh Hiệp\",\"Tân Hưng Thuận\",\"Tân Thới Hiệp\",\"Tân Thới Nhất\",\"Thạnh Lộc\",\"Thạnh Xuân\",\"Thới An\",\"Trung Mỹ Tây\"],\"Bình Tân\":[\"An Lạc\",\"An Lạc A\",\"Bình Hưng Hòa\",\"Bình Hưng Hòa A\",\"Bình Hưng Hòa B\",\"Bình Trị Đông\",\"Bình Trị Đông A\",\"Bình Trị Đông B\",\"Tân Tạo\",\"Tân Tạo A\"],\"Bình Thạnh\":[1,2,3,5,6,7,11,12,13,14,15,17,19,21,22,24,25,26,27,28],\"Gò Vấp\":[1,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17],\"Phú Nhuận\":[1,2,3,4,5,7,8,9,10,11,13,15,17],\"Tân Bình\":[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15],\"Tân Phú\":[\"Hiệp Tân\",\"Hòa Thạnh\",\"Phú Thạnh\",\"Phú Thọ Hòa\",\"Phú Trung\",\"Sơn Kỳ\",\"Tân Quý\",\"Tân Sơn Nhì\",\"Tân Thành\",\"Tân Thới Hòa\",\"Tây Thạnh\"],\"Thủ Đức\":[\"An Khánh\",\"An Lợi Đông\",\"An Phú\",\"Bình Chiểu\",\"Bình Thọ\",\"Bình Trưng Đông\",\"Bình Trưng Tây\",\"Cát Lái\",\"Hiệp Bình Chánh\",\"Hiệp Bình Phước\",\"Hiệp Phú\",\"Linh Chiểu\",\"Linh Đông\",\"Linh Tây\",\"Linh Trung\",\"Linh Xuân\",\"Long Bình\",\"Long Phước\",\"Long Thạnh Mỹ\",\"Long Trường\",\"Phú Hữu\",\"Phước Bình\",\"Phước Long A\",\"Phước Long B\",\"Tam Bình\",\"Tam Phú\",\"Tân Phú\",\"Tăng Nhơn Phú A\",\"Tăng Nhơn Phú B\",\"Thạnh Mỹ Lợi\",\"Thảo Điền\",\"Thủ Thiêm\",\"Trường Thạnh\",\"Trường Thọ\"],\"Bình Chánh\":[\"Tân Túc\",\"An Phú Tây\",\"Bình Chánh\",\"Bình Hưng\",\"Bình Lợi\",\"Đa Phước\",\"Hưng Long\",\"Lê Minh Xuân\",\"Phạm Văn Hai\",\"Phong Phú\",\"Qui Đức\",\"Tân Kiên\",\"Tân Nhựt\",\"Tân Quý Tây\",\"Vĩnh Lộc A\",\"Vĩnh Lộc B\"],\"Cần Giờ\":[\"Cần Thạnh\",\"An Thới Đông\",\"Bình Khánh\",\"Long Hòa\",\"Lý Nhơn\",\"Tam Thôn Hiệp\",\"Thạnh An\"],\"Củ Chi\":[\"Củ Chi\",\"An Nhơn Tây\",\"An Phú\",\"Bình Mỹ\",\"Hòa Phú\",\"Nhuận Đức\",\"Phạm Văn Cội\",\"Phú Hòa Đông\",\"Phú Mỹ Hưng\",\"Phước Hiệp\",\"Phước Thạnh\",\"Phước Vĩnh An\",\"Tân An Hội\",\"Tân Phú Trung\",\"Tân Thạnh Đông\",\"Tân Thạnh Tây\",\"Tân Thông Hội\",\"Thái Mỹ\",\"Trung An\",\"Trung Lập Hạ\",\"Trung Lập Thượng\"],\"Hóc Môn\":[\"Hóc Môn\",\"Bà Điểm\",\"Đông Thạnh\",\"Nhị Bình\",\"Tân Hiệp\",\"Tân Thới Nhì\",\"Tân Xuân\",\"Thới Tam Thôn\",\"Trung Chánh\",\"Xuân Thới Đông\",\"Xuân Thới Sơn\",\"Xuân Thới Thượng\"],\"Nhà Bè\":[\"Nhà Bè\",\"Hiệp Phước\",\"Long Thới\",\"Nhơn Đức\",\"Phú Xuân\",\"Phước Kiển\",\"Phước Lộc\"]}";

}
