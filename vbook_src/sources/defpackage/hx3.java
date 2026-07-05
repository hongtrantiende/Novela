package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hx3  reason: default package */
/* loaded from: classes.dex */
public final class hx3 implements r7b, fa9 {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public hx3(Executor executor) {
        this.c = executor;
    }

    public final synchronized void a(Executor executor, kx3 kx3Var) {
        try {
            executor.getClass();
            if (!this.a.containsKey(yf2.class)) {
                this.a.put(yf2.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.a.get(yf2.class)).put(kx3Var, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
