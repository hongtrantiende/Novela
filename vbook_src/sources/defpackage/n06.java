package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n06  reason: default package */
/* loaded from: classes.dex */
public final class n06 extends AbstractOwnableSynchronizer implements Runnable {
    public final o06 a;

    public n06(o06 o06Var) {
        this.a = o06Var;
    }

    public static void a(n06 n06Var, Thread thread) {
        n06Var.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
