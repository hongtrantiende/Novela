package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kef  reason: default package */
/* loaded from: classes.dex */
public final class kef extends x1 {
    public yv D;
    public final int E;

    public kef(yv yvVar, int i) {
        this.D = yvVar;
        this.E = i;
    }

    @Override // defpackage.x1
    public final void c() {
        AtomicLong atomicLong;
        long j;
        int i;
        int i2;
        boolean z;
        yv yvVar = this.D;
        this.D = null;
        if (yvVar != null) {
            AtomicReference atomicReference = (AtomicReference) yvVar.c;
            do {
                atomicLong = (AtomicLong) yvVar.b;
                j = atomicLong.get();
                i = (int) j;
                long j2 = j >>> 32;
                if (i != Integer.MIN_VALUE) {
                    i2 = (int) j2;
                    if (i == -2147483647) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i2++;
                    }
                } else {
                    StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 13);
                    sb.append("Refcount is: ");
                    sb.append(j);
                    throw new AssertionError(sb.toString());
                }
            } while (!atomicLong.compareAndSet(j, (i2 << 32) | (4294967295L & (i - 1))));
            if (z) {
                while (true) {
                    mef mefVar = (mef) atomicReference.get();
                    if (mefVar != null) {
                        if (mefVar.D <= this.E) {
                            mefVar.cancel(true);
                            while (!atomicReference.compareAndSet(mefVar, null)) {
                                if (atomicReference.get() != mefVar) {
                                    break;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // defpackage.x1
    public final String j() {
        x00 x00Var;
        yv yvVar = this.D;
        if (yvVar == null || (x00Var = (x00) ((w1f) yvVar.a).b) == null) {
            return null;
        }
        String obj = x00Var.toString();
        String v = nk2.v(new StringBuilder(obj.length() + 11), "callable=[", obj, "]");
        mef mefVar = (mef) ((AtomicReference) this.D.c).get();
        if (mefVar != null) {
            int length = v.length();
            String x1Var = mefVar.toString();
            return nk2.w(new StringBuilder(x1Var.length() + length + 9 + 1), v, ", trial=[", x1Var, "]");
        }
        return v;
    }
}
