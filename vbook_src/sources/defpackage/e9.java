package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e9  reason: default package */
/* loaded from: classes.dex */
public abstract class e9 extends q1 {
    public static final dpe F;
    public static final nj6 G = new nj6(e9.class);
    public volatile Set D;
    public volatile int E;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [dpe] */
    /* JADX WARN: Type inference failed for: r0v7 */
    static {
        Throwable th;
        c9 c9Var;
        try {
            th = null;
            c9Var = new c9(AtomicReferenceFieldUpdater.newUpdater(e9.class, Set.class, "D"), AtomicIntegerFieldUpdater.newUpdater(e9.class, "E"));
        } catch (Throwable th2) {
            th = th2;
            c9Var = new Object();
        }
        F = c9Var;
        if (th != null) {
            G.a().log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }
}
