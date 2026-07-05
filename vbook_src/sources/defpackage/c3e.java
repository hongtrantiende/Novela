package defpackage;

import android.content.Context;
import android.graphics.RenderEffect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c3e  reason: default package */
/* loaded from: classes.dex */
public abstract class c3e implements h4b, ujc, tve {
    public Object a;

    public c3e(int i) {
        switch (i) {
            case 3:
                this.a = new HashMap();
                return;
            case 4:
                wu7 wu7Var = oy5.a;
                this.a = new wu7();
                return;
            case 5:
            case 6:
            case 9:
            case 10:
            case 12:
            default:
                this.a = new ArrayList();
                return;
            case 7:
                this.a = new Object();
                return;
            case 8:
                this.a = new p81();
                return;
            case 11:
                this.a = yae.z(Boolean.FALSE);
                return;
            case 13:
                this.a = new ConcurrentHashMap();
                return;
        }
    }

    public static wj2 J(wfd wfdVar) {
        wfdVar.getClass();
        if (!wfdVar.e) {
            return new ra4(wfdVar);
        }
        return new s8b(Boolean.TRUE, wfdVar);
    }

    public List A(vh6 vh6Var, int i, long j) {
        wu7 wu7Var = (wu7) this.a;
        List list = (List) wu7Var.b(i);
        if (list != null) {
            return list;
        }
        List a = vh6Var.a(i);
        int size = a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((w27) a.get(i2)).M(j));
        }
        wu7Var.i(i, arrayList);
        return arrayList;
    }

    public abstract Object B();

    public void C(int i, xt4 xt4Var) {
        mm mmVar = (mm) this.a;
        km kmVar = (km) mmVar.b.get();
        if (kmVar != null) {
            if (kmVar.d.add(Integer.valueOf(i))) {
                xt4Var.invoke(new u0(kmVar, 5));
                return;
            }
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        xt4Var.invoke(new u0(linkedHashSet, 6));
        String[] strArr = (String[]) linkedHashSet.toArray(new String[0]);
        mmVar.S((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void D(km kmVar, km kmVar2, Throwable th, Object obj) {
        LinkedHashSet linkedHashSet = kmVar.d;
        ArrayList arrayList = kmVar.c;
        ArrayList arrayList2 = kmVar.b;
        LinkedHashSet linkedHashSet2 = kmVar.e;
        boolean z = kmVar.f;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        z2 = false;
        if (kmVar2 == null) {
            if (z && kmVar.g) {
                if (!linkedHashSet2.isEmpty()) {
                    String[] strArr = (String[]) linkedHashSet2.toArray(new String[0]);
                    ((mm) this.a).S((String[]) Arrays.copyOf(strArr, strArr.length));
                }
                linkedHashSet2.clear();
                linkedHashSet.clear();
                int size = arrayList2.size();
                while (i < size) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    ((vt4) obj2).invoke();
                }
                arrayList2.clear();
            } else {
                try {
                    int size2 = arrayList.size();
                    while (i2 < size2) {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        ((vt4) obj3).invoke();
                    }
                    arrayList.clear();
                } catch (Throwable th2) {
                    if (th != null) {
                        StringBuilder sb = new StringBuilder("Exception while rolling back from an exception.\nOriginal exception: ");
                        sb.append(th);
                        Throwable cause = th.getCause();
                        sb.append("\nwith cause ");
                        sb.append(cause);
                        sb.append("\n\nRollback exception: ");
                        sb.append(th2);
                        throw new Throwable(sb.toString(), th2);
                    }
                    throw th2;
                }
            }
        } else {
            if (z && kmVar.g) {
                z2 = true;
            }
            kmVar2.g = z2;
            kmVar2.b.addAll(arrayList2);
            kmVar2.c.addAll(arrayList);
            kmVar2.d.addAll(linkedHashSet);
            kmVar2.e.addAll(linkedHashSet2);
        }
        if (th == null) {
            return;
        }
        throw th;
    }

    public void E(int i, Object obj, uv4 uv4Var, Object obj2) {
        if (!c16.i(obj, ax1.a)) {
            return;
        }
        l(i, uv4Var, null);
    }

    public abstract xt4 F(u8a u8aVar);

    public abstract void G(ta1 ta1Var);

    public void H(String str, String str2) {
        str.getClass();
        str2.getClass();
        N(str2);
        List t = t(str);
        t.clear();
        t.add(str2);
    }

    public abstract void I(Object obj);

    public abstract void K(tkc tkcVar);

    public abstract void L();

    public void M(String str) {
        str.getClass();
    }

    public void N(String str) {
        str.getClass();
    }

    public abstract Object O();

    public abstract void P(Object obj, long j, byte b);

    public Object Q(njf njfVar, hre hreVar) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.a;
        Object obj = concurrentHashMap.get(njfVar);
        if (obj != null) {
            return obj;
        }
        Object O = O();
        Object putIfAbsent = concurrentHashMap.putIfAbsent(njfVar, O);
        if (putIfAbsent == null) {
            int t = hreVar.t();
            for (int i = 0; i < t; i++) {
                if (ajf.f.equals(hreVar.u(i))) {
                    hreVar.v(i);
                }
            }
            return O;
        }
        return putIfAbsent;
    }

    public abstract boolean R(Object obj, long j);

    public abstract void S(Object obj, long j, boolean z);

    public abstract float T(Object obj, long j);

    public abstract void U(Object obj, long j, float f);

    public abstract double V(Object obj, long j);

    public void W() {
        ete eteVar = ((lte) this.a).C;
        lte.m(eteVar);
        eteVar.W();
    }

    public abstract void X(Object obj, long j, double d);

    @Override // defpackage.h4b
    public Set a() {
        Set entrySet = ((Map) this.a).entrySet();
        entrySet.getClass();
        Set unmodifiableSet = Collections.unmodifiableSet(entrySet);
        unmodifiableSet.getClass();
        return unmodifiableSet;
    }

    @Override // defpackage.tve
    public jf8 b() {
        throw null;
    }

    @Override // defpackage.tve
    public ppe c() {
        throw null;
    }

    @Override // defpackage.h4b
    public void d(String str, List list) {
        str.getClass();
        list.getClass();
        List t = t(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            N((String) it.next());
        }
        xl1.P(t, list);
    }

    @Override // defpackage.tve
    public kh5 e() {
        throw null;
    }

    @Override // defpackage.tve
    public ete f() {
        throw null;
    }

    @Override // defpackage.tve
    public Context g() {
        throw null;
    }

    @Override // defpackage.h4b
    public void h(String str, String str2) {
        str.getClass();
        str2.getClass();
        N(str2);
        t(str).add(str2);
    }

    public void i(g4b g4bVar) {
        g4bVar.getClass();
        g4bVar.c(new el7(this, 20));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003a, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean j(int r8, defpackage.uv4 r9, java.lang.Object r10) {
        /*
            r7 = this;
            java.util.ArrayList r0 = r9.a
            r1 = 1
            if (r0 != 0) goto La
            r10 = 0
            r7.l(r8, r9, r10)
            return r1
        La:
            int r2 = r0.size()
            r3 = 0
            r4 = r3
        L10:
            if (r4 >= r2) goto L3a
            java.lang.Object r5 = r0.get(r4)
            boolean r6 = r5 instanceof defpackage.lv4
            if (r6 == 0) goto L21
            if (r5 == r10) goto L1d
            goto L32
        L1d:
            r7.l(r3, r9, r5)
            return r1
        L21:
            boolean r6 = r5 instanceof defpackage.uv4
            if (r6 == 0) goto L35
            r6 = r5
            uv4 r6 = (defpackage.uv4) r6
            boolean r6 = r7.j(r8, r6, r10)
            if (r6 == 0) goto L32
            r7.l(r3, r9, r5)
            return r1
        L32:
            int r4 = r4 + 1
            goto L10
        L35:
            java.lang.String r7 = "Unexpected child source info "
            defpackage.xk5.p(r5, r7)
        L3a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c3e.j(int, uv4, java.lang.Object):boolean");
    }

    public void l(int i, uv4 uv4Var, Object obj) {
        ((ArrayList) this.a).add(new ow1(i, null, null));
    }

    public abstract void m(oaa oaaVar);

    public RenderEffect n() {
        RenderEffect renderEffect = (RenderEffect) this.a;
        if (renderEffect == null) {
            RenderEffect r = r();
            this.a = r;
            return r;
        }
        return renderEffect;
    }

    public abstract void o(u8a u8aVar);

    public abstract void p();

    public abstract Object q(Object obj);

    public abstract RenderEffect r();

    public abstract void s();

    public List t(String str) {
        Map map = (Map) this.a;
        List list = (List) map.get(str);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            M(str);
            map.put(str, arrayList);
            return arrayList;
        }
        return list;
    }

    public Object u(Object obj) {
        synchronized (((HashMap) this.a)) {
            try {
                if (((HashMap) this.a).containsKey(obj)) {
                    return ((HashMap) this.a).get(obj);
                }
                Object q = q(obj);
                ((HashMap) this.a).put(obj, q);
                return q;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String v(String str) {
        List w = w(str);
        if (w != null) {
            return (String) sl1.e0(w);
        }
        return null;
    }

    public List w(String str) {
        str.getClass();
        return (List) ((Map) this.a).get(str);
    }

    public abstract wh6 x(int i, int i2, int i3, long j);

    public String y() {
        return null;
    }

    public abstract Object z();

    public c3e(lte lteVar) {
        am8.s(lteVar);
        this.a = lteVar;
    }

    public /* synthetic */ c3e(Object obj) {
        this.a = obj;
    }

    public c3e(mm mmVar) {
        mmVar.getClass();
        this.a = mmVar;
    }
}
