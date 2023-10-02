var lampada = document.getElementById('lampada');
var botao = document.getElementById('botao');

botao.addEventListener('click', () => {
    if (lampada.className == 'on') {
        lampada.src = 'img/off.jpg';
        lampada.className = 'off';
    } else {
        lampada.src = 'img/on.jpg';
        lampada.className = 'on';
    }
    if (botao.className == 'on') {
        botao.src = 'img/buttonOff.png';
        botao.className = 'off';
    } else {
        botao.src = 'img/buttonOn.png';
        botao.className = 'on';
    }
});