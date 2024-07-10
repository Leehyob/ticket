    $(document).ready(function (){

     /*   var location = document.querySelector('#right').offsetTop;

        window.scrollTo({top:location,behavior:'smooth'});*/

    // 전역 변수 선언
    let date = new Date();
    let currYear = date.getFullYear();
    let currMonth = date.getMonth() + 1;
    let selectedDate = null; // 선택된 날짜를 저장할 변수

    // prevNextIcon 요소 선택 수정
    let prevNextIcons = document.querySelectorAll('.prev-next-icon'); // 정확한 클래스명 확인

    let renderCalendar = () => {
    let currentDate = document.querySelector('.current-date');
    let daysTag = document.querySelector('.days');

    // 월이 10 이상일 때 "0"을 추가하지 않음
    currentDate.innerHTML = `${currYear}.` + (currMonth < 10 ? `0${currMonth}` : currMonth);

    let lastDateofMonth = new Date(currYear, currMonth, 0).getDate();
    let liTag = '';
    for (let i = 1; i <= lastDateofMonth; i++) {
    let isToday =
    i === date.getDate() &&
    currMonth === new Date().getMonth() + 1 &&
    currYear === new Date().getFullYear()
    ? 'active'
    : '';
    liTag += `<li class="${isToday}">${i}</li>`;

    // 현재 날짜가 디폴트로 선택된 날짜가 되도록 설정
    if (isToday === 'active') {
    selectedDate = `${currYear}-${currMonth < 10 ? `0${currMonth}` : currMonth}-${i < 10 ? `0${i}` : i}`;
}
}

    let firstDayofMonth = new Date(currYear, currMonth - 1, 1).getDay();
    let lastDayofMonth = new Date(currYear, currMonth - 1, lastDateofMonth).getDay();
    let lastDateofLastMonth = new Date(currYear, currMonth - 1, 0).getDate();

    let prevMonthLiTag = '';
    for (let i = firstDayofMonth; i > 0; i--) {
    prevMonthLiTag += `<li class="inactive">${lastDateofLastMonth - i + 1}</li>`;
}

    let nextMonthLiTag = '';
    for (let i = lastDayofMonth; i < 6; i++) {
    nextMonthLiTag += `<li class="inactive">${i - lastDayofMonth + 1}</li>`;
}

    daysTag.innerHTML = prevMonthLiTag + liTag + nextMonthLiTag;

    // 각 날짜에 클릭 이벤트 추가
    let days = daysTag.querySelectorAll('li:not(.inactive)');
    days.forEach(day => {
    day.addEventListener('click', () => {
    days.forEach(d => d.classList.remove('active'));
    day.classList.add('active');
    selectedDate = `${currYear}-${currMonth < 10 ? `0${currMonth}` : currMonth}-${day.innerText < 10 ? `0${day.innerText}` : day.innerText}`;
    console.log(`Selected Date: ${selectedDate}`);
    sendSelectedDate(selectedDate);
});
});

    // 기존 이벤트 리스너 제거 후 추가
    prevNextIcons.forEach((icon) => {
    icon.removeEventListener('click', handlePrevNextIconClick);
    icon.addEventListener('click', handlePrevNextIconClick);
});

    // 페이지 로드 시 현재 날짜를 서버로 전송
    if (selectedDate) {
    sendSelectedDate(selectedDate);
}
};

    let handlePrevNextIconClick = (event) => {
    let icon = event.target;
    if (icon.id === 'prev') {
    currMonth -= 1;
    if (currMonth < 1) {
    currMonth = 12;
    currYear -= 1;
}
} else if (icon.id === 'next') {
    currMonth += 1;
    if (currMonth > 12) {
    currMonth = 1;
    currYear += 1;
}
}

    renderCalendar();
};

    // AJAX 요청을 전송하는 함수
    let sendSelectedDate = (date) => {
    if (date) {
        $("#date").val(date);
    $.ajax({
    type: "get",
    url: '/contents/calendar',
    data: { date: date },
    success: function (result) {
        console.log('result : ', result);
    for (var i=0; i<result.length; i++){
    var actor = result.map(function (item){
    return item.actorName;
})
    $(".todayCasting").html(actor);

    var time = result.map(function (item){
    return item.time;
})
    $(".runtime").html("회차&nbsp;" + time);
}
},
    error: function (request, status, error) {
    console.log(error);
}
});
} else {
    console.log('날짜가 선택되지 않았습니다.');
}
};

    renderCalendar();


});