from django.http import HttpResponse, Http404, HttpResponseRedirect
from django.shortcuts import render, get_object_or_404
from django.urls import reverse
from .models import Choice, Question
from django.views import generic
from django.utils import timezone
from django.template import loader

from .models import Question


class IndexView(generic.ListView):
    template_name = 'polls/index.html'
    context_object_name = 'latest_question_list'

    @property
    def get_queryset(self):
        """返回最后发布的五个问题"""
        return Question.objects.filter(
            pub_date__lte=timezone.now() #__ite 小于等于
        ).order_by('-pub_date')[:5]


class DetailView(generic.DetailView):
    model = Question
    template_name = 'polls/detail.html'

    def get_queryset(self):
        """
        Excludes any questions that aren't published yet.
        """
        return Question.objects.filter(pub_date__lte=timezone.now())


class ResultsView(generic.DetailView):
    model = Question
    template_name = 'polls/results.html'


def vote(request, question_id):
    question = get_object_or_404(Question, pk=question_id)
    try:
        selected_choice = question.choice_set.get(pk=request.POST['choice'])

    except(KeyError, Choice.DoesNotExist):
        return render(request, 'polls/detail.html', {
            'question': question,
            'error_message': "You are didnt select a choice",
        })
    else:
        selected_choice.votes += 1
        selected_choice.save()
        return HttpResponseRedirect(reverse('polls:results', args=(question.id,)))






# def index(request):
#     latest_question_list = Question.objects.order_by('-pub_date')[:5]
#     context = {
#         'latest_question_list': latest_question_list
#     }
#     return render(request, 'polls/index.html', context)
#     # template=loader.get_template('polls/index.html')
#     # context={
#     #     'latest_question_list':latest_question_list
#     # }
#     # return HttpResponse(template.render(context, request))
#     # # return HttpResponse("Hello, world. You're at the polls index.")
#
#
# def detail(request, question_id):
#     # try:
#     #     question=Question.object.get(pk=question_id)
#     # except Question.DoesNotExist:
#     #     raise Http404("Question does not exist")
#     question = get_object_or_404(Question, pk=question_id)
#     return render(request, 'polls/detail.html', {'question': question})
#
#
# def results(request, question_id):
#     question = get_object_or_404(Question, pk=question_id)
#     return render(request, 'polls/results.html', {'question': question})
