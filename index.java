document.querySelectorAll('nav ul li a').forEach(link => {
    link.addEventListener('click', e => {
        e.preventDefault();
        const href = link.getAttribute('href');
        const tab = document.querySelector(href);
        const currentTab = document.querySelector('.active');
        currentTab.classList.remove('active');
        tab.classList.add('active');
    });
});

document.querySelector('#feedback-form').addEventListener('submit', e => {
    e.preventDefault();
    const name = document.querySelector('#name').value;
    const email = document.querySelector('#email').value;
    const message = document.querySelector('#message').value;
    console.log(`Name: ${name}\nEmail: ${email}\nMessage: ${message}`);
});