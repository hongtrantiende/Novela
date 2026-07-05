package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hh6  reason: default package */
/* loaded from: classes.dex */
public final class hh6 implements th6 {
    public final mj4 a;

    public hh6(mj4 mj4Var) {
        mj4Var.getClass();
        this.a = mj4Var;
    }

    @Override // defpackage.th6
    public final int a() {
        return this.a.a.size();
    }

    @Override // defpackage.th6
    public final Object b(int i) {
        String str;
        lj4 lj4Var = (lj4) sl1.f0(i, this.a.a);
        if (lj4Var != null) {
            str = lj4Var.a;
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // defpackage.th6
    public final void d(final int i, final Object obj, rv4 rv4Var, final int i2) {
        int i3;
        int i4;
        boolean z;
        hh6 hh6Var;
        int i5;
        Object obj2;
        int i6;
        obj.getClass();
        rv4Var.g0(1941896126);
        if (rv4Var.d(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i3 | i2;
        if (rv4Var.f(this)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if ((i8 & Token.DO) != 130) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i8 & 1, z)) {
            lj4 lj4Var = (lj4) sl1.f0(i, this.a.a);
            if (lj4Var == null) {
                ek9 u = rv4Var.u();
                if (u != null) {
                    u.d = new lu4(this, i, obj, i2, 0) { // from class: gh6
                        public final /* synthetic */ int a;
                        public final /* synthetic */ hh6 b;
                        public final /* synthetic */ int c;
                        public final /* synthetic */ Object d;

                        {
                            this.a = r5;
                            this.b = this;
                        }

                        @Override // defpackage.lu4
                        public final Object invoke(Object obj3, Object obj4) {
                            int i9 = this.a;
                            pvc pvcVar = pvc.a;
                            Object obj5 = this.d;
                            int i10 = this.c;
                            hh6 hh6Var2 = this.b;
                            rv4 rv4Var2 = (rv4) obj3;
                            ((Integer) obj4).getClass();
                            switch (i9) {
                                case 0:
                                    hh6Var2.d(i10, obj5, rv4Var2, xoe.p(1));
                                    return pvcVar;
                                default:
                                    hh6Var2.d(i10, obj5, rv4Var2, xoe.p(1));
                                    return pvcVar;
                            }
                        }
                    };
                    return;
                }
                return;
            }
            hh6Var = this;
            i5 = i;
            obj2 = obj;
            i6 = i2;
            ly1 ly1Var = kv6.a;
            boolean f = rv4Var.f(lj4Var.a);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (f || P == lh9Var) {
                P = new ww1();
                rv4Var.o0(P);
            }
            ww1 ww1Var = (ww1) P;
            boolean h = rv4Var.h(ww1Var);
            Object P2 = rv4Var.P();
            if (h || P2 == lh9Var) {
                P2 = new cq2(ww1Var, 27);
                rv4Var.o0(P2);
            }
            yte.b(ww1Var, (xt4) P2, rv4Var);
            pye.a(kv6.a.a(ww1Var), jce.E(-1949147394, new sj(lj4Var, 24), rv4Var), rv4Var, 48);
        } else {
            hh6Var = this;
            i5 = i;
            obj2 = obj;
            i6 = i2;
            rv4Var.X();
        }
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            final int i9 = i6;
            final Object obj3 = obj2;
            final int i10 = i5;
            final hh6 hh6Var2 = hh6Var;
            u2.d = new lu4(hh6Var2, i10, obj3, i9, 1) { // from class: gh6
                public final /* synthetic */ int a;
                public final /* synthetic */ hh6 b;
                public final /* synthetic */ int c;
                public final /* synthetic */ Object d;

                {
                    this.a = r5;
                    this.b = hh6Var2;
                }

                @Override // defpackage.lu4
                public final Object invoke(Object obj32, Object obj4) {
                    int i92 = this.a;
                    pvc pvcVar = pvc.a;
                    Object obj5 = this.d;
                    int i102 = this.c;
                    hh6 hh6Var22 = this.b;
                    rv4 rv4Var2 = (rv4) obj32;
                    ((Integer) obj4).getClass();
                    switch (i92) {
                        case 0:
                            hh6Var22.d(i102, obj5, rv4Var2, xoe.p(1));
                            return pvcVar;
                        default:
                            hh6Var22.d(i102, obj5, rv4Var2, xoe.p(1));
                            return pvcVar;
                    }
                }
            };
        }
    }
}
