import greenfoot.*;

public class green extends NPC {
    public void act() {
        move(2);
        crash();
    }

    public void crash() {
        super.crash(); // Panggil metode crash dari superclass untuk menangani logika penghapusan objek
        // Tambahan logika khusus green jika diperlukan
    }
}
