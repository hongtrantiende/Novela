package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q3c  reason: default package */
/* loaded from: classes3.dex */
public final class q3c {
    public final String a;
    public final Map b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;
    public final List h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ q3c(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.util.List r17, int r18) {
        /*
            r12 = this;
            r0 = r18
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto La
            r4 = r2
            goto Lb
        La:
            r4 = r13
        Lb:
            r13 = r0 & 4
            if (r13 == 0) goto L11
            r5 = r2
            goto L12
        L11:
            r5 = r14
        L12:
            r13 = r0 & 8
            if (r13 == 0) goto L18
            r6 = r2
            goto L19
        L18:
            r6 = r15
        L19:
            r13 = r0 & 16
            if (r13 == 0) goto L1f
            r7 = r2
            goto L21
        L1f:
            r7 = r16
        L21:
            r13 = r0 & 128(0x80, float:1.8E-43)
            ks3 r8 = defpackage.ks3.a
            if (r13 == 0) goto L29
            r10 = r8
            goto L2b
        L29:
            r10 = r17
        L2b:
            ls3 r11 = defpackage.ls3.a
            r9 = r8
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q3c.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.List] */
    public static q3c a(q3c q3cVar, LinkedHashMap linkedHashMap, String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2, int i) {
        String str4 = q3cVar.a;
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        if ((i & 2) != 0) {
            linkedHashMap2 = q3cVar.b;
        }
        LinkedHashMap linkedHashMap3 = linkedHashMap2;
        if ((i & 4) != 0) {
            str = q3cVar.c;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = q3cVar.d;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = q3cVar.e;
        }
        String str7 = str3;
        ArrayList arrayList3 = arrayList;
        if ((i & 32) != 0) {
            arrayList3 = q3cVar.f;
        }
        ArrayList arrayList4 = arrayList3;
        ArrayList arrayList5 = arrayList2;
        if ((i & 64) != 0) {
            arrayList5 = q3cVar.g;
        }
        ArrayList arrayList6 = arrayList5;
        List list = q3cVar.h;
        q3cVar.getClass();
        str4.getClass();
        linkedHashMap3.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        arrayList4.getClass();
        arrayList6.getClass();
        list.getClass();
        return new q3c(str4, str5, str6, str7, arrayList4, arrayList6, list, linkedHashMap3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3c)) {
            return false;
        }
        q3c q3cVar = (q3c) obj;
        if (c16.i(this.a, q3cVar.a) && c16.i(this.b, q3cVar.b) && c16.i(this.c, q3cVar.c) && c16.i(this.d, q3cVar.d) && c16.i(this.e, q3cVar.e) && c16.i(this.f, q3cVar.f) && c16.i(this.g, q3cVar.g) && c16.i(this.h, q3cVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode() + eub.l(eub.l(eub.j(eub.j(eub.j(rs8.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), this.f, 31), this.g, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextTranslateState(word=");
        sb.append(this.a);
        sb.append(", translate=");
        sb.append(this.b);
        sb.append(", translateId=");
        nk2.C(sb, this.c, ", fromLanguage=", this.d, ", toLanguage=");
        sb.append(this.e);
        sb.append(", fromLanguages=");
        sb.append(this.f);
        sb.append(", toLanguages=");
        sb.append(this.g);
        sb.append(", translateEngines=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    public q3c(String str, String str2, String str3, String str4, List list, List list2, List list3, Map map) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list3.getClass();
        this.a = str;
        this.b = map;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = list;
        this.g = list2;
        this.h = list3;
    }
}
