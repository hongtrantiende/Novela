package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ji0  reason: default package */
/* loaded from: classes.dex */
public abstract class ji0 implements c14 {
    public final ajc a;
    public final int b;
    public final int[] c;
    public final vq4[] d;
    public final long[] e;
    public int f;

    public ji0(ajc ajcVar, int[] iArr) {
        boolean z;
        vq4[] vq4VarArr;
        int i = 0;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        wq9.D(z);
        ajcVar.getClass();
        this.a = ajcVar;
        int length = iArr.length;
        this.b = length;
        this.d = new vq4[length];
        int i2 = 0;
        while (true) {
            int length2 = iArr.length;
            vq4VarArr = this.d;
            if (i2 >= length2) {
                break;
            }
            vq4VarArr[i2] = ajcVar.d[iArr[i2]];
            i2++;
        }
        Arrays.sort(vq4VarArr, new uk(2));
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i < i3) {
                this.c[i] = ajcVar.a(this.d[i]);
                i++;
            } else {
                this.e = new long[i3];
                return;
            }
        }
    }

    @Override // defpackage.c14
    public final boolean a(int i, long j) {
        if (this.e[i] > j) {
            return true;
        }
        return false;
    }

    @Override // defpackage.c14
    public final ajc c() {
        return this.a;
    }

    @Override // defpackage.c14
    public final int e(vq4 vq4Var) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == vq4Var) {
                return i;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ji0 ji0Var = (ji0) obj;
            if (this.a.equals(ji0Var.a) && Arrays.equals(this.c, ji0Var.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.c14
    public final vq4 h(int i) {
        return this.d[i];
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    @Override // defpackage.c14
    public final int j(int i) {
        return this.c[i];
    }

    @Override // defpackage.c14
    public int k(long j, List list) {
        return list.size();
    }

    @Override // defpackage.c14
    public final int length() {
        return this.c.length;
    }

    @Override // defpackage.c14
    public final int m() {
        return this.c[d()];
    }

    @Override // defpackage.c14
    public final vq4 n() {
        return this.d[d()];
    }

    @Override // defpackage.c14
    public final boolean p(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean a = a(i, elapsedRealtime);
        for (int i2 = 0; i2 < this.b && !a; i2++) {
            if (i2 != i && !a(i2, elapsedRealtime)) {
                a = true;
            } else {
                a = false;
            }
        }
        if (!a) {
            return false;
        }
        long[] jArr = this.e;
        jArr[i] = Math.max(jArr[i], a2d.a(elapsedRealtime, j));
        return true;
    }

    @Override // defpackage.c14
    public final int u(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.c14
    public void i() {
    }

    @Override // defpackage.c14
    public void l() {
    }

    @Override // defpackage.c14
    public final void g(boolean z) {
    }

    @Override // defpackage.c14
    public void q(float f) {
    }
}
