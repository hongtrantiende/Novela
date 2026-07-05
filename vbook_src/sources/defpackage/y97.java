package defpackage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y97  reason: default package */
/* loaded from: classes.dex */
public final class y97 extends jx1 {
    public static final f57 w;
    public final boolean k;
    public final boolean l;
    public final ci0[] m;
    public final ArrayList n;
    public final aac[] o;
    public final ArrayList p;
    public final kh5 q;
    public final HashMap r;
    public final gu7 s;
    public int t;
    public long[][] u;
    public ik1 v;

    /* JADX WARN: Type inference failed for: r4v0, types: [z47, y47] */
    static {
        fr2 fr2Var = new fr2();
        ms5 ms5Var = qs5.b;
        mm9 mm9Var = mm9.e;
        List list = Collections.EMPTY_LIST;
        mm9 mm9Var2 = mm9.e;
        a57 a57Var = new a57();
        w = new f57("MergingMediaSource", new y47(fr2Var), null, new b57(a57Var), j57.B, d57.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kh5, java.lang.Object] */
    public y97(boolean z, boolean z2, ci0... ci0VarArr) {
        ?? obj = new Object();
        this.k = z;
        this.l = z2;
        this.m = ci0VarArr;
        this.q = obj;
        this.p = new ArrayList(Arrays.asList(ci0VarArr));
        this.t = -1;
        this.n = new ArrayList(ci0VarArr.length);
        for (int i = 0; i < ci0VarArr.length; i++) {
            this.n.add(new ArrayList());
        }
        this.o = new aac[ci0VarArr.length];
        this.u = new long[0];
        this.r = new HashMap();
        kue.e(8, "expectedKeys");
        kue.e(2, "expectedValuesPerKey");
        us1 a = us1.a(8);
        fu7 fu7Var = new fu7();
        gu7 gu7Var = new gu7(a);
        gu7Var.C = fu7Var;
        this.s = gu7Var;
    }

    @Override // defpackage.ci0
    public final n57 b(e67 e67Var, ij1 ij1Var, long j) {
        ci0[] ci0VarArr = this.m;
        int length = ci0VarArr.length;
        n57[] n57VarArr = new n57[length];
        aac[] aacVarArr = this.o;
        aac aacVar = aacVarArr[0];
        Object obj = e67Var.a;
        int b = aacVar.b(obj);
        for (int i = 0; i < length; i++) {
            e67 a = e67Var.a(aacVarArr[i].l(b));
            n57VarArr[i] = ci0VarArr[i].b(a, ij1Var, j - this.u[b][i]);
            ((List) this.n.get(i)).add(new x97(a, n57VarArr[i]));
        }
        w97 w97Var = new w97(this.q, this.u[b], n57VarArr);
        if (this.l) {
            Long l = (Long) this.r.get(obj);
            l.getClass();
            sj1 sj1Var = new sj1(w97Var, false, 0L, l.longValue(), 0);
            this.s.j(obj, sj1Var);
            return sj1Var;
        }
        return w97Var;
    }

    @Override // defpackage.ci0
    public final f57 h() {
        ci0[] ci0VarArr = this.m;
        if (ci0VarArr.length > 0) {
            return ci0VarArr[0].h();
        }
        return w;
    }

    @Override // defpackage.jx1, defpackage.ci0
    public final void j() {
        ik1 ik1Var = this.v;
        if (ik1Var == null) {
            super.j();
            return;
        }
        throw ik1Var;
    }

    @Override // defpackage.ci0
    public final void l(ys2 ys2Var) {
        this.j = ys2Var;
        this.i = a2d.p(null);
        int i = 0;
        while (true) {
            ci0[] ci0VarArr = this.m;
            if (i < ci0VarArr.length) {
                x(Integer.valueOf(i), ci0VarArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.ci0
    public final void n(n57 n57Var) {
        n57 n57Var2;
        n57 n57Var3;
        if (this.l) {
            sj1 sj1Var = (sj1) n57Var;
            gu7 gu7Var = this.s;
            Collection collection = gu7Var.a;
            if (collection == null) {
                collection = gu7Var.d();
                gu7Var.a = collection;
            }
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((sj1) entry.getValue()).equals(sj1Var)) {
                    gu7Var.g(entry.getKey(), entry.getValue());
                    break;
                }
            }
            n57Var = sj1Var.a;
        }
        w97 w97Var = (w97) n57Var;
        int i = 0;
        while (true) {
            ci0[] ci0VarArr = this.m;
            if (i < ci0VarArr.length) {
                List list = (List) this.n.get(i);
                boolean[] zArr = w97Var.b;
                n57[] n57VarArr = w97Var.a;
                if (zArr[i]) {
                    n57Var2 = ((s9c) n57VarArr[i]).a;
                } else {
                    n57Var2 = n57VarArr[i];
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= list.size()) {
                        break;
                    } else if (((x97) list.get(i2)).b.equals(n57Var2)) {
                        list.remove(i2);
                        break;
                    } else {
                        i2++;
                    }
                }
                ci0 ci0Var = ci0VarArr[i];
                if (w97Var.b[i]) {
                    n57Var3 = ((s9c) n57VarArr[i]).a;
                } else {
                    n57Var3 = n57VarArr[i];
                }
                ci0Var.n(n57Var3);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.jx1, defpackage.ci0
    public final void p() {
        super.p();
        Arrays.fill(this.o, (Object) null);
        this.t = -1;
        this.v = null;
        ArrayList arrayList = this.p;
        arrayList.clear();
        Collections.addAll(arrayList, this.m);
    }

    @Override // defpackage.ci0
    public final void s(f57 f57Var) {
        this.m[0].s(f57Var);
    }

    @Override // defpackage.jx1
    public final e67 t(Object obj, e67 e67Var) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.n;
        List list = (List) arrayList.get(intValue);
        for (int i = 0; i < list.size(); i++) {
            if (((x97) list.get(i)).a.equals(e67Var)) {
                return ((x97) ((List) arrayList.get(0)).get(i)).a;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.IOException, ik1] */
    @Override // defpackage.jx1
    public final void w(Object obj, ci0 ci0Var, aac aacVar) {
        HashMap hashMap;
        r2 r2Var;
        Integer num = (Integer) obj;
        if (this.v == null) {
            if (this.t == -1) {
                this.t = aacVar.h();
            } else if (aacVar.h() != this.t) {
                this.v = new IOException();
                return;
            }
            int length = this.u.length;
            aac[] aacVarArr = this.o;
            if (length == 0) {
                this.u = (long[][]) Array.newInstance(Long.TYPE, this.t, aacVarArr.length);
            }
            ArrayList arrayList = this.p;
            arrayList.remove(ci0Var);
            aacVarArr[num.intValue()] = aacVar;
            if (arrayList.isEmpty()) {
                if (this.k) {
                    y9c y9cVar = new y9c();
                    for (int i = 0; i < this.t; i++) {
                        long j = -aacVarArr[0].f(i, y9cVar, false).e;
                        for (int i2 = 1; i2 < aacVarArr.length; i2++) {
                            this.u[i][i2] = j - (-aacVarArr[i2].f(i, y9cVar, false).e);
                        }
                    }
                }
                aac aacVar2 = aacVarArr[0];
                u17 u17Var = aacVar2;
                if (this.l) {
                    y9c y9cVar2 = new y9c();
                    int i3 = 0;
                    while (true) {
                        int i4 = this.t;
                        hashMap = this.r;
                        if (i3 >= i4) {
                            break;
                        }
                        long j2 = Long.MIN_VALUE;
                        for (int i5 = 0; i5 < aacVarArr.length; i5++) {
                            long j3 = aacVarArr[i5].f(i3, y9cVar2, false).d;
                            if (j3 != -9223372036854775807L) {
                                long j4 = j3 + this.u[i3][i5];
                                if (j2 == Long.MIN_VALUE || j4 < j2) {
                                    j2 = j4;
                                }
                            }
                        }
                        Object l = aacVarArr[0].l(i3);
                        hashMap.put(l, Long.valueOf(j2));
                        gu7 gu7Var = this.s;
                        Collection collection = (Collection) gu7Var.e.get(l);
                        if (collection == null) {
                            collection = gu7Var.i();
                        }
                        List list = (List) collection;
                        if (list instanceof RandomAccess) {
                            r2Var = new r2(gu7Var, l, list, null);
                        } else {
                            r2Var = new r2(gu7Var, l, list, null);
                        }
                        Iterator it = r2Var.iterator();
                        while (it.hasNext()) {
                            sj1 sj1Var = (sj1) it.next();
                            sj1Var.f = 0L;
                            sj1Var.C = j2;
                        }
                        i3++;
                    }
                    u17Var = new u17(aacVar2, hashMap);
                }
                m(u17Var);
            }
        }
    }
}
