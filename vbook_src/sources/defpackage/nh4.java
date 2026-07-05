package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nh4  reason: default package */
/* loaded from: classes3.dex */
public final class nh4 extends jr4 {
    public final long b;
    public final boolean c;
    public long d;

    public nh4(osa osaVar, long j, boolean z) {
        super(osaVar);
        this.b = j;
        this.c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [my0, java.lang.Object] */
    @Override // defpackage.jr4, defpackage.osa
    public final long read(my0 my0Var, long j) {
        my0Var.getClass();
        long j2 = this.d;
        long j3 = this.b;
        if (j2 > j3) {
            j = 0;
        } else if (this.c) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long read = this.a.read(my0Var, j);
        int i = (read > (-1L) ? 1 : (read == (-1L) ? 0 : -1));
        if (i != 0) {
            this.d += read;
        }
        long j5 = this.d;
        int i2 = (j5 > j3 ? 1 : (j5 == j3 ? 0 : -1));
        if ((i2 < 0 && i == 0) || i2 > 0) {
            if (read > 0 && i2 > 0) {
                ?? obj = new Object();
                obj.J(my0Var);
                my0Var.write(obj, my0Var.b - (j5 - j3));
                obj.o();
            }
            StringBuilder o = rs8.o(j3, "expected ", " bytes but got ");
            o.append(this.d);
            throw new IOException(o.toString());
        }
        return read;
    }
}
