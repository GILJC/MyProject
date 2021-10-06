from django.urls import path
from . import views
# .  <-  현재의(=notiecboard)

app_name = 'noticeboard'
urlpatterns = [
    path('', views.index, name='index'),  # 주소는 'index'라는 이름으로 됨
    #  views의 index란 함수를 호출
    path('write/', views.write_article, name='write_article'),  # / 추가
    # write_artice 라는 이름으로 만들 것
    # view 가서 def write_article(request) -> 만들어줘야 됨
    path('add/', views.add_article, name='add_article'),        #  / 추가
    path('<int:article_id>/', views.view_article, name='view'),
    # 요 슬래시/  자동으로 붙지만, 명시적으로 써줍시다.
    # 이러면 noticecode/id번호 가 됨
    # 넘어온 값을 article_id 에 담은 것
    # 다음엔 views.add_article을 만듭시다. -> views.py로 이동

    path('update/<int:article_id>/', views.update_article, name='update'),
    path('delete/<int:article_id>/', views.delete_article, name='delete'),
]
