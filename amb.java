import greenfoot.*;

public class amb extends NPC {
    public void act() {
       move(3);
       crash();
    }

    public void crash() {
        super.crash(); // Panggil metode crash dari superclass untuk menangani logika penghapusan objek
        // Tambahan logika khusus amb jika diperlukan
    }
}
