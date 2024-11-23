class Carousel{
    private images: string[];
    private currentIndex: number;

    constructor(images: string[]){
        this.images = images;
        this.currentIndex = 0;
    }

    public displayNextIamge(): void {
        this.currentIndex = (this.currentIndex + 1) % this.images.length;
        this.displayNextIamge();
    }

    public displayPreviousIamge(): void {
        this.currentIndex = (this.currentIndex - 1 + this.images.length) % this.images.length;
        this.displayPreviousIamge();
    }
    /*displayImage*/
    private displayCurrentImage(): void {
        const currentImage = this.images[this.currentIndex];
    }

}