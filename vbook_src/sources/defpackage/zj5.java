package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zj5  reason: default package */
/* loaded from: classes.dex */
public final class zj5 {
    public final ak5 a;
    public final String b;
    public final ck5 c;
    public final Integer d;
    public final Integer e;
    public final tv5 f;
    public final dr6 g;
    public final List h;
    public final String i;
    public final String j;
    public final bn5 k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ zj5(defpackage.ak5 r16, java.lang.String r17, defpackage.ck5 r18, java.lang.Integer r19, java.lang.Integer r20, defpackage.tv5 r21, defpackage.dr6 r22, java.lang.String r23, defpackage.bn5 r24, int r25) {
        /*
            r15 = this;
            r0 = r25
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L9
            r5 = r2
            goto Lb
        L9:
            r5 = r17
        Lb:
            r1 = r0 & 4
            if (r1 == 0) goto L11
            r6 = r2
            goto L13
        L11:
            r6 = r18
        L13:
            r1 = r0 & 8
            if (r1 == 0) goto L19
            r7 = r2
            goto L1b
        L19:
            r7 = r19
        L1b:
            r1 = r0 & 16
            if (r1 == 0) goto L21
            r8 = r2
            goto L23
        L21:
            r8 = r20
        L23:
            r1 = r0 & 64
            if (r1 == 0) goto L29
            r9 = r2
            goto L2b
        L29:
            r9 = r21
        L2b:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L31
            r10 = r2
            goto L33
        L31:
            r10 = r22
        L33:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L39
            r13 = r2
            goto L3b
        L39:
            r13 = r23
        L3b:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L41
            r14 = r2
            goto L43
        L41:
            r14 = r24
        L43:
            r11 = 0
            r12 = 0
            r3 = r15
            r4 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zj5.<init>(ak5, java.lang.String, ck5, java.lang.Integer, java.lang.Integer, tv5, dr6, java.lang.String, bn5, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.util.List] */
    public static zj5 a(zj5 zj5Var, ak5 ak5Var, String str, ck5 ck5Var, Integer num, tv5 tv5Var, ArrayList arrayList, String str2, String str3, bn5 bn5Var, int i) {
        String str4;
        ck5 ck5Var2;
        Integer num2;
        tv5 tv5Var2;
        ArrayList arrayList2;
        String str5;
        String str6;
        bn5 bn5Var2;
        if ((i & 1) != 0) {
            ak5Var = zj5Var.a;
        }
        ak5 ak5Var2 = ak5Var;
        if ((i & 2) != 0) {
            str4 = zj5Var.b;
        } else {
            str4 = str;
        }
        if ((i & 4) != 0) {
            ck5Var2 = zj5Var.c;
        } else {
            ck5Var2 = ck5Var;
        }
        if ((i & 8) != 0) {
            num2 = zj5Var.d;
        } else {
            num2 = num;
        }
        Integer num3 = zj5Var.e;
        zj5Var.getClass();
        if ((i & 64) != 0) {
            tv5Var2 = zj5Var.f;
        } else {
            tv5Var2 = tv5Var;
        }
        dr6 dr6Var = zj5Var.g;
        if ((i & 256) != 0) {
            arrayList2 = zj5Var.h;
        } else {
            arrayList2 = arrayList;
        }
        if ((i & 512) != 0) {
            str5 = zj5Var.i;
        } else {
            str5 = str2;
        }
        if ((i & 1024) != 0) {
            str6 = zj5Var.j;
        } else {
            str6 = str3;
        }
        if ((i & 2048) != 0) {
            bn5Var2 = zj5Var.k;
        } else {
            bn5Var2 = bn5Var;
        }
        zj5Var.getClass();
        ak5Var2.getClass();
        return new zj5(ak5Var2, str4, ck5Var2, num2, num3, tv5Var2, dr6Var, arrayList2, str5, str6, bn5Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj5)) {
            return false;
        }
        zj5 zj5Var = (zj5) obj;
        if (this.a == zj5Var.a && c16.i(this.b, zj5Var.b) && c16.i(this.c, zj5Var.c) && c16.i(this.d, zj5Var.d) && c16.i(this.e, zj5Var.e) && c16.i(this.f, zj5Var.f) && this.g == zj5Var.g && c16.i(this.h, zj5Var.h) && c16.i(this.i, zj5Var.i) && c16.i(this.j, zj5Var.j) && c16.i(this.k, zj5Var.k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10 = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode10 + hashCode) * 31;
        ck5 ck5Var = this.c;
        if (ck5Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = ck5Var.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Integer num = this.d;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Integer num2 = this.e;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 961;
        tv5 tv5Var = this.f;
        if (tv5Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = tv5Var.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        dr6 dr6Var = this.g;
        if (dr6Var == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = dr6Var.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        List list = this.h;
        if (list == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = list.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str2 = this.i;
        if (str2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str2.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        String str3 = this.j;
        if (str3 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str3.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        bn5 bn5Var = this.k;
        if (bn5Var != null) {
            i = bn5Var.hashCode();
        }
        return i10 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IRBlock(type=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", table=");
        sb.append(this.c);
        sb.append(", level=");
        sb.append(this.d);
        sb.append(", pageNumber=");
        sb.append(this.e);
        sb.append(", bbox=null, style=");
        sb.append(this.f);
        sb.append(", listType=");
        sb.append(this.g);
        sb.append(", children=");
        sb.append(this.h);
        sb.append(", href=");
        nk2.C(sb, this.i, ", footnoteText=", this.j, ", imageData=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }

    public zj5(ak5 ak5Var, String str, ck5 ck5Var, Integer num, Integer num2, tv5 tv5Var, dr6 dr6Var, List list, String str2, String str3, bn5 bn5Var) {
        this.a = ak5Var;
        this.b = str;
        this.c = ck5Var;
        this.d = num;
        this.e = num2;
        this.f = tv5Var;
        this.g = dr6Var;
        this.h = list;
        this.i = str2;
        this.j = str3;
        this.k = bn5Var;
    }
}
