package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m6d  reason: default package */
/* loaded from: classes3.dex */
public final class m6d {
    public final j6d a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final long e;
    public final long f;
    public final int g;
    public final String h;
    public final String i;
    public final double j;
    public final double k;
    public final double l;
    public final Object m;
    public final String n;
    public final Throwable o;

    public m6d(j6d j6dVar, boolean z, boolean z2, long j, long j2, long j3, int i, String str, String str2, double d, double d2, double d3, Object obj, String str3, Throwable th) {
        str.getClass();
        str2.getClass();
        this.a = j6dVar;
        this.b = z;
        this.c = z2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = d;
        this.k = d2;
        this.l = d3;
        this.m = obj;
        this.n = str3;
        this.o = th;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m6d) {
                m6d m6dVar = (m6d) obj;
                if (c16.i(this.a, m6dVar.a) && this.b == m6dVar.b && this.c == m6dVar.c && this.d == m6dVar.d && this.e == m6dVar.e && this.f == m6dVar.f && this.g == m6dVar.g && c16.i(this.h, m6dVar.h) && c16.i(this.i, m6dVar.i) && Double.compare(this.j, m6dVar.j) == 0 && Double.compare(this.k, m6dVar.k) == 0 && Double.compare(this.l, m6dVar.l) == 0 && c16.i(this.m, m6dVar.m) && c16.i(this.n, m6dVar.n) && c16.i(this.o, m6dVar.o)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int j = eub.j(eub.j(hl5.a(this.g, hl5.c(hl5.c(hl5.c(eub.k(eub.k(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31), this.e, 31), this.f, 31), 31), 31, this.h), 31, this.i);
        int hashCode3 = (Double.hashCode(this.l) + ((Double.hashCode(this.k) + ((Double.hashCode(this.j) + j) * 31)) * 31)) * 31;
        int i = 0;
        Object obj = this.m;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 961;
        String str = this.n;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Throwable th = this.o;
        if (th != null) {
            i = th.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VfsStat(");
        ArrayList arrayList = new ArrayList(16);
        arrayList.add("file=" + this.a);
        arrayList.add("exists=" + this.b);
        arrayList.add("isDirectory=" + this.c);
        arrayList.add("size=" + this.d);
        arrayList.add("device=" + this.e);
        arrayList.add("inode=" + this.f);
        arrayList.add("mode=" + this.g);
        arrayList.add("owner=" + this.h);
        arrayList.add("group=" + this.i);
        arrayList.add("createTime=" + ((Object) wi2.a(this.j)));
        arrayList.add("modifiedTime=" + ((Object) wi2.a(this.k)));
        arrayList.add("lastAccessTime=" + ((Object) wi2.a(this.l)));
        arrayList.add("extraInfo=" + this.m);
        arrayList.add("id=" + this.n);
        return s21.p(sb, sl1.i0(arrayList, ", ", null, null, null, 62), ')');
    }
}
