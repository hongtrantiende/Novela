package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a9f  reason: default package */
/* loaded from: classes.dex */
public abstract class a9f {
    public static final hvc a;
    public static final hvc b;
    public static final y5f c;
    public static final u5f d;
    public static final t3f e;
    public static final m3f f;

    static {
        hlf c2 = k7f.c("type.googleapis.com/google.crypto.tink.HmacKey");
        c3f z = hvc.z();
        z.b(eif.RAW, f8f.e);
        z.b(eif.TINK, f8f.b);
        z.b(eif.LEGACY, f8f.d);
        z.b(eif.CRUNCHY, f8f.c);
        a = z.a();
        c3f z2 = hvc.z();
        z2.b(lef.SHA1, g8f.b);
        z2.b(lef.SHA224, g8f.c);
        z2.b(lef.SHA256, g8f.d);
        z2.b(lef.SHA384, g8f.e);
        z2.b(lef.SHA512, g8f.f);
        b = z2.a();
        c = new y5f(h8f.class, new tw8(28));
        d = new u5f(c2, new iv8(28));
        e = new t3f(r7f.class, new v28(29));
        f = new m3f(c2, new u28(29));
    }
}
