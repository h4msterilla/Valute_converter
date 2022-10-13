
var messageApi = Vue.resource('/hello{/id}');

Vue.component('message-row', {
    props: ['message'],
    template: '<div><i>({{ message.id }})</i> {{ message.text }}</div>'
});

Vue.component('messages-list', {
    props: ['messages'],
    template: '<div><message-row v-for="message in messages" :key="message.id" :message="message"/></div>',
    created: function(){

    }
});

var app = new Vue({
  el: '#app',
  template: '<messages-list :messages="messages" />',
  data: {
    messages: [
        {id: '123', text: 'qweerty'},
        {id: '12', text: 'qweertyadadad'},
        {id: '1', text: '12314424'},
        {id: '23', text: 'zczxczczcx'}
    ]
  }
})