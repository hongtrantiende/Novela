package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qga  reason: default package */
/* loaded from: classes3.dex */
public abstract class qga {
    public static final lie a = new lie(5, "NO_VALUE", false);

    public static pga a(int i, int i2, py0 py0Var) {
        int i3;
        if ((i2 & 1) != 0) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i4 = i2 & 4;
        py0 py0Var2 = py0.a;
        if (i4 != 0) {
            py0Var = py0Var2;
        }
        if (i >= 0) {
            if (i3 <= 0 && i <= 0 && py0Var != py0Var2) {
                cy7.h(py0Var, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
                return null;
            }
            int i5 = i + i3;
            if (i5 < 0) {
                i5 = Integer.MAX_VALUE;
            }
            return new pga(i3, i5, py0Var);
        }
        p1a.k(a82.j(i, "extraBufferCapacity cannot be negative, but was "));
        return null;
    }

    public static final void b(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }
}
