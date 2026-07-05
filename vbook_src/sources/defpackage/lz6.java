package defpackage;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lz6  reason: default package */
/* loaded from: classes.dex */
public final class lz6 {
    public final LinkedHashMap a;

    public lz6(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap();
                return;
            default:
                this.a = new LinkedHashMap(0, 0.75f, true);
                return;
        }
    }

    public static String a(int i, int i2, String str) {
        return i + '-' + i2 + '-' + str;
    }
}
