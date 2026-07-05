package defpackage;

import android.content.Context;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dk6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dk6 implements xt4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ dk6(ck6 ck6Var, ArrayList arrayList, boolean z, long j, vh6 vh6Var) {
        this.d = ck6Var;
        this.e = arrayList;
        this.b = z;
        this.c = j;
        this.f = vh6Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                final ArrayList arrayList = (ArrayList) obj3;
                final vh6 vh6Var = (vh6) obj2;
                lw8 lw8Var = (lw8) obj;
                final boolean z = this.b;
                final long j = this.c;
                xt4 xt4Var = new xt4() { // from class: ek6
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj5) {
                        int i2;
                        boolean z2;
                        boolean z3;
                        List list;
                        int i3;
                        p15 p15Var;
                        int i4;
                        int i5;
                        int i6;
                        int i7;
                        long j2;
                        lw8 lw8Var2 = (lw8) obj5;
                        ArrayList arrayList2 = arrayList;
                        int size = arrayList2.size();
                        int i8 = 0;
                        while (i8 < size) {
                            ik6 ik6Var = (ik6) arrayList2.get(i8);
                            boolean I0 = vh6Var.b.I0();
                            boolean z4 = ik6Var.d;
                            if (ik6Var.r == Integer.MIN_VALUE) {
                                ov5.a("position() should be called first");
                            }
                            List list2 = ik6Var.c;
                            int i9 = 0;
                            for (int size2 = list2.size(); i9 < size2; size2 = i3) {
                                mw8 mw8Var = (mw8) list2.get(i9);
                                int i10 = ik6Var.s;
                                if (z4) {
                                    i2 = mw8Var.b;
                                } else {
                                    i2 = mw8Var.a;
                                }
                                int i11 = i10 - i2;
                                int i12 = ik6Var.t;
                                int i13 = i8;
                                long j3 = ik6Var.w;
                                ArrayList arrayList3 = arrayList2;
                                int i14 = size;
                                mh6 a = ik6Var.j.a(i9, ik6Var.b);
                                if (a != null) {
                                    if (I0) {
                                        a.n = j3;
                                        z2 = I0;
                                        z3 = z4;
                                        list = list2;
                                        i3 = size2;
                                    } else {
                                        z2 = I0;
                                        z3 = z4;
                                        list = list2;
                                        i3 = size2;
                                        if (!py5.b(a.n, 9223372034707292159L)) {
                                            j2 = a.n;
                                        } else {
                                            j2 = j3;
                                        }
                                        long d = py5.d(j2, ((py5) a.r.getValue()).a);
                                        if ((ik6Var.l(j3) <= i11 && ik6Var.l(d) <= i11) || (ik6Var.l(j3) >= i12 && ik6Var.l(d) >= i12)) {
                                            a.b();
                                        }
                                        j3 = d;
                                    }
                                    p15Var = a.o;
                                } else {
                                    z2 = I0;
                                    z3 = z4;
                                    list = list2;
                                    i3 = size2;
                                    p15Var = null;
                                }
                                if (z) {
                                    if (z3) {
                                        i5 = (int) (j3 >> 32);
                                    } else {
                                        int i15 = ik6Var.r - ((int) (j3 >> 32));
                                        if (z3) {
                                            i4 = mw8Var.b;
                                        } else {
                                            i4 = mw8Var.a;
                                        }
                                        i5 = i15 - i4;
                                    }
                                    if (z3) {
                                        int i16 = ik6Var.r - ((int) (j3 & 4294967295L));
                                        if (z3) {
                                            i7 = mw8Var.b;
                                        } else {
                                            i7 = mw8Var.a;
                                        }
                                        i6 = i16 - i7;
                                    } else {
                                        i6 = (int) (j3 & 4294967295L);
                                    }
                                    j3 = (i6 & 4294967295L) | (i5 << 32);
                                }
                                long d2 = py5.d(j3, j);
                                if (!z2 && a != null) {
                                    a.m = d2;
                                }
                                if (p15Var != null) {
                                    lw8.H(lw8Var2, mw8Var, d2, p15Var);
                                } else {
                                    lw8.F(lw8Var2, mw8Var, d2);
                                }
                                i9++;
                                I0 = z2;
                                i8 = i13;
                                arrayList2 = arrayList3;
                                size = i14;
                                z4 = z3;
                                list2 = list;
                            }
                            i8++;
                        }
                        return pvc.a;
                    }
                };
                lw8Var.a = true;
                xt4Var.invoke(lw8Var);
                lw8Var.a = false;
                ((ck6) obj4).a.u.getValue();
                return pvcVar;
            default:
                cqe.e.l((Context) obj4, (ResolveInfo) obj3, Boolean.valueOf(this.b), (CharSequence) obj2, new fxb(this.c));
                ((apb) obj).close();
                return pvcVar;
        }
    }

    public /* synthetic */ dk6(Context context, ResolveInfo resolveInfo, boolean z, CharSequence charSequence, long j) {
        this.d = context;
        this.e = resolveInfo;
        this.b = z;
        this.f = charSequence;
        this.c = j;
    }
}
