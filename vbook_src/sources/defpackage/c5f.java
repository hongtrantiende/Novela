package defpackage;

import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c5f  reason: default package */
/* loaded from: classes.dex */
public final class c5f {
    public static final c5f b = new c5f();
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final void a(xhe xheVar, Class cls) {
        xhe xheVar2 = (xhe) this.a.putIfAbsent(cls, xheVar);
        if (xheVar2 != null && !xheVar2.equals(xheVar)) {
            hfd.j("Different key creator for parameters class already inserted");
        }
    }
}
