var Carousel = /** @class */ (function () {
    function Carousel(images) {
        this.images = images;
        this.currentIndex = 0;
    }
    Carousel.prototype.displayNextImage = function () {
        this.currentIndex = (this.currentIndex + 1) % this.images.length;
        this.displayNextImage();
    };
    Carousel.prototype.displayPreviousImage = function () {
        this.currentIndex = (this.currentIndex - 1 + this.images.length) % this.images.length;
        this.displayPreviousImage();
    };
    /*displayImage*/
    Carousel.prototype.displayCurrentImage = function () {
        var currentImage = this.images[this.currentIndex];
    };
    return Carousel;
}());
