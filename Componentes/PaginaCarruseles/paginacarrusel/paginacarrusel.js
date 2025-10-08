// Selecciona todos los carruseles cuyo id empiece por "carruselCanciones"
const carousels = document.querySelectorAll('[id^="carruselCanciones"]');

// Recorre cada carrusel individualmente
carousels.forEach((carousel, index) => {
    let isDown = false;
    let startX;
    let scrollLeft;

    // ======================
    // 🖱 Drag con el mouse
    // ======================
    carousel.addEventListener('mousedown', (e) => {
        isDown = true;
        startX = e.pageX - carousel.offsetLeft;
        scrollLeft = carousel.scrollLeft;
    });

    carousel.addEventListener('mouseleave', () => isDown = false);
    carousel.addEventListener('mouseup', () => isDown = false);

    carousel.addEventListener('mousemove', (e) => {
        if (!isDown) return;
        e.preventDefault();
        const x = e.pageX - carousel.offsetLeft;
        const walk = (x - startX) * 2; // velocidad del arrastre
        carousel.scrollLeft = scrollLeft - walk;
    });

    // ======================
    // 📱 Swipe en móviles
    // ======================
    carousel.addEventListener('touchstart', (e) => {
        isDown = true;
        startX = e.touches[0].pageX - carousel.offsetLeft;
        scrollLeft = carousel.scrollLeft;
    });

    carousel.addEventListener('touchend', () => isDown = false);

    carousel.addEventListener('touchmove', (e) => {
        if (!isDown) return;
        const x = e.touches[0].pageX - carousel.offsetLeft;
        const walk = (x - startX) * 2;
        carousel.scrollLeft = scrollLeft - walk;
    });

    // ======================
    // ⏪⏩ Botones del carrusel
    // ======================
    const prevBtn = carousel.parentElement.querySelector('.carousel-btn-prev');
    const nextBtn = carousel.parentElement.querySelector('.carousel-btn-next');

    if (prevBtn && nextBtn) {
        prevBtn.addEventListener('click', () => {
            carousel.scrollBy({ left: -300, behavior: 'smooth' });
        });

        nextBtn.addEventListener('click', () => {
            carousel.scrollBy({ left: 300, behavior: 'smooth' });
        });
    }
});





