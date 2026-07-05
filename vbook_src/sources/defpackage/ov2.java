package defpackage;

import android.content.Context;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ov2  reason: default package */
/* loaded from: classes.dex */
public final class ov2 {
    public boolean a;
    public int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;

    public ov2(List list, List list2, boolean z, int i, j25 j25Var, float f, j25 j25Var2, float f2) {
        list.getClass();
        this.c = list;
        this.d = list2;
        this.a = z;
        this.b = i;
        this.e = j25Var;
        this.f = j25Var2;
        int size = list.size();
        q1d[] q1dVarArr = new q1d[size];
        for (int i2 = 0; i2 < size; i2++) {
            ((w27) ((List) this.c).get(i2)).S();
            q1dVarArr[i2] = null;
        }
        this.g = q1dVarArr;
    }

    public static ov2 b(ov2 ov2Var, int i, jp5 jp5Var, int i2) {
        if ((i2 & 1) != 0) {
            i = ov2Var.b;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            jp5Var = (jp5) ov2Var.e;
        }
        cna cnaVar = (cna) ov2Var.f;
        return new ov2((jp5) ov2Var.c, (List) ov2Var.d, i3, jp5Var, cnaVar, (ox9) ov2Var.g, ov2Var.a);
    }

    public void a(jp5 jp5Var, pz5 pz5Var) {
        Context context = jp5Var.a;
        jp5 jp5Var2 = (jp5) this.c;
        if (context == jp5Var2.a) {
            if (jp5Var.b != n68.a) {
                if (jp5Var.c == jp5Var2.c) {
                    if (jp5Var.o == jp5Var2.o) {
                        return;
                    }
                    vm1.e(pz5Var, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.", "Interceptor '");
                    return;
                }
                vm1.e(pz5Var, "' cannot modify the request's target.", "Interceptor '");
                return;
            }
            vm1.e(pz5Var, "' cannot set the request's data to null.", "Interceptor '");
            return;
        }
        vm1.e(pz5Var, "' cannot modify the request's context.", "Interceptor '");
    }

    public d67 c(int i) {
        c9b c9bVar;
        HashMap hashMap = (HashMap) this.e;
        d67 d67Var = (d67) hashMap.get(Integer.valueOf(i));
        if (d67Var != null) {
            return d67Var;
        }
        HashMap hashMap2 = (HashMap) this.d;
        c9b c9bVar2 = (c9b) hashMap2.get(Integer.valueOf(i));
        if (c9bVar2 == null) {
            final gg2 gg2Var = (gg2) this.f;
            gg2Var.getClass();
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                c9bVar2 = new c9b() { // from class: mv2
                                    @Override // defpackage.c9b
                                    public final Object get() {
                                        int i2 = r3;
                                        gg2 gg2Var2 = gg2Var;
                                        Object obj = this;
                                        switch (i2) {
                                            case 0:
                                                return pv2.e((Class) obj, gg2Var2);
                                            case 1:
                                                return pv2.e((Class) obj, gg2Var2);
                                            case 2:
                                                return pv2.e((Class) obj, gg2Var2);
                                            default:
                                                return new e89(gg2Var2, (ut2) ((ov2) obj).c);
                                        }
                                    }
                                };
                            } else {
                                vs.m(a82.j(i, "Unrecognized contentType: "));
                                c9bVar2 = null;
                            }
                        } else {
                            c9bVar = new nv2(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(d67.class), 0);
                        }
                    } else {
                        final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(d67.class);
                        c9bVar = new c9b() { // from class: mv2
                            @Override // defpackage.c9b
                            public final Object get() {
                                int i2 = r3;
                                gg2 gg2Var2 = gg2Var;
                                Object obj = asSubclass;
                                switch (i2) {
                                    case 0:
                                        return pv2.e((Class) obj, gg2Var2);
                                    case 1:
                                        return pv2.e((Class) obj, gg2Var2);
                                    case 2:
                                        return pv2.e((Class) obj, gg2Var2);
                                    default:
                                        return new e89(gg2Var2, (ut2) ((ov2) obj).c);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(d67.class);
                    c9bVar = new c9b() { // from class: mv2
                        @Override // defpackage.c9b
                        public final Object get() {
                            int i2 = r3;
                            gg2 gg2Var2 = gg2Var;
                            Object obj = asSubclass2;
                            switch (i2) {
                                case 0:
                                    return pv2.e((Class) obj, gg2Var2);
                                case 1:
                                    return pv2.e((Class) obj, gg2Var2);
                                case 2:
                                    return pv2.e((Class) obj, gg2Var2);
                                default:
                                    return new e89(gg2Var2, (ut2) ((ov2) obj).c);
                            }
                        }
                    };
                }
                c9bVar2 = c9bVar;
            } else {
                final Class asSubclass3 = DashMediaSource$Factory.class.asSubclass(d67.class);
                c9bVar2 = new c9b() { // from class: mv2
                    @Override // defpackage.c9b
                    public final Object get() {
                        int i2 = r3;
                        gg2 gg2Var2 = gg2Var;
                        Object obj = asSubclass3;
                        switch (i2) {
                            case 0:
                                return pv2.e((Class) obj, gg2Var2);
                            case 1:
                                return pv2.e((Class) obj, gg2Var2);
                            case 2:
                                return pv2.e((Class) obj, gg2Var2);
                            default:
                                return new e89(gg2Var2, (ut2) ((ov2) obj).c);
                        }
                    }
                };
            }
            hashMap2.put(Integer.valueOf(i), c9bVar2);
        }
        d67 d67Var2 = (d67) c9bVar2.get();
        d67Var2.a((abf) this.g);
        d67Var2.b(this.a);
        d67Var2.d(this.b);
        hashMap.put(Integer.valueOf(i), d67Var2);
        return d67Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(defpackage.n42 r7) {
        /*
            r6 = this;
            int r0 = r6.b
            boolean r1 = r7 instanceof defpackage.sj9
            if (r1 == 0) goto L15
            r1 = r7
            sj9 r1 = (defpackage.sj9) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            sj9 r1 = new sj9
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r1.b
            int r2 = r1.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            pz5 r0 = r1.a
            defpackage.hre.r(r7)
            goto L53
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r3
        L30:
            defpackage.hre.r(r7)
            java.lang.Object r7 = r6.d
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = r7.get(r0)
            pz5 r7 = (defpackage.pz5) r7
            int r0 = r0 + r4
            r2 = 6
            ov2 r0 = b(r6, r0, r3, r2)
            r1.a = r7
            r1.d = r4
            java.lang.Object r0 = r7.a(r0, r1)
            n82 r1 = defpackage.n82.a
            if (r0 != r1) goto L50
            return r1
        L50:
            r5 = r0
            r0 = r7
            r7 = r5
        L53:
            wp5 r7 = (defpackage.wp5) r7
            jp5 r1 = r7.a()
            r6.a(r1, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ov2.d(n42):java.lang.Object");
    }

    public ov2(jp5 jp5Var, List list, int i, jp5 jp5Var2, cna cnaVar, ox9 ox9Var, boolean z) {
        this.c = jp5Var;
        this.d = list;
        this.b = i;
        this.e = jp5Var2;
        this.f = cnaVar;
        this.g = ox9Var;
        this.a = z;
    }

    public ov2(ut2 ut2Var, abf abfVar) {
        this.c = ut2Var;
        this.g = abfVar;
        this.d = new HashMap();
        this.e = new HashMap();
        this.a = true;
        this.b = 3;
    }
}
