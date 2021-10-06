
from django.shortcuts import render, get_object_or_404   # get_object_or_404 추가.  view_article(리퀘,id)작업중
from noticeboard.models import Notice
from django.http import HttpResponseRedirect  # 이것과 아래것 2개 추가
from django.urls import reverse
from django.utils import timezone  # 타임존 추가
# Create your views here.


def index(request):  # request -> 사용자가 요청한 request객체를 받음 -> Django가 알아서 전달해줌
    # 전체를 보여달라는 요청이므로, 모든 데이터를 가져와야함. 가져와서 변수에 담아야 함. 변수의 이름=article_list
    article_list = Notice.objects.all().order_by('-writeDate')  # - 붙이면 디센딩, 안붙이면 어센딩
                                        # 일반적으로 게시글 가장 최근이 가장 위에 오기때문에 이렇게 한것
    # 변수 설정. 마음대로 -> 여기선 context
    context = {'article_list': article_list}  # 파이썬 dictionary 만들어줌 -> return해서 클라이언트에게 던져줌
    # 데이터만 던져주면 소용 없음, HTML낑겨서 전체 전달해야함. -> HTML소스 아직 없음. -> 있어야 return 쓸 수 있음.
    # 당장 HTML부터 만들어야함,.
    # return ''

    # MVT 중에서 M(모델), V(뷰) 는 했음 , T(템플릿) 해야함

    # html 만들었다고 가정하고(boardRoot\templates\noticeboard\index.html) 이제 return 마무리
    # import render 에 render 들어있음.
    return render(request, 'noticeboard/index.html', context) # 사용자에게 보내져야할 html 파일
    # 보낼때, context도 같이 보내라.
    # noticeboard로 들어올때, index.html 을 보여준다는 뜻.


def write_article(request):
    return render(request, 'noticeboard/writeArticle.html')
# 색을 작성하는거니 넘겨줄 데이터 필요 없음. 이거면 됨
# templates -> noticeboard  우클릭 -> writeArticle.html 파일 생성


def add_article(request):  # from에서 뽑아오기 위한 함수
    notice = Notice()
    notice.title = request.POST['title']
    notice.content = request.POST['content']
# writeAtricl 의 30번째줄,  name="content 이므로
    notice.writeID = 'bit'
    notice.save()

    return HttpResponseRedirect(reverse('noticeboard:index'))
    # 요 주소로 호출해 라고 호출하는게 Redirect -> 주소, 욜로 리다이렉트 해
# -> 템플릿을 리다이렉트한것, 소스 안바꾸려고. {% url~~ %}  <-  똑같은 기능을 하는 파이썬 함수가 필요하다 -> 그게 리버스
    # 위의 리버스 저놈이 이 기능을 한다는 것


def view_article(request, article_id):  # article_id  ->  이름이 같으면 장고가 알아서 받아서 값을 넘겨줌
    notice = get_object_or_404(Notice, pk=article_id)  # 위의 article_id를 굉장히 쉽게 넘겨받음
    # -> 받고 렌더시키면 됨
    return render(request, 'noticeboard/detail.html', {'article':notice})  # 위의 notice를 항상 dictionary타입으로 넘겨줘야함.
# 그리고 우린 detail.html을 만들면 되는거야. -> 일단 껍데기만 만들자
# -> templates -> noticeboard 우클릭 -> detail.html 만들기


def update_article(request, article_id):
    notice = Notice.objects.get(id=article_id)
    if request.method == 'POST':
        notice.title = request.POST['title']
        notice.content = request.POST['content']
        notice.writeDate = timezone.datetime.now()
        notice.save()
        return HttpResponseRedirect(reverse('noticeboard:view', args=(article_id,)))
    else:
        return render(request, 'noticeboard/detail.html', {'article': notice})


def delete_article(request, article_id):
    # pass
    notice = Notice.objects.get(id=article_id)
    notice.delete()
    return HttpResponseRedirect(reverse('noticeboard:index'))


# 파이참은 함수와 함수 사이 최소 2줄을 띄워야 빨간줄이 안그어짐