Самостоятельная разработка мобильного приложения "Memories". Версия для Android (Java).

Приложение позволяет сохранять самые яркие моменты в жизни, к которым можно добавлять описание и фотографию.
Реализован один унифицированный xml layout, который используется для динамического добавления Fragments с разным контентом, в зависимости от действий пользователя.
Стартовый файл, определенный в файле-манифесте, добавляет на экран пользователя RecyclerView виджет, который определен в одном из Фрагментов.
Каждая ячейка кликабельна и в случае выбора инициирует переход от текущего Фрагмента к новому Фрагменту с детальным описанием, где можно увидеть дату события, фото и описание.
