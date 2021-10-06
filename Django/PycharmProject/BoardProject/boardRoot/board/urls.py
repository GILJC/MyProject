"""board URL Configuration

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/3.2/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  path('', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.urls import include, path
    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
"""
from django.contrib import admin
from django.urls import path, include
# 위에 , include 추가

urlpatterns = [     # admin으로 들어갈 수 있게 해줌
    path('admin/', admin.site.urls),
    # path('noticeboard/', include('noticeboard.urls') admin.site.urls),   # 전체 조회하게 만듬
    path('noticeboard/', include('noticeboard.urls'))
]
# 지금 이곳에 admin, noticeboard만 정의했으니, 그 둘만 접속 가능함.
