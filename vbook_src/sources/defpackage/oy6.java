package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oy6  reason: default package */
/* loaded from: classes.dex */
public final class oy6 implements r13 {
    public boolean a;
    public long b = 9223372034707292159L;
    public long c = 0;
    public final /* synthetic */ ry6 d;

    public oy6(ry6 ry6Var) {
        this.d = ry6Var;
    }

    @Override // defpackage.r13
    public final float G0() {
        return this.d.G0();
    }

    public final sc6 a() {
        this.a = true;
        ry6 ry6Var = this.d;
        sc6 S0 = ry6Var.S0();
        if (py5.b(this.b, 9223372034707292159L)) {
            this.b = hif.v(S0.L(0L));
            this.c = S0.a();
        }
        ry6Var.U0().d0.b();
        return S0;
    }

    @Override // defpackage.r13
    public final float f() {
        return this.d.f();
    }

    public final void g(u95 u95Var, float f) {
        ry6 ry6Var = this.d;
        t6f t6fVar = ry6Var.M;
        if (t6fVar == null) {
            t6fVar = new t6f(7);
            ry6Var.M = t6fVar;
        }
        int r0 = b00.r0(u95Var, (u95[]) t6fVar.c);
        if (r0 < 0) {
            int i = t6fVar.b;
            u95[] u95VarArr = (u95[]) t6fVar.c;
            if (i == u95VarArr.length) {
                int i2 = i * 2;
                t6fVar.c = (u95[]) Arrays.copyOf(u95VarArr, i2);
                t6fVar.d = Arrays.copyOf((float[]) t6fVar.d, i2);
                t6fVar.e = Arrays.copyOf((byte[]) t6fVar.e, i2);
            }
            ((u95[]) t6fVar.c)[i] = u95Var;
            ((byte[]) t6fVar.e)[i] = 3;
            ((float[]) t6fVar.d)[i] = f;
            t6fVar.b++;
            return;
        }
        float[] fArr = (float[]) t6fVar.d;
        if (fArr[r0] == f) {
            byte[] bArr = (byte[]) t6fVar.e;
            if (bArr[r0] == 2) {
                bArr[r0] = 0;
                return;
            }
            return;
        }
        fArr[r0] = f;
        ((byte[]) t6fVar.e)[r0] = 1;
    }
}
