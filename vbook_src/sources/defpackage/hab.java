package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hab  reason: default package */
/* loaded from: classes.dex */
public final class hab extends mq7 implements d19, r13, c19 {
    public Object K;
    public Object L;
    public Object[] M;
    public PointerInputEventHandler N;
    public iya O;
    public r09 P = dab.a;
    public final gw7 Q;
    public final gw7 R;
    public final gw7 S;
    public r09 T;
    public long U;

    public hab(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.K = obj;
        this.L = obj2;
        this.M = objArr;
        this.N = pointerInputEventHandler;
        gw7 gw7Var = new gw7(new gab[16], 0);
        this.Q = gw7Var;
        this.R = gw7Var;
        this.S = new gw7(new gab[16], 0);
        this.U = 0L;
    }

    @Override // defpackage.mq7
    public final void A1() {
        J1();
    }

    @Override // defpackage.r13
    public final float G0() {
        return voe.v(this).V.G0();
    }

    public final Object H1(lu4 lu4Var, m42 m42Var) {
        f61 f61Var = new f61(1, w92.t(m42Var));
        f61Var.u();
        gab gabVar = new gab(this, f61Var);
        synchronized (this.R) {
            this.Q.b(gabVar);
            new ow9(w92.t(w92.q(gabVar, gabVar, lu4Var))).resumeWith(pvc.a);
        }
        f61Var.w(new ko9(gabVar, 8));
        return f61Var.s();
    }

    public final void I1(r09 r09Var, s09 s09Var) {
        f61 f61Var;
        f61 f61Var2;
        synchronized (this.R) {
            gw7 gw7Var = this.S;
            gw7Var.c(gw7Var.c, this.Q);
        }
        try {
            int ordinal = s09Var.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new gt1(7);
                    }
                } else {
                    gw7 gw7Var2 = this.S;
                    int i = gw7Var2.c - 1;
                    Object[] objArr = gw7Var2.a;
                    if (i < objArr.length) {
                        while (i >= 0) {
                            gab gabVar = (gab) objArr[i];
                            if (s09Var == gabVar.d && (f61Var2 = gabVar.c) != null) {
                                gabVar.c = null;
                                f61Var2.resumeWith(r09Var);
                            }
                            i--;
                        }
                    }
                    this.S.g();
                }
            }
            gw7 gw7Var3 = this.S;
            Object[] objArr2 = gw7Var3.a;
            int i2 = gw7Var3.c;
            for (int i3 = 0; i3 < i2; i3++) {
                gab gabVar2 = (gab) objArr2[i3];
                if (s09Var == gabVar2.d && (f61Var = gabVar2.c) != null) {
                    gabVar2.c = null;
                    f61Var.resumeWith(r09Var);
                }
            }
            this.S.g();
        } catch (Throwable th) {
            this.S.g();
            throw th;
        }
    }

    public final void J1() {
        iya iyaVar = this.O;
        if (iyaVar != null) {
            iyaVar.t(new nx8("Pointer input was reset", 2));
            this.O = null;
        }
    }

    @Override // defpackage.c19
    public final void b0(r09 r09Var, s09 s09Var, long j) {
        this.U = j;
        if (s09Var == s09.a) {
            this.P = r09Var;
        }
        if (this.O == null) {
            this.O = z87.v(v1(), null, p82.d, new ov9(this, (m42) null, 10), 1);
        }
        I1(r09Var, s09Var);
        List list = r09Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (!ie2.m((z09) list.get(i))) {
                    break;
                }
                i++;
            } else {
                r09Var = null;
                break;
            }
        }
        this.T = r09Var;
    }

    @Override // defpackage.r13
    public final float f() {
        return voe.v(this).V.f();
    }

    @Override // defpackage.c19
    public final void j1() {
        J1();
    }

    @Override // defpackage.c19
    public final void n0() {
        r09 r09Var = this.T;
        if (r09Var != null) {
            List list = r09Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((z09) list.get(i)).d) {
                    ArrayList arrayList = new ArrayList(list.size());
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        z09 z09Var = (z09) list.get(i2);
                        long j = z09Var.a;
                        long j2 = z09Var.c;
                        long j3 = z09Var.b;
                        float f = z09Var.e;
                        boolean z = z09Var.d;
                        arrayList.add(new z09(j, j3, j2, false, f, j3, j2, z, z, z09Var.i, 0L, 1.0f, 0L));
                    }
                    r09 r09Var2 = new r09(arrayList, null);
                    this.P = r09Var2;
                    I1(r09Var2, s09.a);
                    I1(r09Var2, s09.b);
                    I1(r09Var2, s09.c);
                    this.T = null;
                    return;
                }
            }
        }
    }

    @Override // defpackage.f03
    public final void p() {
        J1();
    }
}
