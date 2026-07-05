package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a72  reason: default package */
/* loaded from: classes.dex */
public final class a72 {
    private volatile /* synthetic */ Object current = ls3.a;

    static {
        AtomicReferenceFieldUpdater.newUpdater(a72.class, Object.class, "current");
    }

    public final Object a(hq7 hq7Var) {
        hq7Var.getClass();
        return ((Map) this.current).get(hq7Var);
    }
}
