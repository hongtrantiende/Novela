package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: co3  reason: default package */
/* loaded from: classes3.dex */
public final class co3 {
    public static final yy9 e = oue.G(new pg2(10), new u83(13));
    public final hm8 a;
    public final hm8 b;
    public final hm8 c;
    public final hm8 d = yae.z(Boolean.FALSE);

    public co3(String str, String str2, boolean z) {
        this.a = yae.z(Boolean.valueOf(z));
        this.b = yae.z(str);
        this.c = yae.z(str2);
    }

    public final void a(boolean z) {
        this.a.setValue(Boolean.valueOf(z));
    }

    public final void b(String str, String str2) {
        boolean z;
        str.getClass();
        str2.getClass();
        this.b.setValue(str);
        this.c.setValue(str2);
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        this.d.setValue(Boolean.valueOf(z));
        a(true);
    }
}
