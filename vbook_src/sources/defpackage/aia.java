package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aia  reason: default package */
/* loaded from: classes3.dex */
public final class aia {
    public final boolean a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final List g;
    public final List h;
    public final List i;
    public final List j;

    public aia(boolean z, int i, int i2, boolean z2, boolean z3, boolean z4, List list, List list2, List list3, List list4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = list;
        this.h = list2;
        this.i = list3;
        this.j = list4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof aia) {
                aia aiaVar = (aia) obj;
                if (this.a != aiaVar.a || this.b != aiaVar.b || this.c != aiaVar.c || this.d != aiaVar.d || this.e != aiaVar.e || this.f != aiaVar.f || !c16.i(this.g, aiaVar.g) || !c16.i(this.h, aiaVar.h) || !c16.i(this.i, aiaVar.i) || !c16.i(this.j, aiaVar.j)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.j.hashCode() + eub.l(eub.l(eub.l(eub.k(eub.k(eub.k(hl5.a(this.c, hl5.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), this.g, 31), this.h, 31), this.i, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShelHomeState(isLoading=");
        sb.append(this.a);
        sb.append(", viewType=");
        sb.append(this.b);
        sb.append(", shelfSize=");
        eub.w(sb, this.c, ", isShowReadPercent=", this.d, ", isShowTotalChapter=");
        rs8.z(sb, this.e, ", isShowNewChapter=", this.f, ", recentReadBooks=");
        sb.append(this.g);
        sb.append(", newAddNotViewBooks=");
        sb.append(this.h);
        sb.append(", newUpdateBooks=");
        sb.append(this.i);
        sb.append(", oftenReadBooks=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
