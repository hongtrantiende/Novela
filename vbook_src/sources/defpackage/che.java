package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: che  reason: default package */
/* loaded from: classes.dex */
public abstract class che {
    public static final ogf a = a(16);
    public static final ogf b = a(32);
    public static final ogf c;

    static {
        c(16);
        c(32);
        c = b(16, 16);
        b(32, 32);
        mgf t = ogf.t();
        i6f i6fVar = ake.a;
        t.f("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        eif eifVar = eif.TINK;
        t.e(eifVar);
        ogf ogfVar = (ogf) t.b();
        mgf t2 = ogf.t();
        i6f i6fVar2 = une.a;
        t2.f("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        t2.e(eifVar);
        ogf ogfVar2 = (ogf) t2.b();
    }

    public static ogf a(int i) {
        ecf x = fcf.x();
        x.c();
        ((fcf) x.b).zze = i;
        mgf t = ogf.t();
        t.g(((fcf) x.b()).b());
        i6f i6fVar = bje.a;
        t.f("type.googleapis.com/google.crypto.tink.AesGcmKey");
        t.e(eif.TINK);
        return (ogf) t.b();
    }

    public static ogf b(int i, int i2) {
        jbf w = kbf.w();
        mbf v = nbf.v();
        v.c();
        ((nbf) v.b).zze = 16;
        w.c();
        kbf.v((kbf) w.b, (nbf) v.b());
        w.c();
        ((kbf) w.b).zzg = i;
        oef y = pef.y();
        uef x = vef.x();
        x.c();
        ((vef) x.b).zze = lef.SHA256.zza();
        x.c();
        ((vef) x.b).zzf = i2;
        y.c();
        pef.w((pef) y.b, (vef) x.b());
        y.c();
        ((pef) y.b).zzg = 32;
        waf t = zaf.t();
        t.c();
        zaf.v((zaf) t.b, (kbf) w.b());
        t.c();
        zaf.w((zaf) t.b, (pef) y.b());
        mgf t2 = ogf.t();
        t2.g(((zaf) t.b()).b());
        i6f i6fVar = the.a;
        t2.f("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        t2.e(eif.TINK);
        return (ogf) t2.b();
    }

    public static void c(int i) {
        tbf x = ubf.x();
        x.c();
        ((ubf) x.b).zzg = i;
        xbf v = ybf.v();
        v.c();
        ((ybf) v.b).zze = 16;
        x.c();
        ubf.w((ubf) x.b, (ybf) v.b());
        mgf t = ogf.t();
        t.g(((ubf) x.b()).b());
        i6f i6fVar = kie.a;
        t.f("type.googleapis.com/google.crypto.tink.AesEaxKey");
        t.e(eif.TINK);
        ogf ogfVar = (ogf) t.b();
    }
}
