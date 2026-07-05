package defpackage;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ypa  reason: default package */
/* loaded from: classes.dex */
public class ypa {
    public static final uk h = new uk(23);
    public static final uk i = new uk(24);
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final Object f;
    public final Object g;

    public ypa(int i2) {
        this.a = 1;
        this.b = i2;
        if (i2 > 0) {
            this.f = new lz6(0);
            this.g = new Object();
            return;
        }
        vs.m("maxSize <= 0");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(int i2, float f) {
        xpa xpaVar;
        xpa[] xpaVarArr = (xpa[]) this.g;
        ArrayList arrayList = (ArrayList) this.f;
        if (this.b != 1) {
            Collections.sort(arrayList, h);
            this.b = 1;
        }
        int i3 = this.e;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.e = i4;
            xpaVar = xpaVarArr[i4];
        } else {
            xpaVar = new Object();
        }
        int i5 = this.c;
        this.c = i5 + 1;
        xpaVar.a = i5;
        xpaVar.b = i2;
        xpaVar.c = f;
        arrayList.add(xpaVar);
        this.d += i2;
        while (true) {
            int i6 = this.d;
            if (i6 > 2000) {
                int i7 = i6 - 2000;
                xpa xpaVar2 = (xpa) arrayList.get(0);
                int i8 = xpaVar2.b;
                if (i8 <= i7) {
                    this.d -= i8;
                    arrayList.remove(0);
                    int i9 = this.e;
                    if (i9 < 5) {
                        this.e = i9 + 1;
                        xpaVarArr[i9] = xpaVar2;
                    }
                } else {
                    xpaVar2.b = i8 - i7;
                    this.d -= i7;
                }
            } else {
                return;
            }
        }
    }

    public void b() {
        View view = (View) nk2.n(1, (ArrayList) this.f);
        this.c = ((StaggeredGridLayoutManager) this.g).q.d(view);
        ((eya) view.getLayoutParams()).getClass();
    }

    public void c() {
        ((ArrayList) this.f).clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public Object d(Object obj) {
        obj.getClass();
        return null;
    }

    public int e() {
        boolean z = ((StaggeredGridLayoutManager) this.g).v;
        ArrayList arrayList = (ArrayList) this.f;
        if (z) {
            return g(arrayList.size() - 1, -1);
        }
        return g(0, arrayList.size());
    }

    public int f() {
        boolean z = ((StaggeredGridLayoutManager) this.g).v;
        ArrayList arrayList = (ArrayList) this.f;
        if (z) {
            return g(0, arrayList.size());
        }
        return g(arrayList.size() - 1, -1);
    }

    public int g(int i2, int i3) {
        int i4;
        boolean z;
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        int m = staggeredGridLayoutManager.q.m();
        int i5 = staggeredGridLayoutManager.q.i();
        if (i3 > i2) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        while (i2 != i3) {
            View view = (View) ((ArrayList) this.f).get(i2);
            int g = staggeredGridLayoutManager.q.g(view);
            int d = staggeredGridLayoutManager.q.d(view);
            boolean z2 = false;
            if (g <= i5) {
                z = true;
            } else {
                z = false;
            }
            if (d >= m) {
                z2 = true;
            }
            if (z && z2 && (g < m || d > i5)) {
                return el9.E(view);
            }
            i2 += i4;
        }
        return -1;
    }

    public Object h(Object obj) {
        Object put;
        obj.getClass();
        synchronized (((kh5) this.g)) {
            lz6 lz6Var = (lz6) this.f;
            lz6Var.getClass();
            Object obj2 = lz6Var.a.get(obj);
            if (obj2 != null) {
                this.d++;
                return obj2;
            }
            this.e++;
            Object d = d(obj);
            if (d == null) {
                return null;
            }
            synchronized (((kh5) this.g)) {
                lz6 lz6Var2 = (lz6) this.f;
                lz6Var2.getClass();
                put = lz6Var2.a.put(obj, d);
                if (put != null) {
                    lz6 lz6Var3 = (lz6) this.f;
                    lz6Var3.getClass();
                    lz6Var3.a.put(obj, put);
                } else {
                    int i2 = this.c;
                    o(obj, d);
                    this.c = i2 + 1;
                }
            }
            if (put != null) {
                return put;
            }
            p(this.b);
            return d;
        }
    }

    public int i(int i2) {
        int i3 = this.c;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (((ArrayList) this.f).size() == 0) {
            return i2;
        }
        b();
        return this.c;
    }

    public View j(int i2, int i3) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        ArrayList arrayList = (ArrayList) this.f;
        View view = null;
        if (i3 == -1) {
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                View view2 = (View) arrayList.get(i4);
                if ((staggeredGridLayoutManager.v && el9.E(view2) <= i2) || ((!staggeredGridLayoutManager.v && el9.E(view2) >= i2) || !view2.hasFocusable())) {
                    break;
                }
                i4++;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size() - 1;
        while (size2 >= 0) {
            View view3 = (View) arrayList.get(size2);
            if ((staggeredGridLayoutManager.v && el9.E(view3) >= i2) || ((!staggeredGridLayoutManager.v && el9.E(view3) <= i2) || !view3.hasFocusable())) {
                break;
            }
            size2--;
            view = view3;
        }
        return view;
    }

    public float k() {
        ArrayList arrayList = (ArrayList) this.f;
        if (this.b != 0) {
            Collections.sort(arrayList, i);
            this.b = 0;
        }
        float f = 0.5f * this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            xpa xpaVar = (xpa) arrayList.get(i3);
            i2 += xpaVar.b;
            if (i2 >= f) {
                return xpaVar.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((xpa) nk2.n(1, arrayList)).c;
    }

    public int l(int i2) {
        ArrayList arrayList = (ArrayList) this.f;
        int i3 = this.b;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (arrayList.size() == 0) {
            return i2;
        }
        View view = (View) arrayList.get(0);
        this.b = ((StaggeredGridLayoutManager) this.g).q.g(view);
        ((eya) view.getLayoutParams()).getClass();
        return this.b;
    }

    public Object m(Object obj, Object obj2) {
        Object put;
        obj.getClass();
        obj2.getClass();
        synchronized (((kh5) this.g)) {
            int i2 = this.c;
            o(obj, obj2);
            this.c = i2 + 1;
            lz6 lz6Var = (lz6) this.f;
            lz6Var.getClass();
            put = lz6Var.a.put(obj, obj2);
            if (put != null) {
                int i3 = this.c;
                o(obj, put);
                this.c = i3 - 1;
            }
        }
        p(this.b);
        return put;
    }

    public Object n(Object obj) {
        Object remove;
        obj.getClass();
        synchronized (((kh5) this.g)) {
            lz6 lz6Var = (lz6) this.f;
            lz6Var.getClass();
            remove = lz6Var.a.remove(obj);
            if (remove != null) {
                int i2 = this.c;
                o(obj, remove);
                this.c = i2 - 1;
            }
        }
        return remove;
    }

    public void o(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(int r5) {
        /*
            r4 = this;
        L0:
            java.lang.Object r0 = r4.g
            kh5 r0 = (defpackage.kh5) r0
            monitor-enter(r0)
            int r1 = r4.c     // Catch: java.lang.Throwable -> L1a
            if (r1 < 0) goto L6a
            java.lang.Object r1 = r4.f     // Catch: java.lang.Throwable -> L1a
            lz6 r1 = (defpackage.lz6) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1c
            int r1 = r4.c     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L6a
            goto L1c
        L1a:
            r4 = move-exception
            goto L72
        L1c:
            int r1 = r4.c     // Catch: java.lang.Throwable -> L1a
            if (r1 <= r5) goto L68
            java.lang.Object r1 = r4.f     // Catch: java.lang.Throwable -> L1a
            lz6 r1 = (defpackage.lz6) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L2d
            goto L68
        L2d:
            java.lang.Object r1 = r4.f     // Catch: java.lang.Throwable -> L1a
            lz6 r1 = (defpackage.lz6) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L1a
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L1a
            r1.getClass()     // Catch: java.lang.Throwable -> L1a
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = defpackage.sl1.d0(r1)     // Catch: java.lang.Throwable -> L1a
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L46
            monitor-exit(r0)
            return
        L46:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r3 = r4.f     // Catch: java.lang.Throwable -> L1a
            lz6 r3 = (defpackage.lz6) r3     // Catch: java.lang.Throwable -> L1a
            r3.getClass()     // Catch: java.lang.Throwable -> L1a
            r2.getClass()     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r3 = r3.a     // Catch: java.lang.Throwable -> L1a
            r3.remove(r2)     // Catch: java.lang.Throwable -> L1a
            int r3 = r4.c     // Catch: java.lang.Throwable -> L1a
            r4.o(r2, r1)     // Catch: java.lang.Throwable -> L1a
            int r3 = r3 + (-1)
            r4.c = r3     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            goto L0
        L68:
            monitor-exit(r0)
            return
        L6a:
            java.lang.String r4 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L1a
            throw r5     // Catch: java.lang.Throwable -> L1a
        L72:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ypa.p(int):void");
    }

    public String toString() {
        int i2;
        String str;
        switch (this.a) {
            case 1:
                synchronized (((kh5) this.g)) {
                    try {
                        int i3 = this.d;
                        int i4 = this.e + i3;
                        if (i4 != 0) {
                            i2 = (i3 * 100) / i4;
                        } else {
                            i2 = 0;
                        }
                        str = "LruCache[maxSize=" + this.b + ",hits=" + this.d + ",misses=" + this.e + ",hitRate=" + i2 + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public ypa() {
        this.a = 0;
        this.g = new xpa[5];
        this.f = new ArrayList();
        this.b = -1;
    }

    public ypa(StaggeredGridLayoutManager staggeredGridLayoutManager, int i2) {
        this.a = 2;
        this.g = staggeredGridLayoutManager;
        this.f = new ArrayList();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
        this.e = i2;
    }
}
