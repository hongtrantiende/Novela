package defpackage;

import android.os.Bundle;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m08  reason: default package */
/* loaded from: classes.dex */
public final class m08 {
    public final /* synthetic */ int a = 1;
    public final long b;
    public final long c;
    public final Object d;
    public final Object e;
    public final Object f;

    public m08(long j, long j2, Bundle bundle, String str, String str2) {
        this.d = str;
        this.e = str2;
        this.f = bundle;
        this.b = j;
        this.c = j2;
    }

    public static m08 a(ibe ibeVar) {
        String str = ibeVar.a;
        String str2 = ibeVar.c;
        return new m08(ibeVar.d, ibeVar.e, ibeVar.b.f(), str, str2);
    }

    public ibe b() {
        return new ibe((String) this.d, new dbe(new Bundle((Bundle) this.f)), (String) this.e, this.b, this.c);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                String str = (String) this.e;
                String obj = ((Bundle) this.f).toString();
                int length = String.valueOf(str).length();
                String str2 = (String) this.d;
                StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + obj.length());
                nk2.C(sb, "origin=", str, ",name=", str2);
                return s21.q(sb, ",params=", obj);
            default:
                return super.toString();
        }
    }

    public m08(nq7 nq7Var, long j, long j2, qid qidVar, tu1 tu1Var) {
        this.d = nq7Var;
        this.b = j;
        this.c = j2;
        this.e = qidVar;
        this.f = tu1Var;
    }
}
