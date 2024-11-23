class Carousel{
    private images: string[];
    private currentIndex: number;

    constructor(images: string[]){
        this.images = images;
        this.currentIndex = 0;
    }

    public displayNextImage(): void {
        this.currentIndex = (this.currentIndex + 1) % this.images.length;
        this.displayNextImage();
    }

    public displayPreviousImage(): void {
        this.currentIndex = (this.currentIndex - 1 + this.images.length) % this.images.length;
        this.displayPreviousImage();
    }
    /*displayImage*/
    private displayCurrentImage(): void {
        const currentImage = this.images[this.currentIndex];
    }

}