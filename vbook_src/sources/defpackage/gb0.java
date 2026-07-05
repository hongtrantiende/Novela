package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gb0  reason: default package */
/* loaded from: classes.dex */
public final class gb0 extends pa2 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final x92 g;
    public final oa2 h;
    public final na2 i;
    public final y92 j;
    public final List k;
    public final int l;

    public gb0(String str, String str2, String str3, long j, Long l, boolean z, x92 x92Var, oa2 oa2Var, na2 na2Var, y92 y92Var, List list, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = l;
        this.f = z;
        this.g = x92Var;
        this.h = oa2Var;
        this.i = na2Var;
        this.j = y92Var;
        this.k = list;
        this.l = i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fb0, java.lang.Object] */
    @Override // defpackage.pa2
    public final fb0 a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        obj.j = this.j;
        obj.k = this.k;
        obj.l = this.l;
        obj.m = (byte) 7;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pa2) {
            gb0 gb0Var = (gb0) ((pa2) obj);
            if (this.a.equals(gb0Var.a) && this.b.equals(gb0Var.b)) {
                String str = gb0Var.c;
                String str2 = this.c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.d == gb0Var.d) {
                        Long l = gb0Var.e;
                        Long l2 = this.e;
                        if (l2 != null ? l2.equals(l) : l == null) {
                            if (this.f == gb0Var.f && this.g.equals(gb0Var.g)) {
                                oa2 oa2Var = gb0Var.h;
                                oa2 oa2Var2 = this.h;
                                if (oa2Var2 != null ? oa2Var2.equals(oa2Var) : oa2Var == null) {
                                    na2 na2Var = gb0Var.i;
                                    na2 na2Var2 = this.i;
                                    if (na2Var2 != null ? na2Var2.equals(na2Var) : na2Var == null) {
                                        y92 y92Var = gb0Var.j;
                                        y92 y92Var2 = this.j;
                                        if (y92Var2 != null ? y92Var2.equals(y92Var) : y92Var == null) {
                                            List list = gb0Var.k;
                                            List list2 = this.k;
                                            if (list2 != null ? list2.equals(list) : list == null) {
                                                if (this.l == gb0Var.l) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        int i2 = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.d;
        int i3 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        Long l = this.e;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int i4 = (i3 ^ hashCode2) * 1000003;
        if (this.f) {
            i = 1231;
        } else {
            i = 1237;
        }
        int hashCode7 = (((i4 ^ i) * 1000003) ^ this.g.hashCode()) * 1000003;
        oa2 oa2Var = this.h;
        if (oa2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = oa2Var.hashCode();
        }
        int i5 = (hashCode7 ^ hashCode3) * 1000003;
        na2 na2Var = this.i;
        if (na2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = na2Var.hashCode();
        }
        int i6 = (i5 ^ hashCode4) * 1000003;
        y92 y92Var = this.j;
        if (y92Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = y92Var.hashCode();
        }
        int i7 = (i6 ^ hashCode5) * 1000003;
        List list = this.k;
        if (list != null) {
            i2 = list.hashCode();
        }
        return this.l ^ ((i7 ^ i2) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.a);
        sb.append(", identifier=");
        sb.append(this.b);
        sb.append(", appQualitySessionId=");
        sb.append(this.c);
        sb.append(", startedAt=");
        sb.append(this.d);
        sb.append(", endedAt=");
        sb.append(this.e);
        sb.append(", crashed=");
        sb.append(this.f);
        sb.append(", app=");
        sb.append(this.g);
        sb.append(", user=");
        sb.append(this.h);
        sb.append(", os=");
        sb.append(this.i);
        sb.append(", device=");
        sb.append(this.j);
        sb.append(", events=");
        sb.append(this.k);
        sb.append(", generatorType=");
        return rs8.g(this.l, "}", sb);
    }
}
