package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j4d  reason: default package */
/* loaded from: classes.dex */
public final class j4d extends l4d implements Iterable, j76 {
    public final float C;
    public final float D;
    public final List E;
    public final List F;
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public j4d(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.C = f6;
        this.D = f7;
        this.E = list;
        this.F = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof j4d)) {
            j4d j4dVar = (j4d) obj;
            if (c16.i(this.a, j4dVar.a) && this.b == j4dVar.b && this.c == j4dVar.c && this.d == j4dVar.d && this.e == j4dVar.e && this.f == j4dVar.f && this.C == j4dVar.C && this.D == j4dVar.D && c16.i(this.E, j4dVar.E) && c16.i(this.F, j4dVar.F)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.F.hashCode() + eub.l(nk2.d(this.D, nk2.d(this.C, nk2.d(this.f, nk2.d(this.e, nk2.d(this.d, nk2.d(this.c, nk2.d(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), this.E, 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new st6(this);
    }
}
