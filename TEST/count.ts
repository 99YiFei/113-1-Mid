import { card } from "./card";

function main(): void {
    const com = new card("Diamond", "A", () => {
        console.log("");
    });
    com.doTask();

    const plr = new card("Diamond", "A", () => {
        console.log("");
    });
    plr.doTask();
}

main();