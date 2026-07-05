package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b52  reason: default package */
/* loaded from: classes.dex */
public final class b52 {
    public static final /* synthetic */ b52 a = new Object();
    public static final List b = tl1.B(1, 2, 4, 8, 16, 32);

    public static String a(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        if (i != 16) {
                            if (i != 32) {
                                return "UNKNOWN";
                            }
                            return "ROLLBACK";
                        }
                        return "FLING";
                    }
                    return "GESTURE";
                }
                return "LOCATE";
            }
            return "OFFSET";
        }
        return "SCALE";
    }
}
