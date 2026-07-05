package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d8  reason: default package */
/* loaded from: classes3.dex */
public final class d8 {
    public static final yy9 i = oue.G(new c8(0, (byte) 0), new y4(2));
    public final hm8 a;
    public final hm8 b;
    public final hm8 c;
    public final hm8 d;
    public final hm8 e;
    public final hm8 f;
    public final hm8 g;
    public final hm8 h;

    public d8(boolean z, String str, int i2, int i3, int i4, String str2, String str3, String str4) {
        this.a = yae.z(Boolean.valueOf(z));
        this.b = yae.z(str);
        this.c = yae.z(Integer.valueOf(i2));
        this.d = yae.z(Integer.valueOf(i3));
        this.e = yae.z(Integer.valueOf(i4));
        this.f = yae.z(str2);
        this.g = yae.z(str3);
        this.h = yae.z(str4);
    }

    public final String a() {
        return (String) this.h.getValue();
    }

    public final void b() {
        this.a.setValue(Boolean.FALSE);
        this.b.setValue("");
        this.c.setValue(0);
        this.d.setValue(0);
        this.e.setValue(0);
        this.f.setValue("");
        this.g.setValue("");
        this.h.setValue("");
    }

    public final void c(String str, int i2, int i3, int i4, String str2, String str3, String str4) {
        hl5.z(str, str2, str3, str4);
        this.b.setValue(str);
        this.f.setValue(str2);
        this.c.setValue(Integer.valueOf(i2));
        this.d.setValue(Integer.valueOf(i3));
        this.e.setValue(Integer.valueOf(i4));
        this.g.setValue(str3);
        this.h.setValue(str4);
        this.a.setValue(Boolean.TRUE);
    }
}
