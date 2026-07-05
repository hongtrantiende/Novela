package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vf2  reason: default package */
/* loaded from: classes.dex */
public final class vf2 implements g60 {
    public final String a;
    public final Map b;
    public final String c;
    public final String d;

    public vf2(String str, String str2, String str3, Map map) {
        str.getClass();
        map.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = map;
        this.c = str2;
        this.d = str3;
    }

    @Override // defpackage.g60
    public final Map a() {
        return this.b;
    }

    @Override // defpackage.g60
    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf2)) {
            return false;
        }
        vf2 vf2Var = (vf2) obj;
        if (c16.i(this.a, vf2Var.a) && c16.i(this.b, vf2Var.b) && c16.i(this.c, vf2Var.c) && c16.i(this.d, vf2Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + eub.j(rs8.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataAudioSource(data=");
        sb.append(this.a);
        sb.append(", headers=");
        sb.append(this.b);
        sb.append(", mimeType=");
        return nk2.w(sb, this.c, ", baseUrl=", this.d, ")");
    }
}
