package defpackage;

import android.text.TextUtils;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cy2  reason: default package */
/* loaded from: classes.dex */
public final class cy2 extends jy2 implements Comparable {
    public final String C;
    public final gy2 D;
    public final boolean E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final boolean J;
    public final boolean K;
    public final int L;
    public final int M;
    public final boolean N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final boolean S;
    public final boolean T;
    public final boolean U;
    public final int e;
    public final boolean f;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:116:0x010d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x012f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0 A[LOOP:1: B:63:0x00ed->B:65:0x00f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cy2(int r8, defpackage.ajc r9, int r10, defpackage.gy2 r11, int r12, boolean r13, defpackage.ay2 r14, int r15) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cy2.<init>(int, ajc, int, gy2, int, boolean, ay2, int):void");
    }

    @Override // defpackage.jy2
    public final int a() {
        return this.e;
    }

    @Override // defpackage.jy2
    public final boolean b(jy2 jy2Var) {
        int i;
        String str;
        cy2 cy2Var = (cy2) jy2Var;
        vq4 vq4Var = cy2Var.d;
        this.D.getClass();
        vq4 vq4Var2 = this.d;
        int i2 = vq4Var2.G;
        if (i2 != -1 && i2 == vq4Var.G) {
            if ((this.J || ((str = vq4Var2.o) != null && TextUtils.equals(str, vq4Var.o))) && (i = vq4Var2.H) != -1 && i == vq4Var.H && this.S == cy2Var.S && this.T == cy2Var.T) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public final int compareTo(cy2 cy2Var) {
        ef8 a;
        boolean z = this.E;
        boolean z2 = this.f;
        if (z2 && z) {
            a = ly2.k;
        } else {
            a = ly2.k.a();
        }
        boolean z3 = cy2Var.E;
        int i = cy2Var.Q;
        ys1 c = ys1.a.c(z, z3);
        Integer valueOf = Integer.valueOf(this.G);
        Integer valueOf2 = Integer.valueOf(cy2Var.G);
        az7 az7Var = az7.c;
        ys1 b = c.b(valueOf, valueOf2, az7Var).a(this.F, cy2Var.F).a(this.H, cy2Var.H).b(Integer.valueOf(this.I), Integer.valueOf(cy2Var.I), az7Var).c(this.N, cy2Var.N).c(this.K, cy2Var.K).b(Integer.valueOf(this.L), Integer.valueOf(cy2Var.L), az7Var).a(this.M, cy2Var.M).c(z2, cy2Var.f).b(Integer.valueOf(this.R), Integer.valueOf(cy2Var.R), az7Var);
        this.D.getClass();
        ys1 b2 = b.c(this.S, cy2Var.S).c(this.T, cy2Var.T).c(this.U, cy2Var.U).b(Integer.valueOf(this.O), Integer.valueOf(cy2Var.O), a).b(Integer.valueOf(this.P), Integer.valueOf(cy2Var.P), a);
        if (Objects.equals(this.C, cy2Var.C)) {
            b2 = b2.b(Integer.valueOf(this.Q), Integer.valueOf(i), a);
        }
        return b2.e();
    }
}
