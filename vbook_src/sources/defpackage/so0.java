package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: so0  reason: default package */
/* loaded from: classes3.dex */
public final class so0 {
    public final hk2 a;
    public final List b;
    public final Map c;
    public final Map d;
    public final String e;
    public final String f;
    public final String g;
    public final byte[] h;

    public so0(hk2 hk2Var, List list, HashMap hashMap, HashMap hashMap2, String str, String str2, String str3, byte[] bArr) {
        list.getClass();
        hashMap.getClass();
        hashMap2.getClass();
        this.a = hk2Var;
        this.b = list;
        this.c = hashMap;
        this.d = hashMap2;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = bArr;
    }

    public final Map a() {
        return this.c;
    }

    public final List b() {
        return this.b;
    }

    public final String c() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof so0) {
                so0 so0Var = (so0) obj;
                if (!this.a.equals(so0Var.a) || !c16.i(this.b, so0Var.b) || !c16.i(this.c, so0Var.c) || !c16.i(this.d, so0Var.d) || !this.e.equals(so0Var.e) || !this.f.equals(so0Var.f) || !this.g.equals(so0Var.g) || !c16.i(this.h, so0Var.h)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int j = eub.j(eub.j(eub.j(rs8.a(rs8.a(eub.l(this.a.hashCode() * 31, this.b, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        byte[] bArr = this.h;
        if (bArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(bArr);
        }
        return j + hashCode;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.h);
        StringBuilder sb = new StringBuilder("ExportContext(book=");
        sb.append(this.a);
        sb.append(", chapters=");
        sb.append(this.b);
        sb.append(", chapterTitles=");
        sb.append(this.c);
        sb.append(", chapterContents=");
        sb.append(this.d);
        sb.append(", fileBaseName=");
        nk2.C(sb, this.e, ", exportName=", this.f, ", exportAuthor=");
        return nk2.w(sb, this.g, ", customCoverBytes=", arrays, ")");
    }
}
