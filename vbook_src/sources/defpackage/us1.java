package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: us1  reason: default package */
/* loaded from: classes.dex */
public final class us1 extends AbstractMap implements Serializable {
    public static final Object F = new Object();
    public transient ss1 C;
    public transient ss1 D;
    public transient y2 E;
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] d;
    public transient int e;
    public transient int f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, us1] */
    public static us1 a(int i) {
        boolean z;
        ?? abstractMap = new AbstractMap();
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        wq9.r("Expected size must be >= 0", z);
        abstractMap.e = Math.min(Math.max(i, 1), 1073741823);
        return abstractMap;
    }

    public final Map b() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int c() {
        return (1 << (this.e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (f()) {
            return;
        }
        this.e += 32;
        Map b = b();
        if (b != null) {
            this.e = Math.min(Math.max(size(), 3), 1073741823);
            b.clear();
            this.a = null;
            this.f = 0;
            return;
        }
        Arrays.fill(i(), 0, this.f, (Object) null);
        Arrays.fill(j(), 0, this.f, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(h(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map b = b();
        if (b != null) {
            return b.containsKey(obj);
        }
        if (d(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map b = b();
        if (b != null) {
            return b.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (bue.g(obj, j()[i])) {
                return true;
            }
        }
        return false;
    }

    public final int d(Object obj) {
        if (f()) {
            return -1;
        }
        int B = nqe.B(obj);
        int c = c();
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int C = fxe.C(B & c, obj2);
        if (C == 0) {
            return -1;
        }
        int i = ~c;
        int i2 = B & i;
        do {
            int i3 = C - 1;
            int i4 = h()[i3];
            if ((i4 & i) == i2 && bue.g(obj, i()[i3])) {
                return i3;
            }
            C = i4 & c;
        } while (C != 0);
        return -1;
    }

    public final void e(int i, int i2) {
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] h = h();
        Object[] i3 = i();
        Object[] j = j();
        int size = size();
        int i4 = size - 1;
        if (i < i4) {
            Object obj2 = i3[i4];
            i3[i] = obj2;
            j[i] = j[i4];
            i3[i4] = null;
            j[i4] = null;
            h[i] = h[i4];
            h[i4] = 0;
            int B = nqe.B(obj2) & i2;
            int C = fxe.C(B, obj);
            if (C == size) {
                fxe.D(B, obj, i + 1);
                return;
            }
            while (true) {
                int i5 = C - 1;
                int i6 = h[i5];
                int i7 = i6 & i2;
                if (i7 == size) {
                    h[i5] = fxe.x(i6, i + 1, i2);
                    return;
                }
                C = i7;
            }
        } else {
            i3[i] = null;
            j[i] = null;
            h[i] = 0;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        ss1 ss1Var = this.D;
        if (ss1Var == null) {
            ss1 ss1Var2 = new ss1(this, 0);
            this.D = ss1Var2;
            return ss1Var2;
        }
        return ss1Var;
    }

    public final boolean f() {
        if (this.a == null) {
            return true;
        }
        return false;
    }

    public final Object g(Object obj) {
        if (!f()) {
            int c = c();
            Object obj2 = this.a;
            Objects.requireNonNull(obj2);
            int y = fxe.y(obj, null, c, obj2, h(), i(), null);
            if (y != -1) {
                Object obj3 = j()[y];
                e(y, c);
                this.f--;
                this.e += 32;
                return obj3;
            }
        }
        return F;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map b = b();
        if (b != null) {
            return b.get(obj);
        }
        int d = d(obj);
        if (d == -1) {
            return null;
        }
        return j()[d];
    }

    public final int[] h() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] i() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final Object[] j() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int k(int i, int i2, int i3, int i4) {
        Object n = fxe.n(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            fxe.D(i3 & i5, n, i4 + 1);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] h = h();
        for (int i6 = 0; i6 <= i; i6++) {
            int C = fxe.C(i6, obj);
            while (C != 0) {
                int i7 = C - 1;
                int i8 = h[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int C2 = fxe.C(i10, n);
                fxe.D(i10, n, C);
                h[i7] = fxe.x(i9, C2, i5);
                C = i8 & i;
            }
        }
        this.a = n;
        this.e = fxe.x(this.e, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        ss1 ss1Var = this.C;
        if (ss1Var == null) {
            ss1 ss1Var2 = new ss1(this, 1);
            this.C = ss1Var2;
            return ss1Var2;
        }
        return ss1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fe -> B:37:0x00e4). Please submit an issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object put(java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.us1.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map b = b();
        if (b != null) {
            return b.remove(obj);
        }
        Object g = g(obj);
        if (g == F) {
            return null;
        }
        return g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map b = b();
        if (b != null) {
            return b.size();
        }
        return this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        y2 y2Var = this.E;
        if (y2Var == null) {
            y2 y2Var2 = new y2(this, 2);
            this.E = y2Var2;
            return y2Var2;
        }
        return y2Var;
    }
}
