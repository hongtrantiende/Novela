# Nhật ký công việc (Work Log)

## [2026-06-21] Cải thiện Caching và Hiệu ứng Chuyển Cảnh

### 1. Tắt hiệu ứng nhảy/bay ảnh bìa khi mở chi tiết truyện
- **Tập tin chỉnh sửa**: [MainNavGraph.kt](file:///c:/Users/ACER/Desktop/Nam/apk%20legado/apk-thienthucac/app/src/main/java/io/legado/app/ui/main/MainNavGraph.kt#L584)
- **Chi tiết**: Thay đổi `sharedCoverKey = null` cho màn hình `BookInfoRouteScreen`. Điều này loại bỏ hoàn toàn hiệu ứng chuyển tiếp shared-element khiến ảnh bìa bay lên từ tọa độ dưới màn hình. Thay vào đó, ảnh bìa hiển thị tại chỗ và áp dụng hiệu ứng mờ dần/fade-in (crossfade) mượt mà của thư viện Coil.

### 2. Lưu trữ (Cache) dữ liệu khám phá của tiện ích
- **Tập tin mới**: [ExploreShowCache.kt](file:///c:/Users/ACER/Desktop/Nam/apk%20legado/apk-thienthucac/app/src/main/java/io/legado/app/ui/book/explore/ExploreShowCache.kt)
- **Tập tin chỉnh sửa**: [ExploreShowViewModel.kt](file:///c:/Users/ACER/Desktop/Nam/apk%20legado/apk-thienthucac/app/src/main/java/io/legado/app/ui/book/explore/ExploreShowViewModel.kt)
- **Chi tiết**: Tạo cache bộ nhớ trong (LRU Cache) cho danh sách truyện đã load trong tab khám phá của tiện ích theo cấu trúc `sourceUrl##exploreUrl`. Khi người dùng back ra và click vào lại, dữ liệu và vị trí cuộn trang được phục hồi tức thì mà không cần load lại từ đầu. Kéo xuống để refresh (pull-to-refresh) sẽ xóa cache cũ để tải dữ liệu mới từ mạng.

### 3. Lưu trữ (Cache) chi tiết truyện và danh sách chương (TOC)
- **Tập tin mới**: [BookInfoCache.kt](file:///c:/Users/ACER/Desktop/Nam/apk%20legado/apk-thienthucac/app/src/main/java/io/legado/app/ui/book/info/BookInfoCache.kt)
- **Tập tin chỉnh sửa**: [BookInfoViewModel.kt](file:///c:/Users/ACER/Desktop/Nam/apk%20legado/apk-thienthucac/app/src/main/java/io/legado/app/ui/book/info/BookInfoViewModel.kt)
- **Chi tiết**: Tạo cache bộ nhớ trong lưu thông tin truyện, danh sách chương, nguồn và nhãn thể loại. Khi click vào truyện, dữ liệu được hiển thị ngay lập tức. Khi người dùng thực hiện thao tác Refresh trên màn hình truyện, cache sẽ được giải phóng để lấy dữ liệu mới từ nguồn.

### 4. Lưu trữ (Cache) danh sách trong kho tiện ích (Extensions)
- **Tập tin mới**: [ExtensionCache.kt](file:///c:/Users/ACER/Desktop/Nam/apk%20legado/apk-thienthucac/app/src/main/java/io/legado/app/vbookextension/ui/ExtensionCache.kt)
- **Tập tin chỉnh sửa**: 
  - [ExtensionViewModel.kt](file:///c:/Users/ACER/Desktop/Nam/apk%20legado/apk-thienthucac/app/src/main/java/io/legado/app/vbookextension/ui/ExtensionViewModel.kt)
  - [ExtensionScreens.kt](file:///c:/Users/ACER/Desktop/Nam/apk%20legado/apk-thienthucac/app/src/main/java/io/legado/app/vbookextension/ui/ExtensionScreens.kt)
- **Chi tiết**: Lưu trữ danh sách tiện ích tìm được trong kho để ngăn chặn việc gọi API/quét repo mỗi khi mở tab Tiện ích. Thao tác click nút Refresh hoặc sửa đổi/thêm repo mới sẽ buộc hệ thống làm mới (force = true) để đồng bộ.

## [2026-06-22] Sửa lỗi nháy ảnh bìa mặc định và loại bỏ hiệu ứng chữ

### 1. Sửa lỗi nhấp nháy ảnh bìa mặc định (Default Cover) khi mở truyện
- **Tập tin chỉnh sửa**: [CoilBookCover.kt](file:///c:/Users/ACER/Desktop/Nam/apk%20legado/apk-thienthucac/app/src/main/java/io/legado/app/ui/widget/components/image/cover/CoilBookCover.kt)
- **Chi tiết**: Thêm độ trễ 150ms (`delay(150)`) trước khi hiển thị ảnh bìa mặc định (Book icon/CoverTextOverlay). Đối với các ảnh bìa đã có trong cache bộ nhớ của Coil, thời gian load thực tế chỉ mất vài mili-giây, do đó ảnh bìa chính sẽ được vẽ ngay lập tức mà không bao giờ kích hoạt hiển thị ảnh bìa mặc định bên dưới, giúp loại bỏ hoàn toàn hiện tượng chớp tắt gây khó chịu.

### 2. Loại bỏ hiệu ứng chữ nhảy (sliding text) cho tiêu đề truyện, tác giả, nguồn
- **Tập tin chỉnh sửa**: [BookInfoScreen.kt](file:///c:/Users/ACER/Desktop/Nam/apk%20legado/apk-thienthucac/app/src/main/java/io/legado/app/ui/book/info/BookInfoScreen.kt)
- **Chi tiết**: Thay thế `AnimatedTextLine` bằng `AppText` tiêu chuẩn cho các nhãn Tên truyện (`translatedBookName`), Tên tác giả (`translatedAuthor`), và Tên nguồn (`book.originName`). Chữ sẽ được hiển thị cố định ngay lập tức khi mở màn hình chi tiết truyện thay vì trượt từ dưới lên như trước.

## [2026-06-22] Đồng bộ màu thanh công cụ với nền ứng dụng

### 1. Đồng bộ màu nền thanh top bar với nền chính của ứng dụng khi cuộn
- **Tập tin chỉnh sửa**: [GlassMediumFlexibleTopAppBar.kt](file:///c:/Users/ACER/Desktop/Nam/apk%20legado/apk-thienthucac/app/src/main/java/io/legado/app/ui/widget/components/topbar/GlassMediumFlexibleTopAppBar.kt)
- **Chi tiết**: Thay thế màu nền cơ bản `MaterialTheme.colorScheme.surface` (màu xám nhạt hơn) bằng `LegadoTheme.colorScheme.background` (màu nền chính của app, thường là màu đen tuyền/pure black) trong các hàm `glassColors()`, `containerColor()`, và `scrolledContainerColor()` của `GlassTopAppBarDefaults`. Việc này giúp thanh top bar hoàn toàn đồng bộ màu sắc với nền màn hình chính, loại bỏ dải màu xám lệch tông xuất hiện khi cuộn danh sách lên.

### 2. Tăng kích thước ảnh bìa và thu hẹp khoảng cách các truyện trong tủ sách (bố cục lưới 3 truyện)
- **Tập tin chỉnh sửa**:
  - [BookItem.kt](file:///c:/Users/ACER/Desktop/Nam/apk%20legado/apk-thienthucac/app/src/main/java/io/legado/app/ui/main/bookshelf/BookItem.kt)
  - [BookshelfScreen.kt](file:///c:/Users/ACER/Desktop/Nam/apk%20legado/apk-thienthucac/app/src/main/java/io/legado/app/ui/main/bookshelf/BookshelfScreen.kt)
- **Chi tiết**:
  - Trong `BookItem.kt`, thay thế `.width(coverWidth.dp)` cố định của cột truyện ở chế độ lưới bằng `.fillMaxWidth()` để truyện tự động co giãn hết chiều rộng ô lưới, đồng thời thu nhỏ padding của Box ảnh bìa từ `4.dp` xuống `horizontal = 2.dp, vertical = 4.dp`.
  - Trong `BookshelfScreen.kt`, thu hẹp khoảng cách lưới (`horizontalArrangement` và `verticalArrangement`) từ `8.dp` xuống `4.dp`, và giảm lề ngang `horizontal` của lưới từ `8.dp` xuống `4.dp`.
  - Điều này giúp ảnh bìa truyện to ra tối đa, sắp xếp 3 truyện khít sát nhau và nổi bật hơn trên màn hình tủ sách.

### 3. Xóa bỏ hoàn toàn overlay/thanh mờ phía trên ở màn hình chi tiết truyện (kể cả khi cuộn)
- **Tập tin chỉnh sửa**: [BookInfoScreen.kt](file:///c:/Users/ACER/Desktop/Nam/apk%20legado/apk-thienthucac/app/src/main/java/io/legado/app/ui/book/info/BookInfoScreen.kt)
- **Chi tiết**: Cập nhật `BookInfoTransparentTopAppBar` thành luôn sử dụng màu nền trong suốt (`Color.Transparent`) và không áp dụng hiệu ứng mờ/haze ở bất kỳ trạng thái cuộn nào. Điều này loại bỏ hoàn toàn thanh top bar, giữ cho giao diện luôn đẹp và liền mạch kể cả khi vuốt lên cuộn trang.

### 4. Tích hợp kính lúp tìm kiếm nội bộ cho Tiện ích (Extension Local Search)
- **Tập tin chỉnh sửa**:
  - [ExploreShowContract.kt](file:///c:/Users/ACER/Desktop/Nam/apk%20legado/apk-thienthucac/app/src/main/java/io/legado/app/ui/book/explore/ExploreShowContract.kt)
  - [ExploreShowViewModel.kt](file:///c:/Users/ACER/Desktop/Nam/apk%20legado/apk-thienthucac/app/src/main/java/io/legado/app/ui/book/explore/ExploreShowViewModel.kt)
  - [ExploreShowScreen.kt](file:///c:/Users/ACER/Desktop/Nam/apk%20legado/apk-thienthucac/app/src/main/java/io/legado/app/ui/book/explore/ExploreShowScreen.kt)
- **Chi tiết**:
  - Tự động kiểm tra xem tiện ích hiện tại có chứa kịch bản tìm kiếm (`search` script trong `plugin.json`) hay không.
  - Hiển thị nút kính lúp trên thanh công cụ của màn hình Khám phá khi tiện ích hỗ trợ tìm kiếm.
  - Khi click vào kính lúp, ứng dụng sẽ chuyển đổi sang chế độ tìm kiếm nội bộ (`isSearchMode = true`), hiển thị một thanh `SearchBar` tích hợp ngay bên dưới thanh top bar.
  - Người dùng gõ từ khóa và tìm kiếm trực tiếp, ứng dụng sẽ thực thi kịch bản tìm kiếm của tiện ích (`ExtensionRepository.searchBooks()`) thay vì mở màn hình tìm kiếm toàn cục, hỗ trợ phân trang và tải thêm đầy đủ. Nhấn phím Back hoặc nút đóng sẽ thoát chế độ tìm kiếm và quay lại giao diện phân loại.

### 5. Khắc phục lỗi hiển thị lại WebView Captcha liên tục (kể cả khi đã bấm tích V hoặc không có captcha)
- **Tập tin chỉnh sửa**:
  - [JSFetchFunction.kt](file:///c:/Users/ACER/Desktop/Nam/apk%20legado/apk-thienthucac/app/src/main/java/io/legado/app/vbookextension/runtime/api/JSFetchFunction.kt)
- **Chi tiết**:
  - **Kiểm tra nội dung HTML thực tế**: Thay vì chỉ kiểm tra mã phản hồi 403/503 cùng với header `Server: cloudflare` (vốn dễ gây nhận diện nhầm khi tiện ích lỗi kịch bản hoặc trang API gặp lỗi thông thường không có captcha), ứng dụng hiện chỉ kích hoạt WebView xác minh khi HTML body chứa các dấu hiệu của thử thách Cloudflare thực tế như `cf-challenge`, `window._cf_chl_opt`, `Just a moment...`, `challenge-running`, `cf_challenge`, hoặc `cdn-cgi/challenge-platform`.
  - **Tăng thời gian chờ (Cooldown) lên 5 phút**: Sau khi người dùng giải captcha thành công hoặc bấm nút dấu tích (V) để lưu/bỏ qua, thời gian chờ kích hoạt WebView mới của tiện ích đó được kéo dài lên **5 phút** (300,000 ms) thay vì 15 giây. Điều này đảm bảo giao diện WebView không bị bật lên liên tục làm phiền người dùng khi tiện ích xảy ra lỗi tải truyện liên tục.

### 6. Cấu hình mặc định điều khiển cảm ứng màn hình chỉ kích hoạt Menu ở giữa
- **Tập tin chỉnh sửa**:
  - [ReadMangaConfig.kt](file:///c:/Users/ACER/Desktop/Nam/apk%20legado/apk-thienthucac/app/src/main/java/io/legado/app/ui/config/readMangaConfig/ReadMangaConfig.kt)
  - [ReadMenuConfig.kt](file:///c:/Users/ACER/Desktop/Nam/apk%20legado/apk-thienthucac/app/src/main/java/io/legado/app/ui/config/readConfig/ReadMenuConfig.kt)
  - [ReadSettingsRepository.kt](file:///c:/Users/ACER/Desktop/Nam/apk%20legado/apk-thienthucac/app/src/main/java/io/legado/app/data/repository/ReadSettingsRepository.kt)
  - [AppConfig.kt](file:///c:/Users/ACER/Desktop/Nam/apk%20legado/apk-thienthucac/app/src/main/java/io/legado/app/help/config/AppConfig.kt)
- **Chi tiết**:
  - Đặt cấu hình mặc định (default/fallback values) cho toàn bộ các vùng cảm ứng bên ngoài (TL, TC, TR, ML, MR, BL, BC, BR) về giá trị `-1` (Không có/Non-action) cho cả trình đọc truyện chữ (Novel Reader) và truyện tranh (Manga Reader).
  - Chỉ giữ lại vùng chính giữa (MC) có hành vi mở Menu (`0`), giúp giao diện đọc sạch sẽ và không bị phản hồi nhầm khi chạm vào các cạnh màn hình.

### 7. Tối ưu hóa cấu hình R8 và Ký số tự động cho bản build Release chính thức
- **Tập tin chỉnh sửa**:
  - [proguard-rules.pro](file:///c:/Users/ACER/Desktop/Nam/apk%20legado/apk-thienthucac/app/proguard-rules.pro)
  - [build.gradle.kts](file:///c:/Users/ACER/Desktop/Nam/apk%20legado/apk-thienthucac/app/build.gradle.kts)
- **Chi tiết**:
  - Thêm cấu hình `-keep class io.legado.app.vbookextension.** { *; }` vào Proguard Rules của ứng dụng. Việc này ngăn chặn R8 tối ưu hóa hoặc làm biến đổi tên các class/method nằm trong package cầu nối Extension JS (chạy Rhino/WebView), giữ cho các tiện ích truyện hoạt động ổn định và chính xác trên bản build Release chính thức.
  - Cấu hình cho phép tự động ký số bằng key `debug` cho bản build Release nếu không chỉ định keystore chính thức, giúp APK sinh ra được ký số hợp lệ và sẵn sàng để cài đặt trực tiếp.
