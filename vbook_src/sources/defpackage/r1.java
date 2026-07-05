package defpackage;

import sun.misc.Unsafe;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r1  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class r1 {
    public static /* synthetic */ boolean a(Unsafe unsafe, x1 x1Var, long j, w1 w1Var, w1 w1Var2) {
        while (!unsafe.compareAndSwapObject(x1Var, j, w1Var, w1Var2)) {
            if (unsafe.getObject(x1Var, j) != w1Var) {
                return false;
            }
        }
        return true;
    }
}
