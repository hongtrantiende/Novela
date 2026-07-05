package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: io3  reason: default package */
/* loaded from: classes3.dex */
public final class io3 {
    public static final yy9 h = oue.G(new pg2(16), new u83(19));
    public final hm8 a;
    public final hm8 b;
    public final hm8 c;
    public final hm8 d;
    public final hm8 e;
    public final hm8 f;
    public final hm8 g = yae.z(Boolean.FALSE);

    public io3(boolean z, String str, String str2, boolean z2, boolean z3, boolean z4) {
        this.a = yae.z(Boolean.valueOf(z));
        this.b = yae.z(str);
        this.c = yae.z(str2);
        this.d = yae.z(Boolean.valueOf(z2));
        this.e = yae.z(Boolean.valueOf(z4));
        this.f = yae.z(Boolean.valueOf(z3));
    }

    public final String a() {
        return (String) this.c.getValue();
    }

    public final void b() {
        this.a.setValue(Boolean.FALSE);
        this.b.setValue("");
        c("");
        this.e.setValue(Boolean.TRUE);
    }

    public final void c(String str) {
        this.c.setValue(str);
    }

    public final void d(String str, String str2, boolean z, boolean z2) {
        boolean z3;
        str.getClass();
        str2.getClass();
        this.b.setValue(str);
        c(str2);
        this.e.setValue(Boolean.valueOf(z));
        this.d.setValue(Boolean.valueOf(z2));
        if (str.length() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.g.setValue(Boolean.valueOf(z3));
        this.a.setValue(Boolean.TRUE);
    }
}
