export class card {
    suit: string;
    rank: string;
    task: () => void;

    constructor(suit: string, rank: string, task: () => void) {
        this.suit = suit;
        this.rank = rank;
        this.task = task;
    }

    doTask(){
        return this.task();
    }
}