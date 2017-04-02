# app/urls.py

from django.conf.urls import include, url
from app import views


urlpatterns = [
   # url(r'^$', views.HomePageView.as_view()),
   # url(r'^$', views.HomePageView.index, name = 'index'),
     url(r'^$', views.HomePageView.scanPage, name = 'scanPage'),
]
