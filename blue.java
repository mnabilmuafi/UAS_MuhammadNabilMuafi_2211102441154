import greenfoot.*;

public class blue extends NPC {
    public void act() {
        move(1);
        crash();
    }

    public void crash() {
        super.crash(); // Panggil metode crash dari superclass untuk menangani logika penghapusan objek
        // Tambahan logika khusus blue jika diperlukan
    }
}
