package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u72  reason: default package */
/* loaded from: classes3.dex */
public abstract class u72 {
    public static final mfb a = new mfb(new cd1(23));

    public static int a(int i, boolean z) {
        int i2 = ((i - 1) % 12) + 1;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3 && i2 != 5 && i2 != 10 && i2 != 12 && i2 != 7 && i2 != 8) {
                    return 30;
                }
                return 31;
            } else if (z) {
                return 29;
            } else {
                return 28;
            }
        }
        return 31;
    }

    public static boolean b(int i) {
        if (i % 4 == 0) {
            if (i % 100 != 0 || i % 400 == 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
