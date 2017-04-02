# app/views.py

from django.shortcuts import render
from django.views.generic import TemplateView
from django.http import HttpResponse
from bs4 import BeautifulSoup
import requests
import re
# Create your views here.

class HomePageView(TemplateView):
    def get(self, request, **kwargs):
        testString = 'testing view'
       # return  render(request, 'index.html', context=None) 

    def index(request):
        testSt = 'test index function'
        return HttpResponse(testSt)

    def scanPage(request):
        url = requests.get("https://boards.greenhouse.io/definiens#.WNAYbFUrLX5")
        content = url.content
       # print (content)
        soup = BeautifulSoup(content,'html.parser')
        links = soup.findAll('a')
       # link = soup.findAll("a")
        for link in links:
            print (link)
            if link.find(text=re.compile("DevOps")):
                thelink =  link 
                break

        print (thelink)
        return HttpResponse(thelink)
