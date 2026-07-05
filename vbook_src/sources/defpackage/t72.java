package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t72  reason: default package */
/* loaded from: classes.dex */
public final class t72 extends m03 implements z7a {
    public ikc M;
    public jub N;
    public ol6 O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public j88 S;
    public gtb T;
    public as5 U;
    public zm4 V;

    /* JADX WARN: Multi-variable type inference failed */
    public static void K1(ol6 ol6Var, String str, boolean z, boolean z2) {
        if (!z && z2) {
            wub wubVar = ol6Var.e;
            h72 h72Var = ol6Var.v;
            if (wubVar != null) {
                jub j = ol6Var.d.j(tl1.B(new Object(), new mq1(str, 1)));
                wubVar.a(null, j);
                h72Var.invoke(j);
                return;
            }
            int length = str.length();
            h72Var.invoke(new jub(str, sze.a(length, length), 4));
        }
    }

    @Override // defpackage.z7a
    public final void m1(l8a l8aVar) {
        boolean z = this.R;
        ps psVar = this.N.a;
        r76[] r76VarArr = j8a.a;
        k8a k8aVar = h8a.F;
        r76[] r76VarArr2 = j8a.a;
        r76 r76Var = r76VarArr2[18];
        l8aVar.a(k8aVar, psVar);
        ps psVar2 = this.M.a;
        k8a k8aVar2 = h8a.G;
        r76 r76Var2 = r76VarArr2[19];
        l8aVar.a(k8aVar2, psVar2);
        long j = this.N.b;
        k8a k8aVar3 = h8a.H;
        r76 r76Var3 = r76VarArr2[20];
        l8aVar.a(k8aVar3, new fxb(j));
        j8a.d(l8aVar, ox9.d);
        bj k = h50.k(this.N.a);
        if (k != null) {
            j8a.g(l8aVar, k);
        }
        boolean z2 = false;
        j8a.b(l8aVar, new s72(this, 0));
        int i = this.U.d;
        if (i == 6) {
            f32.a.getClass();
            j8a.f(l8aVar, b32.c);
        } else if (i == 7 || i == 8) {
            f32.a.getClass();
            j8a.f(l8aVar, b32.b);
        } else if (i == 4) {
            f32.a.getClass();
            j8a.f(l8aVar, b32.d);
        }
        boolean z3 = this.Q;
        pvc pvcVar = pvc.a;
        if (!z3) {
            l8aVar.a(h8a.j, pvcVar);
        }
        if (z) {
            l8aVar.a(h8a.N, pvcVar);
        }
        if (this.Q && !this.P) {
            z2 = true;
        }
        k8a k8aVar4 = h8a.Q;
        r76 r76Var4 = r76VarArr2[28];
        l8aVar.a(k8aVar4, Boolean.valueOf(z2));
        j8a.a(l8aVar, new s72(this, 1));
        if (z2) {
            l8aVar.a(s7a.k, new g4(null, new s72(this, 2)));
            l8aVar.a(s7a.o, new g4(null, new s72(this, l8aVar)));
        }
        l8aVar.a(s7a.j, new g4(null, new qo4(this, 11)));
        j8a.c(l8aVar, this.U.e, new r72(this, 6));
        l8aVar.a(s7a.b, new g4(null, new r72(this, 7)));
        l8aVar.a(s7a.c, new g4(null, new r72(this, 1)));
        if (!fxb.d(this.N.b) && !z) {
            l8aVar.a(s7a.q, new g4(null, new r72(this, 2)));
            if (this.Q && !this.P) {
                l8aVar.a(s7a.r, new g4(null, new r72(this, 3)));
            }
        }
        if (this.Q && !this.P) {
            l8aVar.a(s7a.s, new g4(null, new r72(this, 5)));
        }
    }

    @Override // defpackage.z7a
    public final boolean o1() {
        return true;
    }
}
