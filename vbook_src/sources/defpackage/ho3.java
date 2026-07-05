package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ho3  reason: default package */
/* loaded from: classes3.dex */
public final class ho3 {
    public static final yy9 g = oue.G(new pg2(15), new u83(18));
    public final hm8 a;
    public final hm8 b;
    public final hm8 c;
    public final hm8 d;
    public final hm8 e;
    public final hm8 f = yae.z(Boolean.FALSE);

    public ho3(String str, String str2, String str3, String str4, boolean z) {
        this.a = yae.z(Boolean.valueOf(z));
        this.b = yae.z(str);
        this.c = yae.z(str2);
        this.d = yae.z(str3);
        this.e = yae.z(str4);
    }

    public final void a(boolean z) {
        this.a.setValue(Boolean.valueOf(z));
    }

    public final void b(String str, String str2, String str3, String str4) {
        boolean z;
        hl5.z(str, str2, str3, str4);
        this.b.setValue(str);
        this.c.setValue(str2);
        this.d.setValue(str3);
        this.e.setValue(str4);
        if (str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f.setValue(Boolean.valueOf(z));
        a(true);
    }
}
