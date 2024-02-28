package P2.GameDragon;

public class DragonGame25 {
    
    int x;
    int y;
    int width;
    int height;

    DragonGame25(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    void moveLeft() {
        x -= 1;
        printPosition();
        detectCollision(x, y);
    }

    void moveRight() {
        x += 1;
        printPosition();
        detectCollision(x, y);
    }

    void moveUp() {
        y -= 1;
        printPosition();
        detectCollision(x, y);
    }

    void moveDown() {
        y += 1;
        printPosition();
        detectCollision(x, y);
    }

    void printPosition() {
        System.out.println("x = " + x + ", y = " + y);
    }

    void detectCollision(int x, int y) {
        if (x < 0 || y < 0 || x > width || y > height) {
            System.out.println("Game Over");
            System.exit(0);
        } 
    }
}

