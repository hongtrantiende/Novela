package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hdd  reason: default package */
/* loaded from: classes.dex */
public final class hdd {
    public final tw8 a = new tw8(4);
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashSet c = new LinkedHashSet();
    public volatile boolean d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                eub.u(autoCloseable);
            } catch (Exception e) {
                fb4.l(e);
            }
        }
    }
}
