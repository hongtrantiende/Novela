package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fo3  reason: default package */
/* loaded from: classes3.dex */
public final class fo3 {
    public static final yy9 e = oue.G(new pg2(13), new u83(16));
    public final hm8 a;
    public final hm8 b;
    public final hm8 c;
    public final hm8 d = yae.z(Boolean.FALSE);

    public fo3(String str, String str2, boolean z) {
        this.a = yae.z(Boolean.valueOf(z));
        this.b = yae.z(str);
        this.c = yae.z(str2);
    }

    public final void a(String str, String str2) {
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
        this.a.setValue(Boolean.TRUE);
    }
}
