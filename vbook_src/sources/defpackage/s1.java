package defpackage;

import sun.misc.Unsafe;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s1  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class s1 {
    public static /* synthetic */ boolean a(Unsafe unsafe, x1 x1Var, long j, l1 l1Var, l1 l1Var2) {
        while (!unsafe.compareAndSwapObject(x1Var, j, l1Var, l1Var2)) {
            if (unsafe.getObject(x1Var, j) != l1Var) {
                return false;
            }
        }
        return true;
    }
}
