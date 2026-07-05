package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bjf  reason: default package */
/* loaded from: classes.dex */
public final class bjf extends hre {
    public Object[] d;
    public int e;

    @Override // defpackage.hre
    public final int t() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.e; i++) {
            sb.append(" '");
            sb.append(u(i));
            sb.append("': ");
            sb.append(v(i));
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // defpackage.hre
    public final sjf u(int i) {
        if (i < this.e) {
            return (sjf) this.d[i + i];
        }
        xk5.r();
        return null;
    }

    @Override // defpackage.hre
    public final Object v(int i) {
        if (i < this.e) {
            return this.d[i + i + 1];
        }
        xk5.r();
        return null;
    }

    @Override // defpackage.hre
    public final Object w(sjf sjfVar) {
        int y = y(sjfVar);
        if (y != -1) {
            return sjfVar.b.cast(this.d[y + y + 1]);
        }
        return null;
    }

    public final void x(sjf sjfVar, Object obj) {
        int y;
        if (!sjfVar.c && (y = y(sjfVar)) != -1) {
            uaf.D(obj, "metadata value");
            this.d[y + y + 1] = obj;
            return;
        }
        int i = this.e + 1;
        Object[] objArr = this.d;
        int length = objArr.length;
        if (i + i > length) {
            this.d = Arrays.copyOf(objArr, length + length);
        }
        Object[] objArr2 = this.d;
        int i2 = this.e;
        int i3 = i2 + i2;
        objArr2[i3] = sjfVar;
        uaf.D(obj, "metadata value");
        objArr2[i3 + 1] = obj;
        this.e++;
    }

    public final int y(sjf sjfVar) {
        for (int i = 0; i < this.e; i++) {
            if (this.d[i + i].equals(sjfVar)) {
                return i;
            }
        }
        return -1;
    }
}
